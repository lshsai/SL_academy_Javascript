package answer;

import java.util.Arrays;

public class School2 {

//School Ŭ������ ��������
// ���� 1��
// �� ����
// �� 8�� ��

	Baan2[] baans = new Baan2[8];
	Baan2[] rank;

	Student2[] top;
	int topScore = 0;

	int numOfStudent=0;

	void setBaanRank() {
		rank = baans.clone();

		for (int i = 7; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (rank[j].avg > rank[j + 1].avg) {
					Baan2 tmp = rank[j];
					rank[j] = rank[j + 1];
					rank[j + 1] = tmp;

				}
			}
		}

		int i = 1;
		for (Baan2 b : rank) {
			System.out.println(b.num + "���� ������" + i + "�� �Դϴ�.");
			i++;
		}
		System.out.println();
	}

	void initSchool() {
		for (int i = 0; i < baans.length; i++)
			baans[i] = new Baan2(i+1);
	}

	void findTop() {
		for (Baan2 b : baans) {
			for (Student2 s : b.students) {
				if (topScore < s.getTotal()) {
					topScore = s.getTotal();
				}
			}
		}
		findOtherTops();
	}

	void findOtherTops() {
		int count = 0;
		
		Student2[] topStudents = new Student2[10];

		for (Baan2 b : baans) {
			for (Student2 s : b.students) {
				if (topScore == s.getTotal()) {
					topStudents[count] = s;
					count++;
				}
			}
		}
		
		numOfStudent = count;
		top = topStudents;
	}

	void calcRank() {
		double[] baanRank = new double[baans.length];

		for (int i = 0; i < baans.length; i++) {
			baanRank[i] = baans[i].avg;
		}

		Arrays.sort(baanRank);
		System.out.println(baanRank[0]);

	}

	// ��(Baan) Ŭ������ ��������
	// * �ʵ�
//		- �л��� 15��, �� ��ȣ, �� ���, �� ����

	// * �޼���
//		- �� ��� ������ ���ϴ� �޼���
	// - �л� �迭�� �л����� 15�� ��ġ�ϴ� �޼��� (�׽�Ʈ��)
}
class Baan2 {
	Student2[] students = new Student2[15];
	int num;
	double avg;
	int rank;

	Baan2(int baan) {
		num = baan;
		initStudents(baan);
		calcAvg();
	}

	void initStudents(int baan) {
		for (int i = 0; i < students.length; i++)
			students[i] = new Student2(baan, i + 1);
	}

	void calcAvg() {
		double total = 0;
		// enhanced for loop (forEach)
		for (Student2 s : students) {
			total += s.getAvg();
		}

		avg = total / 15;

	}

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
		return getTotal() / 3.0;
	}

	String genRandomName() {
		String name = "";

		for (int i = 0; i < 3; i++)
			name += (char) (Math.random() * 26 + 'A');

		return name;
	}

	int genRandomScore() {
		return (int) (Math.random() * 100 + 1);
	}

	void view() {
		System.out.println("===" + name + " �� ���� ===");
		System.out.println("�� : " + baan);
		System.out.println("��ȣ : " + num);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + getTotal());
		System.out.println("��� : " + getAvg());

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