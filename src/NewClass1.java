import java.awt.*;
import javax.swing.*;
public class NewClass1
{
    public static void main(String args[])
    {
        
        JFrame ob=new JFrame(); 
        JLabel b=new JLabel("LOGIN FORM");
        b.setBounds(900,350,100,40);//x axis,yaxis,width,height
       JTextField f = new JTextField("Username");
       f.setBounds(800, 400,300,25);
       JPasswordField pf = new JPasswordField("password");
       pf.setBounds(800,450,300,25);
       JButton bn = new JButton("log in");
       bn.setBounds(900, 500,100,30);
       
       ob.getContentPane().setBackground(Color.cyan);
       ob.add(b);
       ob.add(f);
       ob.add(pf);
       ob.add(bn);
       ob.setSize(200,200);
        ob.setLayout(null);
        ob.setVisible(true);
    }
}
        
        
        
