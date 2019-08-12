package answer;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class RSPGameGui extends JFrame {
	static String[] select = {"가위", "바위", "보"};
	static String input = null;

	Container con;

	JPanel centerPanel = new JPanel();
	JTextArea chatting = new JTextArea(10,30);
	
	JPanel southPanel = new JPanel();	
	JButton btnFirst = new JButton("가위");
	JButton btnSecond = new JButton("바위");
	JButton btnThird = new JButton("보");
	
	
	public RSPGameGui() {
		con = getContentPane();

		con.add(centerPanel, "Center");
		centerPanel.add(chatting);
		chatting.setEditable(false);
		
		southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.LINE_AXIS));
		southPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		
		
		chatting.append(("가위 바위 보 버튼을 눌러주세요." + "\n"));
		
		btnFirst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = 0;
				RSP(value);
			}
		});
		btnSecond.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = 1;
				RSP(value);
			}
		});
		btnThird.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = 2;
				RSP(value);	
			}
		});		
		southPanel.add(btnFirst);
		southPanel.add(btnSecond);
		southPanel.add(btnThird);		
		con.add(southPanel, "South");
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	public void RSP(int value) {
		value = (int)value;
		int com = (int)(Math.random()*3);
		
		if(com == value) {
			input = "비김";
			showResult(input, value, com);
		} else {
			if((com+1)%3 == value) {
				input = "사용자가 이김";
				showResult(input, value, com);
			} else if((value+1)%3 == com) {
				input = "컴퓨터가 이김";
				showResult(input, value, com);
			}
		}
	}
	
	public void showResult(String input, int value, int com) {
		chatting.append("************************"+"\n");
		chatting.append("결과 : " + input + "\n");
		chatting.append("사용자 :" + select[value] + "\n");
		chatting.append("컴퓨터 : " + select[com] + "\n");
		chatting.append("************************"+"\n");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				RSPGameGui ui = new RSPGameGui();
			}
		});
	}
}

