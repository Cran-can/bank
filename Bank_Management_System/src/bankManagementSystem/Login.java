package bankManagementSystem;

import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel lable1,label2,label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2,button3;
    Login(){
        super("Bank Management System");

        lable1= new JLabel("WELCOME TO BANK");
        lable1.setForeground(Color.GRAY);
        lable1.setFont(new Font("AvantGarde",Font.BOLD,38));
        lable1.setBounds(250,10,450,40);
        add(lable1);

        label2=new JLabel("USER ID: ");
        label2.setFont(new Font("Ralway",Font.BOLD,25));
        label2.setForeground(Color.BLACK);
        label2.setBounds(70,110,375,30);
        add(label2);

        textField=new JTextField(15);
        textField.setBounds(200,110,230,30);
        textField.setFont(new Font("Arial",Font.BOLD,14));
        add(textField);

        label3=new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD,25));
        label3.setForeground(Color.BLACK);
        label3.setBounds(70,150,375,30);
        add(label3);

        passwordField=new JPasswordField(15);
        passwordField.setBounds(200,150,230,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField);

        button1=new JButton("Sign in");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.BLACK);
        button1.setBounds(200,220,90,25);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("clear");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.BLACK);
        button2.setBounds(340,220,90,25);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("Sign up");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.BLACK);
        button3.setBounds(200,260,230,25);
        button3.addActionListener(this);
        add(button3);


        setLayout(null);
        setSize(850,480);
        setLocation(300,150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      try{
          if(e.getSource()==button1){
              Conn c=new Conn();
              String cardno=textField.getText();
              String pin=passwordField.getText();
              String q="select *from login where card_number = '"+cardno+"' and pin='"+pin+"'";
              ResultSet resultset = c.statement.executeQuery(q);
              if(resultset.next()){
                  setVisible(false);
                  new Main_class(pin);
              }else {
                  JOptionPane.showMessageDialog(null,"Incorrect card number or PIN");
              }

          }
          else if(e.getSource()==button2){
              textField.setText("");
              passwordField.setText("");
          }
          else if (e.getSource()==button3) {
               new Signup();
               setVisible(false);
          }
      }
      catch (Exception E){
          E.printStackTrace();
      }
    }

    public static void main(String[] args){
        new Login();
    }
}
