package socket.chat.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatManager extends Thread {
	Socket cs;
	PrintWriter p;

	public ChatManager(Socket cs, PrintWriter p) {
		this.cs = cs;
		this.p = p;

	}

	public void sendAll(String msg) {
		for (PrintWriter writer : ChatServer.clientWriters) {
			if(writer.equals(p))
				continue;
			
			
			writer.println(msg);
			writer.flush();
		}
	}

	@Override
	public void run() {
		sendAll("'" + cs.getInetAddress() + "님이 입장하셨습니다.");

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(cs.getInputStream()));

			String receiveMsg;

			while (true) {
				// sc.nextline()처럼 입력 들어올떄까지 블럭
				receiveMsg = reader.readLine();

				if (receiveMsg == null) {
					// System.out.println("'"+cs.getInetAddress() + "가 나갔습니다");
					sendAll("'" + cs.getInetAddress() + "가 나갔습니다.");
					break;
				}

				sendAll(receiveMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (ChatServer.clientSockts.contains(cs)) {
					ChatServer.clientSockts.remove(cs);
					System.out.println("소켓 현황" + ChatServer.clientSockts.toString());
				}
				if (ChatServer.clientWriters.contains(p)) {
					ChatServer.clientWriters.remove(p);
					System.out.println("Printwriter 현황" + ChatServer.clientWriters.toString());
				}
				
				if (p != null)
					p.close();
				
				if(cs != null)
					cs.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
