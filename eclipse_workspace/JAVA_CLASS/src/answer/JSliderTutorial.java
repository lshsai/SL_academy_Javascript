package answer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// 
public class JSliderTutorial {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JSlider jRsource = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider jGsource = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider jBsource = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider[] sliders = { jRsource, jGsource, jBsource };

	// new JSlider(슬라이더상수, 최소값, 최대값, 초기값);
	int[] rgb = { 0, 0, 0 };


	public JSliderTutorial() {
		label.setPreferredSize(new Dimension(500, 100));
		label.setOpaque(true);
		
		for (int i = 0; i < sliders.length; i++) {
			final int a = i;
			sliders[i].setPreferredSize(new Dimension(150, 50));
			sliders[i].setMajorTickSpacing(50);
			sliders[i].setMinorTickSpacing(5);
			sliders[i].setPaintLabels(true);
			sliders[i].addChangeListener(new ChangeListener() {				
				@Override
				public void stateChanged(ChangeEvent e) {
					rgb[a] = ((JSlider) e.getSource()).getValue();
					update();
					// System.out.println(Arrays.toString(rgb));
				}
				
				private void update() {
					label.setBackground(new Color(rgb[0], rgb[1], rgb[2]));
				}
			});
		}
		/*
		 * sliders[0].addChangeListener(new ChangeListener() {
		 * 
		 * @Override public void stateChanged(ChangeEvent e) { jRsource = (JSlider)
		 * e.getSource(); } }); sliders[1].addChangeListener(new ChangeListener() {
		 * 
		 * @Override public void stateChanged(ChangeEvent e1) { jGsource = (JSlider)
		 * e1.getSource(); } }); sliders[2].addChangeListener(new ChangeListener() {
		 * 
		 * @Override public void stateChanged(ChangeEvent e2) { jBsource = (JSlider)
		 * e2.getSource(); } });
		 */
		
		label.setBackground(new Color(jRsource.getValue(), jGsource.getValue(), jBsource.getValue()));
		
//		slider.setPreferredSize(new Dimension(150, 50));
//
//		// 큰 눈금 50개마다
//		slider.setMajorTickSpacing(50);
//
//		// 작은 눈금 5개마다
//		slider.setMinorTickSpacing(5);
//
//		// 슬라이더 명찰 사용여부
//		slider.setPaintLabels(true);
//
//		// 슬라이더 눈금 사용여부
//		slider.setPaintTicks(true);
//
//		// ChangeListener : 변화가 있을때 이벤트처리
//		slider.addChangeListener(new ChangeListener() {
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				JSlider source = (JSlider) e.getSource();
//				label.setBackground(new Color(0, 0, source.getValue()));
//				System.out.println(source.getValue());
//			}
//		});

		
		frame.add(label, BorderLayout.CENTER);
		
		JPanel south = new JPanel();
		frame.add(south, "South");
		south.add(sliders[0]);
		south.add(sliders[1]);
		south.add(sliders[2]);
		
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

class CSlider extends JSlider implements ChangeListener {
	JSlider jRsource;
	JSlider jGsource;
	JSlider jBsource;
	JLabel label;

	public CSlider(JSlider jRsource, JSlider jGsource, JSlider jBsource, JLabel label) {
		this.jRsource = jRsource;
		this.jGsource = jGsource;
		this.jBsource = jBsource;
		this.label = label;
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		jRsource = (JSlider) e.getSource();
		jGsource = (JSlider) e.getSource();
		jBsource = (JSlider) e.getSource();
		
		label.setBackground(new Color(jRsource.getValue(), jGsource.getValue(), jBsource.getValue()));
	}
}
