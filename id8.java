
/* Change Password" */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class id8
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("Change Password");
		
		f.setBounds(250,30,1000,700);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon im1 = new ImageIcon("images//mother2.jpg");
		f.setContentPane(new JLabel(im1));
 
		Font f2 = new Font("Algerian",Font.BOLD,40);
		Font f1 = new Font("Adobe Caslon Pro",Font.BOLD,30);
		
		JLabel l1 = new JLabel("Change Password");
		l1.setFont(f2);
		l1.setBounds(300,50,500,40);
		f.add(l1);


		JLabel l2 = new JLabel("Current Password");
		l2.setFont(f1);
		l2.setBounds(190,210,300,30);
		f.add(l2);

		JPasswordField p1 = new JPasswordField();
		p1.setFont(f1);
		p1.setBounds(500,200,300,40);
		f.add(p1);

	/*	JLabel l3 = new JLabel("---------------------------------------------------------------------------------------------------");
		l3.setFont(f2);
		l3.setBounds(000,255,1000,10);
		f.add(l3); */


		JLabel l4 = new JLabel("New Password");
		l4.setFont(f1);
		l4.setBounds(237,310,300,30);
		f.add(l4);
		
		JPasswordField l4a = new JPasswordField();
		l4a.setFont(f1);
		l4a.setBounds(500,300,300,40);
		f.add(l4a);

		JLabel l5 = new JLabel("Confirm Password");
		l5.setFont(f1);
		l5.setBounds(190,370,300,30);
		f.add(l5);
		
		JPasswordField l5a = new JPasswordField();
		l5a.setFont(f1);
		l5a.setBounds(500,360,300,40);
		f.add(l5a);

		JButton b1 = new JButton("Update Password");
		b1.setFont(f1);
		b1.setBounds(280,500,300,40);
		f.add(b1);

		JButton b2 = new JButton("Back");
		b2.setFont(f1);
		b2.setBounds(600,500,150,40);
		f.add(b2);

		f.setVisible(true);

		//button working code

		b1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		try
		{
		Connection con = getConnection();
		Statement stmt = con.createStatement();

		String query ="select * from mother.mother_data  where mname like "+"'"+args[0]+"'";
		String sql = query;
		ResultSet rs = stmt.executeQuery(sql);

		String pass = p1.getText();
		while(rs.next())
		{
			if(pass.equals(rs.getString("sp")))
			{
			JOptionPane.showMessageDialog(null,"Current password Matched");
			String sp = l4a.getText();
			String cp = l5a.getText();
			
			if(sp.equals(cp))
			{
			String q1="UPDATE mother.mother_data SET sp="+"'"+sp+"'"+", cp="+"'"+cp+"'"+" WHERE mname="+"'"+args[0]+"'";
			String up=q1;
			
			int i =stmt.executeUpdate(up);
			if(i>0)
			{
			JOptionPane.showMessageDialog(null,"Password Changed");}
			else
			{
			JOptionPane.showMessageDialog(null,"Data is not Updated");
			}
			
			String q2="UPDATE mother.user_data SET password="+"'"+sp+"'"+" WHERE username="+"'"+args[0]+"'";
			String up1=q2;
			
			int ij =stmt.executeUpdate(up1);
			if(ij>0)
			{
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Data is not Updated");
			}

			}
			else
			{
			JOptionPane.showMessageDialog(null,"new and confirm password not match");

			}
						
			}//end if
			else
			{
			JOptionPane.showMessageDialog(null,"Current Password don't Match");
			}	
		}//end while
		}//end try
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
		}//end pf actionPerformed fun()
		});



		b2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		String ar[] = new String[]{args[0]};
		f.dispose();
		id4.main(ar);
		
		}
		});
		
	}
	
	/* Change Password" */
	public static Connection getConnection() throws Exception
		{
		try
		{
		String url ="jdbc:mysql://127.0.0.1:3306/mother?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "123456";
		
		Connection conn = DriverManager.getConnection(url,username,password);
		
		return conn;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
		}
}