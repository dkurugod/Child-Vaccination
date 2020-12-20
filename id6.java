
/*  Mother Detail   */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class id6 {

	public static void main(String args[]) {
		JFrame f = new JFrame("Parent DetailS"); // Mother Detail
		f.setVisible(true);
		f.setBounds(250, 30, 1000, 700);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon im1 = new ImageIcon("images//mother2.jpg");
		f.setContentPane(new JLabel(im1));

		Font f2 = new Font("Adobe Caslon Pro", Font.BOLD, 30);
		Font f1 = new Font("Algerian", Font.BOLD, 50);

		JLabel l1 = new JLabel("       PARENT DETAILS");
		l1.setFont(f1);
		f.add(l1);
		l1.setBounds(200, 20, 700, 30);

		JLabel l2 = new JLabel("Mother Name:");
		JLabel t1 = new JLabel("");
		f.add(l2);
		f.add(t1);
		l2.setFont(f2);
		t1.setFont(f2);
		l2.setBounds(220, 80, 200, 35);
		t1.setBounds(500, 80, 300, 35);

		JLabel l3 = new JLabel("Father Name:"); // Mother Name
		JLabel t2 = new JLabel("");
		f.add(l3);
		f.add(t2);
		l3.setFont(f2);
		t2.setFont(f2);
		l3.setBounds(220, 120, 200, 35);
		t2.setBounds(500, 120, 300, 35);

		JLabel l4 = new JLabel("Mobile Number:");
		JLabel t3 = new JLabel("");
		f.add(l4);
		f.add(t3);
		l4.setFont(f2);
		t3.setFont(f2);
		l4.setBounds(220, 160, 240, 35);
		t3.setBounds(500, 160, 300, 35);

		JLabel l4a = new JLabel("SIN Number:");
		JLabel t3a = new JLabel("");
		f.add(l4a);
		f.add(t3a);
		l4a.setFont(f2);
		t3a.setFont(f2);
		l4a.setBounds(220, 200, 300, 35);
		t3a.setBounds(500, 200, 300, 35);

		JLabel l5 = new JLabel("DOB(YYYY/MM/DD):");
		JLabel t4 = new JLabel("");
		f.add(l5);
		f.add(t4);
		l5.setFont(f2);
		t4.setFont(f2);
		l5.setBounds(220, 240, 300, 35);
		t4.setBounds(500, 240, 300, 35);

		JLabel l6 = new JLabel("Street:"); // Address
		JLabel t5 = new JLabel("");
		f.add(l6);
		f.add(t5);
		l6.setFont(f2);
		t5.setFont(f2);
		l6.setBounds(220, 280, 240, 35);
		t5.setBounds(500, 280, 300, 35);

		JLabel l7 = new JLabel("City:");// District
		JLabel t6 = new JLabel("");
		f.add(l7);
		f.add(t6);
		l7.setFont(f2);
		t6.setFont(f2);
		l7.setBounds(220, 320, 240, 35);
		t6.setBounds(500, 320, 300, 35);

		JLabel l8 = new JLabel("Province:"); // State
		JLabel t7 = new JLabel("");
		f.add(l8);
		f.add(t7);
		l8.setFont(f2);
		t7.setFont(f2);
		l8.setBounds(220, 360, 240, 35);
		t7.setBounds(500, 360, 300, 35);

		JLabel l9 = new JLabel("Pincode:");
		JLabel t8 = new JLabel("");
		f.add(l9);
		f.add(t8);
		l9.setFont(f2);
		t8.setFont(f2);
		l9.setBounds(220, 400, 240, 35);
		t8.setBounds(500, 400, 300, 35);

		/*
		 * JLabel l10 = new JLabel("Password"); JLabel t9 = new JLabel();
		 * f.add(l10); f.add(t9); l10.setFont(f2); t9.setFont(f2);
		 * l10.setBounds(220, 440, 240, 35); t9.setBounds(500, 440, 300, 35);
		 */

		/*
		 * JLabel l11 = new JLabel("Confirm Password"); JLabel t10 = new
		 * JLabel(); f.add(l11); f.add(t10); l11.setFont(f2); t10.setFont(f2);
		 * l11.setBounds(220,480,240,35); t10.setBounds(500,480,300,35);
		 */

		JButton b1 = new JButton("Back");
		f.add(b1);
		b1.setFont(f2);
		b1.setBounds(450, 540, 150, 40);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { "ass" };
				f.dispose();
				id4.main(args);
			}
		});

		String query = "select * from mother.mother_data  where mname like " + "'" + args[0] + "'";

		// String abc =obj.sendfun();

		try {
			Connection con = getConnection();

			// FETCH DATA FROM DATABASE
			Statement stmt1 = con.createStatement();
			// String query1 ="select * from mother.mother_data where mname like
			// 'lala'";
			String query1 = query;
			ResultSet rs = stmt1.executeQuery(query1);

			while (rs.next()) {
				t1.setText(" " + rs.getString("mname"));
				t2.setText(" " + rs.getString("hname"));
				t3.setText(" " + rs.getString("mno"));
				t3a.setText(" " + rs.getString("ano"));
				t4.setText(" " + rs.getString("dob"));
				t5.setText(" " + rs.getString("add"));
				t6.setText(" " + rs.getString("dist"));
				t7.setText(" " + rs.getString("st"));
				t8.setText(" " + rs.getString("pc"));
				// t9.setText(" " + rs.getString("sp"));

			}

			con.close();
		} // end of try

		catch (Exception e23) {
			System.out.println(e23.getMessage());
			// JOptionPane.showMessageDialog(null,e23);
		}

	}

	/* Mother Detail */
	public static Connection getConnection() throws Exception {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/mother?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "123456";

			Connection conn = DriverManager.getConnection(url, username, password);

			return conn;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}