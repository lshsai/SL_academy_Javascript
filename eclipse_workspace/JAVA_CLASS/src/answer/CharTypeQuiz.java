package answer;

import java.util.Scanner;

public class CharTypeQuiz {

	public static void main(String[] args) {
		// ���ڿ��� ��ĳ�ʷ� �Է¹ް� (�ҹ���, �빮��, ����, ����)
		// ���ڿ��� i��° ���ڰ� �������� 
		// while���� ��� ���
		// ���ڿ��� ���� = int len = str.length();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� >> ");
		String str = sc.nextLine();
		
		int len = str.length();

		int i = 0;
		String result = null;
				
		while (i  < len) {
			char text = str.charAt(i);
			
			if ((int)text >= 48 && (int)text <= 57)
				result = "����";
			if ((int)text == 32)
				result = "����";
			if ((int)text >= 65 && (int)text <= 90)
				result = "�빮��";
			if ((int)text >= 97 && (int)text <= 122)
				result = "�ҹ���";
			
//			zero-based(0���� ���� ���� ��)�� ���̰� length�� �� length-1���� �ݺ�
			// 1���� ������ length������
			// 0���� �����̹Ƿ� length-1 �����̴�.
			// ������ length�� <�� �Բ� ���δ� 
			
			System.out.println((i+1) + "��° ���ڴ� : " + result + "�Դϴ�");
			++i;	
		}
	}

}
