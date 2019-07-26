
public class E02_final {

	public static void main(String[] args) {
		// final 더 이상 변경하지 않겠다

		/*
		 * final class : 더 이상 상속 받을 수 없다. 
		 * final method : 더 이상 오버라이드 할 수 없다. 
		 * final field : 더 이상 값을 변경할 수 없다. 
		 * final local : 더 이상 값을 변경할 수 없다.
		 */
	}
}

class Building {
	final void check() {
		
	}
}

final class Kiwazip extends Building {
	// 필드 영역
	final int a = 10;
	
	void testMethid() {
		//로컬 영역
		final int b = 10;
//		a = 11;
//		b = 11;
	}
	
	void testMethod2() {
		int b = 11;
	}
}

class Chogazip extends Building {

}

/*
 * class EnhancedKiwazip extends Kiwazip {
 * 
 * }
 */
