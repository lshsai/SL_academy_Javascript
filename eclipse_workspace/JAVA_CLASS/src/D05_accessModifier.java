
public class D05_accessModifier {

	void testMethod() {
		
	}
	
	public static void main(String[] args) {
		/*
		 * 접근제어자 1. public : 다른 패키지에서도 접근 할 수 있다. 2. protected : 상속받으면, 다른 패키지에서도 접근 할 수
		 * 있다. 3. default : 같은 패키지 내에서 쓸 수 있다. 4. private : 내 클래스 내부에서만 사용할 수 있다.
		 */
		


		PublicClass p = new PublicClass();

		//1. 같은 패키지 사용 가능
		int a = p._public;
		
		//2. 같은 패키지 사용 가능 
		a = p._protected;
		
		// 3. 같은 패키지 사용 가능
		a = p._default;
		
		// 4. 같은 패지키여도 사용 불가
//		a = p._private;
		
		
		p.publicMethod();
		p.protectedMethod();
		p.defaultMethod();
//		p.privateMethod();
		
		
		//같은 패키지의 defaultclass 테스트
		DefaultClass d = new DefaultClass();
		a = d._public;
 		a = d._protected;
		a = d._default;
//		a = d._private;
		
		p.publicMethod();
		p.protectedMethod();
		p.defaultMethod();
//		p.privateMethod();
		
		
		// 다른 패키지의 publicclass 테스트
		answer.PublicClass ap = new answer.PublicClass();
		
		a = ap._public;
//		a = ap._protected;
//		a = ap._default;
//		a = ap._private;
		
		ap.publicMethod();
//		ap.protectedMethod();
//		ap.defaultMethod();
//		ap.privateMethod();
		
		//다른 패키지의 defaultclass 테스트
//		answer.DefaultClass ap = new answer.DefaultClass;
	}

}
