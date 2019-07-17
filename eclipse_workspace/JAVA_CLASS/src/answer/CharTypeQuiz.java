package answer;

import java.util.Scanner;

public class CharTypeQuiz {

	public static void main(String[] args) {
		// 문자열을 스캐너로 입력받고 (소문자, 대문자, 숫자, 공백)
		// 문자열의 i번째 글자가 무엇인지 
		// while으로 모두 출력
		// 문자열의 길이 = int len = str.length();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 >> ");
		String str = sc.nextLine();
		
		int len = str.length();

		int i = 0;
		String result = null;
				
		while (i  < len) {
			char text = str.charAt(i);
			
			if ((int)text >= 48 && (int)text <= 57)
				result = "숫자";
			if ((int)text == 32)
				result = "공백";
			if ((int)text >= 65 && (int)text <= 90)
				result = "대문자";
			if ((int)text >= 97 && (int)text <= 122)
				result = "소문자";
			
//			zero-based(0부터 숫자 세는 것)은 길이가 length일 떄 length-1까지 반복
			// 1부터 셀때는 length까지만
			// 0부터 시작이므로 length-1 까지이다.
			// 때문에 length는 <와 함께 쓰인다 
			
			System.out.println((i+1) + "번째 문자는 : " + result + "입니다");
			++i;	
		}
	}

}
