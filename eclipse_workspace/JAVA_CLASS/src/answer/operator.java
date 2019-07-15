package answer;

public class Operator {

	public static void main(String[] args) {
		// int a 선언
		// 삼항연산자 사용
		// a 홀수 "홀수 입니다"
		// a 짝수 "짝수 입니다"
		
		int a = 4;
		System.out.println(a % 2 == 0? "짝수 입니다":"홀수 입니다");
		
		/*
		 	b -> 100자리 미만 버리고 출력
		 */
		int b = 41516;
		b = b / 100;
		b = b * 100;
		System.out.println(b);
		
		/*
	 	어떤수가 들어와도 일의 자리를 3으로 출력
		 */
		int c = 509;
		c = c / 10;
		c = c * 10;
		c = c + 3;
		System.out.println(c); 	
		 
		
		

	}

}
