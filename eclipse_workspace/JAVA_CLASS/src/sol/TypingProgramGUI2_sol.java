package quiz;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
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
			public synchronized void actionPerformed(ActionEvent e) {
				String input = e.getActionCommand();				
				
				System.out.println(input);
				 
				LinkedList<WordData> all = WordLeinPanel.allWords;				
				Iterator<WordData> i = all.iterator();
				
				while (i.hasNext()) {					
					WordData d = null;
					d = i.next();
					
					if (d == null)
						break;
					
					System.out.println("d : " + d);
					System.out.println("input : " + input);
					if (d.word.equalsIgnoreCase(input)) {
						i.remove();
						d.word = "";
						d.parent.updateLabels();
						break;
					}
				}
				
				
				/*
				for (WordLeinPanel lein : main.leins) {
					boolean found = false;					
					
					for (int i = lein.words.size()-1; i >= 0; i--) {
						if (lein.words.get(i).equalsIgnoreCase(input)) {
							lein.words.set(i, "");
							
							lein.updateLabels();
							// Á¡¼ö up
							found = true;
							break;
						}
					}
					
					if (found) break;
				}
				*/
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
	final static int NUM_OF_LEIN = 5;
	WordLeinPanel[] leins = new WordLeinPanel[NUM_OF_LEIN];	
	
	public MainPanel() {
		initLeins();		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		for (WordLeinPanel p : leins) 
			add(p);		
	}
	
	private void initLeins() {
		for (int i = 0; i < NUM_OF_LEIN; i++)
			leins[i] = new WordLeinPanel();
	}
}

class WordLeinPanel extends JPanel implements Runnable {
	final static int LEIN_SIZE = 20;
	JLabel[] labels = new JLabel[LEIN_SIZE];	
	long interval = 1000;
	
	WordQueue<WordData> words = new WordQueue<>(LEIN_SIZE); 
	static LinkedList<WordData> allWords = new LinkedList<>();
	
	final static String[] WORD_BANK = { 
				"", "Apple", "Water", "", "", "", "Melon",
				"", "","","","","","","","","","","","","","",
				"", "Orange", "Air", "", "Car", "Eagle", "", ""}; 
	
	public WordLeinPanel() {
		setLayout(new GridLayout(LEIN_SIZE, 1));
		initLabels();	
		
		for (JLabel label : labels)
			add(label);
		
		new Thread(this).start();
	}
	
	private void initLabels() {
		for (int i = 0; i < LEIN_SIZE; i++) {
			JLabel newLabel = new JLabel("", SwingConstants.CENTER);
			newLabel.setPreferredSize(new Dimension(50, 20));
			labels[i] = newLabel;
		}
	}
	
	private void pushWord() {		
		String word = WORD_BANK[(int)(Math.random()*WORD_BANK.length)];
		words.push(new WordData(word, this));		
		allWords.add(words.getFirst());
		updateLabels();
	}
	
	public void updateLabels() {
		int i = 0;
		try {
			for (i = 0; i < words.size(); i++) {
				labels[i].setText(words.get(i).word);
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
			
			try {
				Thread.sleep(interval);
			} catch (Exception e) { System.out.println("sleep error"); }		
		}
	}
}

class WordData {
	String word;
	int rows;
	WordLeinPanel parent;
	
	public WordData(String word, WordLeinPanel parent) {
		this.word = word;
		this.rows = 0;
		this.parent = parent;
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
			T data = get(queueSize-1);
			WordLeinPanel.allWords.remove(data);
			remove(data);
		}	
		
		super.push(e);
	}
}








