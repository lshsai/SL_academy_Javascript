
public class A04_variable {

	public static void main(String[] args) {
		/* [������ ����]
		 	Ÿ�Ը� �����̸�;
		 */
		
		/* [�ڷ���] ũ�Ⱑ �ٸ�
		  
		 	1byte = 8bit
		 	bit = 0, 1 ��Ÿ���� ���� 
		 	char : ������ ����(unsigned)
		 	
		 	* 1byte
		 		0 ~ 2^8-1 
		 	* 2byte
		 		char(java) : 0 ~ 2^16-1
		 		short : -2^15 ~ 2^15-1
		 	* 4byte
		 		int : -2^31 ~ 2^31-1 (2^32��)
		 	* 8byte
		 		long : -2^63 ~ 2^63-1 (2^64��)
		 		
			������
			byte(1byte), 
			short(2byte), char(2byte)
			int(4byte),
			long(8byte) 
			
			�Ǽ���
			float(4bute) : �ε��Ҽ���
			double(8byte)
			
			��/����
			boolean
			
			������ ����(�⺻���� ������ ������)
			String(���ڿ�) ���
		 */
		
		/* 
		 	10 : int
		    10L : long
		    1.234 : double
		    1.234f : float
		 */
		
		
		char grade = 'A';
		char _char = 65535;
		// _char = -1; // ���� unsigned
		
		short _short = 32767;
		_short = -1;
		System.out.println(_short);		
		
		int _int = 10;
		System.out.println(_int);
		
		int _long = 10;
		System.out.println(_long);
		
		
		float _float = 1.234f;
		System.out.println(_float);
		
		
		
		
		
	}
}
