package bankManagementSystem;

import com.mysql.cj.protocol.Resultset;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquriy extends JFrame implements ActionListener {
    JLabel label2;
    String pin;
    JButton b1;
    BalanceEnquriy(String pin){
        this.pin=pin;
        JLabel label1=new JLabel("YOUR CURRENT BALANCE IS Rs. ");
        label1.setFont(new Font("System",Font.BOLD,26));
        label1.setBounds(260,20,800,35);
        add(label1);

        label2=new JLabel();
        label2.setFont(new Font("System",Font.BOLD,30));
        label2.setBounds(260,80,800,35);
        add(label2);

        b1=new JButton("BACK");
        b1.setBounds(650,250,150,35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        int balance=0;
        try{
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1400,1000);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main_class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquriy("");
    }
}
