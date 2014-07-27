import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class BorderDemo extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	BorderDemo()
	{
		Container c = getContentPane();
		c.setLayout (new FlowLayout());
		
		b1 =new JButton("Raised Bevel Border");
		b2= new JButton("Lower Bevel Border");
		b3 =new JButton("Raised Etched border");
                b4 =new JButton("Lowered Etched Border");
		b5 =new JButton("Line Border");
                b6 =new JButton("Matted Border");
                b7 =new JButton("Compound Border");
                b8 =new JButton("Empty Border");
				b9=new JButton("SIMPLE JBUTTON");
                
                
                
                
		Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.red,Color.green);
		b1.setBorder(bd);
		
                Border bd2=BorderFactory.createBevelBorder(BevelBorder.LOWERED);
                b2.setBorder(bd2);
                
                Border bd3=BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.red,Color.green);
		b3.setBorder(bd3);
		
                Border bd4=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED,Color.red,Color.green);
		b4.setBorder(bd4);
                
                Border bd5=BorderFactory.createLineBorder(Color.red,5);
		b5.setBorder(bd5);
                
                Border bd6=BorderFactory.createMatteBorder(5,10,15,20,Color.red);
		b6.setBorder(bd6);
                
                Border bd7=BorderFactory.createCompoundBorder();
		b7.setBorder(bd7);
                
                Border bd8=BorderFactory.createEmptyBorder(5,10,15,20);
		b8.setBorder(bd8);
                
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);
		c.add(b9);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String args[])
	{
		BorderDemo obj=new BorderDemo();
		obj.setTitle("Borders");
		obj.setSize(500,400);
		
		obj.setVisible(true);
                
	}
}
