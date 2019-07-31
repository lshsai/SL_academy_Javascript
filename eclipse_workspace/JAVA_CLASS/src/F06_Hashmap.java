import java.util.HashMap;
import java.util.Set;

public class F06_Hashmap {
	public static void main(String[] args) {
		/* Map
		 *  - Key�� Value�� ��Ʈ�̴�.
		 *  - Key�� ������ Value�� �����´� 
		 */
		
		/* HashMap
		 *  - Key�� �ߺ��� ������� �ʴ´�.
		 *  - ���� ������ ������� ������ ����
		 *  - �ӵ��� Map�߿� ���� ����
		 *  - Ű�� ������ null�� ���ȴ�.
		 *  - 1key, 1value 
		 */
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("ȫ�浿", 99);
		map.put("�Ӳ���", 88);
		

		System.out.println(map.get("�Ӳ���"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.size());
		
		System.out.println(map.containsKey("�̸���"));
		System.out.println(map.containsValue(89));
		
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.putAll(map);
		
		System.out.println("map��� ���" + map);
		
		
		
		//get/post������� �����Ͱ� ���۵Ǵ� ����
		HashMap<String, String> req = new HashMap<String, String>();
		req.put("age", "19");
		req.put("src", "img/sd.jpg");
		req.put("question", "�̸���?");
		req.put("id", "123");
		
		System.out.println(req.get("id"));
		System.out.println("+++++++++++++++++++");
		
		//mapŸ���� ���ϰ� �ٷ��
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
