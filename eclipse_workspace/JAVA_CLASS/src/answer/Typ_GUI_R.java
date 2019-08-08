package answer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Typ_GUI_R implements Runnable {
	JFrame f = new JFrame();
	JPanel main = new JPanel();
	JPanel view = new JPanel();

	JTextField inputfield = new JTextField(30);
	Container con;
	long intervel = 1 * 1000 / 2;
	String[] bank = { "사과", "Apple", "귤", "오렌지", "밤"};

	// String[][] twoDArray = new String[5][10];
	ArrayList<JLabel> blanks = new ArrayList<JLabel>();

	final int rowSize = 10;
	{
		view.setLayout(new GridLayout(10, 1, 3, 3));

		for (int i = 0; i < rowSize; i++) {
			JLabel l = new JLabel("", JLabel.CENTER);
			l.setPreferredSize(new Dimension(30, 50)); // 크기
			l.setBackground(Color.GRAY); // 바탕색
			l.setForeground(Color.WHITE); // 글자색
			l.setOpaque(true); // 불투명 여부
			l.setFont(new Font("D2Coding", Font.BOLD, 20)); // 폰트 설정
			blanks.add(l);
		}
		for (JLabel blank : blanks) {
			view.add(blank);
		}
	}

	public Typ_GUI_R() {
		main.setLayout(new BorderLayout());

		main.add(view, "Center");
		main.add(inputfield, "South");

		inputfield.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = e.getActionCommand();
				for (JLabel blank : blanks) {
					if (input.equalsIgnoreCase(blank.getText())) {
						blank.setText("");
						break;
					}
				}
				((JTextField) e.getSource()).setText("");
			}
		});

		con = f.getContentPane();
		con.add(main);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();

		new Thread(this).start();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Typ_GUI_R();

			}
		});
	}

	@Override
	public void run() {
		
		int len = 0;
		while (true) {
			
			String randomStr = bank[(int) (Math.random() * bank.length)];
			if (blanks.get(0).getText().equals("")) {
				blanks.get(0).setText(randomStr);
				for (int i = (rowSize-1); 1 <= i ; i--) {
					blanks.get(i).setText(blanks.get(i-1).getText());

				}
				blanks.get(0).setText("");
				//break;
			}
			len++;


			
			/*
			 * for (JLabel blank : blanks) { if (blank.getText().equals("")) {
			 * 
			 * // System.out.println(randomStr); blank.setText(randomStr); break;
			 * 
			 * } len++; }
			 */
			// blanks.get(len).setText(randomStr);
			if (len == rowSize)
				break;

			try {
				Thread.sleep(intervel);
			} catch (Exception e) {
				System.out.println("sleep error");
			}

		}
		System.out.println("게임 종료");
	}
}
