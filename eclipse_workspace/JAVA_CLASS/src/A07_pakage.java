import answer.ChangeCaseQuiz;

//import 패키지.클래스;

// 같은 패키지 내부의 클래스를 사용할 때는 import가 필요
// 하지만 다른 패키지의 클래스를 사용할때는 import를 해야 한다.


public class A07_pakage {

	public static void main(String[] args) {
		/* 패키지란? 소스코드를 분류하는 폴더
		 	한 프로젝트 내에서는, 다른 클래스를 가져다 사용할 수 있다
		 */
		
		// 클래스도 하나의 타입이고, 클래스타입의 변수는 참조형 변수이다.
		// 클래스명 변수 = new class_constructior();
		// 클래스 생성자란? 클래스 이름과 같은 이름을 가진 메서드(함수)
		// 매서드(함수)는 ()로 구분
		A01_HelloWorld hello = new A01_HelloWorld();
		hello.main(null);
		
		ChangeCaseQuiz quiz = new ChangeCaseQuiz();
		// ctrl + shift + o ; 이클립스 자동 import 단축키
		quiz.main(null);
		
		
		//import를 생략하는 방법
		answer.Condition con = new answer.Condition();
		con.main(null);

	}

}
