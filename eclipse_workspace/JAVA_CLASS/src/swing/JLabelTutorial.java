package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTutorial {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JLabel label = new JLabel();
		label.setText("라벨 입니다");
		f.add(label);
		
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
