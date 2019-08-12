package answer;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class RSPgui {
	JFrame main = new JFrame();
	Container con;

	JPanel centerPanel = new JPanel();
	JLabel stateLabel = new JLabel("버튼을 눌러주세요");
	

	JLabel mzbGif;

	JPanel southPanel = new JPanel();
	
	//JButton eastBtn = new JButton();
	//JPanel eastPanel = new JPanel();
	
	public RSPgui() {
		initGUI();
	}

	private void initCenterPanel() {
		centerPanel.setLayout(new BorderLayout());

		stateLabel.setHorizontalAlignment(SwingConstants.CENTER);

		ImageIcon img = new ImageIcon("img/mzb.gif");
		mzbGif = new JLabel(img);

		centerPanel.add(stateLabel, "North");
		centerPanel.add(mzbGif, "Center");

		// centerPanel.add()

		System.out.println(centerPanel.getComponent(0));
	}

	private void initSouthPanel() {
		southPanel.setLayout(new FlowLayout());

		southPanel.add(new MzbButton("가위", 0, centerPanel));
		southPanel.add(new MzbButton("바위", 1, centerPanel));
		southPanel.add(new MzbButton("보", 2, centerPanel));
		southPanel.add(new MzbButton("재시작", 3, centerPanel));
	}

	private void initGUI() {
		con = main.getContentPane();
		con.setLayout(new BorderLayout());

		initCenterPanel();
		initSouthPanel();

		con.add(centerPanel, "Center");
		con.add(southPanel, "South");

		main.setVisible(true);
		main.pack();
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setResizable(false);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new RSPgui();

			}
		});

	}
}

class MzbButton extends JButton implements ActionListener {
	String label;
	JPanel con;
	// int value;

	public MzbButton(String label, int value, JPanel con) {
		this.label = label;
		this.con = con;

		this.setActionCommand("" + value);

		Image resized = null;

		try {
			// ImageIO.read와 File 객체를 이용해 ori라는 변수에 이미지를 불러 옴.
			Image ori = ImageIO.read(new File("img/" + label + ".jpg"));

			// ori의 크기를 수정한 뒤 반환 : getScaledInstance
			resized = ori.getScaledInstance(74, 74, Image.SCALE_DEFAULT);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ImageIcon img = new ImageIcon(resized);
		setIcon(img);

		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int user = Integer.parseInt(e.getActionCommand());
		int com = (int) (Math.random() * 3);
		String src = null;

		System.out.println(user);
		System.out.println(com);

		String result = getResult(user, com);
		((JLabel) con.getComponent(0)).setText(result);

		if (com == 0) {
			src = "img/com_big_S.jpg";
		} else if (com == 1) {
			src = "img/com_big_R.jpg";
		} else { 
			src = "img/com_big_P.gif";
		} 	
		
		if (user == 3) {
			src = "img/mzb.gif";
		}
		
		((JLabel) con.getComponent(1)).setIcon(new ImageIcon(src));

	}

	// center 제어권 > 0, 1

	public String getResult(int user, int com) {
		if (user < 0 || user > 2) {
			return "버튼을 눌러주세요";
		} else if (com == user) {
			return "비겼습니다.";
		} else {
			if ((com + 1) % 3 == user) {
				return "사용자가 이겼습니다.";
			} else {
				return "컴퓨터가 이겼습니다.";
			}
		}
	}
}
