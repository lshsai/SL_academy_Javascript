
public class G01_Thread {
	/*
	 * Thread��? - Program�ȿ��� ������ �۾��� �����ϴ� ��ü - �� Program �ȿ��� �������� �� �ִ�.
	 */

	public static void main(String[] args) {
		// main thread�� ����

		Thread gg = new Thread(new Test('B'));
		Thread gg1 = new Thread(new Test('C'));
		Thread gg2 = new Thread(new Test('D'));

		// start() �ż��� : ���ο� �����带 ����
		// run() : ���������� ����, �޼��� �θ��Ͱ� ����
		gg.start();
		gg1.start();
		gg2.start();
		new TestThread().start();

		for (int i = 0; i < 1000; i++) {
			System.out.print("A");

			if (i % 50 == 49)
				System.out.println();
		}

		// main thread�� ��
		System.out.println("main��");
	}
}

// 1. Runnable �������̽��� �����޴� ���
class Test implements Runnable {
	char word;

	Test(char c) {
		word = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print(word);
			try {
				// Thread.sleep(100);
			} catch (Exception e) {
				System.out.println("sleep�� Exception �߻�");
			}

			if (i % 50 == 49)
				System.err.println();
		}

		System.out.println(word + "������ ��");
	}
}

class TestThread extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i++ < 1000) {
			System.out.print("��");
			if (i % 50 == 49)
				System.err.println();
		}
		System.out.println("�� ������ ��");
	}
}