import java.util.Calendar;

import javax.swing.JOptionPane;

public class G05_WhyThread {
	public static void main(String[] args) {

		Thread checkTime = new Thread(new OutputTimeThread());
		checkTime.start();
		
		String input = JOptionPane.showInputDialog("�ƹ�");
		System.out.println("�Է��Ͻ� ����" + input + "�Դϴ�.");

	}
}

class OutputTimeThread extends Thread {
	@Override
	public void run() {
		for (;;) {
			System.out.println(Calendar.getInstance().get(Calendar.SECOND));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
