
public class B04_for {

	public static void main(String[] args) {
		// �ݺ��� (for, while, do-while, forEach)
		
		// ���� ����� �� ȸ �ݺ����� �����ؾ� ��
		
		/*
		   for (�ʱⰪ; ��(boolean); ������) {
		       ��ɾ�
		   }
		 */

		int sum = 0;
		for (int i=1; i <= 10; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("�� �� : " + sum);
	}

}
