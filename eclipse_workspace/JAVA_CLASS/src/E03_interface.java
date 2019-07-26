
public class E03_interface {
	
	static void poolParty(Swimmer s){
		s.swim();
	}
	
	static void marathon(Runner r){
		r.run();
	}
	
	static void fightClub(Fight f) {
		f.fight();
		
	}
	

	
	
	
	public static void main(String[] args) {
		// 인터페이스
		/* 
		 * 1. 인스턴스화 할 수 없다. (단독 사용이 불가능, 클레스가 아니다.) 
		 * 2. 무조건 상속 비슷한걸 해서 사용해야 한다 (구현)
		 * 3. 인터페이스의 메서드들은 모두 abstract method이다.
		 * 4. 인터페이스 맴버 변수와 멤버 메서드는 만들 수 없다. 
		 * 5. 인터페이스 static 변수, 메서드는 만들 수 있다.
		 * 6. 인터페이스는 클래스 상속과 다르게 여러개 구현할 수 있다.  
		 */
		
		Swimmer[] srr = { new Fish(), new Human()};
		Runner[] rrr = { new Human()};
		
		System.out.println(Swimmer.oxyzon);
		Swimmer.breath();
		
		
		//익명 클래스
		// 추상클래스나 인터페이스로 만들 수 있다.
		// 한번만 쓰고 안 쓸 구현들은 이런식으로 한번 만들고 버린다.
		poolParty(new Swimmer() {
			@Override
			public void swim() {
			}
		});
		
		fightClub(new Fight() {
			@Override
			void fight() {
				System.out.println("익명 클래스 싸움");
			}
		});
		
		
		
		
	}
}

interface Swimmer{
	// final static이 생략되어 있음(값을 넣어야 한다)
	int oxyzon = 10;
	
	static void breath() {
		System.out.println("Swimer의 static 매서드");
	}

	//abstract 쓰지 않았지만, 
	// 인터페이스이므로, 내부 맴버(인스턴스)매서드는
	//자동으로 abstract로 인식된다.
	void swim();
}

interface Runner{
	void run();
}

//인터페이스 구현할 떄, implements라는 구문을 사용
class Fish implements Swimmer{
	
	// abstract와 똑같다.
	@Override
	public void swim() {
		System.out.println("물고기는 헤엄을 칩니다.");
	}
	
}

class Human implements Swimmer, Runner{

	@Override
	public void swim() {
		System.out.println("사람은 수영을 합니다.");
		
	}

	@Override
	public void run() {
		System.out.println("사람은 달리기를 합니다.");
	}
	
}
