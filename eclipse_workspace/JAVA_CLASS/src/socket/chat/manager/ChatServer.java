package socket.chat.manager;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	
	public static ArrayList<Socket> clientSockts = new ArrayList<Socket>();
	public static ArrayList<PrintWriter> clientWriters = new ArrayList<>();

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(8889);
			
			while(true) {
				System.out.println("접속 대기...[현재 인원 : " + clientSockts.size()+ "]");
				Socket cs = ss.accept();
				PrintWriter p = new PrintWriter(cs.getOutputStream());
				clientSockts.add(cs);
				clientWriters.add(p);
				
				new ChatManager(cs, p).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
