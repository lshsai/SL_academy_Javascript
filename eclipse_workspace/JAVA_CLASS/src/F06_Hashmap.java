import java.util.HashMap;
import java.util.Set;

public class F06_Hashmap {
	public static void main(String[] args) {
		/* Map
		 *  - Key와 Value가 세트이다.
		 *  - Key를 넣으면 Value를 가져온다 
		 */
		
		/* HashMap
		 *  - Key는 중복을 허용하지 않는다.
		 *  - 넣은 순서와 관계없는 순서로 저장
		 *  - 속도가 Map중에 가장 빠름
		 *  - 키와 값으로 null이 허용된다.
		 *  - 1key, 1value 
		 */
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("홍길동", 99);
		map.put("임꺽정", 88);
		

		System.out.println(map.get("임꺽정"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.size());
		
		System.out.println(map.containsKey("이몽룡"));
		System.out.println(map.containsValue(89));
		
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.putAll(map);
		
		System.out.println("map모두 출력" + map);
		
		
		
		//get/post방식으로 데이터가 전송되는 형태
		HashMap<String, String> req = new HashMap<String, String>();
		req.put("age", "19");
		req.put("src", "img/sd.jpg");
		req.put("question", "이름은?");
		req.put("id", "123");
		
		System.out.println(req.get("id"));
		System.out.println("+++++++++++++++++++");
		
		//map타입을 편하게 다루기
		Set<String> keySet = req.keySet();
		
		for(String key:keySet) {
			String value = req.get(key);
			System.out.println(value);
		}
		System.out.println("+++++++++++++++++++");
		
		for (String value:req.values()) {
			System.out.println(value);
		}
	}
}
