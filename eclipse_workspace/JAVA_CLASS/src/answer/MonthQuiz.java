package answer;

import java.util.Scanner;

public class MonthQuiz {

	public static void main(String[] args) {
		// 

		int month = new Scanner(System.in).nextInt();
		
		String season = null;
		
			 				
		switch (month) {
		case 1: case 2: case 12:
			season = "�ܿ�";
			break;
		case 3: case 4: case 5:
			season = "��";
			break;
		case 9: case 10: case 8:
			season = "����";
			break;
		default:
			season = "??";
			break;
		}
		System.out.println("������ " + season + "�Դϴ�.");
	}

}
