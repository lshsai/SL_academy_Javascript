import java.util.ArrayList;

public class F02_ArrayList {

	public static void main(String[] args) {
		/* ArrayList
		 *   - 상당히 빠르고, 크기를 마음대로 조절할 수 있는 배열
		 *   - 단방향 구조로 구성, 순차적 데이터 접근시 가장 유리 
		 */
		
		/* 컬렉션 공통 메소드
		 * add() : 추가
		 * set() : 쓰기
		 * get() : 반환
		 * remove() : 제거
		 * size() : 크기 반환
		 * contains() : 포함하면 true
		 * clear() : 전부 삭제
		 * clone() : 복제
		 * 
		 * indexOf(Object) : 값이 몇번쨰에 인덱스에 있는지 알려줌
		 * lastIndexOf(Object) : 값이 뒤에서 몇번째에 있는지 알려줌
		 */
		ArrayList<Double> weight = new ArrayList<Double>();
		
		weight.add(33.33);
		weight.add(44.33);
		weight.add(44.3323);
		weight.add(4.33);
		// 하나씩 늘어나야 한다. 
		weight.add(4, 99.99);
		// insert가 발생하는 경우
		weight.add(1, 66.66);
		
		
		
		System.out.println(weight.toString());
		System.out.println("set :" + weight.set(2, 77.0));
		System.out.println(weight.toString());
		
		System.out.println("get : " + weight.get(3));
		
		// remove : i번째 값을 제거하면서 반환
		System.out.println("remove : " + weight.remove(2));
		System.out.println(weight.toString());
		
		// remove : 값 을 제거하면서 참/거짓 반환
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
