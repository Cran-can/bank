package bankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends  JFrame implements ActionListener {
    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    Signup2(String formno){
        super("APPLICATION FORM");
        this.formno=formno;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,18));
        l1.setBounds(350,20,200,23);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        l2.setBounds(300,50,200,23);
        add(l2);

        JLabel l3=new JLabel("Religion : ");
        l3.setFont(new Font("Raleway",Font.BOLD,16));
        l3.setBounds(100,100,100,20);
        add(l3);

        String religion[] ={"Hindu","Muslim","sikh","Christian","other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(222,255,225));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(300,100,300,20);
        add(comboBox);

        JLabel l4=new JLabel("Category : ");
        l4.setFont(new Font("Raleway",Font.BOLD,16));
        l4.setBounds(100,150,100,20);
        add(l4);

        String category[] ={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(222,255,225));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(300,150,300,20);
        add(comboBox2);

        JLabel l5=new JLabel("Income : ");
        l5.setFont(new Font("Raleway",Font.BOLD,16));
        l5.setBounds(100,200,100,20);
        add(l5);

        String income[] ={"0","<= 150000","<= 300000","<= 1000000","above 1000000"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(222,255,225));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(300,200,300,20);
        add(comboBox3);

        JLabel l6=new JLabel("Education : ");
        l6.setFont(new Font("Raleway",Font.BOLD,16));
        l6.setBounds(100,250,100,20);
        add(l6);

        String education[] ={"Non-Graduate","Graduation","Post Graduation","Other"};
        comboBox4=new JComboBox(education);
        comboBox4.setBackground(new Color(222,255,225));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(300,250,300,20);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway",Font.BOLD,16));
        l7.setBounds(100,300,150,20);
        add(l7);

        String occupation[] ={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        comboBox5=new JComboBox(occupation);
        comboBox5.setBackground(new Color(222,255,225));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(300,300,300,20);
        add(comboBox5);

        JLabel l8=new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway",Font.BOLD,16));
        l8.setBounds(100,350,150,20);
        add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,16));
        textPan.setBounds(300,350,300,20);
        add(textPan);

        JLabel l9=new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway",Font.BOLD,16));
        l9.setBounds(100,400,150,20);
        add(l9);

        textAadhar=new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,16));
        textAadhar.setBounds(300,400,300,20);
        add(textAadhar);

        JLabel l10=new JLabel("Serior Citizen : ");
        l10.setFont(new Font("Raleway",Font.BOLD,16));
        l10.setBounds(100,450,150,20);
        add(l10);

        r1=new JRadioButton("yes");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(222,255,225));
        r1.setBounds(300,450,100,20);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(222,255,225));
        r2.setBounds(400,450,100,20);
        add(r2);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel l11=new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway",Font.BOLD,16));
        l11.setBounds(100,500,150,20);
        add(l11);

        e1=new JRadioButton("yes");
        e1.setFont(new Font("Raleway",Font.BOLD,16));
        e1.setBackground(new Color(222,255,225));
        e1.setBounds(300,500,100,20);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,16));
        e2.setBackground(new Color(222,255,225));
        e2.setBounds(400,500,100,20);
        add(e2);

        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        JLabel l12=new JLabel("Form No : ");
        l12.setFont(new Font("Raleway",Font.BOLD,16));
        l12.setBounds(630,20,150,20);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,16));
        l13.setBounds(710,20,150,20);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,16));
        next.setForeground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(520,600,80,25);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(800,730);
        setLocation(320,10);
        getContentPane().setBackground(new Color(222,255,228));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String)comboBox.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occ=(String) comboBox5.getSelectedItem();

        String pan=textPan.getText();
        String addhar=textAadhar.getText();

        String scitizen="";
        if(r1.isSelected()){
            scitizen="Yes";
        }else if(r2.isSelected()){
            scitizen="No";
        }

        String eAccount=" ";
        if(e1.isSelected()){
            scitizen="Yes";
        }else if(e2.isSelected()){
            scitizen="No";
        }

        try{
            if(textPan.getText().equals("")||textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn c1=new Conn();
                String q="insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
