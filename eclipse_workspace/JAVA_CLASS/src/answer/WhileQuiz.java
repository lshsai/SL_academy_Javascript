package answer;

public class WhileQuiz {

	public static void main(String[] args) {
		// ������ 100�϶��� i��
		// 1 + (-2) + 3...
		// ¦�� * -1

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
		System.out.println("����� ���� �� �� : " + total);
		System.out.println("�� ���� ���� Ƚ�� : " +(i-1));
		
	}
}
