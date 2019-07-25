
public class D04_extends {

	// �Լ��� overloading(�����ε�)
	// ���� �̸�, �ٸ� �Ű�����(����, Ÿ���� �޶�� ��)�� �ż��带 ���� �� �ִ�.
	// �Ű������� ����, Ÿ���� �޶�� ��
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
		/* �ڹ��� Ŭ���� ���
		    - ������ Ŭ������ �״�� �������� ��
		    - extends�� ����� �Ǵ� Ŭ������ parent class
		    - parent Ŭ������ ��� ��(�ʵ�, �޼�Ʈ, ������)�� �״�� �����޴� 
		*/
		
		/*
		   ����� ����ϴ� ����
		    - ������ ����Ϳ��� �Ϻ� �����ϱ� ����
		    - ������ ������ ��ġ�� ����ä�� �ڵ� �����ϱ� ����  
		 */
		Animal a = new Animal();
		a.cry();
		
		Cat c = new Cat();
		c.cry();
		c.catInfo();
		
		
		Animal b = new Animal("�۸�");
		b.cry();
		
		
	}

}

class Animal{
	String crying;
	int walkSpeed;
	int runSpeed;
	
	Animal() {
		crying = "��� ������ �����Ҹ��� �ֽ��ϴ�.";
		walkSpeed = 10;
		runSpeed = 30;
	}
	
	Animal(String crying) {
		this.crying = crying;
	}
	
	//�θ��� cry
	void cry() {
		System.out.println(crying);
	}
	
	
	
}

class Cat extends Animal{
	/*
	  this ���� Ŭ����
	  super �θ��� Ŭ����
	  
	  this() ���� Ŭ���� ������
	  super() �θ��� Ŭ���� ������
	 */
	
	Cat() {
		// super(); // �θ��� ������
		// super("�߿�"); // �θ��� �������� �Ʒ����� �� --> ���ǵ�� �������� �ʾƼ� �� ����
		crying = "�߿�"; // --> �⺻ �������� ������ �ٲٰ�, ���ǵ嵵 ����
	}
	
	//�ż��� �������̵�
	// �ڽ��� cry()
	void cry() {
		System.out.println("����̴� :" + crying);
	}
	void catInfo() {
		System.out.println(crying + walkSpeed + runSpeed);
	}
}