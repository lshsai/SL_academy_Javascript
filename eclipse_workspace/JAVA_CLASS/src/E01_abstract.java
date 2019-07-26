
public class E01_abstract {
	public static void main(String[] args) {
		// abstract class : �� Ŭ�������� �߻� �޼��尡 �ִ�. 
		// abstract method : �� �ż���� �ݵ�� ��ӹ��� �ڿ� �����ؾ� �Ѵ�.
		
		
		// abstract�� �������� Ŭ������, �ݵ�� �˸��� ���·� �� �޼��带 �����س��� ���̴�. 
		Fight[] fight = {new WWE(), new UFC()};
		
		for (Fight f : fight)
			f.fight();
	}
}	


abstract class Fight {
	abstract void fight();	
}

class WWE extends Fight{
	@Override
	void fight() {
		System.out.println("�������� ��¥�� �ο��");
		
	}
		
}

class UFC extends Fight{
	@Override
	void fight() {
		System.out.println("UFC�� ��¥�� �ο��");
		
	}
}

