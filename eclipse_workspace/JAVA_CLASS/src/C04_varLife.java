
public class C04_varLife {
	// class���� ���� ���� �����ϴ�
	// static int class_a = 10;
	
	// int class_a = 10;
	// C04_varLif c04 = new C04_varLif;
	// System.out.println(c04.class_a);

	
	public static void main(String[] args) {
		/*
		   ������ ����
		     - �� ������ �����ִ� {}���� �̴�
		 */
		{
			int a = 10;
			System.out.println("{}������ a : " + a);
		}
		// System.out.println(a);
		
		
		
	}
}
