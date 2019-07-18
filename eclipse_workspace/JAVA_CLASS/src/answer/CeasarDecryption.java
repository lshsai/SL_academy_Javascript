package answer;

public class CeasarDecryption {


	// ����� ���������� �빮�� ���
	static final int KEY = 1;

	static String decryption(String ori) {
		String result = "";

		for (int i = 0; i < ori.length(); i++) {
			char ch = ori.charAt(i);
			result += decrypter(ch);
		}

		return result;
	}

	static char decrypter(char ch) {
		if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
			return ch;
		} else if (ch >= 'a' && ch <= 'z') {
			ch = (char) (ch - KEY);
			if (ch < 'a')
				ch = (char) ('z' - ('a' - ch) + 1);
		} else {
			ch = (char) (ch - KEY);
			if (ch < 'A')
				ch = (char) ('Z' - ('A' - ch) + 1 );
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
		String str = "aBzasdasdas Z !";
		System.out.println(str);
		System.out.println(decryption(str));

	}
}