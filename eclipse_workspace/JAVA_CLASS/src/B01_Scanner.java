import java.util.Scanner;

public class B01_Scanner {

	public static void main(String[] args) {

		// Scanner Ŭ����
		Scanner sc = new Scanner(System.in);
		

		// int�� �����͸� �Է¹޴� �޼���, ������� �Է��� ��ٸ��� ��
		System.out.print("�Է� ����� �ι谡 �˴ϴ�.");
		int num = sc.nextInt();
		System.out.println(num * 2);

		// 1 2 3 4 5 6 7 8 9 A B C D E F 
		System.out.print("�Է� ����� 16�������� 10������ ��ȯ�˴ϴ� >> ");
		num = sc.nextInt(16);
		System.out.println(num);
		
		//
		System.out.print("����� ������ �Է��ϼ��� >>");
		int numOfApple = sc.nextInt();
		int bucketSize = 10;
		int numOfBucket = (numOfApple%bucketSize ==0)?
							numOfApple/bucketSize:
							numOfApple/bucketSize+1;
		System.out.println("�ʿ��� �ٱ��� ������ " + numOfBucket + "�� �Դϴ�.");

		sc.nextLine();
		// int�� �޾Ҵµ�, �ڿ� str�� �������� sc.nextLine();�� ���۸� ��� ��. 
		
		System.out.print("���ڿ��� �Է��ϼ��� >> ");
		String str = sc.nextLine();
		System.out.println("�Է¹��� ���ڿ� :" + str);
		
		str = str.equals("yes")? "��":"�ƴϿ�";
		System.out.println("\"yes\"�Դϱ�? :" + str);
	}
}
