
public class D01_Class {

	public static void main(String[] args) {
		// ��ü���� ���α׷���

		/* ��ü
		   �����ϴ� ��� ��(�繰, �߻� ���) - ��ü(����)�� �ʵ�(����)ȭ �ൿ(�޼���)�� ǥ��
		 */

		/* Ŭ����
		   - ��� Ŭ�����z �ϳ��� '������ Ÿ��'�̴�. 
		   - Ŭ������ ��ü�� ���赵 - Ŭ������ ���� ������� ��ü�� '�ν��Ͻ�'��� �θ���.
		 */

		/*  �ٽ� �� �� ���� --> new Student();
			�ٽ� ����ϱ� ���� ������ ���� ; Student s1 = new Student();
			'���ο� �ν��Ͻ�' Student s2 = new Student();
		 	 Ŭ������ ���� ������ �ν��Ͻ��� ��� �ٸ���.
		 */

		/* Ŭ������ ���� ��Ģ��
			- ���� ��Ű�� �������� ���� �̸��� Ŭ������ ����� �� ����.
			public class�� '���� �̸�'�� ���ƾ� �Ѵ�.
			public class�� �� ���� ���� �Ѱ��� ����
			�ٸ� ��Ű�������� public class���� ������ �� �ִ�.
			public class�� �� ���� ��ü�� ��ü
		*/ 
		
		/* ������
		 	- �ν��Ͻ��� ������ �� �� �ѹ� ���� (new Student();)
		 	- Ŭ���� �̸��� ���� �̸��� �ż��� 
		 	- ��� �ν��Ͻ��� ����
		 	
		 */
		
		// s1, s2�� ���� Ŭ������ �������, �ٸ� ��ü
		// ��ó�� Ŭ������ ���� ������� �ϳ��� ��ü�� �ν��Ͻ���� �θ���
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "ȫ�浿";
		s2.name = "�Ӳ���";
		
		s1.info();
		
		Student[] students = new Student[100];
		System.out.println(students);
		
		// �̰Ͱ� ����������, ó�� student �迭�� ����������, null���� ��� ����. 
		// �Ʒ� ó�� ������ ��� ��.
		// String str = new String();
		// System.out.println(str);
		
		for (int i=0; i<students.length; i++) {
			students[i] = new Student();
		}
	}
}

class Student {
	String name;
	int kor;
	int eng;
	int num;
	int ban;
	
	// �����ڴ� ��ȯŸ���� ���� (�����ڸ� ȣ������ ��, ��ȯ�ϴ� ���� �ν��Ͻ��� �ּҸ� ��ȯ�ϹǷ�)
	// Ŭ���� �̸��� ���� �̸��� �޼��� �̴�. 
	Student() {
		name = "�⺻";
		kor = 5;
		eng = 1;
		ban = 1;
	}
	
	void info() {
		System.out.println("�̸� : " + name);
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�� : " + ban);
	}
}

class Bus {
	int numOfWheels;
	int capacity;
	Wheel[] wheels = new Wheel[numOfWheels];
	Student[] passenger = new Student[capacity];
	Chair[] chairs = new Chair[capacity / 2];
}

class Chair {

}

class Wheel {
	int r;
	int type;
}
