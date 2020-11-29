package online.voting.system;

import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class votepage extends JFrame implements ActionListener{
    int a,b,c,d;
    JButton b1,b2,b3,b4,b5;
    public votepage(){
        setBounds(0,0,1600,700);
        setVisible(true);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("online/voting/system/icons/Shivsena.png"));
        Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,500,350);
        add(l1);
        
        b1=new JButton("Vote");
        b1.addActionListener(this);
        b1.setBounds(450,175,100,50);
        add(b1);
        
        b2=new JButton("Vote");
        b2.addActionListener(this);
        b2.setBounds(750,175,100,50);
        add(b2);
        
        
        b3=new JButton("Vote");
        b3.addActionListener(this);
        b3.setBounds(750,470,100,50);
        add(b3);
        
        b4=new JButton("Vote");
        b4.addActionListener(this);
        b4.setBounds(450,470,100,50);
        add(b4);
        
        b5=new JButton("Results");
        b5.addActionListener(this);
        b5.setBounds(600,320,100,50);
        add(b5);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("online/voting/system/icons/AamAadmi.png"));
        Image i5=i4.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(800,0,500,350);
        add(l2);
        
         ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("online/voting/system/icons/Congress.png"));
        Image i8=i7.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel l3=new JLabel(i9);
        l3.setBounds(0,350,500,350);
        add(l3);
        
         ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("online/voting/system/icons/BJP.png"));
        Image i11=i10.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel l4=new JLabel(i12);
        l4.setBounds(800,350,500,350);
        add(l4);
    }
    public static void main(String[] args){
        new votepage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1){
           a=a+1;
           JOptionPane.showMessageDialog(null,"Your vote is added to Shivsena");
       }else if(e.getSource()==b2){
           b=b+1;
           JOptionPane.showMessageDialog(null,"Your vote is added to Aam Aadmi Party");
       }else if(e.getSource()==b3){
           c=c+1;
           JOptionPane.showMessageDialog(null,"Your vote is added to BJP");
       }else if(e.getSource()==b4){
           d=d+1;
           JOptionPane.showMessageDialog(null,"Your vote is added to Congress");
       }else if(e.getSource()==b5){
           JOptionPane.showMessageDialog(null,"Shivsena="+a+",Aam Aadmi="+b+",BJP="+c+",Congress="+d);
       }
    }
}
