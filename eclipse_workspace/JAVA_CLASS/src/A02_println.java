
public class A02_println {

	public static void main(String[] args) {
		
		System.out.println(123); // ����
		System.out.println(); // �ٹٲٱ�(����Ű)
		System.out.println(""); // ���ڿ� (���� ���� ��)
		System.out.println('0'); // ����
				
		System.out.println(""); // ��� ��, �ڵ� �� �ٲ�
		System.out.print(""); // ��� ��, �� �ٲ� ����
				
		// \�� ���� ���ڴ� Ư������� ���� ���ڷ� �ν��Ѵ�.
		// * \n �� �ٲ� ���
		// * \t tab ���
		// * \\ �������ø� ���ڷ� ���(��θ� �Է��ϴ� ���)
		// * \" �ֵ���ǥ�� ���
		// * \' Ȭ����ǥ�� ���
		
		System.out.println("�ȳ��ϼ���\n�ݰ����ϴ�");
		System.out.println("�ȳ��ϼ���\t �ݰ����ϴ�");
		System.out.println("C:\\User\\admin\\Destop");
		System.out.println("���� \"����\" �Ͷ�");
		System.out.println("���� '����' �Ͷ�");
		
		int weight = 78;
		System.out.printf("%dkg", weight);
		System.out.println("");
		System.out.println(weight + "kg");
		
		
	}

}
