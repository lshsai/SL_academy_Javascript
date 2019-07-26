
public class E04_polymorphism {

	public static void main(String[] args) {
		// 다형성
		
		// 업캐스팅 : 부모타입으로 캐스팅 되는 것 (인터페이스/클래스 모두)
		//Swimmer s = new Fish(); 		
		Swimmer s1 = new Fish();
		Swimmer s2 = new Tuna();
		Fish f = new Tuna();
		
		s1.swim();
		s2.swim();
		
		// s2 (부모 타입의 모양이지만, 안에는 참치) 
		// 참치 특성을 잃어버려서, 참치캔이 될 수 없음.
		// s2.canBeCan();
		
		// 업캐스팅 했을때, 어떤 클래스의 인스턴스인지 비교해주는 메소드
		System.out.println("s1이 참치인가?" + (s1 instanceof Tuna));
		System.out.println("s2가 참치인가?" + (s2 instanceof Tuna));
		System.out.println("f가 참치인가?" + (f instanceof Tuna));
		
		//다운캐스팅 : 자식타입으로 타입캐스팅 해주는 것.
		// 다시 자식클래스로 돌려서,
		// 자식클래스에만 존재하던 매서드를 다시 사용할 수 있게 해주는 것
		
		//Tuna t1 = (Tuna)s1;
		//t1.canBeCan();
		
		Tuna t2 = (Tuna)s2;
		t2.canBeCan();
		Tuna t3 = (Tuna)f;
		t3.canBeCan();
		
	}

}


class Tuna extends Fish {

	@Override
	public void swim() {
		System.out.println("참치는 바다를 헤엄칩니다.");
	}
	
	void canBeCan() {
		System.out.println("참치캔이 될 수 있다");
	}
}
