package answer.serverGui;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

import javax.print.attribute.standard.Severity;

import socket.chat.manager.ChatServer;

public class ServerSendThread extends Thread {

	Socket cs;
	Scanner sc;

	public ServerSendThread(Socket cs) {
		this.cs = cs;
		sc = new Scanner(System.in);
	}

	// I/o�� ��ǲ��Ʈ���� �ƿ�ǲ��Ʈ���� �̿��� ����̴�.
	// ���α׷��� �ü���� ��� : system.in, system.out
	// ���α׷��� ��Ʈ��ũ ��� : socket.getinputstream(), socket.getoutputstream()
	// ���α׷��� �ϵ��ũ ��� : fileinputstream(�ҷ�����), fileoutputstream(�����ϱ�)
	@Override
	public void run() {
		// BufferedReader systemReader = new BufferedReader(new
		// InputStreamReader(System.in));
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(cs.getOutputStream());

			String sendMsg;
			InetAddress id;
			
			while (true) {
				sendMsg = sc.nextLine();
				// id =  ServerMain.id;
				writer.println(sendMsg);
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null)
				writer.close();
			if(sc != null)
				sc.close();
		}
	}
}
