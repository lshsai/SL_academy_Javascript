
public class E06_wrapperClass {

	public static void main(String[] args) {
		// wrapperClass
		// 기본형 타입 : byte char short int long float  
		// 의 참조형 버전이다.
		
		Byte b = 10;
		Character c = 'a';
		Short s = 10;
		Integer i = 10;
		Long l= 10l;
		Float f = 10.0f;
		Double d = 10.1;
		
		// 각 타입에 해당하는 기능들을 .을 찍고 사용할 수 있다. 
//		 1. Xx.parseXx(String data, int radix) : 문자열을 해당 타입으로 변환
		String data = "ABC08DD";
		int a = Integer.parseInt(data, 16);
		System.out.println(a);
		
//		toHexString : 값을 16진수 문자열로 변환
		String hexString = Integer.toHexString(100);
		System.out.println(hexString);
// 		toHexStringer과 같음(다른 진법으로 바꿀 수 있음)	
		System.out.println(Integer.toString(100, 16));
		
		// 제네릭에는 기본형 타입이 들어갈 수 없다. 
		// <> 안에는 Wrapper클래스를 넣어야 한다.
	}
}
