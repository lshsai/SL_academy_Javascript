package answer;

public class B05_breakAndContinue {

	public static void main(String[] args) {

		// break ; 처음 만나는 break에서 반복 끝
		int i = 0;
		for (;;) {
			System.out.println(++i);
			if (i > 50)
				break;
		}

		// continue ; 만난 순간부터 처음으로 시작

		for (int j = 0; j < 50; j++) {

			if (j % 2 == 0 && j != 0)
				continue;
			// for, if 등의 중괄호는 실행할 명령이 하나라면 생략 가능

			System.out.println(j);
		}

	}
}
