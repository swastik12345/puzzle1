import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExitDialog extends Dialog implements ActionListener {
	Button b1,b2;
	Label l1;
	public ExitDialog(Frame arg0) {
		super(arg0);
		setLayout(new FlowLayout());
		setSize(200,100);
		b1=new Button("yes");
		b2=new Button("no");
		l1= new Label("Are You Sure Want To Exit?");
		add(l1);add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLocationRelativeTo(this);
		
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			System.exit(0);
			
		}
		if(ae.getSource()==b2)
		{
			dispose();
		}
	}
}
