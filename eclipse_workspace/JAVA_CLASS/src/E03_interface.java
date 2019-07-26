
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
		// �������̽�
		/* 
		 * 1. �ν��Ͻ�ȭ �� �� ����. (�ܵ� ����� �Ұ���, Ŭ������ �ƴϴ�.) 
		 * 2. ������ ��� ����Ѱ� �ؼ� ����ؾ� �Ѵ� (����)
		 * 3. �������̽��� �޼������ ��� abstract method�̴�.
		 * 4. �������̽� �ɹ� ������ ��� �޼���� ���� �� ����. 
		 * 5. �������̽� static ����, �޼���� ���� �� �ִ�.
		 * 6. �������̽��� Ŭ���� ��Ӱ� �ٸ��� ������ ������ �� �ִ�.  
		 */
		
		Swimmer[] srr = { new Fish(), new Human()};
		Runner[] rrr = { new Human()};
		
		System.out.println(Swimmer.oxyzon);
		Swimmer.breath();
		
		
		//�͸� Ŭ����
		// �߻�Ŭ������ �������̽��� ���� �� �ִ�.
		// �ѹ��� ���� �� �� �������� �̷������� �ѹ� ����� ������.
		poolParty(new Swimmer() {
			@Override
			public void swim() {
			}
		});
		
		fightClub(new Fight() {
			@Override
			void fight() {
				System.out.println("�͸� Ŭ���� �ο�");
			}
		});
		
		
		
		
	}
}

interface Swimmer{
	// final static�� �����Ǿ� ����(���� �־�� �Ѵ�)
	int oxyzon = 10;
	
	static void breath() {
		System.out.println("Swimer�� static �ż���");
	}

	//abstract ���� �ʾ�����, 
	// �������̽��̹Ƿ�, ���� �ɹ�(�ν��Ͻ�)�ż����
	//�ڵ����� abstract�� �νĵȴ�.
	void swim();
}

interface Runner{
	void run();
}

//�������̽� ������ ��, implements��� ������ ���
class Fish implements Swimmer{
	
	// abstract�� �Ȱ���.
	@Override
	public void swim() {
		System.out.println("������ ����� Ĩ�ϴ�.");
	}
	
}

class Human implements Swimmer, Runner{

	@Override
	public void swim() {
		System.out.println("����� ������ �մϴ�.");
		
	}

	@Override
	public void run() {
		System.out.println("����� �޸��⸦ �մϴ�.");
	}
	
}
