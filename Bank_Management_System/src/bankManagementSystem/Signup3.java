package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    String formno;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    Signup3(String formno){

        super("APPLICATION FORM");
        this.formno=formno;
        JLabel l1=new JLabel("Page 3");
        l1.setFont(new Font("Rale-way",Font.BOLD,18));
        l1.setBounds(350,20,200,23);
        add(l1);

        JLabel l2=new JLabel("Account Details");
        l2.setFont(new Font("Rale-way",Font.BOLD,18));
        l2.setBounds(300,50,200,23);
        add(l2);

        JLabel l3=new JLabel("Account Type : ");
        l3.setFont(new Font("Rale-way",Font.BOLD,15));
        l3.setBounds(100,100,200,20);
        add(l3);

        r1=new JRadioButton("Savings Account");
        r1.setFont(new Font("Rale-way",Font.BOLD,14));
        r1.setBounds(100,140,200,20);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Rale-way",Font.BOLD,14));
        r2.setBounds(300,140,200,20);
        r2.setBackground(new Color(222,255,228));
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Rale-way",Font.BOLD,14));
        r3.setBounds(100,180,200,20);
        r3.setBackground(new Color(222,255,228));
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Rale-way",Font.BOLD,14));
        r4.setBounds(300,180,250,20);
        r4.setBackground(new Color(222,255,228));
        add(r4);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l4=new JLabel("Card Number : ");
        l4.setFont(new Font("Rale-way",Font.BOLD,15));
        l4.setBounds(100,240,200,20);
        add(l4);

        JLabel l5=new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Rale-way",Font.BOLD,11));
        l5.setBounds(100,260,200,20);
        add(l5);

        JLabel l6=new JLabel(" XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Rale-way",Font.BOLD,15));
        l6.setBounds(300,240,200,20);
        add(l6);

        JLabel l7=new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Rale-way",Font.BOLD,11));
        l7.setBounds(300,260,350,20);
        add(l7);

        JLabel l8=new JLabel("PIN : ");
        l8.setFont(new Font("Rale-way",Font.BOLD,18));
        l8.setBounds(100,300,200,30);
        add(l8);

        JLabel l9=new JLabel(" XXXX");
        l9.setFont(new Font("Rale-way",Font.BOLD,18));
        l9.setBounds(300,300,200,30);
        add(l9);

        JLabel l10=new JLabel("(4-digit password)");
        l10.setFont(new Font("Rale-way",Font.BOLD,11));
        l10.setBounds(100,320,200,20);
        add(l10);

        JLabel l11=new JLabel("Services Required : ");
        l11.setFont(new Font("Rale-way",Font.BOLD,16));
        l11.setBounds(100,360,200,20);
        add(l11);

        c1= new JCheckBox("ATM CARD");
        c1.setBackground(new Color(222,255,228));
        c1.setFont(new Font("Rale-way",Font.BOLD,14));
        c1.setBounds(100,400,200,20);
        add(c1);

        c2= new JCheckBox("Internet Banking");
        c2.setBackground(new Color(222,255,228));
        c2.setFont(new Font("Rale-way",Font.BOLD,14));
        c2.setBounds(300,400,200,20);
        add(c2);

        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(222,255,228));
        c3.setFont(new Font("Rale-way",Font.BOLD,14));
        c3.setBounds(100,440,200,20);
        add(c3);

        c4= new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(222,255,228));
        c4.setFont(new Font("Rale-way",Font.BOLD,14));
        c4.setBounds(300,440,200,20);
        add(c4);

        c5= new JCheckBox("Cheque Book");
        c5.setBackground(new Color(222,255,228));
        c5.setFont(new Font("Rale-way",Font.BOLD,14));
        c5.setBounds(100,480,200,20);
        add(c5);

        c6= new JCheckBox("E-Statement");
        c6.setBackground(new Color(222,255,228));
        c6.setFont(new Font("Rale-way",Font.BOLD,14));
        c6.setBounds(300,480,200,20);
        add(c6);

        JCheckBox c7=new JCheckBox("I here by declares that the above entered details to the best of my knowledge.",true);
        c7.setBackground(new Color(222,255,228));
        c7.setFont(new Font("Rale-way",Font.BOLD,11));
        c7.setBounds(100,550,600,20);
        add(c7);

        JLabel l12=new JLabel("Form No : ");
        l12.setFont(new Font("Raleway",Font.BOLD,16));
        l12.setBounds(600,20,150,20);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,16));
        l13.setBounds(700,20,150,20);
        add(l13);

        s=new JButton("Submit");
        s.setFont(new Font("Rale-way",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(200,600,100,30);
        s.addActionListener(this);
        add(s);

        c=new JButton("Cancel");
        c.setFont(new Font("Rale-way",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(400,600,100,30);
        c.addActionListener(this);
        add(c);

        setLayout(null);
        setSize(800,730);
        setLocation(320,10);
        getContentPane().setBackground(new Color(222,255,228));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype=null;
        if(r1.isSelected()){
            atype="Savings Account";
        }else if(r2.isSelected()){
            atype="Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype="Current Account";
        } else if (r4.isSelected()) {
            atype="Recurring Deposit Account";
        }

        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);

        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac="";
        if(c1.isSelected()){
            fac += "ATM CARD";
        }if(c2.isSelected()){
            fac += "  Internet Banking";
        }if(c3.isSelected()){
            fac += "  Mobile Banking";
        }if(c4.isSelected()){
            fac += "  EMAIL Alerts";
        }if(c5.isSelected()){
            fac += "  Cheque Book";
        }if(c6.isSelected()){
            fac += "  E-Statement";
        }

        try{
            if(e.getSource()==s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Conn c1=new Conn();
                    String q1="insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number: "+cardno+"\n Pin: "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }

            } else if (e.getSource()==c) {
                       System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
