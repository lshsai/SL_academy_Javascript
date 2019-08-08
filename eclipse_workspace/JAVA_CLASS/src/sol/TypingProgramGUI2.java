package sol;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class TypingProgramGUI2 {
	JFrame f = new JFrame("Type Two");
	MainPanel main = new MainPanel();
	JTextField inputField = new JTextField(); 
	
	public TypingProgramGUI2() {
		Container con = f.getContentPane();
		con.setLayout(new BorderLayout());
		
		con.add(main, "Center");
		con.add(inputField, "South");
		
		inputField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = e.getActionCommand();
				System.out.println(input);
				
				((JTextField)e.getSource()).setText("");
			}
		});
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setAlwaysOnTop(true);
		f.pack();
	}
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				new TypingProgramGUI2();
			}
		});

	}

}

class MainPanel extends JPanel {
	final int leinSize = 5;
	WordLeinPanel[] leins = new WordLeinPanel[leinSize];
	
	public MainPanel() {
		initLeins();		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		for (WordLeinPanel p : leins) 
			add(p);		
	}
	
	private void initLeins() {
		for (int i = 0; i < leinSize; i++)
			leins[i] = new WordLeinPanel();
	}
}

class WordLeinPanel extends JPanel implements Runnable {
	final int leinSize = 20;
	JLabel[] labels = new JLabel[leinSize];	
	long interval = 2000 / (int)(Math.random()*4 + 1);
	
	WordQueue<String> words = new WordQueue<>(leinSize); 
	
	final static String[] WORD_BANK = { 
				"", "Apple", "Water", "", "", "", "Melon",
				"", "","","","","","","","","","","","","","",
				"", "Orange", "Air", "", "Car", "Eagle", "", ""}; 
	
	public WordLeinPanel() {
		setLayout(new GridLayout(leinSize, 1));
		initLabels();	
		
		for (JLabel label : labels)
			add(label);
		
		new Thread(this).start();
	}
	
	private void initLabels() {
		for (int i = 0; i < leinSize; i++) {
			JLabel newLabel = new JLabel("", SwingConstants.CENTER);
			newLabel.setPreferredSize(new Dimension(50, 20));
			labels[i] = newLabel;
		}
	}
	
	private void pushWord() {
		words.push(WORD_BANK[(int)(Math.random()*WORD_BANK.length)]);
		// words.add(WORD_BANK[(int)(Math.random()*WORD_BANK.length)]);		
	}
	
	private void updateLabels() {
		int i = 0;
		try {
			for (i = 0; i < words.size(); i++) {
				labels[i].setText(words.get(i));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		while (true) {			
			pushWord();
			updateLabels();
			
			try {
				Thread.sleep(interval);
			} catch (Exception e) { System.out.println("sleep error"); }		
		}
	}
}

class WordQueue<T> extends LinkedList<T> {
	
	private final int queueSize;
	
	public WordQueue(int size) {
		queueSize = size;
	}
	
	@Override
	public void push(T e) {
		if (size() == queueSize) {
			remove(queueSize-1);
		}		
		super.push(e);
	}
}








