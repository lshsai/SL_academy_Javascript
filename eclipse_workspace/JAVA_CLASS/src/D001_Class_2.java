
public class D001_Class_2 {

	public static void main(String[] args) {
		// Class의 흐름
		Apple a;
		a = new Apple();
		int size = a.size;

		Apple b = new Apple(), C = new Apple();

		System.out.println(a.size);
		System.out.println(a.color);

		AppleBox box = new AppleBox();

		box.apples[0] = a;
		box.apples[1] = new Apple();
		box.apples[2] = new Apple();
	}

}

class AppleBox {
	Apple[] apples = new Apple[10];
}

class Apple {
	int size;
	String color;
	int hometown;

	static int seoul = 2;
	static int busan = 3;
	

	// 생성자를 입력하지 않았을때의 기본형태
	Apple() {
		size = 10;
		color = "빨강";
		hometown = 054;
//		this(10, "빨강", 054); 위에 꺼라 같음
	}

	Apple(int size, String color, int hometown) {
		this.size = size;
		this.color = color;
		this.hometown = hometown;
		// a.Apple()할때의 size / b.Apple()때의 b.size
		// Class 내부에서의 현재 인스턴스(Apple 자신)을 가르킨다.

	}
}
