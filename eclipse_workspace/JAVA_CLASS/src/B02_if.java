import java.util.Scanner;

public class B02_if {

	public static void main(String[] args) {
		// ���ǹ�
		/*
		 * if(boolean b){ b�� true�϶� ���� } else if (boolean b) { ���� ������ false�� ��� ����else
		 * ifüũ } else if (boolean b) { else if�� ������ �� �� �ִ�. } else { ���� ������ ��� false��
		 * ��� else�� ������ ���� }
		 */
		int a = new Scanner(System.in).nextInt();

		if (a == 10) {
			System.out.println("a�� 10�϶�");
		} else if (a % 2 == 0) {
			System.out.println("a�� 10�ƴϰ�, ¦�� �϶�");
		} else {
			System.out.println("a�� 10�ƴϰ�, ¦���� �ƴ� ��");
		}

	}

}
