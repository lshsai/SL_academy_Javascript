package answer;

import java.util.Scanner;

public class CeasarCrypto {

	//상수는 관례적으로 대문자 사용
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
		// 시저 암호
		// 키(key)값 만큼 오른쪽으로 알파벳을 이동하는 암호 방식
		// key값 만큼 오른쪽으로 이동 : 암호화(encryption)
		// key값 만큼 왼쪽으로 이동 : 복호화(decryption)
		// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		// "Hello World" => "IFMMP XPSME!"

		// 1. 문자를 입력
		// 2. 암호문이 출력
		// 3. 키 값은 26이상이 될 수 없다.

		System.out.println("암호화 할 문자를 입력 하세요");
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
