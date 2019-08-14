package answer.serverGui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerMainFrame extends JFrame {
	
	Container con;
		
	JPanel centerPanel = new JPanel();	
	JPanel topPanel = new JPanel();
	JPanel southPanel = new JPanel();
	
	JButton reqBtn = new JButton("서버시작하기");
	JTextField inputPort = new JTextField(5);
	JLabel labelPort = new JLabel();
	static int portNum=0;
	
	///JTextArea chatting = new JTextArea(10,30);
	
	public ServerMainFrame() {
		labelPort.setText("가동할 포트번호 입력");
		
		setLayout(new BorderLayout());
		con = getContentPane();
		
		con.add(topPanel, "North");
		topPanel.add(labelPort);
		topPanel.add(inputPort);
		topPanel.add(reqBtn);
		reqBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				portNum = Integer.parseInt(inputPort.getText());
				
				// makeSc(portNum);
			}
		});
		
		con.add(centerPanel, "Center");
		centerPanel.add(chatting);
		chatting.setEditable(false);
		
		con.add(southPanel, "South");
		southPanel.add(inputChat);
		inputChat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//socket outputstream을 이용해 전송
				// e.getActionCommand()을 전송
				
				try {
					writer = new PrintWriter(cs.getOutputStream());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				String input = e.getActionCommand();
				writer.println(input);
				writer.flush();
				((JTextField)e.getSource()).setText("");
			}
		});

		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void makeSc(String add, int port) {
		try {
			cs = new Socket(add, port);
			ServerMainFrame mainFrame = new ServerMainFrame();
			new ClientReceiveThread(cs, mainFrame).start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}


