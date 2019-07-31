import java.util.LinkedList;

public class F04_LinkedList {
	public static void main(String[] args) {
		/*
		 * LinkedList - ����� ������ �������� ����, ������ ����� ��� �����ϴ�
		 * 
		 */

		LinkedList<Integer> linked = new LinkedList<Integer>();
		linked.add(30);
		linked.addFirst(40);
		linked.addLast(70);
		linked.add(30);
		linked.add(linked.size() - 1, 40);

		System.out.println(linked);

		LinkedList<Integer> linked2 = (LinkedList<Integer>) linked.clone();
		LinkedList<Integer> linked3 = (LinkedList<Integer>) linked.clone();

		int size = linked.size();
		for (int i = 0; i < size; i++) {
			System.out.println(linked.removeFirst());
		}

		size = linked2.size();
		for (int i = 0; i < size; i++) {
			System.out.println(linked2.removeLast());
		}

//		 * indexOf(Object) : ���� ������� �ε����� �ִ��� �˷���
//		 * lastIndexOf(Object) : ���� �ڿ��� ���°�� �ִ��� �˷���
		System.out.println(linked3.indexOf(30));
		System.out.println(linked3.lastIndexOf(30)); 
		// �����ʿ��� ã�Ƽ� ó�� ������ �ش� ���� �ε����� ��ȯ(�ڿ��� ó�� ������ 30�� ��ġ : 4)
		
		System.out.println(linked3.peek()); // ù��° ��� ��ȯ(����x)
		System.out.println(linked3);
		
		System.out.println(linked3.poll()); // ù��° ��� ��ȯ(����o
		System.out.println(linked3);

	}
}
