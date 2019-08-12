package answer.chatGui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import answer.chatGui.ClientMainFrame;


public class ClientReceiveThread extends Thread {
	private Socket cs;
	private ClientMainFrame mainFrame;

	public ClientReceiveThread(Socket cs, ClientMainFrame mainFrame) {
		this.cs = cs;
		this.mainFrame = mainFrame;
	}

	@Override
	public void run() {
		// BufferedReader : 좀 더 빠른 inputStream

		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new InputStreamReader(cs.getInputStream()));

			String receiveMsg;

			while (true) {
				receiveMsg = buffer.readLine();

				if (receiveMsg == null) {
					System.out.println("연결 끊어짐");
					break;
				} else {
					// System.out.println(receiveMsg);
					// textarea에 출력
					mainFrame.chatting.append(receiveMsg + "\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (buffer != null)
					buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
