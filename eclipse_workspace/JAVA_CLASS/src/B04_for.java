
public class B04_for {

	public static void main(String[] args) {
		// 반복문 (for, while, do-while, forEach)
		
		// 같은 명령을 몇 회 반복할지 설정해야 함
		
		/*
		   for (초기값; 비교(boolean); 증감값) {
		       명령어
		   }
		 */

		int sum = 0;
		for (int i=1; i <= 10; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("총 합 : " + sum);
	}

}
