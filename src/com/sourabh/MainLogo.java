package com.sourabh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLogo implements ActionListener {
    JFrame f=new JFrame();
    JPanel p2=new JPanel();
    JButton b1=new JButton();
    JButton b2=new JButton();
    JLabel l1=new JLabel(new ImageIcon("Hel.jpg"));
    JLabel l2=new JLabel("TIC    ");
    JLabel l3=new JLabel("      TAC ");
    JLabel l4=new JLabel("  TOE   ");
    MainLogo()
    {
        b1.setBounds(400,200,300,100);
        b1.setText("Single Player");
        b1.setBackground(Color.gray);
        b1.setFont(new Font("Arial", Font.BOLD, 40));
        b1.setForeground(Color.white);
        b1.setFocusPainted(false);
        f.add(b1,BorderLayout.CENTER);
        b2.setBounds(400,350,300,100);
        b2.setText("Two Player");
        b2.setBackground(Color.gray);
        b2.setFont(new Font("Arial", Font.BOLD, 40));
        b2.setForeground(Color.white);
        b2.setFocusPainted(false);
        f.add(b2,BorderLayout.CENTER);
        p2.add(l2);
        p2.add(l3);
        p2.add(l4);
        p2.setLayout(new FlowLayout());
        l2.setFont(new Font("Arial",Font.BOLD,50));
        l2.setForeground(Color.white.brighter());
        l3.setFont(new Font("Arial",Font.BOLD,50));
        l3.setForeground(Color.white.brighter());
        l4.setFont(new Font("Arial",Font.BOLD,50));
        l4.setForeground(Color.white.brighter());
        p2.setBackground(Color.gray);
        p2.setBounds(20,200,200,200);
        f.add(p2,BorderLayout.WEST);
        f.setLayout(new BorderLayout());
        f.add(l1);
        f.setVisible(true);
        f.setSize(1000,800);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        b1.addActionListener(this);
        b1.setFocusable(false);
        b2.addActionListener(this);
        b2.setFocusable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            f.dispose();
            new SinglePlayer();
        }
        if(e.getSource()==b2)
        {
            f.dispose();
            new TwoPlayer();
        }
    }
}
