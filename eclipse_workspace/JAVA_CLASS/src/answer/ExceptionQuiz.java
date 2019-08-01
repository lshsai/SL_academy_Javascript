package answer;

import java.util.Scanner;

public class ExceptionQuiz {

	public static void main(String[] args) {
		/*
		 * nextInt로 숫자입력 다른 타입의 경우, 다시 입력하도록 예외처리를 한다
		 */
		while (true) {
			try {
				inPutNum();
				break;
			} catch (Exception e) {
				System.out.println("예외 발생");
			}
		}
	}

	public static void inPutNum() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.println("숫자 형태가 되어야 합니다.");
		a = sc.nextInt();

		System.out.println(a);
	}

}

/*
 * Scanner sc = new Scanner(System.in); int a = 0; while (true) { try {
 * System.out.println("숫자 형태가 되어야 합니다."); a = sc.nextInt();
 * System.out.println(a); break; } catch (Exception e) {
 * System.out.println("숫자 형태로 넣어주세요."); sc.nextLine(); } }
 */
