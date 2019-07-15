
public class A06_operator {

	public static void main(String[] args) {
		/* 
		 	operator ; 연산자
		 	operand ; 피연산자
		 */
		
		// [산술연산]
		int a = 7, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b); //
		
		System.out.println(a ^ b); // 비트연산 --> 정수를 이진수로 바꿔서 계산(두 비트가 다르면 1)
		
		// [비교연산 (※ 결과는 boolean type)]
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		boolean result1 = a > b;
		boolean result2 = a > b;
		System.out.println(result1);
		System.out.println(result2);

		// 단항연산
		a = 10;
		System.out.println(a++); // 10
		System.out.println(a);   // 11
		
		a = 10;
		System.out.println(++a); // 11
		System.out.println(a);   // 11
	
		boolean male = false;
		System.out.println(male);
		System.out.println(!male);
		
		//[대입연산]
		a = 10;
		a += 2;
		a -= 2;
		a *= 2;
		a %= 2;
		
		// && : 둘 모두 true일때 true
		// || : 둘 중 하나라도 true 일때 true
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);

		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		// [비트연산] (&, |, <<, >>, ~, ^)
		a = 10; b = 3; 
		
		System.out.println(a&b); // 두 비트가 모두 1이면 1
		// 10 : 1010
		// 3  : 0011
		// &  : 0010 = 2
		System.out.println(a|b); // 두 비트 중 하나 이상이 1이면 1
		// 10 : 1010
		// 3  : 0011
		// |  : 1011 = 11
		System.out.println(a^b); // 두 비트가 다르면 1
		// 10 : 1010
		// 3  : 0011
		// &  : 1001 = 9
		System.out.println(a >> 1); // 방향으로 n칸 밈
		// 10 : 1010 >> 0101 : 5 

		System.out.println(~a); // 비트 반전
		// 10 : 1010 ~
		// 10 : 00000000 00000000 00000000 00001010
		//      11111111 11111111 11111111 11110101 
		// [음수]
		// 1. 맨 앞 비트가 1이면 숫자를 뒤집는다(1의 보수)
		// 2. +1을 한다 (2의 보수)
		// 3. 극 숫자가 음수이다.
		
		//[삼항 연산]
		// 비교? 예:아니요
		// ?왼쪽의 비교결과에 따라
		// : 왼쪽을 실행할지, 오른쪽을 실행할지 결정한다
		// System.out.println(a > b? "a가 큽니다":"b가 큽니다");
		
		int c = 99;
		String result = a > b? 
				(c > a? "c가 더 큽니다":"a가 더 큽니다"):
				(c > b? "c가 더 큽니다":"b가 더 큽니다");
		System.out.println(result);
	}

}
