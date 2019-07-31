import java.util.ArrayList;

public class F01_Collection {

	public static void main(String[] args) {
		/*
		 * List, Set, Map : 대표적인 자료구조들
		 * 배열과 마찬가지로 여러 데이터를 저장하는데 사용된다.
		 * 다만, Collection은 독특한 방식으로 자료를 저장한다. 
		 *  배열은 순차저장
		 */		
		
		/* <> : 제네릭
		 * 컬렉션 안에 어떤 타입의 데이터가 들어잇는지 알려주는 역할을 한다.
		 * 제네릭을 사용하지 않으면 데이터를 꺼낼 때 Object 타입으로 꺼낸다. 
		 * 제네릭에 기본형 타입은 들어갈 수 없다.
		 * 기본형 타입은 Wrapper Class를 이용해야 한다. 
		 * 
		 * Byte b = 10;
		 * Character c = 'a';
		 * Short s = 10;
		 * Integer i = 10;
		 * Long l= 10l;
		 * Float f = 10.0f;
		 * Double d = 10.1;
		 */
		
		
		/*Object type? 
		 *  모든 클래스의 부모 클래스
		 *  모든 타입은 Object type으로 업캐스팅 할 수 있다.
		 *  하지만, 사용하기위에서는 다운캐스팅이 필요하다.   
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list.toString());
		
		System.out.println(list.get(0));
		System.out.println("ArrayList의 size : " + list.size());
		
		int a = list.get(0);
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		for (int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}

}
