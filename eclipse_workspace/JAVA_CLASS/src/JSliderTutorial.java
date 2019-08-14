package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// 
public class JSliderTutorial {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	// new JSlider(�����̴����, �ּҰ�, �ִ밪, �ʱⰪ);
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,255,0);

	public JSliderTutorial() {
		label.setPreferredSize(new Dimension(500, 100));
		label.setOpaque(true);
		slider.setPreferredSize(new Dimension(500, 50));
		
		// ū ���� 50������
		slider.setMajorTickSpacing(50);
		
		// ���� ���� 5������  
		slider.setMinorTickSpacing(5);
		
		// �����̴� ���� ��뿩��
		slider.setPaintLabels(true);
		
		// �����̴� ���� ��뿩��
		slider.setPaintTicks(true);
		
		// ChangeListener : ��ȭ�� ������ �̺�Ʈó�� 
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
			  	JSlider source = (JSlider) e.getSource();
				label.setBackground(new Color(0,0,source.getValue()));
			}
		});
		
		frame.add(label, BorderLayout.CENTER);
		frame.add(slider,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JSliderTutorial();
			}
		});
	}
}
