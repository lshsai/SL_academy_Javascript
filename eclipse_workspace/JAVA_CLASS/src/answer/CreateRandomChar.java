package answer;

public class CreateRandomChar {

	public static void main(String[] args) {
		// 랜덤 알파벳 소문자 50개 출력
//		for (int i = 0; i < 50; i++) {
//			char ch = (char) ((int) (Math.random() * 25) + 97);
//			System.out.println(ch);
//		}
		
//		int range = 'z' - 'a' +1;
//		for (int i = 0; i < 50; i++) {
//			System.out.print((char)(Math.random()*range+'a'));
//			if (i%10 == 9) 
//				System.out.println();
//		}
//		
		// Math.random()*[range] + [시작 값]
		// 37 ~ 88 랜덤 숫자 뽑기
		// range = (88-37) + 1
		// Math.random()+ ((88-37) + 1) + 37
		
		char ch = 'a';
		for (int i = 0; i <50; i++) {
			int dummy = (int)(Math.random()*26);
			char out_ch = (char)((int)ch + dummy);
			System.out.print(out_ch + " ");
			if (i%10 == 9) 
				System.out.println();
		}
		
	}
}
