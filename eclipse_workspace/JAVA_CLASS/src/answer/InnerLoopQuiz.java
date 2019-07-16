package answer;

public class InnerLoopQuiz {

	public static void main(String[] args) {
		// 1 + (1+2) + .....(1+2...+10)

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("[" + i + "]");
			for (int j = 1; j <= i; j++) {
				sum += j;
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
