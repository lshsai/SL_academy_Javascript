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
		// JtextField의 Actionlistener는 enter키만 처리한다 
		text.addActionListener(new ActionListener() {
			@Override
			// ActionEvent e : 이벤트가 일어났을때 당시의 정보를 담고있는 객체
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.toString());				
				// e.getActionCommand(): 이벤트객체의 cmd값을 가져온다.
				System.out.println("" + e.getActionCommand() + "가 입력되었습니다.");		
				// e.getSource() : 이벤트를 발생시킨 객체를 가져온다.
				JTextField tf = (JTextField) e.getSource();
				// tf.setText : 텍스트를 원하는 문장으로 set한다. 
				tf.setText("");
			}
		});
		
		text.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				System.out.println("지워짐");
			}			
			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("써짐");				
			}			
			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("변함");			
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
