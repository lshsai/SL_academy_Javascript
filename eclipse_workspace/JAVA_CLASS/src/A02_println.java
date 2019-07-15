
public class A02_println {

	public static void main(String[] args) {
		
		System.out.println(123); // 숫자
		System.out.println(); // 줄바꾸기(엔터키)
		System.out.println(""); // 문자열 (문자 여러 개)
		System.out.println('0'); // 문자
				
		System.out.println(""); // 명령 후, 자동 줄 바꿈
		System.out.print(""); // 명령 후, 줄 바꿈 없음
				
		// \가 붙은 문자는 특수기능을 가진 문자로 인식한다.
		// * \n 줄 바꿈 기능
		// * \t tab 기능
		// * \\ 역슬래시를 문자로 출력(경로를 입력하는 경우)
		// * \" 쌍따옴표를 출력
		// * \' 홑따옴표를 출력
		
		System.out.println("안녕하세요\n반갑습니다");
		System.out.println("안녕하세요\t 반갑습니다");
		System.out.println("C:\\User\\admin\\Destop");
		System.out.println("빨리 \"집에\" 와라");
		System.out.println("빨리 '집에' 와라");
		
		int weight = 78;
		System.out.printf("%dkg", weight);
		System.out.println("");
		System.out.println(weight + "kg");
		
		
	}

}
