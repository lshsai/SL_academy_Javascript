package swing.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Container;





public class CardLayoutTutorial {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new CardLayoutFrame();
			}
		});
	}
}

class CardLayoutFrame extends JFrame{
	
	NextButton nbtn = new NextButton();
	MainPanel pmain = new MainPanel();
	
	public CardLayoutFrame() {
		super("CardLayout 튜토리얼");
		
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		con.add(pmain, BorderLayout.CENTER);
		con.add(nbtn, BorderLayout.SOUTH);
		
		nbtn.addActionListener(new NextButtonEvent());
		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class NextButtonEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {	
			int index = pmain.index;
			Container parent = pmain; 
			ArrayList<swing.layout.MainPanel.CardInfo> infos = pmain.infos;
			CardLayout cl = pmain.cl;
			
			++index;
			
			if(index == infos.size())
				index = 0;
			
			pmain.index = index;
			cl.show(parent, infos.get(index).name);
		}
	}
}

class NextButton extends JButton{
	public NextButton() {
		super("다음 카드로");
	}
}

class MainPanel extends JPanel{
	CardLayout cl = new CardLayout();
	ArrayList<CardInfo> infos = new ArrayList<>();
	int index =0; ///////////
	public MainPanel() {
		setLayout(cl);
		initCardNames();
		
		for (CardInfo info:infos) {
			add(new CardPanel(info.color), info.name);
		}
		cl.show(this, infos.get(0).name);		
	}
	
	class CardInfo{
		String name;
		Color color;
		
		public CardInfo(Color color, String name) {
			this.color = color;
			this.name = name;
		}
	}
	
	public void initCardNames() {
		infos.add(new CardInfo(Color.RED, "옷"));		
		infos.add(new CardInfo(Color.GREEN, "숲"));
		infos.add(new CardInfo(Color.YELLOW, "레몬"));
		infos.add(new CardInfo(Color.ORANGE, "오랜지"));
	}
}

class CardPanel extends JPanel{
	public CardPanel(Color color) {
		setBackground(color);
	}
}










