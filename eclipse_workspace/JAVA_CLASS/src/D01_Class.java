
public class D01_Class {

	public static void main(String[] args) {
		// 객체지향 프로그래밍

		/* 객체
		   존재하는 모든 것(사물, 추상 모두) - 객체(모든것)를 필드(변수)화 행동(메서드)로 표현
		 */

		/* 클래스
		   - 모든 클래스틑 하나의 '참조형 타입'이다. 
		   - 클래스는 객체의 설계도 - 클래스에 의해 만들어진 객체를 '인스턴스'라고 부른다.
		 */

		/*  다시 쓸 수 없음 --> new Student();
			다시 사용하기 위해 변수에 담음 ; Student s1 = new Student();
			'새로운 인스턴스' Student s2 = new Student();
		 	 클래스에 의해 생성된 인스턴스는 모두 다르다.
		 */

		/* 클래스의 여러 규칙들
			- 같은 패키지 내에서는 같은 이름의 클래스를 사용할 수 없다.
			public class는 '파일 이름'과 같아야 한다.
			public class는 한 파일 내에 한개만 존재
			다른 패키지에서는 public class에만 접근할 수 있다.
			public class가 그 파일 전체의 주체
		*/ 
		
		/* 생성자
		 	- 인스턴스를 생성할 때 단 한번 실행 (new Student();)
		 	- 클래스 이름과 같은 이름의 매서드 
		 	- 모든 인스턴스의 시작
		 	
		 */
		
		// s1, s2는 같은 클래스로 만들어진, 다른 객체
		// 이처럼 클래스를 통해 만들어진 하나의 객체를 인스턴스라고 부른다
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "홍길동";
		s2.name = "임꺽정";
		
		s1.info();
		
		Student[] students = new Student[100];
		System.out.println(students);
		
		// 이것과 마찬가지로, 처음 student 배열로 선언했을때, null값이 들어 있음. 
		// 아래 처럼 생성해 줘야 함.
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
	
	// 생성자는 반환타입이 없다 (생성자를 호출했을 때, 반환하는 것은 인스턴스의 주소만 반환하므로)
	// 클래스 이름과 같음 이름의 메서드 이다. 
	Student() {
		name = "기본";
		kor = 5;
		eng = 1;
		ban = 1;
	}
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("반 : " + ban);
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
