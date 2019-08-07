package swing.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BorderLayoutTutorial {
	
	JFrame frame = new JFrame("튜토리얼");
	JButton btn1 = new JButton("North");
	JButton btn2 = new JButton("South");
	JButton btn3 = new JButton("Center");
	JButton btn4 = new JButton("West");
	JButton btn5 = new JButton("East");
	
	public BorderLayoutTutorial() {
		//실제
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
		 * 쓰레드를 이용해 프레임을 안정적으로 실행시키는 방법
		 */

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
// 여기에 main에 넣을 내용을 대신 넣으면 안정적인 실행이 됩니다.
				new BorderLayoutTutorial();
			}
		});
	}
}
