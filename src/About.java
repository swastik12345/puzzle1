import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class About extends Dialog implements ActionListener
{
	JLabel l1;
	public About(Frame arg0)
	{
		super(arg0);
		setLayout(null);
		setSize(300,300);
	   l1=new JLabel("This is a Puzzle Game.You set the puzzle picses in the correct image form");
	   l1.setBounds(20, 10, 300, 300);
	   add(l1);
	   setLocationRelativeTo(this);
	   setVisible(true);
		
	}


	
	

	public void actionPerformed(ActionEvent arg0) {
		
		
	}
   
}
