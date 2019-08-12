package socket.chat.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	

	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(8889);
			
			// accept()�� ���� Socket ��ü�� ������...
			// �� ���� ��ü���� Ŭ���̾�Ʈ�� ����� �ϱ� ���� �������� ��� ����մ�.
			System.out.println("��븦 ��ٸ��� ��...");
			Socket cs = ss.accept();
			
			System.out.println("���� ����Ǿ����ϴ�.(" + cs.getInetAddress());

			new ServerReceiveThread(cs).start();
			new ServerSendThread(cs).start();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
