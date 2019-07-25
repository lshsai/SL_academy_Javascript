
public class D06_override {

	static void action(Robot r) {
		r.action();
	}
	
	public static void main(String[] args) {
	Robot[] robots = { new DanceRobot(), new SingRobot(), new DrawRobot()};
	
	for (Robot r : robots)
		action(r);
	}

}

class Robot {
	void action() {
		
	}
}

class DanceRobot extends Robot{
	void action() {
		System.out.println("��");
	}
}

class SingRobot extends Robot{
	void action() {
		System.out.println("�뷡");
	}
}

class DrawRobot extends Robot{
	void action() {
		System.out.println("�׸�");
	}
}