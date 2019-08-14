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

	// I/o는 인풋스트림과 아웃풋스트림을 이용한 통신이다.
	// 프로그램과 운영체제의 통신 : system.in, system.out
	// 프로그램과 네트워크 통신 : socket.getinputstream(), socket.getoutputstream()
	// 프로그램과 하드디스크 통신 : fileinputstream(불러오기), fileoutputstream(저장하기)
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
