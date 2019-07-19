package answer;

import java.util.Arrays;

public class School {

}

class Bann {
	
}

/*
 	[필드]
 	- 학생이름, 반, 번호, 국어점수, 영어점수, 수학점수
 	
 	
 	[메서드]
 	- 학생의 총점을 반환하는 메서드 totalSum()
 	- 학생의 평균점수를 반환하는 메서드 avg()
 	- 학생의 정보를 랜덤으로 생성해주는 메서드 randomStudent()
 */


class Student {
	String name;
	int bann;
	int number;
	int kor;
	int eng;
	int math;
	
	Student[] random = {
			new Student(),
			new Student(),
			new Student()
	};
	
	String[][] studentInfo = {
			{
				"홍길동", 
				"3 반", 
				"001",
				"40",
				"50",
				"60"
			},
			{
				"고길동", 
				"1 반", 
				"002",
				"60",
				"90",
				"90"
			},
			{
				"동홍길", 
				"2 반", 
				"003",
				"40",
				"40",
				"20"
			}
	};
	
	
	void makeRandomInfo() {
		random[0].name = "홍길동";
		/* 노가다로 랜덤정보 생성 */
	}
	
	void setStudent(Student s) {
		this.name = s.name;
		this.bann = s.bann;
		this.kor = s.kor;
		this.eng = s.eng;
		this.math = s.math;
		this.number = s.number;
	}
	
	void randomStudent() {
		makeRandomInfo();		
		
		int ran = (int)(Math.random()*studentInfo.length)+1;
		
		setStudent(random[ran]);
		
		/*
		int ran = (int)(Math.random()*studentInfo.length)+1;
		String[] randomInfo = studentInfo[ran];
		
		name = randomInfo[0];
		bann = (int)(randomInfo[1].charAt(0));
		number = Integer.parseInt(randomInfo[2]);
		kor = Integer.parseInt(randomInfo[3]);
		eng = Integer.parseInt(randomInfo[4]);
		math = Integer.parseInt(randomInfo[5]);
		*/
	}
//	
//	void avg(String[] studentInfo) {
//		for (int i=3; i<studentInfo.length; i++) {
////			kor = (int)studentInfo[i]
////			eng = (int)studentInfo[i]
////			math = (int)studentInfo[i]
//		}
//		
//		
//	}
//	
//	void totalSum() {
//		
//	}
	
}