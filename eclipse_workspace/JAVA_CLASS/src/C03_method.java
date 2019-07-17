
public class C03_method {

	/* method는 함수
    		- 뒤에 () 붙게 된다.
    		- 특정 명령어들의 묶음
    		- 반환값, 반환타입을 가진다
    		- 재사용이 가능
    		- 반드시 class 내부에 만들어야 한다.
  
  		main()은 
    		- 프로그램의 시작과 끝이자, 하나의 쓰레드이다.(main thread)
	 */
	/* 
	   static : new를 쓸것이냐 안 쓸것이냐
	   void : 반환 데이터가 없을 경우 
	   createRabbit : 메서드의 이름
	   () : 전달 받는 값(데이터, 매개변수)
	 */
	static void createRabbit() {
		System.out.println("======================");
		System.out.println("        /)/)");
		System.out.println("       ( ..)");
		System.out.println("       (  >♡");
		System.out.println("  Have a Good Time");
		System.out.println("======================");
		System.out.println();
	}
	
	static int getTotal(int kor, int eng) {
		int total = kor + eng;
		return total;
	}
	
	static int getAverage(int num1, int num2) {
		int average = (num1 + num2)/2;
		return average;
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
			createRabbit();
		
		System.out.println(getAverage(50, 70));
		
		int kor = 70;
		int eng = 100;
		int total = getTotal(eng , kor); 
		// 변수이름과 상관없이 각 번째의 데이터가 할당 된다.(100, 70)들어감
		// 매개변수 개수와 타입이 일치해야 한다.
	
		
	}

}
