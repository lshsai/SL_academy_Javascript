package answer;

import java.util.HashMap;
import java.util.Set;

public class HashMapQuiz2 {
//	//	HashMap을 이용해, 전화번호부를 구현해 보세요.
//그룹, 이름, 전화번호를 저장해야 한다
//그룹을 key으로 넣으면, 그룹에 해당하는 HashMap(이름/번호들)이 value로 나온다.
//그룹을 넣어서 가져온 결과에 번호를 key로 넣으면 이름이 나온다.

	// 그룹을 추가하는 메서드

//	모든 목록을 한번에 출력하는 메서드 printList();
/// 	
	// groupname, (name, tel)
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap();

	public static void main(String[] args) {

		addPhoneNo("친구", "김두한", "010-123-4567");
		addPhoneNo("직장", "임창정", "010-467-4588");
		addPhoneNo("직장", "김두한", "010-467-1234");
		addPhoneNo("직장", "구마적", "010-467-4663");

		printList();
		
		// findName("123");
		

	}

	// 그룹을 추가하는 메서드
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap<>());
	}

//  그룹에 번호를 추가하는 메서드 
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group = phoneBook.get(groupName);
		group.put(tel, name);
		// 전화번호 == 개개인을 식별할 수 있다.
		// 이런 key를 primary key(기본키)라고 부른다.
	}

	// phonebook의 모든 목록을 출력하는 메서드
	static void printList() {
		Set<String> groupNames = phoneBook.keySet();

		for (String groupName : groupNames) {
			System.out.println("* *" + groupName + "* *");
			System.out.println("이름\t전화번호");
			HashMap<String, String> group = phoneBook.get(groupName);

			Set<String> tels = group.keySet();
			for (String tel : tels) {
				String name = group.get(tel);
				System.out.println(name + "\t" + tels);
			}

		}
	}

	// 전화번호의 일부입력, 입력부분까지 일치하는 사람의 목록을 출력하는 메서드
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

	// 이름을 입력하면, 전화번호를 출력해주는 메서드 (동명이인있는 경우, 모두 출력)
	static void findTel(String name) {

	}
}
