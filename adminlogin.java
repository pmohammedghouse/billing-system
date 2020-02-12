import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class adminlogin extends JFrame implements ActionListener 
{
	
JLabel l1,l2,l3;
JPasswordField p1;
JTextField t1;
JButton b1;

adminlogin()
{
super("practice");
setSize(500,500);
setLocationRelativeTo(null); 
this.getContentPane().setBackground(Color.lightGray);
setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setResizable(false);
l3=new JLabel("Admin Login");
l3.setFont(new Font("Times New Roman",Font.BOLD,30));
l3.setBounds(150,30,500,100);
add(l3);

l1=new JLabel("Name");
l1.setBounds(100,150,100,30);
l1.setFont(new Font("Times New Roman",Font.TRUETYPE_FONT,20));
add(l1);

t1=new JTextField();
t1.setBounds(250,150,150,30);
add(t1);
			 
l2=new JLabel("Password");
l2.setBounds(100,200,100,30);
l2.setFont(new Font("Times New Roman",Font.TRUETYPE_FONT,20));
add(l2);

p1=new JPasswordField();
p1.setBounds(250,200,150,30);
add(p1);

b1=new JButton("Login"); 
b1.setBounds(220,270,100,30);
add(b1);
b1.addActionListener(this);
setVisible(true);
}
	

@Override
public void actionPerformed(ActionEvent e) 
{
String a=t1.getText();
String b=p1.getText();
String c="prabal";
//System.out.println(c);
		
if(a.equals(c)&&b.equals(c))
{
new admin();
dispose();
}
else
{
JOptionPane.showMessageDialog(this,"Login Invalid");  
}
} 
}



