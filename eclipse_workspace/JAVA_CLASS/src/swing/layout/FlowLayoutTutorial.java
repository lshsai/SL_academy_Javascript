package swing.layout;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FlowLayoutTutorial {

	JFrame f = new JFrame();
	JPanel panel = new JPanel();
	
	ArrayList<JButton> btns = new ArrayList<JButton>();
	final int howManyBtns = 10;
	
		
	Container con;
	{
		con = f.getContentPane();
		for (int i=0; i< howManyBtns; i++) {
			btns.add(new JButton(i + "번째 버튼"));	
		}
	}
	
	class ClickButtonEvent implements ActionListener{
		private int num;
		ClickButtonEvent(int i){
			this.num = i;
		}
		@Override
		public void actionPerformed(ActionEvent e) {	
			System.out.println(num + "버튼이 눌렸습니다.");
		}
	}
	
	public FlowLayoutTutorial() {
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 3, 3));
		int i = 0;
		for(JButton btn : btns) {
			panel.add(btn);
			btn.addActionListener(new ClickButtonEvent(i));
			i++;
		}
		
		con.add(panel);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(1000,1000);
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {	
			@Override
			public void run() {
				new FlowLayoutTutorial();
				
			}
		});
	}
}
