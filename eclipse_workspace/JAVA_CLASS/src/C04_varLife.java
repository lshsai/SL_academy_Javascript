
public class C04_varLife {
	// class에서 변수 선언 가능하다
	// static int class_a = 10;
	
	// int class_a = 10;
	// C04_varLif c04 = new C04_varLif;
	// System.out.println(c04.class_a);

	
	public static void main(String[] args) {
		/*
		   변수의 수명
		     - 그 변수가 속해있는 {}까지 이다
		 */
		{
			int a = 10;
			System.out.println("{}내부의 a : " + a);
		}
		// System.out.println(a);
		
		
		
	}
}
