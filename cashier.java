import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

class cashier extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4;
String time;
int cec;
String cec1,cec2;

public  void clock()
{
	
Calendar calen=new GregorianCalendar();	

int sec=calen.get(Calendar.SECOND);
int min=calen.get(Calendar.MINUTE);
int hr=calen.get(Calendar.HOUR);

time  =hr+":"+min+":"+sec;
}


cashier()
{
super("Practice");

setSize(1300,1100);
setLocationRelativeTo(null); 
setExtendedState(JFrame.MAXIMIZED_BOTH); 
setUndecorated(true);
this.getContentPane().setBackground(Color.getHSBColor(154, 254, 25));
setLayout(null);
setResizable(false);

b1=new JButton("Create Bill");
b1.setBounds(20,10,200,40);
add(b1);
b1.addActionListener(this);
b1.setFont(new Font("Arial", Font.PLAIN, 20));

b2=new JButton("Search Bill");
b2.setBounds(230,10,200,40);
add(b2);
b2.setFont(new Font("Arial", Font.PLAIN, 20));
b2.addActionListener(this);

b3=new JButton("Extra");
b3.setBounds(440,10,200,40);
add(b3);
b3.setFont(new Font("Arial", Font.PLAIN, 20));
//b3.addActionListener(this);

b4=new JButton("Log Out");
b4.setBounds(1150,10,200,40);
add(b4);
b4.addActionListener(this);
Image img=new ImageIcon(this.getClass().getResource("/Log-Out-icon.png")).getImage();
b4.setIcon(new ImageIcon(img));
b4.setFont(new Font("Arial", Font.PLAIN, 20));

setVisible(true);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

}



public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{
new createbill();
}

else if(e.getSource()==b2)
{
new searchbill();	
}

else 
{
clock();	
try
{
Connection cn=connection.mycon();
Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery("select s_no from cashierlogindata order by s_no");
rs.afterLast();

if(rs.previous())
{
cec=rs.getInt(1);
st.executeUpdate("update cashierlogindata set logout_time='"+time+"' where s_no='"+cec+"'");	
}
cn.close();
}
catch(Exception e4)
{
System.out.println(e4);
JOptionPane.showMessageDialog(this,"Error"); 
}
dispose();
new home();	
}
}
}








