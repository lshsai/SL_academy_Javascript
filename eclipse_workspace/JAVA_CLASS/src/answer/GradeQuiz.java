package answer;

import java.util.Scanner;

public class GradeQuiz {

	public static void main(String[] args) {
		// 90 >= A / 80 >= B / 70 >= C / 60>= D / else F

		int grade = new Scanner(System.in).nextInt();

		if (grade > 100) {
			System.out.println("점수가 이상합니다");
		} else if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}

