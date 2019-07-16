import java.util.Scanner;

public class B02_if {

	public static void main(String[] args) {
		// 조건문
		/*
		 * if(boolean b){ b가 true일때 실행 } else if (boolean b) { 위의 조건이 false일 경우 밑의else
		 * if체크 } else if (boolean b) { else if는 여러개 쓸 수 있다. } else { 위의 조건이 모두 false인
		 * 경우 else를 무조건 실행 }
		 */
		int a = new Scanner(System.in).nextInt();

		if (a == 10) {
			System.out.println("a가 10일때");
		} else if (a % 2 == 0) {
			System.out.println("a가 10아니고, 짝수 일때");
		} else {
			System.out.println("a가 10아니고, 짝수도 아닐 때");
		}

	}

}
