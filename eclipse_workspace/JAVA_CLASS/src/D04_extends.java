
public class D04_extends {

	// 함수의 overloading(오버로딩)
	// 같은 이름, 다른 매개변수(갯수, 타입이 달라야 함)의 매서드를 만들 수 있다.
	// 매개변수는 갯수, 타입이 달라야 함
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static double add(int a, double b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		/* 자바의 클래스 상속
		    - 기존의 클래스를 그대로 가져오는 것
		    - extends의 대상이 되는 클래스를 parent class
		    - parent 클래스의 모든 것(필드, 메서트, 생성자)를 그대로 물려받는 
		*/
		
		/*
		   상속을 사용하는 이유
		    - 예전에 만든것에서 일부 변경하기 위해
		    - 원본에 영향을 미치지 않은채로 코드 변경하기 위해  
		 */
		Animal a = new Animal();
		a.cry();
		
		Cat c = new Cat();
		c.cry();
		c.catInfo();
		
		
		Animal b = new Animal("멍멍");
		b.cry();
		
		
	}

}

class Animal{
	String crying;
	int walkSpeed;
	int runSpeed;
	
	Animal() {
		crying = "모든 동물은 울음소리가 있습니다.";
		walkSpeed = 10;
		runSpeed = 30;
	}
	
	Animal(String crying) {
		this.crying = crying;
	}
	
	//부모의 cry
	void cry() {
		System.out.println(crying);
	}
	
	
	
}

class Cat extends Animal{
	/*
	  this 현재 클래스
	  super 부모의 클래스
	  
	  this() 현재 클래스 생성자
	  super() 부모의 클래스 생성자
	 */
	
	Cat() {
		// super(); // 부모의 생성자
		// super("야옹"); // 부모의 생성자의 아래에만 들어감 --> 스피드는 생성하지 않아서 안 나옴
		crying = "야옹"; // --> 기본 생성자의 변수를 바꾸고, 스피드도 나옴
	}
	
	//매서드 오버라이드
	// 자식의 cry()
	void cry() {
		System.out.println("고양이는 :" + crying);
	}
	void catInfo() {
		System.out.println(crying + walkSpeed + runSpeed);
	}
}