package swingConcepts;

import javax.swing.*;

public class Example1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setTitle("Dasaratha");//creates the title for the frame 
		//ImageIcon component= used to place the image at the source URL 
		ImageIcon im = new ImageIcon(Example1.class.getResource("/swingConcepts/ppt2.jpeg"));
		f.setIconImage(im.getImage());// it will set the icon at the top left side of title

		//        //JButton component= used to create a button on the UI .
		//        JButton b1= new JButton("Ok");//creating button with some text and also we can insert image in it
		//        f.add(b1);//button add to the frame
		//        b1.setBounds(120, 90, 120, 30);// we have to set the boundaries like x-axis, y axis, width , height



		// JLabel component=  is used to show text or images
		//        JLabel l = new JLabel("Dasaratha Reddy");
		//        l.setBounds(0, 50, 200, 30);
		//
		//        // Add label to the frame
		//        f.add(l);

		//        // JTextField component= used to an editable single line TextBox
		//        JTextField tf = new JTextField("");
		//        tf.setBounds(100, 100, 300, 60); // x, y, width, height
		//        f.add(tf);
		//        
		//        //JTextArea component =A JTextArea is like a JTextField, but it allows you to enter multiple lines of text.
		//        JTextArea ta = new JTextArea("Type your text here...");
		//        ta.setBounds(50, 50, 250, 100); // x, y, width, height
		//        f.add(ta);

		//JPasswordField component= A JPasswordField is just like a JTextField, but it hides the characters typed by the user (shows ●●●● instead of real text).
		//        JPasswordField pf = new JPasswordField();
		//        pf.setBounds(50, 50, 200, 30); // x, y, width, height
		//        f.add(pf);


		//JCheckBox Component= A JCheckBox is used to create a check option (true/false). You can select or deselect it.
		//        JCheckBox cb1 = new JCheckBox("Java");
		//        cb1.setBounds(50, 50, 100, 30);
		//
		//        JCheckBox cb2 = new JCheckBox("Python");
		//        cb2.setBounds(50, 100, 100, 30);
		//
		//        //JRadioButton is used to select an option as like male or female
		//        JRadioButton rb= new JRadioButton("Male");
		//        rb.setBounds(100, 100, 100, 30);
		//        
		//        JRadioButton  rb1= new JRadioButton("Female");
		//        rb1.setBounds(100,150,100,30);
		//        
		//        ButtonGroup bg= new ButtonGroup();
		//        bg.add(rb);
		//        bg.add(rb1);
		//        

		//        
		//        f.add(rb);
		//        f.add(rb1);
		//        
		//        // Add checkboxes to frame
		//        f.add(cb1);
		//        f.add(cb2);

//		DefaultListModel<String> cl=new DefaultListModel<String>();
//		cl.addElement("sareat");
//		cl.addElement("dasa");
//		cl.addElement("sarearet");
//		cl.addElement("dasaed");
//		JList<String> jl= new JList<String>(cl);
//		jl.setBounds(100, 100, 100, 100);
//		f.add(jl);
		
//		String [] Categories= {"Groceries","Clothing","Furniture","electronics"};
//		JComboBox<String> jb1=new JComboBox<String>(Categories);
//		jb1.setBounds(15, 100, 80, 30);
//		f.add(jb1);
		
		JColorChooser cc=new JColorChooser();
		cc.setBounds(100, 100, 100, 190);
		f.add(cc);
		
		f.setSize(450, 350);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setVisible(true);


	}
}
