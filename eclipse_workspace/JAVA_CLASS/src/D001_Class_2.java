
public class D001_Class_2 {

	public static void main(String[] args) {
		// Class�� �帧
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
	

	// �����ڸ� �Է����� �ʾ������� �⺻����
	Apple() {
		size = 10;
		color = "����";
		hometown = 054;
//		this(10, "����", 054); ���� ���� ����
	}

	Apple(int size, String color, int hometown) {
		this.size = size;
		this.color = color;
		this.hometown = hometown;
		// a.Apple()�Ҷ��� size / b.Apple()���� b.size
		// Class ���ο����� ���� �ν��Ͻ�(Apple �ڽ�)�� ����Ų��.

	}
}
