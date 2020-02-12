import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class admin extends JFrame implements ActionListener
{
JLabel l3;	
JButton b1,b2,b3,b4,b5;


admin()
{
super("Practice");
setSize(1300,1100);
setLocationRelativeTo(null); 
setExtendedState(JFrame.MAXIMIZED_BOTH); 
setUndecorated(true);
this.getContentPane().setBackground(Color.getHSBColor(154, 254, 25));
setResizable(false);  
setLayout(null);

l3=new JLabel("");
Image img12=new ImageIcon(this.getClass().getResource("/pexels-photo-811103.jpeg")).getImage();
l3.setIcon(new ImageIcon(img12));
l3.setBounds(210,80,940,647);
getContentPane().add(l3);

b1=new JButton("Cashier Details");
b1.setBounds(20,10,200,40);
add(b1);
b1.addActionListener(this);
b1.setFont(new Font("Arial", Font.PLAIN, 20));

b2=new JButton("New Product");
b2.setBounds(230,10,200,40);
add(b2);
b2.addActionListener(this);
b2.setFont(new Font("Arial", Font.PLAIN, 20));

b3=new JButton("Available Stock");
b3.setBounds(440,10,200,40);
add(b3);
b3.addActionListener(this);
b3.setFont(new Font("Arial", Font.PLAIN, 20));

b5=new JButton("Cashier Login Details");
b5.setBounds(650,10,230,40);
add(b5);
b5.addActionListener(this);
b5.setFont(new Font("Arial", Font.PLAIN, 20));

b4=new JButton("Log Out");
b4.setBounds(1150,10,200,40);
add(b4);
b4.addActionListener(this);
Image img=new ImageIcon(this.getClass().getResource("/Log-Out-icon.png")).getImage();
b4.setIcon(new ImageIcon(img));
b4.setFont(new Font("Arial", Font.PLAIN, 20));

setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e) 
{

if(e.getSource()==b1)
{
new cashierdetails();
}

else if(e.getSource()==b2)
{
new newproduct();
}

else if(e.getSource()==b3)
{
new availablestock();
}
 
else if(e.getSource()==b5)
{
new cashierlogindetails();
}

else
{
dispose();
new home();	
}
}
}








