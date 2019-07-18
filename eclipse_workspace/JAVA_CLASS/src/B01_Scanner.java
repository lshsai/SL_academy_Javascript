import java.util.Scanner;

public class B01_Scanner {

	public static void main(String[] args) {

		// Scanner 클래스
		Scanner sc = new Scanner(System.in);
		

		// int형 데이터를 입력받는 메서드, 사용자의 입력을 기다리게 됨
		System.out.print("입력 결과는 두배가 됩니다.");
		int num = sc.nextInt();
		System.out.println(num * 2);

		// 1 2 3 4 5 6 7 8 9 A B C D E F 
		System.out.print("입력 결과는 16진수에서 10진수로 변환됩니다 >> ");
		num = sc.nextInt(16);
		System.out.println(num);
		
		//
		System.out.print("사과의 개수를 입력하세요 >>");
		int numOfApple = sc.nextInt();
		int bucketSize = 10;
		int numOfBucket = (numOfApple%bucketSize ==0)?
							numOfApple/bucketSize:
							numOfApple/bucketSize+1;
		System.out.println("필요한 바구니 개수는 " + numOfBucket + "개 입니다.");

		sc.nextLine();
		// int를 받았는데, 뒤에 str을 받으려면 sc.nextLine();로 버퍼를 줘야 함. 
		
		System.out.print("문자열을 입력하세요 >> ");
		String str = sc.nextLine();
		System.out.println("입력받은 문자열 :" + str);
		
		str = str.equals("yes")? "네":"아니요";
		System.out.println("\"yes\"입니까? :" + str);
	}
}
