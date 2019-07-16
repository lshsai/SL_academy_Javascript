import java.util.Scanner;

public class B03_switch {

	public static void main(String[] args) {
		// chartAt() : 문자열의 index번째 문자를 반환한다. 0번이 맨 앞의 문자이다.
		
		// switch (비교할 변수) {
		//case 값 : 실행할 내용 ; break;
		//case 값 : 실행할 내용 ; break;
		//default: 실행할 내용 ; break;
				
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char grade = str.charAt(0);
		// char grade = new Scanner(System.in).nextLine().charAt(0);
		
		switch (grade) {
		case 'A' : 
			System.out.println("A는 100~ 90점 입니다.");
			break;
		case 'B' : 
			System.out.println("B는 89~ 80점 입니다.");
			break;
		case 'C' : 
			System.out.println("C는 79~ 70점 입니다.");
			break;
		default: 
			System.out.println("모든 경우가 아닐 경우");
			break;
		}
	}
}
		
		

	


