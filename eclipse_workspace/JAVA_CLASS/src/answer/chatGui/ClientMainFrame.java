package answer.chatGui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ClientMainFrame extends JFrame {
	Socket cs;
	Container con;
	PrintWriter writer;
	
	JPanel centerPanel = new JPanel();
	JTextArea chatting = new JTextArea(10,30);
	// 
	JPanel southPanel = new JPanel();
	JTextField inputChat = new JTextField(30);

	public ClientMainFrame(Socket cs) {
		this.cs = cs;
		try {
			writer = new PrintWriter(cs.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setLayout(new BorderLayout());
		con = getContentPane();
		
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

	
}
