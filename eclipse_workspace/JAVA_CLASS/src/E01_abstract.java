
public class E01_abstract {
	public static void main(String[] args) {
		// abstract class : 이 클래스에는 추상 메서드가 있다. 
		// abstract method : 이 매서드는 반드시 상속받은 뒤에 구현해야 한다.
		
		
		// abstract를 구현받은 클래스는, 반드시 알맞은 형태로 그 메서드를 구현해놨을 것이다. 
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
		System.out.println("레슬링은 가짜로 싸운다");
		
	}
		
}

class UFC extends Fight{
	@Override
	void fight() {
		System.out.println("UFC는 진짜로 싸운다");
		
	}
}

