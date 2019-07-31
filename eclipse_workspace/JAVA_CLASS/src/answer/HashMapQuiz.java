package answer;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuiz {
	private static final boolean True = false;

	public static void main(String[] args) {
		/*
		 * HashMao에 유저의 id와 pw로 넣어두고, id,pw를 입력 받았을때, 대조하여, 일치하면 로그인을 성공하는 프로그램을 작성
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
				System.out.println("존재하지 않는 id입니다.");
				continue;
			} else {
				System.out.println("pw : ");
				String password = sc.nextLine();
				if (!userInfo.containsValue(password)) {
					System.out.println("비밀번호를 다시 입력해 주세요.");
					continue;
				} else {
					System.out.println("Login Success");
					break;
				}
			}
		}
	}
}
