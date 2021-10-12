import javax.swing.*;
public class NewClass
{
    public static void main(String args[])
    {
        JFrame ob=new JFrame(); //creating object for frame
        JButton b=new JButton("login");
        b.setBounds(800,500,100,40);//x axis,yaxis,width,height
        JButton c = new JButton("login 2");
        c.setBounds(920,500,100,40);
        JButton d = new JButton("login 3");
        d.setBounds(1040, 500, 100, 40);
        JLabel x = new JLabel("welcome");
        x.setBounds(950, 450, 60, 60);
        JTextField t = new JTextField("Hello World");
        t.setBounds(900, 550, 150, 25);
        JCheckBox g1= new JCheckBox("Agree");
        g1.setBounds(900,580,150,25);
        JCheckBox g2= new JCheckBox("Disagree");
        g2.setBounds(900, 600, 150, 25);
        String dept[]={"IT","CT","CSBS","FT"};
        JComboBox cb = new JComboBox(dept);
        cb.setBounds(900,630,150,25);
        JRadioButton rb = new JRadioButton("Male");
        rb.setBounds(900,665,150,25);
        JRadioButton rb1 = new JRadioButton("Female");
        rb1.setBounds(900,685,150,25);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(900,707,150,25);
        JTextArea ta = new JTextArea();
        ta.setBounds(900,750,150,20);
        DefaultListModel<String> l1 = new DefaultListModel();  
        l1.addElement("IT");
        l1.addElement("CT");
        l1.addElement("CSBS");
        l1.addElement("FT");
        l1.addElement("CSC");
        final JList<String> list1 = new JList(l1);  
          list1.setBounds(900,800, 75,75); 
          
           
           String data[][]={ {"101","NAVEEN","178"},    
                           {"102","MUTHU","196"},    
                           {"101","PUGAZH","184.3"}}; 
           String column[]={"ID","NAME","CUT OFF"};
           JTable jt=new JTable(data,column);    
           jt.setBounds(1000,800,200,50);
        ob.add(jt);
        ob.add(list1);
        ob.add(ta);
        ob.add(pf);
        ob.add(rb1);
        ob.add(rb);
        ob.add(cb);
        ob.add(g1);
        ob.add(g2);
        ob.add(b);
        ob.add(c);
        ob.add(d);
        ob.add(t);
        ob.add(x);
        ob.setSize(200,200);
        ob.setLayout(null);
        ob.setVisible(true);
    }
}
