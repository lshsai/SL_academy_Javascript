package answer;

public class Operator {

	public static void main(String[] args) {
		// int a ����
		// ���׿����� ���
		// a Ȧ�� "Ȧ�� �Դϴ�"
		// a ¦�� "¦�� �Դϴ�"
		
		int a = 4;
		System.out.println(a % 2 == 0? "¦�� �Դϴ�":"Ȧ�� �Դϴ�");
		
		/*
		 	b -> 100�ڸ� �̸� ������ ���
		 */
		int b = 41516;
		b = b / 100;
		b = b * 100;
		System.out.println(b);
		
		/*
	 	����� ���͵� ���� �ڸ��� 3���� ���
		 */
		int c = 509;
		c = c / 10;
		c = c * 10;
		c = c + 3;
		System.out.println(c); 	
		 
		
		

	}

}
