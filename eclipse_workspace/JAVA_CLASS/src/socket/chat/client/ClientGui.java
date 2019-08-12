package socket.chat.client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ClientGui {

	JFrame f = new JFrame("Type Two");
	JPanel main = new JPanel();

	JTextField inputField = new JTextField();

	public ClientGui() {
		Container con = f.getContentPane();
		con.setLayout(new BorderLayout());

		con.add(main, "Center");
		con.add(inputField, "South");

		JLabel label = new JLabel();
		label.setText("");
		main.add(label);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);

		inputField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientReceiveThread.receiveMsg = e.getActionCommand();
			}
		});
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ClientGui();
				new ClientMain();
			}
		});
	}
}
