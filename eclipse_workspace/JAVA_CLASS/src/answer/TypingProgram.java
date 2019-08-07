package answer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TypingProgram {
	static String[] data = { "Apple", "Banana", "Watermelon", "Kiwi", "Melon", "Coconut" };
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> list = new ArrayList<>();
	static boolean bbreak = true;
	static String input = "";


	public static void main(String[] args) {
		/*
		 * 1. 2초마다 단어가 하나씩 ArrayList에 추가되면서 콘솔에 출력 2. 사용자가 단어를 입력하면 일치하는 단어를 삭제 3. 사용자가
		 * 모든 단어를 삭제하면 프로그램 종료
		 */
		Thread tp = new OutputListThread();
		tp.setDaemon(true);
		tp.start();
		
		while(bbreak) {
			input = JOptionPane.showInputDialog("입력하세요");
			list.remove(TypingProgram.input);
			if (TypingProgram.list.size() == 0) {
				System.out.println("종료");
				break;
			}
		}
	}
}

class OutputListThread extends Thread {
	@Override
	public void run() {
		int randNum = 0;
		TypingProgram.list.add(TypingProgram.data[randNum]);
		System.out.println(TypingProgram.list);
		while (TypingProgram.bbreak) {
			try {				
				randNum = (int) (Math.random() * TypingProgram.data.length) + 1;
				Thread.sleep(1000 * 5);
				TypingProgram.list.add(TypingProgram.data[randNum]);
				
				System.out.println(TypingProgram.list);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
