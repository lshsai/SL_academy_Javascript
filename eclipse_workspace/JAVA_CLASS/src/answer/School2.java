package answer;

import java.util.Arrays;

public class School2 {

//School 클래스를 만들어보세요
// 전교 1등
// 반 순위
// 총 8개 반

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
			System.out.println(b.num + "반의 순위는" + i + "위 입니다.");
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

	// 반(Baan) 클래스를 만들어보세요
	// * 필드
//		- 학생이 15명, 반 번호, 반 평균, 반 순위

	// * 메서드
//		- 반 평균 점수를 구하는 메서드
	// - 학생 배열에 학생들을 15명 배치하는 메서드 (테스트용)
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

// 다음과 같은 변수와 메서드를 갖는 Student 클래스를 만들어보세요
//	* 필드
//	- 학생이름, 반, 번호, 국어점수, 영어점수, 수학점수

//  * 메서드
//	- 학생의 총점을 반환하는 메서드
//	- 학생의 평균점수를 반환하는 메서드
//	- 학생의 정보를 랜덤으로 생성해주는 메서드 (테스트용)
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
		System.out.println("===" + name + " 의 정보 ===");
		System.out.println("반 : " + baan);
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + getTotal());
		System.out.println("평균 : " + getAvg());

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