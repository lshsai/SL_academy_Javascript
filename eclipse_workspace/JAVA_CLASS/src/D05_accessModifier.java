
public class D05_accessModifier {

	void testMethod() {
		
	}
	
	public static void main(String[] args) {
		/*
		 * ���������� 1. public : �ٸ� ��Ű�������� ���� �� �� �ִ�. 2. protected : ��ӹ�����, �ٸ� ��Ű�������� ���� �� ��
		 * �ִ�. 3. default : ���� ��Ű�� ������ �� �� �ִ�. 4. private : �� Ŭ���� ���ο����� ����� �� �ִ�.
		 */
		


		PublicClass p = new PublicClass();

		//1. ���� ��Ű�� ��� ����
		int a = p._public;
		
		//2. ���� ��Ű�� ��� ���� 
		a = p._protected;
		
		// 3. ���� ��Ű�� ��� ����
		a = p._default;
		
		// 4. ���� ����Ű���� ��� �Ұ�
//		a = p._private;
		
		
		p.publicMethod();
		p.protectedMethod();
		p.defaultMethod();
//		p.privateMethod();
		
		
		//���� ��Ű���� defaultclass �׽�Ʈ
		DefaultClass d = new DefaultClass();
		a = d._public;
 		a = d._protected;
		a = d._default;
//		a = d._private;
		
		p.publicMethod();
		p.protectedMethod();
		p.defaultMethod();
//		p.privateMethod();
		
		
		// �ٸ� ��Ű���� publicclass �׽�Ʈ
		answer.PublicClass ap = new answer.PublicClass();
		
		a = ap._public;
//		a = ap._protected;
//		a = ap._default;
//		a = ap._private;
		
		ap.publicMethod();
//		ap.protectedMethod();
//		ap.defaultMethod();
//		ap.privateMethod();
		
		//�ٸ� ��Ű���� defaultclass �׽�Ʈ
//		answer.DefaultClass ap = new answer.DefaultClass;
	}

}
