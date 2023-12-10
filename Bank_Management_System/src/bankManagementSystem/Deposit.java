package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    Deposit(String pin){
        this.pin=pin;

        JLabel label1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System",Font.BOLD,30));
        label1.setBounds(260,80,800,35);
        add(label1);

        textField=new TextField();
        textField.setBounds(260,150,600,35);
        textField.setFont(new Font("Rale-way",Font.BOLD,30));
        add(textField);

        b1=new JButton("DEPOSIT");
        b1.setBounds(650,250,150,35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("BACK");
        b2.setBounds(400,250,150,35);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setLayout(null);
        setSize(1400,1000);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount=textField.getText();
            Date date=new Date();
            if(e.getSource()==b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the amount you want to deposit");
                }else{
                    Conn c=new Conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposit Sucessfully");
                    setVisible(false);
                    new Main_class(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new Main_class(pin);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
