package answer;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuiz {
	private static final boolean True = false;

	public static void main(String[] args) {
		/*
		 * HashMao�� ������ id�� pw�� �־�ΰ�, id,pw�� �Է� �޾�����, �����Ͽ�, ��ġ�ϸ� �α����� �����ϴ� ���α׷��� �ۼ�
		 */

		HashMap<String, String> userInfo = new HashMap<>();
		userInfo.put("abc", "llii");
		userInfo.put("efd", "18121");

		Scanner sc = new Scanner(System.in);

		System.out.println("* *Login Program ver.1.1* *");
		while (true) {
			System.out.print("ID : ");
			String id = sc.nextLine();

			if (!userInfo.containsKey(id)) {
				System.out.println("�������� �ʴ� id�Դϴ�.");
				continue;
			} else {
				System.out.println("pw : ");
				String password = sc.nextLine();
				if (!userInfo.containsValue(password)) {
					System.out.println("��й�ȣ�� �ٽ� �Է��� �ּ���.");
					continue;
				} else {
					System.out.println("Login Success");
					break;
				}
			}
		}
	}
}
