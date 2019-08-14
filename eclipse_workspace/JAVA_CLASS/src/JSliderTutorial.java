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
	
	// new JSlider(슬라이더상수, 최소값, 최대값, 초기값);
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,255,0);

	public JSliderTutorial() {
		label.setPreferredSize(new Dimension(500, 100));
		label.setOpaque(true);
		slider.setPreferredSize(new Dimension(500, 50));
		
		// 큰 눈금 50개마다
		slider.setMajorTickSpacing(50);
		
		// 작은 눈금 5개마다  
		slider.setMinorTickSpacing(5);
		
		// 슬라이더 명찰 사용여부
		slider.setPaintLabels(true);
		
		// 슬라이더 눈금 사용여부
		slider.setPaintTicks(true);
		
		// ChangeListener : 변화가 있을때 이벤트처리 
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
