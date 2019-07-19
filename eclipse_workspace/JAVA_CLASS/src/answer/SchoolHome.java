package quiz;


// SchoolŬ������ �ϼ��غ�����
//  * �ʵ�
//	- ���� 8��, ���� 1���� ����

//  * �޼���
//	- ���� 1���� ���ϴ� �޼���
//	- �� ������ ���ϴ� �޼���
//	- 1�ݺ��� 8���� �����ϴ� �޼��� (�׽�Ʈ��)
public class School {

	public static void main(String[] args) {
		Student s1 = new Student(1,1);
		System.out.println(s1.name);
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
class Student {
	String name;
	int baan;
	int num;
	int kor, eng, math;
	
	Student(int baan, int num) {
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










