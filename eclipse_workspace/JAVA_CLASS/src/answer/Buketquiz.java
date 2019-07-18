package answer;

public class Buketquiz {

	public static void main(String[] args) {
		/* 사과 123개
		 * 1바구니 10개 담을 수 있음
		 * 필요한 총 바구니 수는?
		 */
		
		int apple = 123;
		int result = apple % 10 == 0? 
				(apple/10):
				((apple/10)+1);
		System.out.println(result);
		
		

	}

}
