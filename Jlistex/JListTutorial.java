package swing;

import java.awt.Dimension;
import java.math.BigDecimal;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListTutorial {

    JFrame frame = new JFrame("Storage");
    JList<Product> list = new JList<>();
    DefaultListModel<Product> model = new DefaultListModel<>();

    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();

    public JListTutorial() {
    	// JList�� Model�� ���� 
        list.setModel(model);        

        // Model�� Element�� �߰� 
        // Element��ü�� toString() �޼��带 �������̵� �ؼ� 
        // JList��ü�� ������ �̸��� ������ �� �ִ�
        model.addElement(new Product("Oranges", new BigDecimal("2.00"), "These are fresh oranges"));
        model.addElement(new Product("Apples", new BigDecimal("1.50"), "These are fresh apples"));

        // ����Ʈ ���� �̺�Ʈó��
        list.getSelectionModel().addListSelectionListener(new ListSelectionListener() {			
			@Override
			public void valueChanged(ListSelectionEvent e) {
	            Product p = list.getSelectedValue();
	            label.setText("Name: " + p.getName() + " ::: " + p.getPrice().toPlainString() + " ::: " + p.getDesc());
	        }
        });
        		
        
        // Swing���� Pane�̶�? Component�� Ư�� ����� �����Ѵ� 

        // JSplitPane
        //	- setLeftComponent
        //  - setRightComponent
        //  - setTopComponent
        //  - setBottomComponent  
        //	https://docs.oracle.com/javase/tutorial/uiswing/components/splitpane.html
        
        // JList�� JScrollPane�� ���ε� ���ø� ���ʿ� ���δ� (JList�� ��ũ�� ��� ����)
        splitPane.setLeftComponent(new JScrollPane(list));
        splitPane.setRightComponent(panel);
        panel.add(label);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(100);

        // JSplitPane�� �����ӿ� ���δ�
        frame.add(splitPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(new Dimension(500, 200));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				new JListTutorial();				
			}
		});
    }

    private class Product {
        String name;
        BigDecimal price;
        String desc;

        public Product(String name, BigDecimal price, String desc) {
            this.name = name;
            this.price = price;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
        	// JList�� ������ ���ڿ��� �������ش�  
            return name;
        }
    }

}
