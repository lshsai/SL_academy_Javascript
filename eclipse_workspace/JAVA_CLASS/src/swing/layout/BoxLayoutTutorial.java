package swing.layout;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BoxLayoutTutorial {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	// 다른 컴포넌트를 붙일 수 있는 컴포넌트
	// (Jpanel위에 jpanel을 붙일 수 있음)
	// Jpanel도 Layout을 설정할 수 있음.

	JButton btnFirst = new JButton("First");
	JButton btnSecond = new JButton("Second");
	JButton btnThird = new JButton("Third");
	JButton btnFourth = new JButton("Fourth");

	public BoxLayoutTutorial() {
		// X.AXIS, Y.AXIS, LINE_AXIS, PAGE_AXIS
		panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
		//panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		// panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		// panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.add(btnFirst);
		// panel.add(Box.createHorizontalGlue());
		panel.add(Box.createRigidArea(new Dimension(5, 0)));
		panel.add(btnSecond);
		panel.add(btnThird);
		panel.add(btnFourth);
		
		
		frame.add(panel);	
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new BoxLayoutTutorial();
			}
		});
	}
}

