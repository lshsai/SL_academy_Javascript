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

		// Scanner�� ���� arr�� ���� ��� �Է�
		// ArraryIndexOutOfbounds���� �߻��ϸ�
		// ����ó��
		// �迭�� ũ�⸦ 3���� �÷��� ��� �Է¹ޱ�
		// ���ڸ� 10�� �Է��Ҷ����� ����ϵ���

		while (true) {
			try {
				inPutNum();
				arr[i] += a;
				i++;
				if (arr.length <= 3)
					continue;
				// printArr();
			} catch (InputMismatchException e) {
				System.out.println("�����Է� ���� ����");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭 ũ�⸦ ������ŵ�ϴ�. ���� ũ��� " + (arr.length+1) + "�Դϴ�.");
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
		// System.out.println("��� �Է��� a�� " + a);
		tmp = new int[arr.length + 1];
		for (int k = 0; k < arr.length; k++) {
			tmp[k] = arr[k];
		}

		tmp[arr.length] = finalNum;
		arr = tmp.clone();
		// System.out.println("arr�� ũ��" + arr.length);
		// printArr();
		i++;
		if(arr.length % 10 == 0)
			printArr();
		
	}

	public static void inPutNum() {
		sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���.");
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
