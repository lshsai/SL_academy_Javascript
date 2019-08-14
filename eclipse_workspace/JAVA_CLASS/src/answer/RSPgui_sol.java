package answer.������;

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
	JLabel stateLabel = new JLabel("���������� ��ư�� �����ּ���.");
	JLabel mzbGif;

	JPanel southPanel = new JPanel();
	MzbButton[] mzbBtns   = { 
			new MzbButton("����", 0, this),
			new MzbButton("����", 1, this),
			new MzbButton("��", 2, this)
	};
	
	JPanel resetPanel = new JPanel();
	JButton resetBtn = new JButton("�ٽ� �����ϱ�");

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
		
		// Button�� addActionListener 
		// ���������� �̰��� ������(Ȥ�� �Է���) �޼��带 ȣ���ϴ� ���� �ƴ϶�
		// ��ư�� ������ �̷��� ������ �϶�� �Է��س��°� ���̴�  
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
		
		mainFrame.setTitle("���������� ����");
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.pack();
	}

	public String getResult(int user, int com) {
		if (user < 0 || user > 2) {
			return "�Է��� �̻��մϴ�.";
		}
		if (com == user) {
			return "�Է��� �̻��մϴ�.";
		} else {
			if ((com + 1) % 3 == user) {
				return "����ڰ� �̰���ϴ�.";
			} else if (com == (user + 1) % 3) {
				return "��ǻ�Ͱ� �̰���ϴ�.";
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
			// ImageIO.read �� File ��ü�� �̿��Ͽ� �̹����� �ҷ���
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
		
		// JFrame�� ���� ��ü���� �����ϰ� ������
		// �װ��� �츮�� ���� ��ü���� ���� JFrame�� �ִ� �ֵ��� �ƴϴ� 
		((JLabel)main.centerPanel.getComponent(0)).setText(result);
		((JLabel)main.centerPanel.getComponent(1)).setIcon(new ImageIcon("img/" + com + ".png"));
	}
		

	public String getResult(int user, int com) {
		if (com == user) {
			return "�����ϴ�.";
		} else {
			if ((com + 1) % 3 == user) {
				return "����ڰ� �̰���ϴ�.";
			} else if (com == (user + 1) % 3) {
				return "��ǻ�Ͱ� �̰���ϴ�.";
			}
		}
		return null;
	}

}
