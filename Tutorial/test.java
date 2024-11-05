import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test implements ActionListener{
	JLabel l;
	JTextField t;
	JButton b;
	
	test()
	{
		JFrame f = new JFrame("TEXT FIELD");
		
		l = new JLabel("Login");
		
		t = new JTextField(16);
		
		b = new JButton("Submit");
		
		JPanel p = new JPanel(new GridLayout(3,1));
		
		p.add(l);
		p.add(t);
		p.add(b);
		
		b.addActionListener(this);
		
		f.add(p);
		
		f.setSize(300,300);
		
		f.show();
	}
	//If the button is pressed
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("submit"))
		{
		//set the text of the label to the text of the field
		l.setText(t.getText());
		//set the text of the field to the blank
		t.setText(" ");
		}
	}
	public static void main(String args[])
	{
	test t = new test();
	}
}
