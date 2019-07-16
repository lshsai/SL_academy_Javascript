package answer;

public class WhileQuiz {

	public static void main(String[] args) {
		// 총합이 100일때의 i값
		// 1 + (-2) + 3...
		// 짝수 * -1

		int total = 0;
		int i = 1;
		int num = 0;

		while (total <= 100) {
			if (i % 2 == 0)
				num = -1;
			else
				num = 1;

			total += i * num;
			++i;
		}
		System.out.println("종료될 때의 총 합 : " + total);
		System.out.println("그 때의 실행 횟수 : " +(i-1));
		
	}
}
