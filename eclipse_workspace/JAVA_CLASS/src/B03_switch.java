import java.util.Scanner;

public class B03_switch {

	public static void main(String[] args) {
		// chartAt() : ���ڿ��� index��° ���ڸ� ��ȯ�Ѵ�. 0���� �� ���� �����̴�.
		
		// switch (���� ����) {
		//case �� : ������ ���� ; break;
		//case �� : ������ ���� ; break;
		//default: ������ ���� ; break;
				
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char grade = str.charAt(0);
		// char grade = new Scanner(System.in).nextLine().charAt(0);
		
		switch (grade) {
		case 'A' : 
			System.out.println("A�� 100~ 90�� �Դϴ�.");
			break;
		case 'B' : 
			System.out.println("B�� 89~ 80�� �Դϴ�.");
			break;
		case 'C' : 
			System.out.println("C�� 79~ 70�� �Դϴ�.");
			break;
		default: 
			System.out.println("��� ��찡 �ƴ� ���");
			break;
		}
	}
}
		
		

	


