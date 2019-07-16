package answer;

public class WhilePractice {

	public static void main(String[] args) {
		// 1 ~ 200
		// i % 2 != 0 && i % 3 != 0 ¼öÀÇ ÃÑ ÇÕ

		int sum = 0;
		int i = 0;
		while (i < 201) {
			i++;
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
