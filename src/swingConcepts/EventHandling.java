package swingConcepts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame();
//		JButton b= new JButton("Click me..");
//		b.setBounds(50, 100, 90, 30);
//		f.add(b);
//		b.addActionListener(e -> JOptionPane.showMessageDialog(f, "Button Clicked!"));
		
		String[] categories = {"Select Category", "Electronics", "Furniture", "Clothing", "Groceries"};

        // First ComboBox (Main Categories)
        JComboBox<String> categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.setBounds(100, 50, 180, 30);
        JLabel label= new JLabel("Sleted: None");
        label.setBounds(100, 100, 180, 30);
        categoryComboBox.addItemListener(e->{
        	if(e.getStateChange()==ItemEvent.SELECTED) {
        		String selected= (String) categoryComboBox.getSelectedItem();
        		label.setText("Selected"+selected);
        	}
        });
		f.add(categoryComboBox);
		f.add(label);
		
		JTextField tf= new JTextField("Type Something.");
		tf.setBounds(100, 150, 180, 30);
		
		JLabel label1= new JLabel(" ");
        label1.setBounds(100, 200, 180, 30);
        tf.addKeyListener(new KeyListener() {
        	public void keyPressed(KeyEvent e) {
                label1.setText("Key Pressed: " + e.getKeyChar());
            }
            public void keyReleased(KeyEvent e) {
                label1.setText("Key Released: " + e.getKeyChar());
            }
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });
		f.add(tf);
		f.add(label1);
		f.setSize(400,500);
		f.setTitle("event handling..");
		f.setLayout(null);
		f.setVisible(true);
	}

}
