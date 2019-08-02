
public class G04_Priority {
	public static void main(String[] args) {
		Thread th7 = new Thread(new Thread7());
		Thread th8 = new Thread(new Thread8());

		th7.setPriority(1);
		th8.setPriority(8);

		System.out.println("th7�� �켱����" + th7.getPriority());
		System.out.println("th8�� �켱����" + th8.getPriority());

		th7.start();
		th8.start();
		for (int i = 0; i < 300; i++) {
			System.out.print("A");
			if (i % 50 == 49)
				System.out.println();
		}
		System.out.println("main ��");
	}
}

class Thread7 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			if (i % 50 == 49)
				System.out.println();
		}
		System.out.println("th7 ��");
	}
}

class Thread8 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			if (i % 50 == 49)
				System.out.println();
		}
		System.out.println("th8 ��");
	}
}
