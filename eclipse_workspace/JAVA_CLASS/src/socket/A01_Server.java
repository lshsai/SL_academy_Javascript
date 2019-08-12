package socket;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class A01_Server {
	/*
	 * 서버 - 클라이언트
	 * 
	 * 서버 : 24시간 켜져있음 : 클라이언트가 성공적으로 접속하면 약속된 방식(프로토콜)으로 서로 통신
	 */

	// 네이버에 접속하는 경우....
	// 내 컴퓨터 - 공유기 - 우리 층 라우터 - 우리건물 라우터 - ////
	// - 네이버의 라우터 - 네이버의 공유기 - 네이버의 서버 컴퓨터

	// 라우터에서 찾아갈때는 IP주소를 사용한다.
	// 내부망에서 특정 컴퓨터를 찾아갈때는 내부ip주소와 mac주소를 대조하여 찾아간다
	// 특정 컴퓨터 내에서 특정 프로그램을 식별할때 port번호를 사용한다.
	public static void main(String[] args) {

		int count = 0;
		try {
			ServerSocket ss = new ServerSocket(8888);

			while (true) {
				System.out.println("연결을 기다리는 중..."+ count);
				count++;
				Socket cs = ss.accept();
				
				byte[] welcomMSG = "서버 접속 성공".getBytes();

				OutputStream out = cs.getOutputStream();
				out.write(welcomMSG);

				cs.close();
			}
		} catch (Exception e) {

		}
	}
}
