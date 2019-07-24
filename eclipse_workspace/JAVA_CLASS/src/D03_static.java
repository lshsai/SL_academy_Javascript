
public class D03_static {

	public static void main(String[] args) {
		/*
		 	static : 모든 클래스에서 공통으로 사용하는 영역
		 	 - 1. 가장 먼저 실행된다  (new를 통해 클래스를 처음 부를때, 가장 먼저 불러진다)
		 	 - 2. 같은 클래스로 만들어진 모든 인스턴스는 static을 공유한다
		 	 - 3. static이 없으면, 별도로 new작업이 필요하다
		 	 - 4. static은 클래스당 1개, 클래스.static으로 사용한다.  
		 */		
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.attack_upgrade = 1;		
		System.out.println(m2.attack_upgrade);
		m1.attack_upgrade = 3;		
		System.out.println(m2.attack_upgrade);
		
	}
	
}

class Marine{
	static int attack_upgrade;
	static int defence_upgrade;
	
	int hp;
	
	static void attackUpgrade() {
		attack_upgrade++;
	}

class Bay {
	void humanAttackUpgrade() {
		Marine.attackUpgrade();
	}
}





}

