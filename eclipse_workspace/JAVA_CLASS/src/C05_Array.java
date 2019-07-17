
public class C05_Array {
	public static void main(String[] args) {
		/*
		 	배열 : 같은 타입의 변수를 한번에 여러개 선언하는 방법
		 	
		 	
		 	(배열사용 이전) int 100개 선언
		 	int a1, a2, a...;
		 	
		 	(배열)
		 	타입[] 변수명 = new 타입[크기];
		 	타입[] 변수명 = { 타입(데이터 들) };
		 	타입[] 변수명 = new 타입[] { 타입(데이터 들) };
		 	타입[] 변수명;
		 	 
		 	int[] arr = new int[4];
		 	int arr2[] = new int[4];
				- 타입뒤에 대괄호 ; 배열의 선언
		 		- 둘 다 가능
		 		- 초기화 시, 크기를 지정해야 한다
		 */
		int[] numbers = {33, 999, 788, 3};
		double [] doubles = {1.123, 444.444f,  123, 666L};
		int[] numbers1 = new int[] {33, 999, 788, 3};
		
		System.out.println(numbers[0]);
		System.out.println(doubles[1]);
		
		numbers[0] = 1;
		System.out.println(numbers[0]);
		
		int[] alphabat = new int[3];
		alphabat[0] = 67;
		alphabat[1] = 65;
		alphabat[2] = 84;
		
		for (int i = 0; i < 3; i++)
			System.out.print((char)alphabat[i]);
		
		System.out.println();
		
		String[] msgs = new String[] {"hello", "hi", "My name"};
		
		int len = msgs.length;
		for (int i=0; i<len; i++)
			System.out.println(msgs[i]);
		
		String[] copy;
		copy = msgs;
		copy[0] = "good bye";
		// copy의 내용을 변경했지만, msgs[0]도 함께 변경된다. 

 
		System.out.println("copy[0] :" + copy[0]);
		System.out.println("msgs[0] :" + msgs[0]);
		
		
		// .clone() 해야
		// copy의 내용을 변경했을때, 원본을 보존
		String[] copy2;
		copy2 = msgs.clone();
		copy2[0] = "good bye2";
 
		System.out.println("copy[0] :" + copy2[0]);
		System.out.println("msgs[0] :" + msgs[0]);	
	}
}
