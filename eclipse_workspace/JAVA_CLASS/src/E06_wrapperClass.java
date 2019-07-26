
public class E06_wrapperClass {

	public static void main(String[] args) {
		// wrapperClass
		// �⺻�� Ÿ�� : byte char short int long float  
		// �� ������ �����̴�.
		
		Byte b = 10;
		Character c = 'a';
		Short s = 10;
		Integer i = 10;
		Long l= 10l;
		Float f = 10.0f;
		Double d = 10.1;
		
		// �� Ÿ�Կ� �ش��ϴ� ��ɵ��� .�� ��� ����� �� �ִ�. 
//		 1. Xx.parseXx(String data, int radix) : ���ڿ��� �ش� Ÿ������ ��ȯ
		String data = "ABC08DD";
		int a = Integer.parseInt(data, 16);
		System.out.println(a);
		
//		toHexString : ���� 16���� ���ڿ��� ��ȯ
		String hexString = Integer.toHexString(100);
		System.out.println(hexString);
// 		toHexStringer�� ����(�ٸ� �������� �ٲ� �� ����)	
		System.out.println(Integer.toString(100, 16));
		
		// ���׸����� �⺻�� Ÿ���� �� �� ����. 
		// <> �ȿ��� WrapperŬ������ �־�� �Ѵ�.
	}
}
