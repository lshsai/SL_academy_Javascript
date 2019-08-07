package answer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TypingProgram_GUI implements Runnable {

	JFrame f = new JFrame();
	JPanel main = new JPanel();
	JPanel view = new JPanel();
	JPanel topscore = new JPanel();/////////////////////////////////////////////////*************///////////////////////////////

	String[] bank = { "사과", "Apple", "귤", "오렌지", "밤" };

	HashSet<JLabel> blanks = new HashSet<>();
	JLabel score = new JLabel("점수 : 0", JLabel.NORTH_EAST); /////////////////////////////////////////////////*************///////////////////////////////
	long intervel = 1 * 1000 / 2;

	final int wordSize = 30;
	{
		view.setLayout(new GridLayout(6, 5, 3, 3));

		topscore.add(score); /////////////////////////////////////////////////*************///////////////////////////////

		for (int i = 0; i < wordSize; i++) {
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

	JTextField inputfield = new JTextField(30);
	// JTextField outscore = new JTextField(30); /////////////////////////////////////////////////*************///////////////////////////////
	Container con;

	public TypingProgram_GUI() {

		main.setLayout(new BorderLayout());

		main.add(view, "Center");
		main.add(inputfield, "South");
		main.add(topscore, "North");/////////////////////////////////////////////////*************///////////////////////////////

		inputfield.setFont(new Font("굴림", Font.PLAIN, 30));

		inputfield.addActionListener(new ActionListener() {
			int ss = 0;/////////////////////////////////////////////////*************///////////////////////////////
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = e.getActionCommand();
				for (JLabel blank : blanks) {
					if (input.equalsIgnoreCase(blank.getText())) {
						blank.setText("");
						ss ++;/////////////////////////////////////////////////*************///////////////////////////////
						score.setText("점수 : " + ss);/////////////////////////////////////////////////*************///////////////////////////////
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
				new TypingProgram_GUI();

			}
		});
	}

	@Override
	public void run() {
		while (true) {
			int len = 0;
			for (JLabel blank : blanks) {
				if (blank.getText().equals("")) {
					String randomStr = bank[(int) (Math.random() * bank.length)];
					// System.out.println(randomStr);
					blank.setText(randomStr);
					break;

				}
				len++;
			}

			if (len == wordSize)
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
