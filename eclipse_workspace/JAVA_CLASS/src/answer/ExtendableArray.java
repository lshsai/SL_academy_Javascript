package answer;

import java.util.Scanner;

public class ExtendableArray {
	static int[] arr = new int[3];
	static Scanner sc = new Scanner(System.in);
	static int a = 0;
	static int i = 3;

	public static void main(String[] args) {

		// Scanner�� ���� arr�� ���� ��� �Է�
		// ArraryIndexOutOfbounds���� �߻��ϸ�
		// ����ó��
		// �迭�� ũ�⸦ 3���� �÷��� ��� �Է¹ޱ�
		// ���ڸ� 10�� �Է��Ҷ����� ����ϵ���


		while (arr.length < 10) {
			try {
				inPutNum();
				arr[i] += a;
				int[] tmp = arr.clone();
				arr[4];
				break;
			} catch (NumberFormatException e) {
				System.out.println("�����Է� ����");
			}
			 catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("�迭 ũ�� ����");
				}
		}
		printArr();
		

	}
	


	public static void inPutNum() {
		System.out.println("���� ���°� �Ǿ�� �մϴ�.");
		a = sc.nextInt();
		System.out.println();
	}

	public static void printArr() {
		for (int a : arr) {
			System.out.println(a);
		}

	}
}
