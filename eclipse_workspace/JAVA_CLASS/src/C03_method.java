
public class C03_method {

	/* method�� �Լ�
    		- �ڿ� () �ٰ� �ȴ�.
    		- Ư�� ��ɾ���� ����
    		- ��ȯ��, ��ȯŸ���� ������
    		- ������ ����
    		- �ݵ�� class ���ο� ������ �Ѵ�.
  
  		main()�� 
    		- ���α׷��� ���۰� ������, �ϳ��� �������̴�.(main thread)
	 */
	/* 
	   static : new�� �����̳� �� �����̳�
	   void : ��ȯ �����Ͱ� ���� ��� 
	   createRabbit : �޼����� �̸�
	   () : ���� �޴� ��(������, �Ű�����)
	 */
	static void createRabbit() {
		System.out.println("======================");
		System.out.println("        /)/)");
		System.out.println("       ( ..)");
		System.out.println("       (  >��");
		System.out.println("  Have a Good Time");
		System.out.println("======================");
		System.out.println();
	}
	
	static int getTotal(int kor, int eng) {
		int total = kor + eng;
		return total;
	}
	
	static int getAverage(int num1, int num2) {
		int average = (num1 + num2)/2;
		return average;
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
			createRabbit();
		
		System.out.println(getAverage(50, 70));
		
		int kor = 70;
		int eng = 100;
		int total = getTotal(eng , kor); 
		// �����̸��� ������� �� ��°�� �����Ͱ� �Ҵ� �ȴ�.(100, 70)��
		// �Ű����� ������ Ÿ���� ��ġ�ؾ� �Ѵ�.
	
		
	}

}
