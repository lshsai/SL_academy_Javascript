package answer;

public class ChangeCaseQuiz {

	public static void main(String[] args) {
		
		
		// ch�� �빮�ڰ� ������ �ҹ��ڷ�
		// ch�� �ҹ��ڰ� ������ �빮�ڷ�
		
		char ch = 'A';
		int result = (ch >= 'a' && ch <= 'z')? 
				(ch-32):
				(ch+32);
		System.out.println((char)result);
		
		
		char ch2 = '!';
		
		int diff = 'A' -'a';
		
		ch2 = (char) ((ch2 >= 'a' && ch2 <= 'z')?
							ch2 +diff :
							((ch2 >= 'A' && ch2 <= 'Z')?
									ch2-diff :
										ch2));
		
		System.out.println(ch2);
		
	}

}
