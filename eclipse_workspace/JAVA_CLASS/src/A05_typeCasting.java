
public class A05_typeCasting {

	public static void main(String[] args) {
		// ������ : byte < char < short < int < long
		// �Ǽ��� : float < double
		// �Ǽ����� ���������� ũ�� ������, 
		// �Ǽ����� ������ �������� Ÿ��ĳ���� �ʿ����
		
		
		byte _byte = 1;
		int _int = 1;
		long _long = 1;
		
		_long = _int;
		_long = _byte;
		
		_int = _byte;
		
		_int = (int)_long;
		_byte = (byte)_int;
		_byte = (byte)_long;
		
		/* 
		 	���� ������ ����ȯ ; �޸� ���� ���� �̿�
		    ������ �ս� �߻� ����
		 */
		
		_long = 400000;
		System.out.println("�׳� ��� :" + _long);
		System.out.println("(int) ��� :" + (int)_long);
		System.out.println("(byte) ��� :" + (byte)_long);
		
		/* [ascii code]
		   ���ĺ� = ���ڷ� ǥ����
		 */
		
		char a = 'A';
		System.out.println(a);
		System.out.println((int)a);
		
		System.out.println('z' - 'a' + 1 );
		
		// �Ѵ� 2byte����
		// unsigned�� signed ���� ���Կ��� ����ȯ�� �ʿ�
		char ch = 'a';
		short s = 10;
		
		_int = ch; // ����
		s = (short)ch; // ����ȯ�� �ʿ�
		ch = (char)s; // �������� �� �� ��� �Ұ���
	
			
	}
}
