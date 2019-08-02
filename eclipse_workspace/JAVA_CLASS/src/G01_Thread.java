
public class G01_Thread {
	/*
	 * Thread란? - Program안에서 실제로 작업을 수행하는 객체 - 한 Program 안에서 여러개일 수 있다.
	 */

	public static void main(String[] args) {
		// main thread의 시작

		Thread gg = new Thread(new Test('B'));
		Thread gg1 = new Thread(new Test('C'));
		Thread gg2 = new Thread(new Test('D'));

		// start() 매서드 : 새로운 쓰레드를 생성
		// run() : 순차적으로 실행, 메서드 부른것과 같음
		gg.start();
		gg1.start();
		gg2.start();
		new TestThread().start();

		for (int i = 0; i < 1000; i++) {
			System.out.print("A");

			if (i % 50 == 49)
				System.out.println();
		}

		// main thread의 끝
		System.out.println("main끝");
	}
}

// 1. Runnable 인터페이스를 구현받는 방법
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
				System.out.println("sleep중 Exception 발생");
			}

			if (i % 50 == 49)
				System.err.println();
		}

		System.out.println(word + "쓰레드 끝");
	}
}

class TestThread extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i++ < 1000) {
			System.out.print("아");
			if (i % 50 == 49)
				System.err.println();
		}
		System.out.println("아 쓰레드 끝");
	}
}