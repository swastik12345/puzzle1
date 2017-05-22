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
import javax.swing.JOptionPane;


public class Game1 extends JFrame implements ActionListener
{
	JMenu menu,lvl;
	JMenuBar mb;
	JLabel l1,l2,l3;
	Icon star;
	Icon ic1=new ImageIcon("3/1.jpg");
	Icon ic2=new ImageIcon("3/2.jpg");
	Icon ic3=new ImageIcon("3/3.jpg");
	Icon ic4=new ImageIcon("3/4.jpg");
	Icon ic5=new ImageIcon("3/5.jpg");
	Icon ic6=new ImageIcon("3/6.jpg");
	Icon ic7=new ImageIcon("3/7.jpg");
	Icon ic8=new ImageIcon("3/8.jpg");
	Icon ic9=new ImageIcon("3/9.jpg");
	
	JMenuItem nwgm,quit,three,four;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample;   
   Game1(String str,Game g)
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
	   //lvl.add(three);
	   lvl.add(four);
	   b1=new JButton();
	   b1.setBounds(245, 20, 175, 121);
	   b2=new JButton(ic2);
	   b2.setBounds(420,20,175,121);
	   b3=new JButton(ic3);
	   b3.setBounds(595,20,175,121);
	   b4=new JButton(ic4);
	   b4.setBounds(245,141,175,121);
	   b5=new JButton(ic5);
	   b5.setBounds(420,141,175,121);
	   b6=new JButton(ic6);
	   b6.setBounds(595, 141, 175,121);
	   b7=new JButton(ic7);
	   b7.setBounds(245, 262, 175,121);
	   b8=new JButton(ic8);
	   b8.setBounds(420,262,175,121);
	   b9=new JButton(ic9);
	   b9.setBounds(595,262,175,121);
	   sample=new JButton(new ImageIcon("3/main1.jpg"));
	   sample.setBounds(320,400,400,251);
	   star=b1.getIcon();
	   //l1=new JLabel("Time Remaining:");
	   //l1.setBounds(30,30,100,50);
	   //add(l1);
	   add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(sample);
	   b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
	   b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
	   b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
	   sample.addActionListener(this);nwgm.addActionListener(this);quit.addActionListener(this);
	   four.addActionListener(this);
	   setLayout(null);
	   setSize(800,710);
	   setLocationRelativeTo(this);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
public void actionPerformed(ActionEvent e) {

	if(e.getSource()==b1){ 
		
	    Icon s1=b1.getIcon();  
	      if(b2.getIcon()==star){  
	        b2.setIcon(s1);  
	        b1.setIcon(star);  
	      } else if(b4.getIcon()==star){  
	                    b4.setIcon(s1);  
	                    b1.setIcon(star);  
	                   }  
	  }  
	  
	if(e.getSource()==b2){  
	    Icon s1=b2.getIcon();  
	      if(b1.getIcon()==star){  
	        b1.setIcon(s1);  
	        b2.setIcon(star);  
	      } else if(b5.getIcon()==star){  
	                    b5.setIcon(s1);  
	                    b2.setIcon(star);  
	                   }  
	         else if(b3.getIcon()==star){  
	                    b3.setIcon(s1);  
	                    b2.setIcon(star);  
	                   }  
	  }  
	  
	if(e.getSource()==b3){  
	    Icon s1=b3.getIcon();  
	      if(b2.getIcon()==star){  
	        b2.setIcon(s1);  
	        b3.setIcon(star);  
	      } else if(b6.getIcon()==star){  
	                    b6.setIcon(s1);  
	                    b3.setIcon(star);  
	                   }  
	  }  
	  
	if(e.getSource()==b4){  
	    Icon s1=b4.getIcon();  
	      if(b1.getIcon()==star){  
	        b1.setIcon(s1);  
	        b4.setIcon(star);  
	      } else if(b5.getIcon()==star){  
	                    b5.setIcon(s1);  
	                    b4.setIcon(star);  
	                   }  
	         else if(b7.getIcon()==star){  
	                    b7.setIcon(s1);  
	                    b4.setIcon(star);  
	                   }  
	  }  
	  
	if(e.getSource()==b5){  
	    Icon s1=b5.getIcon();  
	      if(b2.getIcon()==star){  
	        b2.setIcon(s1);  
	        b5.setIcon(star);  
	      } else if(b4.getIcon()==star){  
	                    b4.setIcon(s1);  
	                    b5.setIcon(star);  
	                   }  
	         else if(b6.getIcon()==star){  
	                    b6.setIcon(s1);  
	                    b5.setIcon(star);  
	                   }  
	          else if(b8.getIcon()==star){  
	                    b8.setIcon(s1);  
	                    b5.setIcon(star);  
	                   }  
	}  
	  
	if(e.getSource()==b6){  
	    Icon s1=b6.getIcon();  
	      if(b3.getIcon()==star){  
	        b3.setIcon(s1);  
	        b6.setIcon(star);  
	      } else if(b5.getIcon()==star){  
	                    b5.setIcon(s1);  
	                    b6.setIcon(star);  
	                   }  
	         else if(b9.getIcon()==star){  
	                    b9.setIcon(s1);  
	                    b6.setIcon(star);  
	                   }  
	}  
	  
	if(e.getSource()==b7){  
	    Icon s1=b7.getIcon();  
	      if(b4.getIcon()==star){  
	        b4.setIcon(s1);  
	        b7.setIcon(star);  
	      } else if(b8.getIcon()==star){  
	                    b8.setIcon(s1);  
	                    b7.setIcon(star);  
	                   }  
	 } 
	  
	   if(e.getSource()==b8){  
	    Icon s1=b8.getIcon();  
	      if(b7.getIcon()==star){  
	        b7.setIcon(s1);  
	        b8.setIcon(star);  
	      } else if(b5.getIcon()==star){  
	                    b5.setIcon(s1);  
	                    b8.setIcon(star);  
	                   }  
	         else if(b9.getIcon()==star){  
	                    b9.setIcon(s1);  
	                    b8.setIcon(star);  
	                   }  
	  
	  }  
	  
	 if(e.getSource()==b9){  
	    Icon s1=b9.getIcon();  
	      if(b8.getIcon()==star){  
	        b8.setIcon(s1);  
	        b9.setIcon(star);  
	      } else if(b6.getIcon()==star){  
	                    b6.setIcon(s1);  
	                    b9.setIcon(star);  
	                   }  
	  }
	 if(e.getSource()==sample)
	 {
         Game2 g1=new Game2("Puzzle",this);
         g1.setVisible(true);
         this.setVisible(false);
	 }
	 if(e.getSource()==nwgm)
	 {
		 b1.setIcon(ic1);
		 b2.setIcon(ic2);
		 b3.setIcon(ic3);
		 b4.setIcon(ic4);
		 b5.setIcon(ic5);
		 b6.setIcon(ic6);
		 b7.setIcon(ic7);
		 b8.setIcon(ic8);
		 b9.setIcon(ic9);
		 star=b1.getIcon();
	 }
	if(e.getSource()==quit)
	{
		ExitDialog ed=new ExitDialog(null);
	}
	 if(e.getSource()==four)
	  {
		 Game3 g=new Game3("Puzzle",null,this,null);
		 g.setVisible(true);
		 this.setVisible(false);
		 //JOptionPane.showMessageDialog(this, "hello");
	  }
  }
	
}
