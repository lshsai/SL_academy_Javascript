package sol;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CaesarCryptoSol {

	// ����� ���������� �빮�� ���
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
		// ���� ��ȣ
		// - Ű(key)�� ��ŭ ���������� ���ĺ��� �̵��ϴ� ��ȣ���
		// - Ű �� ��ŭ ���������� �̵���Ų�� : ��ȣȭ (encryption)
		// - ��ȣ���� Ű �� ��ŭ �������� �̵���Ų�� : ��ȣȭ (decryption)

		// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		// "Hello World!" => "Ifmmp Xpsme!"

		// ���� ���ڸ� �Է��ϸ� -> ��ȯ�� ��ȣ���� ���´�
		String str = "aBzZ !";
		System.out.println(str);
		System.out.println(encryption(str));

	}


}
