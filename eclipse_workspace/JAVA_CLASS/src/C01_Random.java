
public class C01_Random {

	public static void main(String[] args) {
		/* Math.Random();
		   랜던한 double value 도출(0.0 < ran < 1.0)  
		 */
		
		/*
		   1 ~ 10까지의 랜덤 숫자 뽑기
		 */
		
		for (int i = 0; i <100; i++) {
			int num = (int)(Math.random()*10)+1;
			System.out.print(num + " ");
		}
		
		/*
		   1 ~ 45까지의 랜덤 숫자 뽑기
		 */
		System.out.println();
		System.out.println("------------------------");
		int rotto = (int)(Math.random()*45)+1;
		System.out.println(rotto);
		
		// Math.random()*[range] + [시작 값]
		// 37 ~ 88 랜덤 숫자 뽑기
		// range = (88-37) + 1
		// Math.random()+ ((88-37) + 1) + 37
		
		int range = 'z' - 'a' +1;
		for (int i = 0; i < 50; i++) {
			System.out.print((char)(Math.random()*range+'a'));
			if (i%10 == 9) 
				System.out.println();
		}
		
	}

}
