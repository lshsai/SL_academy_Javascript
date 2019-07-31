import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class F03_HashSet {
	public static void main(String[] args) {
		/* Set
		 * �ߺ������͸� ������ �� ���� �÷���
		 * 
		 * �� ��, HashSet�� ���� ����
		 * �ε����� ����. 
		 * ������ ������ �� ����.
		 */
		
		HashSet<Character> set = new HashSet<Character>();
		set.add('D');
		set.add('B');
		set.add('A');
		set.add('F');
		set.add('Z');
		set.add('Y');
		set.add('A');
		set.add('F');
		set.add('Z');
		set.add('Y');
		
		for (char ch : set)
			System.out.println(ch);
		
		System.out.println(set.contains('G'));
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() !=6) {
			Integer ran = new Integer((int)(Math.random()*45)+1);
			lotto.add(ran);
		}
		System.out.println(lotto);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<100; i++) {
			Integer ran = new Integer((int)(Math.random()*100)+1);
			arr.add(ran);
		}
		System.out.println(arr);
		
		HashSet<Integer> arrToSet = new HashSet<Integer>(arr);
		System.out.println(arrToSet);
	}
}
