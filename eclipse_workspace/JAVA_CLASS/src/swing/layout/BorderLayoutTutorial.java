package swing.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BorderLayoutTutorial {
	
	JFrame frame = new JFrame("Ʃ�丮��");
	JButton btn1 = new JButton("North");
	JButton btn2 = new JButton("South");
	JButton btn3 = new JButton("Center");
	JButton btn4 = new JButton("West");
	JButton btn5 = new JButton("East");
	
	public BorderLayoutTutorial() {
		//����
		frame.setLayout(new BorderLayout());
		frame.add(btn1, BorderLayout.NORTH);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.CENTER);
		frame.add(btn4, BorderLayout.WEST);
		frame.add(btn5, BorderLayout.EAST);
		
		
		frame.pack();
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		/*
		 * �����带 �̿��� �������� ���������� �����Ű�� ���
		 */

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
// ���⿡ main�� ���� ������ ��� ������ �������� ������ �˴ϴ�.
				new BorderLayoutTutorial();
			}
		});
	}
}
