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
		 * 1. 2초마다 단어가 하나씩 ArrayList에 추가되면서 콘솔에 출력 2. 사용자가 단어를 입력하면 일치하는 단어를 삭제 3. 사용자가
		 * 모든 단어를 삭제하면 프로그램 종료
		 */

		TypingProgram_sol tp = new TypingProgram_sol();

		// 내부 class바로 쓸 수 없어서, 19줄의 생성하고
		// 바로 tp.WordAdder().start()안됨
		
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
		
		System.out.println("종료");
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
