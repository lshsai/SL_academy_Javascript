
public class E02_final {

	public static void main(String[] args) {
		// final �� �̻� �������� �ʰڴ�

		/*
		 * final class : �� �̻� ��� ���� �� ����. 
		 * final method : �� �̻� �������̵� �� �� ����. 
		 * final field : �� �̻� ���� ������ �� ����. 
		 * final local : �� �̻� ���� ������ �� ����.
		 */
	}
}

class Building {
	final void check() {
		
	}
}

final class Kiwazip extends Building {
	// �ʵ� ����
	final int a = 10;
	
	void testMethid() {
		//���� ����
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
