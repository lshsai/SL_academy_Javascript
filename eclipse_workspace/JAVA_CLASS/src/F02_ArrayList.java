import java.util.ArrayList;

public class F02_ArrayList {

	public static void main(String[] args) {
		/* ArrayList
		 *   - ����� ������, ũ�⸦ ������� ������ �� �ִ� �迭
		 *   - �ܹ��� ������ ����, ������ ������ ���ٽ� ���� ���� 
		 */
		
		/* �÷��� ���� �޼ҵ�
		 * add() : �߰�
		 * set() : ����
		 * get() : ��ȯ
		 * remove() : ����
		 * size() : ũ�� ��ȯ
		 * contains() : �����ϸ� true
		 * clear() : ���� ����
		 * clone() : ����
		 * 
		 * indexOf(Object) : ���� ������� �ε����� �ִ��� �˷���
		 * lastIndexOf(Object) : ���� �ڿ��� ���°�� �ִ��� �˷���
		 */
		ArrayList<Double> weight = new ArrayList<Double>();
		
		weight.add(33.33);
		weight.add(44.33);
		weight.add(44.3323);
		weight.add(4.33);
		// �ϳ��� �þ�� �Ѵ�. 
		weight.add(4, 99.99);
		// insert�� �߻��ϴ� ���
		weight.add(1, 66.66);
		
		
		
		System.out.println(weight.toString());
		System.out.println("set :" + weight.set(2, 77.0));
		System.out.println(weight.toString());
		
		System.out.println("get : " + weight.get(3));
		
		// remove : i��° ���� �����ϸ鼭 ��ȯ
		System.out.println("remove : " + weight.remove(2));
		System.out.println(weight.toString());
		
		// remove : �� �� �����ϸ鼭 ��/���� ��ȯ
		System.out.println("remove : " + weight.remove(4.33));
		System.out.println(weight.toString());
		
		// contains
		System.out.println(weight.contains(22.22));
		
		
		// toArray
		Object[] kgs = weight.toArray();
		for (Object kg : kgs)
			System.out.println(kg);
		// toArray(T[])		
		Double[] kgs2 = weight.toArray(new Double[weight.size()]);
		for (Object kg : kgs2)
			System.out.println(kg);
	}

}
