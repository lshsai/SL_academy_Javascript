
public class E04_polymorphism {

	public static void main(String[] args) {
		// ������
		
		// ��ĳ���� : �θ�Ÿ������ ĳ���� �Ǵ� �� (�������̽�/Ŭ���� ���)
		//Swimmer s = new Fish(); 		
		Swimmer s1 = new Fish();
		Swimmer s2 = new Tuna();
		Fish f = new Tuna();
		
		s1.swim();
		s2.swim();
		
		// s2 (�θ� Ÿ���� ���������, �ȿ��� ��ġ) 
		// ��ġ Ư���� �Ҿ������, ��ġĵ�� �� �� ����.
		// s2.canBeCan();
		
		// ��ĳ���� ������, � Ŭ������ �ν��Ͻ����� �����ִ� �޼ҵ�
		System.out.println("s1�� ��ġ�ΰ�?" + (s1 instanceof Tuna));
		System.out.println("s2�� ��ġ�ΰ�?" + (s2 instanceof Tuna));
		System.out.println("f�� ��ġ�ΰ�?" + (f instanceof Tuna));
		
		//�ٿ�ĳ���� : �ڽ�Ÿ������ Ÿ��ĳ���� ���ִ� ��.
		// �ٽ� �ڽ�Ŭ������ ������,
		// �ڽ�Ŭ�������� �����ϴ� �ż��带 �ٽ� ����� �� �ְ� ���ִ� ��
		
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
		System.out.println("��ġ�� �ٴٸ� ���Ĩ�ϴ�.");
	}
	
	void canBeCan() {
		System.out.println("��ġĵ�� �� �� �ִ�");
	}
}
