package socket;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class A01_Server {
	/*
	 * ���� - Ŭ���̾�Ʈ
	 * 
	 * ���� : 24�ð� �������� : Ŭ���̾�Ʈ�� ���������� �����ϸ� ��ӵ� ���(��������)���� ���� ���
	 */

	// ���̹��� �����ϴ� ���....
	// �� ��ǻ�� - ������ - �츮 �� ����� - �츮�ǹ� ����� - ////
	// - ���̹��� ����� - ���̹��� ������ - ���̹��� ���� ��ǻ��

	// ����Ϳ��� ã�ư����� IP�ּҸ� ����Ѵ�.
	// ���θ����� Ư�� ��ǻ�͸� ã�ư����� ����ip�ּҿ� mac�ּҸ� �����Ͽ� ã�ư���
	// Ư�� ��ǻ�� ������ Ư�� ���α׷��� �ĺ��Ҷ� port��ȣ�� ����Ѵ�.
	public static void main(String[] args) {

		int count = 0;
		try {
			ServerSocket ss = new ServerSocket(8888);

			while (true) {
				System.out.println("������ ��ٸ��� ��..."+ count);
				count++;
				Socket cs = ss.accept();
				
				byte[] welcomMSG = "���� ���� ����".getBytes();

				OutputStream out = cs.getOutputStream();
				out.write(welcomMSG);

				cs.close();
			}
		} catch (Exception e) {

		}
	}
}
