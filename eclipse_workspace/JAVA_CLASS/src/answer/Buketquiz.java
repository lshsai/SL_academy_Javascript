package answer;

public class Buketquiz {

	public static void main(String[] args) {
		/* ��� 123��
		 * 1�ٱ��� 10�� ���� �� ����
		 * �ʿ��� �� �ٱ��� ����?
		 */
		
		int apple = 123;
		int result = apple % 10 == 0? 
				(apple/10):
				((apple/10)+1);
		System.out.println(result);
		
		

	}

}
