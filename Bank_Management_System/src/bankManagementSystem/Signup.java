package bankManagementSystem;


import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    Random random=new Random();
    long first4=(random.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);
    JTextField textName,textFName,textEmail,textAdd,textCity,textPin,textState;
    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;
    Signup(){
        super("APPLICATION FORM");

        JLabel label1=new JLabel("APPLICATION FORM NO: "+first);
        label1.setBounds(200,20,400,30);
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        add(label1);

        JLabel label2=new JLabel("page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setBounds(300,50,200,23);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,18));
        label3.setBounds(260,75,200,20);
        add(label3);

        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,17));
        labelName.setBounds(80,150,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,17));
        textName.setBounds(250,155,400,25);
        add(textName);

        JLabel labelFName=new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,17));
        labelFName.setBounds(80,200,200,30);
        add(labelFName);

        textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,17));
        textFName.setBounds(250,205,400,25);
        add(textFName);

        JLabel DOB=new JLabel("Date Of Bitrh :");
        DOB.setFont(new Font("Raleway",Font.BOLD,17));
        DOB.setBounds(80,300,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(250,305,400,25);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,17));
        labelG.setBounds(80,250,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(250,255,60,25);
        r1.setBackground(new Color(222,255,229));
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(350,255,80,25);
        r2.setBackground(new Color(222,255,229));
        add(r2);

        r3=new JRadioButton("Custom");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(450,255,80,25);
        r3.setBackground(new Color(222,255,229));
        add(r3);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail=new JLabel("Email :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,17));
        labelEmail.setBounds(80,350,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,17));
        textEmail.setBounds(250,355,400,25);
        add(textEmail);

        JLabel labelMs=new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,17));
        labelMs.setBounds(80,400,200,30);
        add(labelMs);

        m1=new JRadioButton("Single");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBounds(250,405,90,25);
        m1.setBackground(new Color(222,255,229));
        add(m1);

        m2=new JRadioButton("Married");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(350,405,80,25);
        m2.setBackground(new Color(222,255,229));
        add(m2);

        m3=new JRadioButton("Others");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(450,405,80,25);
        m3.setBackground(new Color(222,255,229));
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd=new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,17));
        labelAdd.setBounds(80,450,200,30);
        add(labelAdd);

        textAdd =new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,17));
        textAdd.setBounds(250,455,400,25);
        add(textAdd);

        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,17));
        labelCity.setBounds(80,500,200,30);
        add(labelCity);

        textCity=new JTextField();
        textCity.setFont(new Font("Railway",Font.BOLD,17));
        textCity.setBounds(250,505,400,25);
        add(textCity);

        JLabel labelPin=new JLabel("Pin Code :");
        labelPin.setFont(new Font("Railway",Font.BOLD,17));
        labelPin.setBounds(80,550,200,30);
        add(labelPin);

        textPin=new JTextField();
        textPin.setFont(new Font("Railway",Font.BOLD,17));
        textPin.setBounds(250,555,400,25);
        add(textPin);

        JLabel labelState=new JLabel("State :");
        labelState.setFont(new Font("Railway",Font.BOLD,17));
        labelState.setBounds(80,600,200,30);
        add(labelState);

        textState=new JTextField();
        textState.setFont(new Font("Railway",Font.BOLD,17));
        textState.setBounds(250,605,400,25);
        add(textState);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,655,80,25);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(800,730);
        setLocation(320,10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name= textName.getText();
        String fname= textFName.getText();
        String dob= ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }else if(r3.isSelected()){
            gender="Custom";
        }
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="single";
        } else if (m2.isSelected()) {
            marital="married";
        } else if (m3.isSelected()) {
            marital="Others";
        }
        String address=textAdd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn conn1=new Conn();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] agrs){
        new Signup();
    }
}
