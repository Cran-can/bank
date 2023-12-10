package bankManagementSystem;

import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;
    TextField textField;
    JButton b1,b2;
    Withdrawl(String pin){
        this.pin=pin;

        JLabel label=new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label.setFont(new Font("System",Font.BOLD,16));
        label.setBounds(260,20,800,35);
        add(label);

        JLabel label1=new JLabel("PLEASE ENTER YOUR AMOUNT");
        label1.setFont(new Font("System",Font.BOLD,30));
        label1.setBounds(260,80,800,35);
        add(label1);

        textField=new TextField();
        textField.setBounds(260,150,600,35);
        textField.setFont(new Font("Rale-way",Font.BOLD,30));
        add(textField);

        b1=new JButton("WITHDRAW");
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
        if(e.getSource()==b1) {


            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("select*from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("Insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Sucessfully");
                    setVisible(false);
                    new Main_class(pin);

                }
            } catch (Exception E) {

            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new Main_class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
