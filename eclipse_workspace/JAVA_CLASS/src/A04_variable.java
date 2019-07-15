
public class A04_variable {

	public static void main(String[] args) {
		/* [변수의 선언]
		 	타입명 변수이름;
		 */
		
		/* [자료형] 크기가 다름
		  
		 	1byte = 8bit
		 	bit = 0, 1 나타내는 소자 
		 	char : 음수가 없음(unsigned)
		 	
		 	* 1byte
		 		0 ~ 2^8-1 
		 	* 2byte
		 		char(java) : 0 ~ 2^16-1
		 		short : -2^15 ~ 2^15-1
		 	* 4byte
		 		int : -2^31 ~ 2^31-1 (2^32개)
		 	* 8byte
		 		long : -2^63 ~ 2^63-1 (2^64개)
		 		
			정수형
			byte(1byte), 
			short(2byte), char(2byte)
			int(4byte),
			long(8byte) 
			
			실수형
			float(4bute) : 부동소수점
			double(8byte)
			
			참/거짓
			boolean
			
			참조형 변수(기본형을 제외한 나머지)
			String(문자열) 등등
		 */
		
		/* 
		 	10 : int
		    10L : long
		    1.234 : double
		    1.234f : float
		 */
		
		
		char grade = 'A';
		char _char = 65535;
		// _char = -1; // 에러 unsigned
		
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
