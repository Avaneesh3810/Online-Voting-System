package online.voting.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


public class OnlineVotingSystem extends JFrame implements ActionListener{
    OnlineVotingSystem(){
        setBounds(0,0,1600,700);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1=new JLabel("Welcome To");
        setLayout(null);
        l1.setBounds(150,50,500,500);
        l1.setFont(new Font("Tahoma",Font.BOLD,50));
        add(l1);
        
        JLabel l2=new JLabel("Online Voting System");
        l2.setBounds(20,120,1000,500);
        l2.setFont(new Font("Tahoma",Font.BOLD,50));
        add(l2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("online/voting/system/icons/vote.png"));
        Image i2=i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(500,40,900,500);
        add(l3);
        
        JButton b1=new JButton("Next");
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.setBounds(250,500,300,80);
        b1.addActionListener(this);
        add(b1);
     
        
    }

    public static void main(String[] args) {
        new OnlineVotingSystem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new votepage().setVisible(true);
       }
    
}
