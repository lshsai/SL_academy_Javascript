
public class A05_typeCasting {

	public static void main(String[] args) {
		// 정수형 : byte < char < short < int < long
		// 실수형 : float < double
		// 실수형이 정수형보다 크기 때문에, 
		// 실수형에 정수를 넣을때는 타입캐스팅 필요없음
		
		
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
		 	강제 데이터 형변환 ; 메모리 상의 값을 이용
		    데이터 손실 발생 가능
		 */
		
		_long = 400000;
		System.out.println("그냥 출력 :" + _long);
		System.out.println("(int) 출력 :" + (int)_long);
		System.out.println("(byte) 출력 :" + (byte)_long);
		
		/* [ascii code]
		   알파벳 = 숫자로 표현됨
		 */
		
		char a = 'A';
		System.out.println(a);
		System.out.println((int)a);
		
		System.out.println('z' - 'a' + 1 );
		
		// 둘다 2byte지만
		// unsigned와 signed 간의 대입에는 형변환이 필요
		char ch = 'a';
		short s = 10;
		
		_int = ch; // 가능
		s = (short)ch; // 형변환이 필요
		ch = (char)s; // 음수값이 들어갈 수 없어서 불가능
	
			
	}
}
