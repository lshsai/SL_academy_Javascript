package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTutorial {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton button = new JButton("¹öÆ°");
		button.setText("abc");
		
		f.add(button);
		
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
