package answer;

import java.util.Scanner;

public class CeasarCrypto {

	//����� ���������� �빮�� ���
	static final int KEY = 15;
	
	static String encryption(String original) {
		String result = null;;

		for (int i=0; i<original.length(); i++) {
			char ch = original.charAt(i);
			result += encrypter(ch);
		}
		
		return result;
	}
	
	static char encrypter(char ch) {
		if (!((ch >= 'a' && ch<='z') || (ch >= 'a' && ch <'z')))
			return ch;
		else if (ch >= 'a' && ch <= 'z') {
			ch = (char) (ch + KEY);
			if (ch > 'z')
				ch = (char) ('a' + (ch-'z')-1);
		}
		return ch;
	}
	public static void main(String[] args) {
		// ���� ��ȣ
		// Ű(key)�� ��ŭ ���������� ���ĺ��� �̵��ϴ� ��ȣ ���
		// key�� ��ŭ ���������� �̵� : ��ȣȭ(encryption)
		// key�� ��ŭ �������� �̵� : ��ȣȭ(decryption)
		// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		// "Hello World" => "IFMMP XPSME!"

		// 1. ���ڸ� �Է�
		// 2. ��ȣ���� ���
		// 3. Ű ���� 26�̻��� �� �� ����.

		System.out.println("��ȣȭ �� ���ڸ� �Է� �ϼ���");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

//		for (int i = 0; i < str.length(); i++) {
//			int convert = (int) str.charAt(i);
//
//			if (convert == 'z' || convert == 'Z') {
//				convert = (convert - ('z' - 'a'));
//				System.out.print((char) convert);
//			} else if (convert >= 'a' && convert < 'z') {
//				convert++;
//				System.out.print((char) convert);
//			} else if (convert >= 'A' && convert < 'Z') {
//				convert++;
//				System.out.print((char) convert);
//			} else {
//				convert = convert;
//				System.out.print((char) convert);
//			}
//		}
		

	}
}
