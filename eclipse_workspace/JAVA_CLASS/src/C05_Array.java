
public class C05_Array {
	public static void main(String[] args) {
		/*
		 	�迭 : ���� Ÿ���� ������ �ѹ��� ������ �����ϴ� ���
		 	
		 	
		 	(�迭��� ����) int 100�� ����
		 	int a1, a2, a...;
		 	
		 	(�迭)
		 	Ÿ��[] ������ = new Ÿ��[ũ��];
		 	Ÿ��[] ������ = { Ÿ��(������ ��) };
		 	Ÿ��[] ������ = new Ÿ��[] { Ÿ��(������ ��) };
		 	Ÿ��[] ������;
		 	 
		 	int[] arr = new int[4];
		 	int arr2[] = new int[4];
				- Ÿ�Եڿ� ���ȣ ; �迭�� ����
		 		- �� �� ����
		 		- �ʱ�ȭ ��, ũ�⸦ �����ؾ� �Ѵ�
		 */
		int[] numbers = {33, 999, 788, 3};
		double [] doubles = {1.123, 444.444f,  123, 666L};
		int[] numbers1 = new int[] {33, 999, 788, 3};
		
		System.out.println(numbers[0]);
		System.out.println(doubles[1]);
		
		numbers[0] = 1;
		System.out.println(numbers[0]);
		
		int[] alphabat = new int[3];
		alphabat[0] = 67;
		alphabat[1] = 65;
		alphabat[2] = 84;
		
		for (int i = 0; i < 3; i++)
			System.out.print((char)alphabat[i]);
		
		System.out.println();
		
		String[] msgs = new String[] {"hello", "hi", "My name"};
		
		int len = msgs.length;
		for (int i=0; i<len; i++)
			System.out.println(msgs[i]);
		
		String[] copy;
		copy = msgs;
		copy[0] = "good bye";
		// copy�� ������ ����������, msgs[0]�� �Բ� ����ȴ�. 

 
		System.out.println("copy[0] :" + copy[0]);
		System.out.println("msgs[0] :" + msgs[0]);
		
		
		// .clone() �ؾ�
		// copy�� ������ ����������, ������ ����
		String[] copy2;
		copy2 = msgs.clone();
		copy2[0] = "good bye2";
 
		System.out.println("copy[0] :" + copy2[0]);
		System.out.println("msgs[0] :" + msgs[0]);	
	}
}
