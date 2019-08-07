package swing.layout;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class JTextFieldTutorial {

	JFrame f = new JFrame("Jtext");
	JPanel p = new JPanel();
	JTextField text = new JTextField(20);
	JButton okBtn = new JButton("ok");

	public JTextFieldTutorial() {
		Container con = f.getContentPane();

		p.add(text);
		p.add(okBtn);
		// JtextField�� Actionlistener�� enterŰ�� ó���Ѵ� 
		text.addActionListener(new ActionListener() {
			@Override
			// ActionEvent e : �̺�Ʈ�� �Ͼ���� ����� ������ ����ִ� ��ü
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.toString());				
				// e.getActionCommand(): �̺�Ʈ��ü�� cmd���� �����´�.
				System.out.println("" + e.getActionCommand() + "�� �ԷµǾ����ϴ�.");		
				// e.getSource() : �̺�Ʈ�� �߻���Ų ��ü�� �����´�.
				JTextField tf = (JTextField) e.getSource();
				// tf.setText : �ؽ�Ʈ�� ���ϴ� �������� set�Ѵ�. 
				tf.setText("");
			}
		});
		
		text.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				System.out.println("������");
			}			
			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("����");				
			}			
			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("����");			
			}
		});
		
		con.add(p);

		f.setVisible(true);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new JTextFieldTutorial();
			}
		});
	}
}
