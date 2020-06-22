package com.sourabh;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.*;

public class SinglePlayer implements ActionListener{
   private int c1=0,c2=1,count=0;
   private int number=9;
   private int[] a;
   private JFrame f=new JFrame();
    JPanel p=new JPanel();
    JPanel p2=new JPanel();
   private JButton b1=new JButton();
    private JButton b2=new JButton();
    private JButton b3=new JButton();
    private JButton b4=new JButton();
    private JButton b5=new JButton();
    private JButton b6=new JButton();
    private JButton b7=new JButton();
    private JButton b8=new JButton();
    private JButton b9=new JButton();
    private JButton t1=new JButton();
    JLabel l2=new JLabel("TIC    ");
    JLabel l3=new JLabel("      TAC ");
    JLabel l4=new JLabel("  TOE   ");
    JLabel l1=new JLabel(new ImageIcon("Hel.jpg"));
    private JButton res=new JButton();
    SinglePlayer()
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
        a = new int[9];
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1 && a[0]==0)//b1
        { b1.setText("X");
            b1.setFont(new Font("Arial",Font.BOLD,70));b1.setForeground(Color.white);
            c1=1;c2=0;a[0]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(e.getSource()==b2 && a[1]==0)//b2
        { b2.setText("X");
            b2.setFont(new Font("Arial",Font.BOLD,70));b2.setForeground(Color.white);
            c1=1;c2=0;a[1]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(e.getSource()==b3 && a[2]==0)//b3
        { b3.setText("X");
            b3.setFont(new Font("Arial",Font.BOLD,70));b3.setForeground(Color.white);
            c1=1;c2=0;a[2]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(e.getSource()==b4 && a[3]==0)//b4
        { b4.setText("X");
            b4.setFont(new Font("Arial",Font.BOLD,70));b4.setForeground(Color.white);
            c1=1;c2=0;a[3]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(e.getSource()==b5 && a[4]==0)//b5
        { b5.setText("X");
            b5.setFont(new Font("Arial",Font.BOLD,70));b5.setForeground(Color.white);
            c1=1;c2=0;a[4]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(e.getSource()==b6 && a[5]==0)//b6
        { b6.setText("X");
            b6.setFont(new Font("Arial",Font.BOLD,70));b6.setForeground(Color.white);
            c1=1;c2=0;a[5]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(e.getSource()==b7 && a[6]==0)//b7
        { b7.setText("X");
            b7.setFont(new Font("Arial",Font.BOLD,70));b7.setForeground(Color.white);
            c1=1;c2=0;a[6]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(e.getSource()==b8 && a[7]==0)//b8
        { b8.setText("X");
            b8.setFont(new Font("Arial",Font.BOLD,70));b8.setForeground(Color.white);
            c1=1;c2=0;a[7]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(e.getSource()==b9 && a[8]==0)//b9
        { b9.setText("X");
            b9.setFont(new Font("Arial",Font.BOLD,70));b9.setForeground(Color.white);
            c1=1;c2=0;a[8]=1;count++;
            if(winnerX()) {
                winnerFound();t1.setText("Player 1 Won"); }
            else if(winnerO()) {
                winnerFound();t1.setText("PC Won"); }
            else if(count==9) {
                t1.setText("Draw"); }
            else
                t1.setText("PC Chance");
            t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
            buttonSleep();
        }
        if(count==9)
            buttonStart();
        if(e.getSource()==res)//Play Again
        { count=0;c1=0;c2=1;
            for(int i=0;i<9;i++)
                a[i]=0;
            b1.setText("");b2.setText("");b3.setText("");b4.setText("");
            b5.setText("");b6.setText("");b7.setText("");b8.setText("");
            b9.setText("");
            t1.setText("Player 1 Chance");t1.setFont(new Font("Arial", Font.BOLD, 50));
        }
        if(c1==1&&c2==0 && count<9)
        {
            ActionListener tas=new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    number=getValue();
                    if(number==0 && a[0]==0)//b1
                    {b1.setText("O");
                        b1.setFont(new Font("Arial",Font.BOLD,70));b1.setForeground(Color.white);
                        c1=0;c2=1;a[0]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }

                    if(number==1 && a[1]==0)//b2
                    {b2.setText("O");
                        b2.setFont(new Font("Arial",Font.BOLD,70));b2.setForeground(Color.white);
                        c1=0;c2=1;a[1]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }

                    if(number==2 && a[2]==0)//b3
                    {b3.setText("O");
                        b3.setFont(new Font("Arial",Font.BOLD,70));b3.setForeground(Color.white);
                        c1=0;c2=1;a[2]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }

                    if(number==3 && a[3]==0)//b4
                    {b4.setText("O");
                        b4.setFont(new Font("Arial",Font.BOLD,70));b4.setForeground(Color.white);
                        c1=0;c2=1;a[3]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }


                    if(number==4 && a[4]==0)//b5
                    {b5.setText("O");
                        b5.setFont(new Font("Arial",Font.BOLD,70));b5.setForeground(Color.white);
                        c1=0;c2=1;a[4]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }

                    if(number==5 && a[5]==0)//b6
                    {b6.setText("O");
                        b6.setFont(new Font("Arial",Font.BOLD,70));b6.setForeground(Color.white);
                        c1=0;c2=1;a[5]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }

                    if(number==6 && a[6]==0)//b7
                    {b7.setText("O");
                        b7.setFont(new Font("Arial",Font.BOLD,70));b7.setForeground(Color.white);
                        c1=0;c2=1;a[6]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }

                    if(number==7 && a[7]==0)//b8
                    {b8.setText("O");
                        b8.setFont(new Font("Arial",Font.BOLD,70));b8.setForeground(Color.white);
                        c1=0;c2=1;a[7]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }
                    if(number==8 && a[8]==0)//b9
                    {b9.setText("O");
                        b9.setFont(new Font("Arial",Font.BOLD,70));b9.setForeground(Color.white);
                        c1=0;c2=1;a[8]=2;count++;
                        if(winnerX())
                        {winnerFound();t1.setText("Player 1 Won");}
                        else if(winnerO()) {
                            winnerFound();t1.setText("PC Won"); }
                        else if(count==9) {
                            t1.setText("Draw"); }
                        else
                            t1.setText("Player 1 Chance");
                        t1.setFont(new Font("Arial", Font.BOLD, 50));t1.setForeground(Color.white);
                    }
                    buttonStart();
                }
            };

            Timer timer = new Timer(1000 ,tas);
            timer.setRepeats(false);
            timer.start();
        }
    }
    private boolean winnerX()
    {
        if(a[0]==1&&a[1]==1&&a[2]==1 || a[3]==1&&a[4]==1&&a[5]==1 || a[6]==1&&a[7]==1&&a[8]==1 || a[0]==1&&a[3]==1&&a[6]==1 ||a[1]==1&&a[4]==1&&a[7]==1 || a[2]==1&&a[5]==1&&a[8]==1 || a[0]==1&&a[4]==1&&a[8]==1 || a[2]==1&&a[4]==1&&a[6]==1)
        {count=9;
            return true;
        }
        return false;
    }

    private boolean winnerO()
    {
        if(a[0]==2&&a[1]==2&&a[2]==2 || a[3]==2&&a[4]==2&&a[5]==2 || a[6]==2&&a[7]==2&&a[8]==2 || a[0]==2&&a[3]==2&&a[6]==2 ||a[1]==2&&a[4]==2&&a[7]==2 || a[2]==2&&a[5]==2&&a[8]==2 || a[0]==2&&a[4]==2&&a[8]==2 || a[2]==2&&a[4]==2&&a[6]==2)
        {
            count=9;
            return true;
        }
        return false;
    }
    private void winnerFound()
    {
        for(int i=0;i<9;i++)
            a[i]=1;
        count=9;
        buttonStart();
    }
    private void buttonSleep()
    {
        b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);b4.setEnabled(false);
        b5.setEnabled(false);b6.setEnabled(false);b7.setEnabled(false);b8.setEnabled(false);
        b9.setEnabled(false);
    }
    private void buttonStart()
    {
        b1.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);b4.setEnabled(true);
        b5.setEnabled(true);b6.setEnabled(true);b7.setEnabled(true);b8.setEnabled(true);
        b9.setEnabled(true);
    }

    private int getValue()
    { ArrayList<ArrayList> l=new ArrayList<>();
        for(int i=0;i<9;i++)
        { if(a[i]==0)
            { ArrayList<Integer> l2=new ArrayList<>();
                int ef=findEf(i);
                l2.add(ef);l2.add(i);l.add(l2); }
        }
        Collections.sort(l, new Comparator<ArrayList>() {
            @Override
            public int compare(ArrayList o1, ArrayList o2) {
                if((Integer) o1.get(0)>(Integer)o2.get(0))
                    return 1;
                else if((Integer) o1.get(0)<(Integer)o2.get(0))
                    return -1;
                else
                    return 0; }});
        int nx=winX();
        int no=winO();
        for(int i=0;i<l.size();i++)
        { if((Integer)l.get(i).get(1)==no)
                return no; }
        for(int i=0;i<l.size();i++)
        { if((Integer)l.get(i).get(1)==nx)
                return nx; }
        ArrayList<Integer> sel=new ArrayList<>();
        if(count==3 && ((a[0]==1&&a[8]==1)||(a[2]==1&&a[6]==1)))
        { sel.add(3);sel.add(5); }
        else
        {
            for (int i = 0; i < l.size() - 1; i++) {
                if ((Integer) l.get(i).get(0) == (Integer) l.get(i + 1).get(0))
                    sel.add((Integer) l.get(i).get(1));
                else {
                    sel.add((Integer) l.get(i).get(1));
                    break; }
            }
        }
        Random r=new Random();
        return sel.get(r.nextInt(sel.size()));

    }
    private int findEf(int number)
    {
        return patternX(number)-patternO();
    }
    private int patternX(int number)
    {
        int count=0;
        if(a[0]!=2 && a[1]!=2 && a[2]!=2 && number!=0 && number!=1 && number!=2)
            count++;
        if(a[3]!=2 && a[4]!=2 && a[5]!=2 && number!=3 && number!=4 && number!=5)
            count++;
        if(a[6]!=2 && a[7]!=2 && a[8]!=2 && number!=6 && number!=7 && number!=8)
            count++;
        if(a[0]!=2 && a[3]!=2 && a[6]!=2 && number!=0 && number!=3 && number!=6)
            count++;
        if(a[1]!=2 && a[4]!=2 && a[7]!=2 && number!=1 && number!=4 && number!=7)
            count++;
        if(a[2]!=2 && a[5]!=2 && a[8]!=2 && number!=2 && number!=5 && number!=8)
            count++;
        if(a[0]!=2 && a[4]!=2 && a[8]!=2 && number!=0 && number!=4 && number!=8)
            count++;
        if(a[2]!=2 && a[4]!=2 && a[6]!=2 && number!=2 && number!=4 && number!=6)
            count++;
        return count;
    }

    private int patternO()
    {
        int count=0;
        if(a[0]!=1 && a[1]!=1 && a[2]!=1)
            count++;
        if(a[3]!=1 && a[4]!=1 && a[5]!=1)
            count++;
        if(a[6]!=1 && a[7]!=1 && a[8]!=1)
            count++;
        if(a[0]!=1 && a[3]!=1 && a[6]!=1)
            count++;
        if(a[1]!=1 && a[4]!=1 && a[7]!=1)
            count++;
        if(a[2]!=1 && a[5]!=1 && a[8]!=1)
            count++;
        if(a[0]!=1 && a[4]!=1 && a[8]!=1)
            count++;
        if(a[2]!=1 && a[4]!=1 && a[6]!=1)
            count++;
        return count;
    }
    private int winX()
    {if(a[0]==1&&a[1]==1&&a[2]==0)
        return 2;
    else if(a[0]==1&&a[2]==1&&a[1]==0)
        return 1;
    else if(a[1]==1&&a[2]==1&&a[0]==0)
        return 0;
    else if(a[3]==1&&a[4]==1&&a[5]==0)
        return 5;
    else if(a[3]==1&&a[5]==1&&a[4]==0)
        return 4;
    else if(a[4]==1&&a[5]==1&&a[3]==0)
        return 3;
    else if(a[6]==1&&a[7]==1&&a[8]==0)
        return 8;
    else if(a[6]==1&&a[8]==1&&a[7]==0)
        return 7;
    else if(a[7]==1&&a[8]==1&&a[6]==0)
        return 6;
    else if(a[0]==1&&a[3]==1&&a[6]==0)
        return 6;
    else if(a[0]==1&&a[6]==1&&a[3]==0)
        return 3;
    else if(a[3]==1&&a[6]==1&&a[0]==0)
        return 0;
    else if(a[1]==1&&a[4]==1&&a[7]==0)
        return 7;
    else if(a[4]==1&&a[7]==1&&a[1]==0)
        return 1;
    else if(a[1]==1&&a[7]==1&&a[4]==0)
        return 4;
    else if(a[2]==1&&a[5]==1&&a[8]==0)
        return 8;
    else if(a[2]==1&&a[8]==1&&a[5]==0)
        return 5;
    else if(a[5]==1&&a[8]==1&&a[2]==0)
        return 2;
    else if(a[0]==1&&a[4]==1&&a[8]==0)
        return 8;
    else if(a[0]==1&&a[8]==1&&a[4]==0)
        return 4;
    else if(a[4]==1&&a[8]==1&&a[0]==0)
        return 0;
    else if(a[2]==1&&a[4]==1&&a[6]==0)
        return 6;
    else if(a[2]==1&&a[6]==1&&a[4]==0)
        return 4;
    else if(a[4]==1&&a[6]==1&&a[2]==0)
        return 2;
    else
        return 9;
    }

    private int winO()
    {if(a[0]==2&&a[1]==2&&a[2]==0)
        return 2;
    else if(a[0]==2&&a[2]==2&&a[1]==0)
        return 1;
    else if(a[1]==2&&a[2]==2&&a[0]==0)
        return 0;
    else if(a[3]==2&&a[4]==2&&a[5]==0)
        return 5;
    else if(a[3]==2&&a[5]==2&&a[4]==0)
        return 4;
    else if(a[4]==2&&a[5]==2&&a[3]==0)
        return 3;
    else if(a[6]==2&&a[7]==2&&a[8]==0)
        return 8;
    else if(a[6]==2&&a[8]==2&&a[7]==0)
        return 7;
    else if(a[7]==2&&a[8]==2&&a[6]==0)
        return 6;
    else if(a[0]==2&&a[3]==2&&a[6]==0)
        return 6;
    else if(a[0]==2&&a[6]==2&&a[3]==0)
        return 3;
    else if(a[3]==2&&a[6]==2&&a[0]==0)
        return 0;
    else if(a[1]==2&&a[4]==2&&a[7]==0)
        return 7;
    else if(a[4]==2&&a[7]==2&&a[1]==0)
        return 1;
    else if(a[1]==2&&a[7]==2&&a[4]==0)
        return 4;
    else if(a[2]==2&&a[5]==2&&a[8]==0)
        return 8;
    else if(a[2]==2&&a[8]==2&&a[5]==0)
        return 5;
    else if(a[5]==2&&a[8]==2&&a[2]==0)
        return 2;
    else if(a[0]==2&&a[4]==2&&a[8]==0)
        return 8;
    else if(a[0]==2&&a[8]==2&&a[4]==0)
        return 4;
    else if(a[4]==2&&a[8]==2&&a[0]==0)
        return 0;
    else if(a[2]==2&&a[4]==2&&a[6]==0)
        return 6;
    else if(a[2]==2&&a[6]==2&&a[4]==0)
        return 4;
    else if(a[4]==2&&a[6]==2&&a[2]==0)
        return 2;
    else
        return 9;
    }



}

