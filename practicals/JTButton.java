/*write a program That show the function of a Toggle Button*///
//package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTButton extends JFrame implements ActionListener
{
    //variable Declaration
    
    JToggleButton but;
    ImageIcon image1;

    public JTButton()
    {
        //create a content pannel with the flow layout
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        
        image1=new ImageIcon("start.jpg");
        
        but = new JToggleButton("START/STOP",image1);
        
        
        //adding the button just created to the contaioner
        c.add(but);
        
        but.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        ImageIcon image2=new ImageIcon("stop.jpg");
        
        //if button is selected display stop signal image
        //else display start signal
        
        if(but.isSelected())
            but.setIcon(image2);
        else but.setIcon(image1);
    }
    
    
    public static void main(String args[])
    {
        JTButton t= new JTButton();
        t.setSize(400,400);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
