import java.util.ArrayList;

public class F01_Collection {

	public static void main(String[] args) {
		/*
		 * List, Set, Map : ��ǥ���� �ڷᱸ����
		 * �迭�� ���������� ���� �����͸� �����ϴµ� ���ȴ�.
		 * �ٸ�, Collection�� ��Ư�� ������� �ڷḦ �����Ѵ�. 
		 *  �迭�� ��������
		 */		
		
		/* <> : ���׸�
		 * �÷��� �ȿ� � Ÿ���� �����Ͱ� ����մ��� �˷��ִ� ������ �Ѵ�.
		 * ���׸��� ������� ������ �����͸� ���� �� Object Ÿ������ ������. 
		 * ���׸��� �⺻�� Ÿ���� �� �� ����.
		 * �⺻�� Ÿ���� Wrapper Class�� �̿��ؾ� �Ѵ�. 
		 * 
		 * Byte b = 10;
		 * Character c = 'a';
		 * Short s = 10;
		 * Integer i = 10;
		 * Long l= 10l;
		 * Float f = 10.0f;
		 * Double d = 10.1;
		 */
		
		
		/*Object type? 
		 *  ��� Ŭ������ �θ� Ŭ����
		 *  ��� Ÿ���� Object type���� ��ĳ���� �� �� �ִ�.
		 *  ������, ����ϱ��������� �ٿ�ĳ������ �ʿ��ϴ�.   
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list.toString());
		
		System.out.println(list.get(0));
		System.out.println("ArrayList�� size : " + list.size());
		
		int a = list.get(0);
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		for (int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}

}
