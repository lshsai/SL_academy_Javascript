package answer.chatGui;

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




public class ClientMainFrame extends JFrame {
	Socket cs;
	Container con;
	PrintWriter writer;
	
	JPanel centerPanel = new JPanel();
	
	JPanel topPanel = new JPanel();
	JButton reqBtn = new JButton("접속요청");
	JTextField inputIp = new JTextField(10);
	JTextField inputPort = new JTextField(5);
	JTextField inputId = new JTextField(5);
	JLabel labelIp = new JLabel();
	JLabel labelPort = new JLabel();
	JLabel labelId = new JLabel();
	
	static String ipNum ="";
	static int portNum=0;
	static String idString="";
	
	JTextArea chatting = new JTextArea(10,30);
	JPanel southPanel = new JPanel();
	JTextField inputChat = new JTextField(30);

	
	public ClientMainFrame() {
	
		labelIp.setText("IP");
		labelPort.setText("PORT");
		labelId.setText("ID");
		

		
		setLayout(new BorderLayout());
		con = getContentPane();
		
		con.add(topPanel, "North");
		topPanel.add(labelIp);
		topPanel.add(inputIp);
		topPanel.add(labelPort);
		topPanel.add(inputPort);
		topPanel.add(labelId);
		topPanel.add(inputId);
		topPanel.add(reqBtn);
		reqBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ipNum = inputIp.getText();
				portNum = Integer.parseInt(inputPort.getText());
				idString = inputId.getText();
				
				makeSc(ipNum, portNum);
				
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
			ClientMainFrame mainFrame = new ClientMainFrame();
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


