package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    JPasswordField p1,p2;
    Pin(String pin){
        this.pin=pin;

        JLabel label1=new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System",Font.BOLD,30));
        label1.setBounds(260,80,800,35);
        add(label1);

        JLabel label2=new JLabel("ENTER NEW PIN : ");
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(260,200,800,35);
        add(label2);

        p1=new JPasswordField();
        p1.setFont(new Font("Rale-way",Font.BOLD,20));
        p1.setBounds(480,200,150,35);
        add(p1);


        JLabel label3=new JLabel("RE-ENTER NEW PIN : ");
        label3.setFont(new Font("System",Font.BOLD,20));
        label3.setBounds(260,250,800,35);
        add(label3);

        p2=new JPasswordField();
        p2.setFont(new Font("Rale-way",Font.BOLD,20));
        p2.setBounds(480,250,150,35);
        add(p2);

        b1=new JButton("CHANGE");
        b1.setBounds(550,350,150,35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);


        b2=new JButton("BACK");
        b2.setBounds(300,350,150,35);
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
            String pin1=p1.getText();
            String pin2=p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not matched");
                return;
            }
            if(e.getSource()==b1){
                if(p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Conn conn=new Conn();
                String q1="update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2="update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3="update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                conn.statement.executeUpdate(q1);
                conn.statement.executeUpdate(q2);
                conn.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed sucessfully");
                setVisible(false);
                new Main_class(pin);
            }
            else if(e.getSource()==b2){
                new Main_class(pin);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
