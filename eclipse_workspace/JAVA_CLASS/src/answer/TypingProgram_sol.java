package answer;

import java.util.ArrayList;
import java.util.Scanner;

public class TypingProgram_sol extends Thread {

	static String[] data = { "Apple", "Banana", "Watermelon", "Kiwi", "Melon", "Coconut" };
	
	ArrayList<String> words;
	long interval;
	WordAdder adder;
	Scanner sc;

	public TypingProgram_sol() {
		adder = new WordAdder();
		adder.setDaemon(true);
		words = new ArrayList<String>();
		interval = 3 * 1000;
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		/*
		 * 1. 2�ʸ��� �ܾ �ϳ��� ArrayList�� �߰��Ǹ鼭 �ֿܼ� ��� 2. ����ڰ� �ܾ �Է��ϸ� ��ġ�ϴ� �ܾ ���� 3. ����ڰ�
		 * ��� �ܾ �����ϸ� ���α׷� ����
		 */

		TypingProgram_sol tp = new TypingProgram_sol();

		// ���� class�ٷ� �� �� ���, 19���� �����ϰ�
		// �ٷ� tp.WordAdder().start()�ȵ�
		
		tp.adder.start();
		tp.start();
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(">>");
			String input = sc.nextLine();
			
			int index = words.indexOf(capitalize(input));
			
			if(index != -1) {
				words.remove(index);
			}
			
			if(words.size() ==0)
				break;
		}
		
		System.out.println("����");
	}

	public String capitalize(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
	}
	
	class WordAdder extends Thread {
		@Override
		public void run() {
			while (true) {
				words.add(data[(int) (Math.random() * data.length)]);
				System.out.println(words);

				try {
					sleep(interval);
				} catch (Exception e) {
					System.out.println("Sleep Error");
				}
			}
		}
	}
}
