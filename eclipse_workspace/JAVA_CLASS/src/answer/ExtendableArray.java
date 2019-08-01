package answer;

import java.util.Scanner;

public class ExtendableArray {
	static int[] arr = new int[3];
	static Scanner sc = new Scanner(System.in);
	static int a = 0;
	static int i = 3;

	public static void main(String[] args) {

		// Scanner를 통해 arr에 숫자 계속 입력
		// ArraryIndexOutOfbounds예외 발생하면
		// 예외처리
		// 배열의 크기를 3개씩 늘려서 계속 입력받기
		// 숫자를 10개 입력할때마다 출력하도록


		while (arr.length < 10) {
			try {
				inPutNum();
				arr[i] += a;
				int[] tmp = arr.clone();
				arr[4];
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자입력 오류");
			}
			 catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("배열 크기 오류");
				}
		}
		printArr();
		

	}
	


	public static void inPutNum() {
		System.out.println("숫자 형태가 되어야 합니다.");
		a = sc.nextInt();
		System.out.println();
	}

	public static void printArr() {
		for (int a : arr) {
			System.out.println(a);
		}

	}
}
