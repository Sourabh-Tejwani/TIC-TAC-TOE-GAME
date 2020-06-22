package com.sourabh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoPlayer implements ActionListener {
     int c1=0,c2=1,count=0;
     int a[]=new int[9];
        JFrame f=new JFrame();
        JPanel p=new JPanel();
        JPanel p2=new JPanel();
        JButton b1=new JButton();
        JButton b2=new JButton();
        JButton b3=new JButton();
        JButton b4=new JButton();
        JButton b5=new JButton();
        JButton b6=new JButton();
        JButton b7=new JButton();
        JButton b8=new JButton();
        JButton b9=new JButton();
        JButton t1=new JButton();
        JLabel l2=new JLabel("TIC    ");
        JLabel l3=new JLabel("      TAC ");
        JLabel l4=new JLabel("  TOE   ");
        JLabel l1=new JLabel(new ImageIcon("Hel.jpg"));
        JButton res=new JButton();
        TwoPlayer()
        {
            b1.setBackground(Color.gray.darker());
            b1.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 6, Color.white.brighter()));
            b2.setBackground(Color.gray.darker());
            b2.setBorder(BorderFactory.createMatteBorder(0, 6, 10, 6, Color.white.brighter()));
            b3.setBackground(Color.gray.darker());
            b3.setBorder(BorderFactory.createMatteBorder(0, 6, 6, 0, Color.white.brighter()));
            b4.setBackground(Color.gray.darker());
            b4.setBorder(BorderFactory.createMatteBorder(6, 0, 6, 6, Color.white.brighter()));
            b5.setBackground(Color.gray.darker());
            b5.setBorder(BorderFactory.createMatteBorder(6, 6, 6, 6, Color.white.brighter()));
            b6.setBackground(Color.gray.darker());
            b6.setBorder(BorderFactory.createMatteBorder(6, 6, 6, 0, Color.white.brighter()));
            b7.setBackground(Color.gray.darker());
            b7.setBorder(BorderFactory.createMatteBorder(6, 0, 0, 6, Color.white.brighter()));
            b8.setBackground(Color.gray.darker());
            b8.setBorder(BorderFactory.createMatteBorder(6, 6, 0, 6, Color.white.brighter()));
            b9.setBackground(Color.gray.darker());
            b9.setBorder(BorderFactory.createMatteBorder(6, 6, 0, 0, Color.white.brighter()));
            p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
            f.add(p,BorderLayout.NORTH);
            p2.add(l2);
            p2.add(l3);
            p2.add(l4);
            p2.setLayout(new FlowLayout());
            f.add(p2,BorderLayout.WEST);
            l2.setFont(new Font("Arial",Font.BOLD,50));
            l2.setForeground(Color.white.brighter());
            l3.setFont(new Font("Arial",Font.BOLD,50));
            l3.setForeground(Color.white.brighter());
            l4.setFont(new Font("Arial",Font.BOLD,50));
            l4.setForeground(Color.white.brighter());
            p2.setBackground(Color.gray);
            p2.setBounds(20,200,200,200);
            p.setBounds(500,200,430,400);
            f.add(t1,BorderLayout.AFTER_LAST_LINE);
            t1.setBounds(0,650,600,100);
            t1.setText("Player 1 Chance");
            t1.setBackground(Color.gray);
            t1.setFont(new Font("Arial", Font.BOLD, 50));
            t1.setForeground(Color.white);
            t1.setFocusPainted(false);
            res.setText("Play Again");
            res.setBackground(Color.gray);
            res.setFont(new Font("Arial", Font.BOLD, 50));
            res.setForeground(Color.white);
            res.setFocusPainted(false);
            res.addActionListener(this);
            f.add(res,BorderLayout.WEST);
            res.setBounds(640,650,300,100);
            p.setLayout(new GridLayout(3,3));
            f.setLayout(new BorderLayout());
            f.add(l1);
            f.setVisible(true);
            f.setSize(1000,800);
            f.setResizable(false);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            b1.addActionListener(this);
            b1.setFocusPainted(false);
            b2.addActionListener(this);
            b2.setFocusPainted(false);
            b3.addActionListener(this);
            b3.setFocusPainted(false);
            b4.addActionListener(this);
            b4.setFocusPainted(false);
            b5.addActionListener(this);
            b5.setFocusPainted(false);
            b6.addActionListener(this);
            b6.setFocusPainted(false);
            b7.addActionListener(this);
            b7.setFocusPainted(false);
            b8.addActionListener(this);
            b8.setFocusPainted(false);
            b9.addActionListener(this);
            b9.setFocusPainted(false);
        }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b1 && a[0]==0)
            {
                if(c1==0 && c2==1) {
                    b1.setText("X");
                    c1=1;c2=0;a[0]=1;count++;
                    if(winnerX()) {
                        winnerFound();t1.setText("Player 1 Won"); }
                    else if(winnerO()) {
                        winnerFound();t1.setText("Player 2 Won"); }
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b1.setText("O");
                    c1=0;c2=1;a[0]=2;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO()) {
                        winnerFound();t1.setText("Player 2 Won"); }
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
               b1.setFont(new Font("Arial",Font.BOLD,70));b1.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==b2 && a[1]==0)
            { if(c1==0 && c2==1) {
                    b2.setText("X");
                    c1=1;c2=0;a[1]=1;count++;
                    if(winnerX()) {
                        winnerFound();t1.setText("Player 1 Won"); }
                    else if(winnerO()) {
                        winnerFound();t1.setText("Player 2 Won"); }
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b2.setText("O");
                    c1=0;c2=1;a[1]=2;count++;
                    if(winnerX()){
                        winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
                b2.setFont(new Font("Arial",Font.BOLD,70));b2.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==b3 && a[2]==0)
            { if(c1==0 && c2==1) {
                    b3.setText("X");
                    c1=1;c2=0;a[2]=1;count++;
                    if(winnerX()){
                        winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b3.setText("O");
                    c1=0;c2=1;a[2]=2;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
                b3.setFont(new Font("Arial",Font.BOLD,70));b3.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==b4 && a[3]==0)
            { if(c1==0 && c2==1) {
                b4.setText("X");
                    c1=1;c2=0;a[3]=1;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b4.setText("O");
                    c1=0;c2=1;a[3]=2;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
                b4.setFont(new Font("Arial",Font.BOLD,70));b4.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==b5 && a[4]==0)
            { if(c1==0 && c2==1) {
                    b5.setText("X");
                    c1=1;c2=0;a[4]=1;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b5.setText("O");
                    c1=0;c2=1;a[4]=2;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
                b5.setFont(new Font("Arial",Font.BOLD,70));b5.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==b6 && a[5]==0)
            {
                if(c1==0 && c2==1) {
                    b6.setText("X");
                    c1=1;c2=0;a[5]=1;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b6.setText("O");
                    c1=0;c2=1;a[5]=2;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
                b6.setFont(new Font("Arial",Font.BOLD,70));b6.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==b7 && a[6]==0)
            {
                if(c1==0 && c2==1) {
                    b7.setText("X");
                    c1=1;c2=0;a[6]=1;count++;
                    if(winnerX())
                    {winnerFound();
                        t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();
                        t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b7.setText("O");
                    c1=0;c2=1;a[6]=2;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
                b7.setFont(new Font("Arial",Font.BOLD,70));b7.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==b8 && a[7]==0)
            {
                if(c1==0 && c2==1) {
                    b8.setText("X");
                    c1=1;c2=0;a[7]=1;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b8.setText("O");
                    c1=0;c2=1;a[7]=2;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
                b8.setFont(new Font("Arial",Font.BOLD,70));b8.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==b9 && a[8]==0)
            {
                if(c1==0 && c2==1) {
                    b9.setText("X");
                    c1=1;c2=0;a[8]=1;count++;
                    if(winnerX())
                    { winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 2 Chance");
                }
                else if(c1==1 && c2==0) {
                    b9.setText("O");
                    c1=0;c2=1;a[8]=2;count++;
                    if(winnerX())
                    {winnerFound();t1.setText("Player 1 Won");}
                    else if(winnerO())
                    {winnerFound();t1.setText("Player 2 Won");}
                    else if(count==9)
                        t1.setText("Draw");
                    else
                    t1.setText("Player 1 Chance");
                }
                b9.setFont(new Font("Arial",Font.BOLD,70));b9.setForeground(Color.white);
                t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            }
            if(e.getSource()==res)
            { count=0;c1=0;c2=1;
                for(int i=0;i<9;i++)
                    a[i]=0;
                b1.setText("");b2.setText("");b3.setText("");b4.setText("");
                b5.setText("");b6.setText("");b7.setText("");b8.setText("");
                b9.setText("");
                t1.setText("Player 1 Chance");t1.setFont(new Font("Arial", Font.BOLD, 50));
            }

        }
        public boolean winnerX()
        {
            if(a[0]==1&&a[1]==1&&a[2]==1 || a[3]==1&&a[4]==1&&a[5]==1 || a[6]==1&&a[7]==1&&a[8]==1 || a[0]==1&&a[3]==1&&a[6]==1 ||a[1]==1&&a[4]==1&&a[7]==1 || a[2]==1&&a[5]==1&&a[8]==1 || a[0]==1&&a[4]==1&&a[8]==1 || a[2]==1&&a[4]==1&&a[6]==1)
            {
                return true;
            }
            return false;
        }
    public boolean winnerO()
    {
        if(a[0]==2&&a[1]==2&&a[2]==2 || a[3]==2&&a[4]==2&&a[5]==2 || a[6]==2&&a[7]==2&&a[8]==2 || a[0]==2&&a[3]==2&&a[6]==2 ||a[1]==2&&a[4]==2&&a[7]==2 || a[2]==2&&a[5]==2&&a[8]==2 || a[0]==2&&a[4]==2&&a[8]==2 || a[2]==2&&a[4]==2&&a[6]==2)
        {
            return true;
        }
        return false;
    }
    public void winnerFound()
    {
        for(int i=0;i<9;i++)
            a[i]=1;
    }


}
