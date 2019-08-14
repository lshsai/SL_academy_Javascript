package answer.윤영한;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class RSPgui extends JFrame {
	RSPgui mainFrame = null;
	Container con = new Container();

	JPanel centerPanel = new JPanel();
	JLabel stateLabel = new JLabel("가위바위보 버튼을 눌러주세요.");
	JLabel mzbGif;

	JPanel southPanel = new JPanel();
	MzbButton[] mzbBtns   = { 
			new MzbButton("가위", 0, this),
			new MzbButton("바위", 1, this),
			new MzbButton("보", 2, this)
	};
	
	JPanel resetPanel = new JPanel();
	JButton resetBtn = new JButton("다시 시작하기");

	public RSPgui() {
		mainFrame = this;		
		initGUI();
	}
	
	private void initresetPanel() {		
		resetPanel.setLayout(new BorderLayout());
		
		resetPanel.add(resetBtn, "Center");
		
	}

	private void initCenterPanel() {
		centerPanel.setLayout(new BorderLayout());

		stateLabel.setHorizontalAlignment(SwingConstants.CENTER);

		ImageIcon img = new ImageIcon("img/mzb.gif");
		mzbGif = new JLabel(img);
		
		// Button의 addActionListener 
		// 누를때마다 이곳에 구현한(혹은 입력한) 메서드를 호출하는 것이 아니라
		// 버튼의 설정에 이러한 동작을 하라고 입력해놓는것 뿐이다  
		resetBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				mzbGif.setIcon(img);		
				setAllButtonsEnabled(true);
			}
		});

		centerPanel.add(stateLabel, "North");
		centerPanel.add(mzbGif, "Center");
	}

	private void initSouthPanel() {
		southPanel.setLayout(new FlowLayout());
		
		
		southPanel.add(mzbBtns[0]);
		southPanel.add(mzbBtns[1]);
		southPanel.add(mzbBtns[2]);
	}

	private void initGUI() {
		con = mainFrame.getContentPane();
		con.setLayout(new BorderLayout());

		initCenterPanel();
		initSouthPanel();
		initresetPanel();

		con.add(centerPanel, "North");
		con.add(southPanel, "Center");
		con.add(resetPanel, "South");
		
		mainFrame.setTitle("가위바위보 게임");
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.pack();
	}

	public String getResult(int user, int com) {
		if (user < 0 || user > 2) {
			return "입력이 이상합니다.";
		}
		if (com == user) {
			return "입력이 이상합니다.";
		} else {
			if ((com + 1) % 3 == user) {
				return "사용자가 이겼습니다.";
			} else if (com == (user + 1) % 3) {
				return "컴퓨터가 이겼습니다.";
			}
		}
		return null;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new RSPgui();
			}
		});
	}
	
	public void setAllButtonsEnabled(boolean b) {
		for (int i = 0; i < mzbBtns.length; i++) 
			mzbBtns[i].setEnabled(b);
	}
}

class MzbButton extends JButton implements ActionListener {
	String label;
	RSPgui main = null;

	public MzbButton(String label, int value, RSPgui main) {
		this.label = label;
		this.main = main;
		this.setActionCommand("" + value);
		
		
		Image resized = null;
		
		try {
			// ImageIO.read 와 File 객체를 이용하여 이미지를 불러옴
			Image ori = ImageIO.read(new File("img/" + label + ".jpg"));
			
			resized = ori.getScaledInstance(74, 74, Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ImageIcon img = new ImageIcon(resized);
		
		setIcon(img);
		
		addActionListener(this);
	}	
	
	public void actionPerformed(ActionEvent e) {
		int user = Integer.parseInt(e.getActionCommand());
		int com = (int)(Math.random()*3);
		
		String result = getResult(user, com);					
		
		System.out.println(main);
		main.setAllButtonsEnabled(false);
		
		// JFrame에 붙은 객체들을 제어하고 싶은데
		// 그곳에 우리가 붙인 객체들은 원래 JFrame에 있는 애들이 아니다 
		((JLabel)main.centerPanel.getComponent(0)).setText(result);
		((JLabel)main.centerPanel.getComponent(1)).setIcon(new ImageIcon("img/" + com + ".png"));
	}
		

	public String getResult(int user, int com) {
		if (com == user) {
			return "비겼습니다.";
		} else {
			if ((com + 1) % 3 == user) {
				return "사용자가 이겼습니다.";
			} else if (com == (user + 1) % 3) {
				return "컴퓨터가 이겼습니다.";
			}
		}
		return null;
	}

}
