package answer;

import java.time.DayOfWeek;

public class B03_Homework {

	public static void main(String[] args) {
		// 방학 L
		// targetMath_B, targetkor_A
		// maxMath_C, maxkor_D

		// 2<= L <= 40
		// 1 <= A, B <= 1000
		// 1 <= C, D <= 1000

		while (true) {

			int L = (int) (Math.random() * 39) + 2;
			int A = (int) (Math.random() * 1000) + 1;
			int B = (int) (Math.random() * 1000) + 1;
			int C = (int) (Math.random() * 100) + 1;
			int D = (int) (Math.random() * 100) + 1;

			
//			A/C 수학 
//			B/D 국어
			
			if (A/C > L)
				continue;
			else if (B/D > L)
				continue;
			else {
				int dayOfMath = A%C==0? A/C : A/C+1;
				int dayOfKor = B%D==0? B/D : B/D+1;
				
				
				int dayOfHomework = dayOfMath>dayOfKor? dayOfMath : dayOfKor;
				System.out.println("놀 수 있는 날은 " + (L - dayOfHomework) + "일 입니다.");
				break;
			}
			
			


		}
	}
}
