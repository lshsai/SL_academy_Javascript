package answer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExtendableArray {
	static int[] arr = new int[3];
	static int[] tmp;
//	static Scanner sc = new Scanner(System.in);
	static int a = 0;
	static int i = 0;
	static int countLength = 0;
	private static Scanner sc;

	public static void main(String[] args) {

		// Scanner를 통해 arr에 숫자 계속 입력
		// ArraryIndexOutOfbounds예외 발생하면
		// 예외처리
		// 배열의 크기를 3개씩 늘려서 계속 입력받기
		// 숫자를 10개 입력할때마다 출력하도록

		while (true) {
			try {
				inPutNum();
				arr[i] += a;
				i++;
				if (arr.length <= 3)
					continue;
				// printArr();
			} catch (InputMismatchException e) {
				System.out.println("숫자입력 형태 오류");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 크기를 증가시킵니다. 현재 크기는 " + (arr.length+1) + "입니다.");
				addArraySize();
			}
		}
		
	}

	// arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		a = 4;
//		addArraySize();
//		a = 5;
//		addArraySize();
//		a = 6;
//		addArraySize();
//		System.out.println(arr.length);

	public static void addArraySize() {
		int finalNum = a;
		// System.out.println("방금 입력한 a는 " + a);
		tmp = new int[arr.length + 1];
		for (int k = 0; k < arr.length; k++) {
			tmp[k] = arr[k];
		}

		tmp[arr.length] = finalNum;
		arr = tmp.clone();
		// System.out.println("arr의 크기" + arr.length);
		// printArr();
		i++;
		if(arr.length % 10 == 0)
			printArr();
		
	}

	public static void inPutNum() {
		sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		a = sc.nextInt();
		sc.nextLine();
	}

	public static void printArr() {
		for (int aa : arr) {
			System.out.print(aa + " ");
		}
	}

	public static void printTmp() {
		for (int tt : tmp) {
			System.out.println(tt + " ");
		}
	}
}
