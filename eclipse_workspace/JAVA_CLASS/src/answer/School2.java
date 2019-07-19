package answer;

public class School2 {

	public static void main(String[] args) {
			
		Student2 stu = new Student2(1, 1);

		System.out.println(stu.name);
		
		System.out.println(stu.getAvg());
	}
	
}


// 반(Baan) 클래스를 만들어보세요
//  * 필드
//	- 학생이 15명, 반 번호, 반 평균, 반 순위

//  * 메서드
//	- 반 평균 점수를 구하는 메서드
//  - 학생 배열에 학생들을 15명 배치하는 메서드 (테스트용)
class Baan {
	
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










