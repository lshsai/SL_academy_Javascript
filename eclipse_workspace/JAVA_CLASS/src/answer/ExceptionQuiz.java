package answer;

import java.util.Scanner;

public class ExceptionQuiz {

	public static void main(String[] args) {
		/*
		 * nextInt�� �����Է� �ٸ� Ÿ���� ���, �ٽ� �Է��ϵ��� ����ó���� �Ѵ�
		 */
		while (true) {
			try {
				inPutNum();
				break;
			} catch (Exception e) {
				System.out.println("���� �߻�");
			}
		}
	}

	public static void inPutNum() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.println("���� ���°� �Ǿ�� �մϴ�.");
		a = sc.nextInt();

		System.out.println(a);
	}

}

/*
 * Scanner sc = new Scanner(System.in); int a = 0; while (true) { try {
 * System.out.println("���� ���°� �Ǿ�� �մϴ�."); a = sc.nextInt();
 * System.out.println(a); break; } catch (Exception e) {
 * System.out.println("���� ���·� �־��ּ���."); sc.nextLine(); } }
 */
