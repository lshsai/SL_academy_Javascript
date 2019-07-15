package answer;

public class Condition {

	public static void main(String[] args) {
		int x = 11, year = 2019, X = 50;
		char ch = 'A';
		boolean powerOn = false;
		String str = "yes";

		System.out.println(x > 10 && x < 20);
		System.out.println(ch != ' ' && ch != '\t');
		System.out.println(ch == 'x' || ch == 'X');
		System.out.println(ch >= '0' && ch <= '9');
		System.out.println((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		System.out.println(powerOn == false);
		System.out.println(str == "yes");
		
		// 문자열의 주소가 아닌 내용으로 비교
		String str2 = new String("yes");
		System.out.println("내용비교 : " + str.equals(str2));

	}

}
