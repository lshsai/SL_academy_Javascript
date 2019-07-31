import java.util.Comparator;
import java.util.TreeSet;

public class F05_TreeSet {
	public static void main(String[] args) {
		
		/*
		 * TreeSet (�����˻�Ʈ���� ������ Ŭ����) - ���ĵ� ������ ����, ���� ��� ������ ���� - �˻��� ���Ŀ� �پ ���� - ����
		 * ������ ���� �̸� �����Ͽ� ����, ����ð��� �ټ� ���� �ɸ�
		 */

		/*
		 * �����˻�Ʈ���� Ư¡ - ��� ���� �ִ� 2���� �ڽĳ�� ���� �� �ִ�. - ���� : �θ��庸�� ���� - ������ : �θ��庸�� ŭ -
		 * ����� �߰�/������ �����ɸ���. - �˻�/������ ������
		 */
		TreeSet<Integer> tree = new TreeSet<Integer>();

		tree.add(30);
		tree.add(10);
		tree.add(40);
		tree.add(23);
		tree.add(21);
		tree.add(29);
		tree.add(28);
		tree.add(31);
		System.out.println("r" + tree);
		System.out.println(tree.first());
		System.out.println(tree.headSet(29));
		// ������ �����Ѵ�
		System.out.println(tree.tailSet(29));
		// ���� ���̾ �˻� ����
		System.out.println(tree.tailSet(27));

		System.out.println(tree.subSet(21, 29));

		TreeSet<Integer> lotto = new TreeSet<Integer>();

		while (lotto.size() != 6) {
			Integer ran = new Integer((int) (Math.random() * 45) + 1);
			lotto.add(ran);
		}
		System.out.println(lotto);

		/*
		 * asc = ascending : �������� desc = decending : ��������
		 */

		TreeSet<String> desc = new TreeSet<>(new Desc());
//	
		desc.add("Airplane");
		desc.add("abc");
		desc.add("Car");
		desc.add("car");
		desc.add("Elephant");
		desc.add("elephant");
		desc.add("fan");
		desc.add("flower");
		desc.add("dance");
		desc.add("disc");
		desc.add("bat");
//	
		System.out.println(desc);
	}
}



class Desc implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (LowerCase(o1).equals(LowerCase(o2))) {
			return compareChar(o1, o2);
			
		} else {
			return compareString(LowerCase(o1), LowerCase(o2));
		}

	}

	private String LowerCase(String s) {
		String s2 = "";
		int change = 'a' - 'A';

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 'a') {
				s2 += (char)(s.charAt(i) + change);
			} else {
				s2 += s.charAt(i);
			}
		}
		return s2;
	}
	private int compareChar(String s1, String s2) {
		if (s1.charAt(0) > s2.charAt(0))
			return 1;
		return compareString(s1, s2);
		
	}

	private int compareString(String s1, String s2) {
		// �� > �� ; return 1
		// �� / �� return -1
		// �ΰ��� ���� �� return 0
		int len = s1.length() < s2.length() ? s1.length() : s2.length();

		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				continue;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return 1;
			} else if (s1.charAt(i) > s2.charAt(i)) {
				return -1;
			}
		}
		return s1.length() == s2.length() ? 0 : (s1.length() < s2.length() ? -1 : 1);
	}
}

/*
 * class TreeNode { TreeNode left; Integer data; TreeNode right; }
 */