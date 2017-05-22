import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Game4 extends JFrame implements ActionListener 
{
	JMenu menu,lvl;
	JMenuBar mb;
	JLabel l1,l2,l3;
	Icon star;
	Icon ic1=new ImageIcon("6/1.jpg");
	Icon ic2=new ImageIcon("6/2.jpg");
	Icon ic3=new ImageIcon("6/3.jpg");
	Icon ic4=new ImageIcon("6/4.jpg");
	Icon ic5=new ImageIcon("6/5.jpg");
	Icon ic6=new ImageIcon("6/6.jpg");
	Icon ic7=new ImageIcon("6/7.jpg");
	Icon ic8=new ImageIcon("6/8.jpg");
	Icon ic9=new ImageIcon("6/9.jpg");
	Icon ic10=new ImageIcon("6/10.jpg");
	Icon ic11=new ImageIcon("6/11.jpg");
	Icon ic12=new ImageIcon("6/12.jpg");
	Icon ic13=new ImageIcon("6/13.jpg");
	Icon ic14=new ImageIcon("6/14.jpg");
	Icon ic15=new ImageIcon("6/15.jpg");
	Icon ic16=new ImageIcon("6/16.jpg");
	
	JMenuItem nwgm,quit,three,four;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,sample;  
	Game4(String str,Game3 g)
	{
		mb=new JMenuBar();
		   menu=new JMenu("Menu");
		   lvl=new JMenu("Level");
		   setJMenuBar(mb);
		   mb.add(menu);
		   mb.add(lvl);
		   nwgm=new JMenuItem("New Game");
		   quit=new JMenuItem("Quit");
		   three=new JMenuItem("3X3");
		   four=new JMenuItem("4X4");
		   menu.add(nwgm);
		   menu.add(quit);
		   lvl.add(three);
		   //lvl.add(four);
		   b1=new JButton(ic1); 
		   b1.setBounds(200, 20, 150, 94);
		   b2=new JButton(ic2);
		   b2.setBounds(350,20,  150, 94);
		   b3=new JButton(ic3);
		   b3.setBounds(500,20,  150, 94);
		   b4=new JButton(ic4);
		   b4.setBounds(650,20,  150, 94);
		   b5=new JButton(ic5);
		   b5.setBounds(200,114,  150, 94);
		   b6=new JButton(ic6);
		   b6.setBounds(350, 114,   150, 94);
		   b7=new JButton(ic7);
		   b7.setBounds(500, 114,  150, 94);
		   b8=new JButton(ic8);
		   b8.setBounds(650,114,  150, 94);
		   b9=new JButton(ic9);
		   b9.setBounds(200,208,  150, 94);
		   b10=new JButton(ic10);
		   b10.setBounds(350,208,  150, 94);
		   b11=new JButton(ic11);
		   b11.setBounds(500,208,  150, 94);
		   b12=new JButton(ic12);
		   b12.setBounds(650,208,  150, 94);
		   b13=new JButton(ic13);
		   b13.setBounds(200,302,  150, 94);
		   b14=new JButton(ic14);
		   b14.setBounds(350,302,  150, 94);
		   b15=new JButton();
		   b15.setBounds(500,302,  150, 94);
		   b16=new JButton(ic16);
		   b16.setBounds(650,302,  150, 94);
		   sample=new JButton(new ImageIcon("6/main1.jpg"));
		   sample.setBounds(320,450,400,251);
		   star=b15.getIcon();
		   //l1=new JLabel("Time Remaining:");
		   //l1.setBounds(30,30,100,50);
		   //add(l1);
		   add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
		   add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(sample);
		   b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
		   b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
		   b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
		   b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
		   b15.addActionListener(this);b14.addActionListener(this);b13.addActionListener(this);
		   b16.addActionListener(this);
		   sample.addActionListener(this);three.addActionListener(this);
		   setLayout(null);
		   setSize(900,900);
		   setLocationRelativeTo(this);
		   setDefaultCloseOperation(EXIT_ON_CLOSE);
		   setVisible(true); 
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Icon s1=b1.getIcon();
			if(b2.getIcon()==star)
			{
				b2.setIcon(s1);
				b1.setIcon(star);
			}
			else if(b5.getIcon()==star)
			{
				b5.setIcon(s1);
				b1.setIcon(star);
			}
		}
		if(e.getSource()==b2)
		{
			Icon s1=b2.getIcon();
			if(b1.getIcon()==star)
			{
				b1.setIcon(s1);
				b2.setIcon(star);
			}
			else if(b3.getIcon()==star)
			{
				b3.setIcon(s1);
				b2.setIcon(star);
			}
			else if(b6.getIcon()==star)
			{
				b6.setIcon(s1);
				b2.setIcon(star);
			}
		 }

		if(e.getSource()==b3)
		{
			Icon s1=b3.getIcon();
			if(b4.getIcon()==star)
			{
				b4.setIcon(s1);
				b3.setIcon(star);
			}
			else if(b2.getIcon()==star)
			{
				b2.setIcon(s1);
				b3.setIcon(star);
			}
			else if(b7.getIcon()==star)
			{
				b7.setIcon(s1);
				b3.setIcon(star);
			}
		 }
		if(e.getSource()==b4)
		{
			Icon s1=b4.getIcon();
			if(b3.getIcon()==star)
			{
				b3.setIcon(s1);
				b4.setIcon(star);
			}
			else if(b8.getIcon()==star)
			{
				b8.setIcon(s1);
				b4.setIcon(star);
			}
		}
		if(e.getSource()==b5)
		{
			Icon s1=b5.getIcon();
			if(b1.getIcon()==star)
			{
				b1.setIcon(s1);
				b5.setIcon(star);
			}
			else if(b6.getIcon()==star)
			{
				b6.setIcon(s1);
				b5.setIcon(star);
			}
			else if(b9.getIcon()==star)
			{
				b9.setIcon(s1);
				b5.setIcon(star);
			}
		 }
		if(e.getSource()==b6)
		{
			Icon s1=b6.getIcon();
			if(b2.getIcon()==star)
			{
				b2.setIcon(s1);
				b6.setIcon(star);
			}
			else if(b5.getIcon()==star)
			{
				b5.setIcon(s1);
				b6.setIcon(star);
			}
			else if(b7.getIcon()==star)
			{
				b7.setIcon(s1);
				b6.setIcon(star);
			}
			else if(b10.getIcon()==star)
			{
				b10.setIcon(s1);
				b6.setIcon(star);
			}
		 }
		if(e.getSource()==b7)
		{
			Icon s1=b7.getIcon();
			if(b3.getIcon()==star)
			{
				b3.setIcon(s1);
				b7.setIcon(star);
			}
			else if(b6.getIcon()==star)
			{
				b6.setIcon(s1);
				b7.setIcon(star);
			}
			else if(b8.getIcon()==star)
			{
				b8.setIcon(s1);
				b7.setIcon(star);
			}
			else if(b11.getIcon()==star)
			{
				b11.setIcon(s1);
				b7.setIcon(star);
			}
		 }
		if(e.getSource()==b8)
		{
			Icon s1=b8.getIcon();
			if(b4.getIcon()==star)
			{
				b4.setIcon(s1);
				b8.setIcon(star);
			}
			else if(b7.getIcon()==star)
			{
				b7.setIcon(s1);
				b8.setIcon(star);
			}
			else if(b12.getIcon()==star)
			{
				b12.setIcon(s1);
				b8.setIcon(star);
			}
		 }
		if(e.getSource()==b9)
		{
			Icon s1=b9.getIcon();
			if(b5.getIcon()==star)
			{
				b5.setIcon(s1);
				b9.setIcon(star);
			}
			else if(b10.getIcon()==star)
			{
				b10.setIcon(s1);
				b9.setIcon(star);
			}
			else if(b13.getIcon()==star)
			{
				b13.setIcon(s1);
				b9.setIcon(star);
			}
		 }
		if(e.getSource()==b10)
		{
			Icon s1=b10.getIcon();
			if(b6.getIcon()==star)
			{
				b6.setIcon(s1);
				b10.setIcon(star);
			}
			else if(b9.getIcon()==star)
			{
				b9.setIcon(s1);
				b10.setIcon(star);
			}
			else if(b11.getIcon()==star)
			{
				b11.setIcon(s1);
				b10.setIcon(star);
			}
			else if(b14.getIcon()==star)
			{
				b14.setIcon(s1);
				b10.setIcon(star);
			}
		 }
		
		if(e.getSource()==b11)
		{
			Icon s1=b11.getIcon();
			if(b7.getIcon()==star)
			{
				b7.setIcon(s1);
				b11.setIcon(star);
			}
			else if(b10.getIcon()==star)
			{
				b10.setIcon(s1);
				b11.setIcon(star);
			}
			else if(b12.getIcon()==star)
			{
				b12.setIcon(s1);
				b11.setIcon(star);
			}
			else if(b15.getIcon()==star)
			{
				b15.setIcon(s1);
				b11.setIcon(star);
			}
		 }
		if(e.getSource()==b12)
		{
			Icon s1=b12.getIcon();
			if(b8.getIcon()==star)
			{
				b8.setIcon(s1);
				b12.setIcon(star);
			}
			else if(b11.getIcon()==star)
			{
				b11.setIcon(s1);
				b12.setIcon(star);
			}
			else if(b16.getIcon()==star)
			{
				b16.setIcon(s1);
				b12.setIcon(star);
			}
		 }
		if(e.getSource()==b13)
		{
			Icon s1=b13.getIcon();
			if(b9.getIcon()==star)
			{
				b9.setIcon(s1);
				b13.setIcon(star);
			}
			else if(b14.getIcon()==star)
			{
				b14.setIcon(s1);
				b13.setIcon(star);
			}
			
		 }
		if(e.getSource()==b14)
		{
			Icon s1=b14.getIcon();
			if(b10.getIcon()==star)
			{
				b10.setIcon(s1);
				b14.setIcon(star);
			}
			else if(b13.getIcon()==star)
			{
				b13.setIcon(s1);
				b14.setIcon(star);
			}
			else if(b15.getIcon()==star)
			{
				b15.setIcon(s1);
				b14.setIcon(star);
			}
		 }
		if(e.getSource()==b15)
		{
			Icon s1=b15.getIcon();
			if(b11.getIcon()==star)
			{
				b11.setIcon(s1);
				b15.setIcon(star);
			}
			else if(b14.getIcon()==star)
			{
				b14.setIcon(s1);
				b15.setIcon(star);
			}
			else if(b16.getIcon()==star)
			{
				b16.setIcon(s1);
				b15.setIcon(star);
			}
		 }
		if(e.getSource()==b16)
		{
			Icon s1=b16.getIcon();
			if(b12.getIcon()==star)
			{
				b12.setIcon(s1);
				b16.setIcon(star);
			}
			else if(b15.getIcon()==star)
			{
				b15.setIcon(s1);
				b16.setIcon(star);
			}
			
		 }
		if(e.getSource()==three)
		{
			Game g=new Game("Puzzle",null);
			g.setVisible(true);
			this.setVisible(false);
		}
		/*if(e.getSource()==sample)
		{
			Game4 g=new Game4("Puzzle", this);
			g.setVisible(true);
			this.setVisible(false);
		}*/
	 }
		
	}


