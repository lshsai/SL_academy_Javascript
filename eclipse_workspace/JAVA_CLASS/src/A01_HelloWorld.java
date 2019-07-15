// 한줄 주석

/*
 Compile : 언어를 컴퓨터가 알아들을 수 있는 형태로 변경
 Java의 경우 JVM(자바 가상 머진)이 알아들을 수 잇는 바이트 코드로 변경
 */

/*
 [Eclipse 단축키]
 Ctrl + [+, -] : 글자크기 조절 / 주석 묶기(numpad)
 Ctrl + M : 화면 넓게 쓰기
 Ctrl + Z : 되돌리기
 Ctrl + Y : 되돌리기 취소
 Ctrl + Shift + F : 자동 정렬 
 블록지정 후 Ctrl + i : indent 맞춤
 Tab : indent
 Shift + Tab : 역탭
 Alt + 방향키 : 줄 옮기기 
 Ctrl + f11 : program build (comepile + run)
 f2 : 에러 메세지 살펴보기
 */

/* 
 [빠른 코드 작성을 위한 요령 - 단축키]
 	Shift  누른 상태로 + 방향키 : 블록 지정
 	Home : 그 줄의 맨 앞으로 간다
 	end : 그 줄의 맨 뒤로 간다
 	더블클릭 -> alt + shift + r -> 변수 일괄 변경
 */

public class A01_HelloWorld {
	// public static void main(String[] args) { << 정해진 기본 method
	public static void main(String[] args) {
		// main : 프로그램의 시작
		/*
		 * ; 명령의 구분 System.out.println. 콘솔에 ()안에 입력한 것을 출력한다. Ctrl + Space : 자동완성기능
		 * sysout + ctrl + space
		 */
		System.out.println("Hello World!");
		System.out.println(123);
		System.out.println('A');
		System.out.println(1.23);
		System.out.println();

		// 프로그램의 끝
	}

}
