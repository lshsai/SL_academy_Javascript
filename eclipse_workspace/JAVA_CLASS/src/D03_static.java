
public class D03_static {

	public static void main(String[] args) {
		/*
		 	static : ��� Ŭ�������� �������� ����ϴ� ����
		 	 - 1. ���� ���� ����ȴ�  (new�� ���� Ŭ������ ó�� �θ���, ���� ���� �ҷ�����)
		 	 - 2. ���� Ŭ������ ������� ��� �ν��Ͻ��� static�� �����Ѵ�
		 	 - 3. static�� ������, ������ new�۾��� �ʿ��ϴ�
		 	 - 4. static�� Ŭ������ 1��, Ŭ����.static���� ����Ѵ�.  
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

