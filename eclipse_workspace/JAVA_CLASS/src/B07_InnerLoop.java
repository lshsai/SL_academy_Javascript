
public class B07_InnerLoop {

	public static void main(String[] args) {
		// ���߹ݺ���

		for (int i = 0; i < 5; i++) {
			System.out.println("================�ٱ��� �ݺ���" + i);
			for (int j = 0; j < 3; j++) {
				System.out.println("���� �ݺ���================" + j);
				for (int k = 0; k < 5; k++) {
					System.out.println("================���� ���� �ݺ���" + k);
				}
			}
		}
		
		//������ : 2 ~ 9�� i * j
		for (int dan = 2; dan <=9; dan++) {
			for (int gop = 1; gop <= 9; gop++) {
				System.out.print(dan + "x" + gop + "=" + dan*gop + "\t" );
			}
			System.out.println();		
		}
		
		
		
		
	}
}
