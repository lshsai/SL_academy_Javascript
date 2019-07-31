package quiz;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapQuiz2 {	
	
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();
	
	public static void main(String[] args) {
		// HashMap을 이용해 전화번호부를 구현해보세요
		// 1. 그룹/이름/전화번호를 저장해야한다
		// 2. 그룹을 Key값으로 넣으면 그 그룹에 해당하는 HashMap이 Value로 나온다
		// 3. 그룹을 넣어서 가져온 결과에 번호를 Key값으로 넣으면 이름이 나온다	
		addPhoneNo("친구", "김두환", "010-123-1234");
		addPhoneNo("친구", "구마적", "010-123-1235");
		addPhoneNo("친구", "신마적", "010-123-1236");
		addPhoneNo("직장", "임창정", "010-111-1234");
		
		printList();
		
		System.out.print("찾고싶은 사람의 전화번호를 입력하세요 : ");
		findName(new Scanner(System.in).nextLine());
	}
	
	// phoneBook에 새로운 그룹을 추가하는 메서드
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap<>());
	}

	// 그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String,String> group = phoneBook.get(groupName);
		
		group.put(tel, name); 
		// 이름은 개개인을 식별할 수 없지만
		// 전화번호는 개개인을 식별할 수 있다.
		// 이런 Key를 primary key(기본키)라고 부른다 [데이터베이스]
	}	
	
	// phoneBook의 모든 목록을 한번에 출력하는 메서드
	static void printList() {		
		Set<String> groupNames = phoneBook.keySet();
		
		for (String groupName : groupNames) {
			System.out.println("* * " + groupName + " * * ");
			System.out.println("이름\t전화번호");
			HashMap<String, String> group = phoneBook.get(groupName);
			
			Set<String> tels = group.keySet();
			for (String tel : tels) {
				String name = group.get(tel);
				System.out.println(name + "\t" + tel);				
			}
		}		
	}
	
	// 전화번호의 일부를 입력하면 입력한 부분까지 일치하는 사람의 목록을 출력하는 메서드
	static void findName(String tel) {
		Set<String> groupNames = phoneBook.keySet();
		
		for (String groupName : groupNames) {
			HashMap<String, String> group = phoneBook.get(groupName);
			
			Set<String> tels = group.keySet();
			
			for (String tel2 : tels) {
				// 1. 번호를 포함하는경우
				//if (tel2.contains(tel)) {
				//	String name = group.get(tel2);
				//	System.out.println(name + "\t" + tel2);		
				//}
				
				// 2. 정확하게 일치하는경우 
				//	- tel2를 tel의 길이에 맞게 자른다
				//	- 그 다음 일치하는지 비교
				//	- 그러면 출력								

				// str.substring(startIndex, endIndex) : 문자열을 자른다
				String sliced = tel2.substring(0, tel.length());				
				if (tel.equals(sliced)) {
					String name = group.get(tel2);
					System.out.println(name + "\t" + tel2);	
				}				
			}
		}
	}
	
	// 이름을 입력하면 전화번호를 출력해주는 메서드 (동명이인이 있는 경우 모두 출력) 
	static void findTel(String name) {
		
	}
}









