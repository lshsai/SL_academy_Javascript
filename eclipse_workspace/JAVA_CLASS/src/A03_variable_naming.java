
// pubic class의 이름은 반드시 파일명과 같아야 한다. 
// pubic class는 한 파일당 하나만 존재할 수 있다.
public class A03_variable_naming {

	public static void main(String[] args) {
		
		// [변수를 사용 하는 이유]
		// 1. 값을 일괄적으로 변경할 수 있다
		// 2. 값에 의미를 부여할 수 있다(변수 이름 작명이 중요하다)
		
		// [변수의 작명 규칙] (개발자간의 약속, 권장 사항)
		/*
		   1. _(언더바)활용 : 두 단어 이상을 이어붙인 변수명
		   ex) minsu_weight
		   
		   2. 대문자 활용 : 두 단어 이상을 이어분인 변수명 
		   ex) minsuWeight
		   
		   3. 변수명 첫글자는 소문자를 사용하자
		   4. 클래스명 첫글자는 대문자를 사용하자
		   5. 변수 내용을 알 수 있는 단어를 사용하자
		   
		 */
		
		// [반드시 지켜야할 작명 규칙] (필수사항)
		/* 1. 변수의 첫 번째 숫자 불가
		   2. 변수사이 공백 불가
		   3. 특수문자는 _, $만 사용 가능
		   4. 예약어(int, class, public 등) 사용 불가 
		 */
		
		int weight = 5;
		
		System.out.println(weight);
		System.out.println(weight);
		System.out.println(weight);
		System.out.println(weight);
	}
}
