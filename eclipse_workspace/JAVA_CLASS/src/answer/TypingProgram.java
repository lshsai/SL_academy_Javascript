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
		 * 1. 2�ʸ��� �ܾ �ϳ��� ArrayList�� �߰��Ǹ鼭 �ֿܼ� ��� 2. ����ڰ� �ܾ �Է��ϸ� ��ġ�ϴ� �ܾ ���� 3. ����ڰ�
		 * ��� �ܾ �����ϸ� ���α׷� ����
		 */
		Thread tp = new OutputListThread();
		tp.setDaemon(true);
		tp.start();
		
		while(bbreak) {
			input = JOptionPane.showInputDialog("�Է��ϼ���");
			list.remove(TypingProgram.input);
			if (TypingProgram.list.size() == 0) {
				System.out.println("����");
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
