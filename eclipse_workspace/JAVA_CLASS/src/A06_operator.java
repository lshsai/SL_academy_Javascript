
public class A06_operator {

	public static void main(String[] args) {
		/* 
		 	operator ; ������
		 	operand ; �ǿ�����
		 */
		
		// [�������]
		int a = 7, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b); //
		
		System.out.println(a ^ b); // ��Ʈ���� --> ������ �������� �ٲ㼭 ���(�� ��Ʈ�� �ٸ��� 1)
		
		// [�񱳿��� (�� ����� boolean type)]
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		boolean result1 = a > b;
		boolean result2 = a > b;
		System.out.println(result1);
		System.out.println(result2);

		// ���׿���
		a = 10;
		System.out.println(a++); // 10
		System.out.println(a);   // 11
		
		a = 10;
		System.out.println(++a); // 11
		System.out.println(a);   // 11
	
		boolean male = false;
		System.out.println(male);
		System.out.println(!male);
		
		//[���Կ���]
		a = 10;
		a += 2;
		a -= 2;
		a *= 2;
		a %= 2;
		
		// && : �� ��� true�϶� true
		// || : �� �� �ϳ��� true �϶� true
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);

		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		// [��Ʈ����] (&, |, <<, >>, ~, ^)
		a = 10; b = 3; 
		
		System.out.println(a&b); // �� ��Ʈ�� ��� 1�̸� 1
		// 10 : 1010
		// 3  : 0011
		// &  : 0010 = 2
		System.out.println(a|b); // �� ��Ʈ �� �ϳ� �̻��� 1�̸� 1
		// 10 : 1010
		// 3  : 0011
		// |  : 1011 = 11
		System.out.println(a^b); // �� ��Ʈ�� �ٸ��� 1
		// 10 : 1010
		// 3  : 0011
		// &  : 1001 = 9
		System.out.println(a >> 1); // �������� nĭ ��
		// 10 : 1010 >> 0101 : 5 

		System.out.println(~a); // ��Ʈ ����
		// 10 : 1010 ~
		// 10 : 00000000 00000000 00000000 00001010
		//      11111111 11111111 11111111 11110101 
		// [����]
		// 1. �� �� ��Ʈ�� 1�̸� ���ڸ� �����´�(1�� ����)
		// 2. +1�� �Ѵ� (2�� ����)
		// 3. �� ���ڰ� �����̴�.
		
		//[���� ����]
		// ��? ��:�ƴϿ�
		// ?������ �񱳰���� ����
		// : ������ ��������, �������� �������� �����Ѵ�
		// System.out.println(a > b? "a�� Ů�ϴ�":"b�� Ů�ϴ�");
		
		int c = 99;
		String result = a > b? 
				(c > a? "c�� �� Ů�ϴ�":"a�� �� Ů�ϴ�"):
				(c > b? "c�� �� Ů�ϴ�":"b�� �� Ů�ϴ�");
		System.out.println(result);
	}

}
