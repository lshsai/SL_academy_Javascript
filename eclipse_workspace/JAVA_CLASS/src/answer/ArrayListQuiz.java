package answer;

import java.util.ArrayList;


public class ArrayListQuiz {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println("list1 : " + list1);
		System.out.println(list1.toString());
		
		System.out.println("list2 : " + list2);
		
		ArrayList kyo = new ArrayList(); 
		ArrayList hap = new ArrayList();
		ArrayList cha = new ArrayList();
		

		
		Object[] list_1 = list1.toArray();
		int i = 0;
		for (Object list__1 : list_1){
			if (list2.contains(list__1)) {
				kyo.add(list__1); 
			}
		}

		
		Object[] list_11 = list1.toArray();

		cha = (ArrayList) list1.clone();
		for (int j=0; j<kyo.size(); j++)
			cha.remove(kyo.get(j)); 
			
		
		hap = (ArrayList) list1.clone();
		for (int k=0; k<list2.size(); k++)
			hap.add(list2.get(k));
		for (int l=0; l<kyo.size(); l++)
			hap.remove(kyo.get(l)); 

		
		/*
		 * ������, ������, ������
		 */
		
		//addAll(): �÷����� ��� ���� �߰��� �ش�.
		// kyo.addAll(list1)
		
		//retatinAll(): list2 ������
		// kyo.retainAll(list2);
		
		// removeAll() : ��� ������ ����. ���� ���� �A�ٰ� �ؼ� ������ ����Ű�� ����
		// cha.removeAll(list2);
		
		
		System.out.println("������ : " + kyo);
		System.out.println("������(list1 - list2) : " + cha);
		System.out.println("������ : " + hap);
		
		
		/*
		 * ArrayList list3 = new ArrayList();
		 * 
		 * list3.add(1); list3.add(2); list3.add(3); list3.add(3);
		 * 
		 * list3.remove(3); list3.toArray(); System.out.println();
		 * 
		 * Object[] list_3 = list3.toArray(); for (Object list__3 : list_3)
		 * System.out.println(list__3);
		 */

	}

}
