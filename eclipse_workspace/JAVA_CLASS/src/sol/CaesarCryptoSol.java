package sol;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CaesarCryptoSol {

	// 상수는 관례적으로 대문자 사용
	static final int KEY = 1;

	static String encryption(String ori) {
		String result = "";

		for (int i = 0; i < ori.length(); i++) {
			char ch = ori.charAt(i);
			result += encrypter(ch);
		}

		return result;
	}

	static char encrypter(char ch) {
		if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
			return ch;
		} else if (ch >= 'a' && ch <= 'z') {
			ch = (char) (ch + KEY);
			if (ch > 'z')
				ch = (char) ('a' + (ch - 'z') - 1);
		} else {
			ch = (char) (ch + KEY);
			if (ch > 'Z')
				ch = (char) ('A' + (ch - 'Z') - 1);
		}

		return ch;
	}

	public static void main(String[] args) {
		// 시저 암호
		// - 키(key)값 만큼 오른쪽으로 알파벳을 이동하는 암호방식
		// - 키 값 만큼 오른쪽으로 이동시킨다 : 암호화 (encryption)
		// - 암호문을 키 값 만큼 왼쪽으로 이동시킨다 : 복호화 (decryption)

		// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		// "Hello World!" => "Ifmmp Xpsme!"

		// 내가 문자를 입력하면 -> 변환된 암호문이 나온다
		String str = "aBzZ !";
		System.out.println(str);
		System.out.println(encryption(str));

	}


}
