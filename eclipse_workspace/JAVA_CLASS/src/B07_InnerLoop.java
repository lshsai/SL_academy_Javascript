
public class B07_InnerLoop {

	public static void main(String[] args) {
		// 다중반복문

		for (int i = 0; i < 5; i++) {
			System.out.println("================바깥쪽 반복문" + i);
			for (int j = 0; j < 3; j++) {
				System.out.println("안쪽 반복문================" + j);
				for (int k = 0; k < 5; k++) {
					System.out.println("================제일 안쪽 반복문" + k);
				}
			}
		}
		
		//구구단 : 2 ~ 9단 i * j
		for (int dan = 2; dan <=9; dan++) {
			for (int gop = 1; gop <= 9; gop++) {
				System.out.print(dan + "x" + gop + "=" + dan*gop + "\t" );
			}
			System.out.println();		
		}
		
		
		
		
	}
}
