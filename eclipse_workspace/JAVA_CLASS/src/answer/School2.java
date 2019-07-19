package answer;

public class School2 {

	public static void main(String[] args) {
			
		Student2 stu = new Student2(1, 1);

		System.out.println(stu.name);
		
		System.out.println(stu.getAvg());
	}
	
}


// ��(Baan) Ŭ������ ��������
//  * �ʵ�
//	- �л��� 15��, �� ��ȣ, �� ���, �� ����

//  * �޼���
//	- �� ��� ������ ���ϴ� �޼���
//  - �л� �迭�� �л����� 15�� ��ġ�ϴ� �޼��� (�׽�Ʈ��)
class Baan {
	
}

// ������ ���� ������ �޼��带 ���� Student Ŭ������ ��������
//	* �ʵ�
//	- �л��̸�, ��, ��ȣ, ��������, ��������, ��������

//  * �޼���
//	- �л��� ������ ��ȯ�ϴ� �޼���
//	- �л��� ��������� ��ȯ�ϴ� �޼���
//	- �л��� ������ �������� �������ִ� �޼��� (�׽�Ʈ��)
class Student2 {
	String name;
	int baan;
	int num;
	int kor, eng, math;
	
	Student2(int baan, int num) {
		createRandomInfo(baan, num);
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	double getAvg() {
		return getTotal()/3.0;
	}
	
	String genRandomName() {		
		String name = "";
		
		for (int i = 0; i < 3; i++)
			name += (char)(Math.random()*26+'A');
		
		return name;
	}
	
	int genRandomScore() {
		return (int)(Math.random()*100+1);
	}
	
	void createRandomInfo(int baan, int num) {
		name = genRandomName();
		this.baan = baan;
		this.num = num;
		this.kor = genRandomScore();
		this.eng = genRandomScore();
		this.math = genRandomScore();
	}
}










