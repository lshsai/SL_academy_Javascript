import answer.ChangeCaseQuiz;

//import ��Ű��.Ŭ����;

// ���� ��Ű�� ������ Ŭ������ ����� ���� import�� �ʿ�
// ������ �ٸ� ��Ű���� Ŭ������ ����Ҷ��� import�� �ؾ� �Ѵ�.


public class A07_pakage {

	public static void main(String[] args) {
		/* ��Ű����? �ҽ��ڵ带 �з��ϴ� ����
		 	�� ������Ʈ ��������, �ٸ� Ŭ������ ������ ����� �� �ִ�
		 */
		
		// Ŭ������ �ϳ��� Ÿ���̰�, Ŭ����Ÿ���� ������ ������ �����̴�.
		// Ŭ������ ���� = new class_constructior();
		// Ŭ���� �����ڶ�? Ŭ���� �̸��� ���� �̸��� ���� �޼���(�Լ�)
		// �ż���(�Լ�)�� ()�� ����
		A01_HelloWorld hello = new A01_HelloWorld();
		hello.main(null);
		
		ChangeCaseQuiz quiz = new ChangeCaseQuiz();
		// ctrl + shift + o ; ��Ŭ���� �ڵ� import ����Ű
		quiz.main(null);
		
		
		//import�� �����ϴ� ���
		answer.Condition con = new answer.Condition();
		con.main(null);

	}

}
