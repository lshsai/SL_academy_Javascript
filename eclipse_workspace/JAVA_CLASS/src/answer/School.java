package answer;

import java.util.Arrays;

public class School {

}

class Bann {
	
}

/*
 	[�ʵ�]
 	- �л��̸�, ��, ��ȣ, ��������, ��������, ��������
 	
 	
 	[�޼���]
 	- �л��� ������ ��ȯ�ϴ� �޼��� totalSum()
 	- �л��� ��������� ��ȯ�ϴ� �޼��� avg()
 	- �л��� ������ �������� �������ִ� �޼��� randomStudent()
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
				"ȫ�浿", 
				"3 ��", 
				"001",
				"40",
				"50",
				"60"
			},
			{
				"��浿", 
				"1 ��", 
				"002",
				"60",
				"90",
				"90"
			},
			{
				"��ȫ��", 
				"2 ��", 
				"003",
				"40",
				"40",
				"20"
			}
	};
	
	
	void makeRandomInfo() {
		random[0].name = "ȫ�浿";
		/* �밡�ٷ� �������� ���� */
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