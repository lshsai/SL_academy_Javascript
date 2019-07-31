import java.util.Comparator;
import java.util.TreeSet;

public class F05_TreeSet {
	public static void main(String[] args) {
		
		/*
		 * TreeSet (이진검색트리를 구현한 클래스) - 정렬된 순서로 저장, 정렬 방법 지정이 가능 - 검색과 정렬에 뛰어난 성능 - 빠른
		 * 저장을 위해 미리 정렬하여 저장, 저장시간이 다소 오래 걸림
		 */

		/*
		 * 이진검색트리의 특징 - 모든 노드는 최대 2개의 자식노드 가질 수 있다. - 왼쪽 : 부모노드보다 작음 - 오른쪽 : 부모노드보다 큼 -
		 * 노드의 추가/삭제가 오래걸린다. - 검색/정렬이 빠르다
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
		// 본인을 포함한다
		System.out.println(tree.tailSet(29));
		// 없는 값이어도 검색 가능
		System.out.println(tree.tailSet(27));

		System.out.println(tree.subSet(21, 29));

		TreeSet<Integer> lotto = new TreeSet<Integer>();

		while (lotto.size() != 6) {
			Integer ran = new Integer((int) (Math.random() * 45) + 1);
			lotto.add(ran);
		}
		System.out.println(lotto);

		/*
		 * asc = ascending : 오름차순 desc = decending : 내림차순
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
		// 오 > 왼 ; return 1
		// 왼 / 왼 return -1
		// 두개가 같은 값 return 0
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