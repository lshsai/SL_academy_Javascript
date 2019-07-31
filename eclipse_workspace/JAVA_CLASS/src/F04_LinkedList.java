import java.util.LinkedList;

public class F04_LinkedList {
	public static void main(String[] args) {
		/*
		 * LinkedList - 양방향 구조로 데이터의 삽입, 삭제가 빈번할 경우 유리하다
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

//		 * indexOf(Object) : 값이 몇번쨰에 인덱스에 있는지 알려줌
//		 * lastIndexOf(Object) : 값이 뒤에서 몇번째에 있는지 알려줌
		System.out.println(linked3.indexOf(30));
		System.out.println(linked3.lastIndexOf(30)); 
		// 오른쪽에서 찾아서 처음 만나는 해당 값의 인덱스를 반환(뒤에서 처음 만나는 30의 위치 : 4)
		
		System.out.println(linked3.peek()); // 첫번째 요소 반환(제거x)
		System.out.println(linked3);
		
		System.out.println(linked3.poll()); // 첫번째 요소 반환(제거o
		System.out.println(linked3);

	}
}
