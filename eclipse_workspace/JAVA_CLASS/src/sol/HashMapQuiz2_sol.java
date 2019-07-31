package quiz;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapQuiz2 {	
	
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();
	
	public static void main(String[] args) {
		// HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
		// 1. �׷�/�̸�/��ȭ��ȣ�� �����ؾ��Ѵ�
		// 2. �׷��� Key������ ������ �� �׷쿡 �ش��ϴ� HashMap�� Value�� ���´�
		// 3. �׷��� �־ ������ ����� ��ȣ�� Key������ ������ �̸��� ���´�	
		addPhoneNo("ģ��", "���ȯ", "010-123-1234");
		addPhoneNo("ģ��", "������", "010-123-1235");
		addPhoneNo("ģ��", "�Ÿ���", "010-123-1236");
		addPhoneNo("����", "��â��", "010-111-1234");
		
		printList();
		
		System.out.print("ã����� ����� ��ȭ��ȣ�� �Է��ϼ��� : ");
		findName(new Scanner(System.in).nextLine());
	}
	
	// phoneBook�� ���ο� �׷��� �߰��ϴ� �޼���
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap<>());
	}

	// �׷쿡 ��ȭ��ȣ�� �߰��ϴ� �޼���
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String,String> group = phoneBook.get(groupName);
		
		group.put(tel, name); 
		// �̸��� �������� �ĺ��� �� ������
		// ��ȭ��ȣ�� �������� �ĺ��� �� �ִ�.
		// �̷� Key�� primary key(�⺻Ű)��� �θ��� [�����ͺ��̽�]
	}	
	
	// phoneBook�� ��� ����� �ѹ��� ����ϴ� �޼���
	static void printList() {		
		Set<String> groupNames = phoneBook.keySet();
		
		for (String groupName : groupNames) {
			System.out.println("* * " + groupName + " * * ");
			System.out.println("�̸�\t��ȭ��ȣ");
			HashMap<String, String> group = phoneBook.get(groupName);
			
			Set<String> tels = group.keySet();
			for (String tel : tels) {
				String name = group.get(tel);
				System.out.println(name + "\t" + tel);				
			}
		}		
	}
	
	// ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� �Է��� �κб��� ��ġ�ϴ� ����� ����� ����ϴ� �޼���
	static void findName(String tel) {
		Set<String> groupNames = phoneBook.keySet();
		
		for (String groupName : groupNames) {
			HashMap<String, String> group = phoneBook.get(groupName);
			
			Set<String> tels = group.keySet();
			
			for (String tel2 : tels) {
				// 1. ��ȣ�� �����ϴ°��
				//if (tel2.contains(tel)) {
				//	String name = group.get(tel2);
				//	System.out.println(name + "\t" + tel2);		
				//}
				
				// 2. ��Ȯ�ϰ� ��ġ�ϴ°�� 
				//	- tel2�� tel�� ���̿� �°� �ڸ���
				//	- �� ���� ��ġ�ϴ��� ��
				//	- �׷��� ���								

				// str.substring(startIndex, endIndex) : ���ڿ��� �ڸ���
				String sliced = tel2.substring(0, tel.length());				
				if (tel.equals(sliced)) {
					String name = group.get(tel2);
					System.out.println(name + "\t" + tel2);	
				}				
			}
		}
	}
	
	// �̸��� �Է��ϸ� ��ȭ��ȣ�� ������ִ� �޼��� (���������� �ִ� ��� ��� ���) 
	static void findTel(String name) {
		
	}
}









