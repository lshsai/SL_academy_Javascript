package socket.chat.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	

	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(8889);
			
			// accept()를 통해 Socket 객체를 받으면...
			// 그 소켓 갯체에는 클라이언트와 통신을 하기 위한 정보들이 모두 담겨잇다.
			System.out.println("상대를 기다리는 중...");
			Socket cs = ss.accept();
			
			System.out.println("상대와 연결되었습니다.(" + cs.getInetAddress());

			new ServerReceiveThread(cs).start();
			new ServerSendThread(cs).start();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
