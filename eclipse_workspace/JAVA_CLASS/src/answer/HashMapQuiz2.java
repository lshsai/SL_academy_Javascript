package answer;

import java.util.HashMap;
import java.util.Set;

public class HashMapQuiz2 {
//	//	HashMap�� �̿���, ��ȭ��ȣ�θ� ������ ������.
//�׷�, �̸�, ��ȭ��ȣ�� �����ؾ� �Ѵ�
//�׷��� key���� ������, �׷쿡 �ش��ϴ� HashMap(�̸�/��ȣ��)�� value�� ���´�.
//�׷��� �־ ������ ����� ��ȣ�� key�� ������ �̸��� ���´�.

	// �׷��� �߰��ϴ� �޼���

//	��� ����� �ѹ��� ����ϴ� �޼��� printList();
/// 	
	// groupname, (name, tel)
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap();

	public static void main(String[] args) {

		addPhoneNo("ģ��", "�����", "010-123-4567");
		addPhoneNo("����", "��â��", "010-467-4588");
		addPhoneNo("����", "�����", "010-467-1234");
		addPhoneNo("����", "������", "010-467-4663");

		printList();
		
		// findName("123");
		

	}

	// �׷��� �߰��ϴ� �޼���
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap<>());
	}

//  �׷쿡 ��ȣ�� �߰��ϴ� �޼��� 
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group = phoneBook.get(groupName);
		group.put(tel, name);
		// ��ȭ��ȣ == �������� �ĺ��� �� �ִ�.
		// �̷� key�� primary key(�⺻Ű)��� �θ���.
	}

	// phonebook�� ��� ����� ����ϴ� �޼���
	static void printList() {
		Set<String> groupNames = phoneBook.keySet();

		for (String groupName : groupNames) {
			System.out.println("* *" + groupName + "* *");
			System.out.println("�̸�\t��ȭ��ȣ");
			HashMap<String, String> group = phoneBook.get(groupName);

			Set<String> tels = group.keySet();
			for (String tel : tels) {
				String name = group.get(tel);
				System.out.println(name + "\t" + tels);
			}

		}
	}

	// ��ȭ��ȣ�� �Ϻ��Է�, �Էºκб��� ��ġ�ϴ� ����� ����� ����ϴ� �޼���
	static void findName(String tel) {
		Set<String> groupNames = phoneBook.keySet();

		for (String groupName : groupNames) {
			HashMap<String, String> group = phoneBook.get(groupName);

			Set<String> tels = group.keySet();

			for (String tel2 : tels) {
				if (tel2.contains(tel)) {
					String name = group.get(tel2);
					System.out.println(name + "\t" + tel2);
				}
			}

		}
	}

	// �̸��� �Է��ϸ�, ��ȭ��ȣ�� ������ִ� �޼��� (���������ִ� ���, ��� ���)
	static void findTel(String name) {

	}
}
