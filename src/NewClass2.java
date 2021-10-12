import java.awt.*;
import javax.swing.*;
public class NewClass2
{
    public static void main(String args[])
    {
        
        JFrame ob=new JFrame(); 
        
       
       JTextField g = new JTextField();
       g.setBounds(800, 380,300,25);
       JLabel l = new JLabel("NAME");
       l.setBounds(800,350,300,25 );
      
       JLabel r= new JLabel("PHONE NUMBER");
       r.setBounds(800,490,300,25);
       JTextField w = new JTextField();
       w.setBounds(800, 520,300,25);
       JTextField f = new JTextField("ENTER ROLL NO");
       f.setBounds(800,240,300,25);
       JTextField s = new JTextField();
       s.setBounds(800,450,300,25);
       JLabel h = new JLabel("ROLL NO");
       h.setBounds(800,420,300,25 );
       ob.add(s);
       ob.add(h);
       
      
        
         
        JButton k = new JButton("UPDATE");
        k.setBounds(900,650,100,25);
       
        JButton p = new JButton("INSERT");
        p.setBounds(760,650,100,25);
        JButton o = new JButton("DELETE");
        o.setBounds(1040,650,100,25);
        JButton y = new JButton("ADD NEW");
        y.setBounds(600,225,100,25);
        JButton e = new JButton("SEARCH");
        e.setBounds(1200,225,100,25);
        ob.add(e);
        ob.add(f);
        ob.add(y);
        ob.add(o);
        ob.add(p);
       ob.add(k);
       
      
       ob.add(w);
       ob.add(r);
       
       ob.add(l);
       ob.add(g);
       
  
       ob.getContentPane().setBackground(Color.white);
       ob.setSize(200,200);
        ob.setLayout(null);
        ob.setVisible(true);
    }
}
        