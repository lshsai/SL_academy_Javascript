package swing.layout;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GridLayoutTutorial {
	JFrame f = new JFrame("±×¸®µå");
	JPanel p = new JPanel();
	ArrayList<JButton> btns = new ArrayList<JButton>();
	int howManyBtns = 8;
	{
		for (int i =0; i<howManyBtns; i++) {
			btns.add(new JButton(""+i));
		}
	}
	
	

	public GridLayoutTutorial() {
		p.setLayout(new GridLayout(4,2,3,3));
		
		for (JButton btn : btns) {
			p.add(btn);
		}
		
		f.getContentPane().add(p);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {	

			@Override
			public void run() {
				new GridLayoutTutorial();
			}
		});
	}
}
