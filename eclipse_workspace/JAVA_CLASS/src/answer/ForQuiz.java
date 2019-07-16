package answer;

public class ForQuiz {

	public static void main(String[] args) {
		// 1 ~ 200
		// 2 또는 3의 배수가 아닌 수들의 총 합은?

		
		int sum = 0;
		
		for (int i = 0; i <= 200; i++) {
			
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
            
//			 System.out.print(i + " " );
			sum += i;
	
		}
		System.out.println("총 합은 " + sum + "입니다.");

	}

}
