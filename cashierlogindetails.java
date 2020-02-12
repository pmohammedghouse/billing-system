import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class cashierlogindetails extends JFrame 
{
	
JLabel l6;
JTable ta;
JScrollPane sp;
private DefaultTableModel model;

public void updatetable()
{
try
{
Connection cn=connection.mycon();
Statement st=cn.createStatement();
ResultSet rs=st.executeQuery("select * from cashierlogindata");
ta.setModel(DbUtils.resultSetToTableModel(rs));
cn.close();
}
catch(Exception e4)
{
JOptionPane.showMessageDialog(this,"Error"); 
}
}


cashierlogindetails()
{
super("practice");

setSize(800,500);
setLocationRelativeTo(null); 
setResizable(false);
setLayout(null);
//this.getContentPane().setBackground(Color.LIGHT_GRAY); 

l6=new JLabel("Cashier Login Details");
l6.setFont(new Font("Times New Roman",Font.BOLD,40));
l6.setBounds(200,30,500,100);
add(l6);




ta=new JTable();
ta.setBounds(100,150,600,250);
add(ta);

ta.setEnabled(false);
ta.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 12));
DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) ta.getTableHeader().getDefaultRenderer();
renderer.setHorizontalAlignment(JLabel.LEFT);
ta.getTableHeader().setBackground(Color.LIGHT_GRAY);
UIDefaults defaults = UIManager.getLookAndFeelDefaults();
if (defaults.get("Table.alternateRowColor") == null)
    defaults.put("Table.alternateRowColor", new Color(240, 240, 240));

JScrollPane sp = new JScrollPane(ta);
sp.setBounds(100,150,600,250);
add(sp);
updatetable();
setVisible(true);

}

}
