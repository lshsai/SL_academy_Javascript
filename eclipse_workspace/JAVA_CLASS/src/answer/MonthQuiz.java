package answer;

import java.util.Scanner;

public class MonthQuiz {

	public static void main(String[] args) {
		// 

		int month = new Scanner(System.in).nextInt();
		
		String season = null;
		
			 				
		switch (month) {
		case 1: case 2: case 12:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 9: case 10: case 8:
			season = "가을";
			break;
		default:
			season = "??";
			break;
		}
		System.out.println("계절은 " + season + "입니다.");
	}

}
