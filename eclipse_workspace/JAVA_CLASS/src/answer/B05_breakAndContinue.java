package answer;

public class B05_breakAndContinue {

	public static void main(String[] args) {

		// break ; ó�� ������ break���� �ݺ� ��
		int i = 0;
		for (;;) {
			System.out.println(++i);
			if (i > 50)
				break;
		}

		// continue ; ���� �������� ó������ ����

		for (int j = 0; j < 50; j++) {

			if (j % 2 == 0 && j != 0)
				continue;
			// for, if ���� �߰�ȣ�� ������ ����� �ϳ���� ���� ����

			System.out.println(j);
		}

	}
}
