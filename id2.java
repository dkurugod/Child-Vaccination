
/* Mother registration Form */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class id2 {
	public void fun(String abc1, String abc2, String abc3, String abc4, String abc5, String abc6, String abc7,
			String abc8, String abc9, String abc10, String abc11) {
		String check = "";
		if (check.equals(abc1))
			JOptionPane.showMessageDialog(null, "Enter Mother Name");
		if (check.equals(abc2))
			JOptionPane.showMessageDialog(null, "Enter Husband Name");
		if (check.equals(abc3))
			JOptionPane.showMessageDialog(null, "Enter Mobile Number");
		if (check.equals(abc4))
			JOptionPane.showMessageDialog(null, "Enter Aadhar Number");
		if (check.equals(abc5))
			JOptionPane.showMessageDialog(null, "Enter Date of Birth");
		if (check.equals(abc6))
			JOptionPane.showMessageDialog(null, "Enter Address");
		if (check.equals(abc7))
			JOptionPane.showMessageDialog(null, "Enter District");
		if (check.equals(abc8))
			JOptionPane.showMessageDialog(null, "Enter State");
		if (check.equals(abc9))
			JOptionPane.showMessageDialog(null, "Enter  PinCode");
		if (check.equals(abc10))
			JOptionPane.showMessageDialog(null, "Enter Password");
		if (check.equals(abc11))
			JOptionPane.showMessageDialog(null, "Enter Confirm Password");

		if (abc10.equals(abc11))

		{
			try {

				Connection con = getConnection();
				// Statement stmt = con.createStatement();
				String query = "INSERT INTO user_data VALUES(?,?)";

				PreparedStatement stmt = con.prepareStatement(query);

				stmt.setString(1, abc1);

				stmt.setString(2, abc10);

				int i = stmt.executeUpdate();
				if (i > 0) {
					JOptionPane.showMessageDialog(null, "Successfully Registered");
				} else {
					JOptionPane.showMessageDialog(null, "Data is not saved");
				}

				stmt.executeUpdate();
				con.close();
			} // end of try

			catch (Exception e23) {
				System.out.println(e23.getMessage());
				// JOptionPane.showMessageDialog(null,e23);
			}

		} // end of if
		else {
			JOptionPane.showMessageDialog(null, "Enter Matching Password");
		}

		if (abc10.equals(abc11))

		{
			try {

				Connection con = getConnection();

				String query = "INSERT INTO mother_data VALUES(?,?,?,?,?,?,?,?,?,?,?)";

				PreparedStatement stmt = con.prepareStatement(query);

				stmt.setString(1, abc1);

				stmt.setString(2, abc2);
				stmt.setString(3, abc3);
				stmt.setString(4, abc4);
				stmt.setString(5, abc5);
				stmt.setString(6, abc6);
				stmt.setString(7, abc7);
				stmt.setString(8, abc8);
				stmt.setString(9, abc9);
				stmt.setString(10, abc11);
				stmt.setString(11, abc11);
				int i = stmt.executeUpdate();
				if (i > 0) {
					int x;

				} else {
					JOptionPane.showMessageDialog(null, "Data is not saved");
				}

				stmt.executeUpdate();
				con.close();
			} // end of try

			catch (Exception e23) {
				System.out.println(e23.getMessage());
				// JOptionPane.showMessageDialog(null,e23);
			}

		} // end of if
		else {
			// JOptionPane.showMessageDialog(null,"Enter Matching Password");
		}

	}// end of fun function

	public static void main(String args[]) {
		JFrame f = new JFrame("Parents Registration");
		f.setVisible(true);
		f.setBounds(250, 30, 1000, 700);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon im1 = new ImageIcon("images//mother2.jpg");

		f.setContentPane(new JLabel(im1));

		Font f2 = new Font("Adobe Caslon Pro", Font.BOLD, 30);
		Font f1 = new Font("Algerian", Font.BOLD, 50);

		JLabel l1 = new JLabel("Parents Registration");
		l1.setFont(f1);
		f.add(l1);
		l1.setBounds(200, 20, 700, 30);

		JLabel l2 = new JLabel("Mother Name");
		JTextField t1 = new JTextField();
		f.add(l2);
		f.add(t1);
		l2.setFont(f2);
		t1.setFont(f2);
		l2.setBounds(220, 80, 300, 35);
		t1.setBounds(500, 80, 300, 35);

		JLabel l3 = new JLabel("Father Name");
		JTextField t2 = new JTextField();
		f.add(l3);
		f.add(t2);
		l3.setFont(f2);
		t2.setFont(f2);
		l3.setBounds(220, 120, 200, 35);
		t2.setBounds(500, 120, 300, 35);

		JLabel l4 = new JLabel("Mobile Number");
		JTextField t3 = new JTextField();
		f.add(l4);
		f.add(t3);
		l4.setFont(f2);
		t3.setFont(f2);
		l4.setBounds(220, 160, 240, 35);
		t3.setBounds(500, 160, 300, 35);

		JLabel l4a = new JLabel("SIN Number");
		JTextField t3a = new JTextField();
		f.add(l4a);
		f.add(t3a);
		l4a.setFont(f2);
		t3a.setFont(f2);
		l4a.setBounds(220, 200, 300, 35);
		t3a.setBounds(500, 200, 300, 35);

		JLabel l5 = new JLabel("DOB(YYYY/MM/DD)");
		JTextField t4 = new JTextField();
		f.add(l5);
		f.add(t4);
		l5.setFont(f2);
		t4.setFont(f2);
		l5.setBounds(220, 240, 300, 35);
		t4.setBounds(500, 240, 300, 35);

		JLabel l6 = new JLabel("Street");
		JTextField t5 = new JTextField();
		f.add(l6);
		f.add(t5);
		l6.setFont(f2);
		t5.setFont(f2);
		l6.setBounds(220, 280, 240, 35);
		t5.setBounds(500, 280, 300, 35);

		JLabel l7 = new JLabel("City");
		JTextField t6 = new JTextField();
		f.add(l7);
		f.add(t6);
		l7.setFont(f2);
		t6.setFont(f2);
		l7.setBounds(220, 320, 240, 35);
		t6.setBounds(500, 320, 300, 35);

		JLabel l8 = new JLabel("Province");
		JTextField t7 = new JTextField();
		f.add(l8);
		f.add(t7);
		l8.setFont(f2);
		t7.setFont(f2);
		l8.setBounds(220, 360, 240, 35);
		t7.setBounds(500, 360, 300, 35);

		JLabel l9 = new JLabel("Pincode");
		JTextField t8 = new JTextField();
		f.add(l9);
		f.add(t8);
		l9.setFont(f2);
		t8.setFont(f2);
		l9.setBounds(220, 400, 240, 35);
		t8.setBounds(500, 400, 300, 35);

		JLabel l10 = new JLabel("Set Password");
		JPasswordField t9 = new JPasswordField();
		f.add(l10);
		f.add(t9);
		l10.setFont(f2);
		t9.setFont(f2);
		l10.setBounds(220, 440, 240, 35);
		t9.setBounds(500, 440, 300, 35);

		JLabel l11 = new JLabel("Confirm Password");
		JPasswordField t10 = new JPasswordField();
		f.add(l11);
		f.add(t10);
		l11.setFont(f2);
		t10.setFont(f2);
		l11.setBounds(220, 480, 240, 35);
		t10.setBounds(500, 480, 300, 35);

		JButton b1 = new JButton("Submit");
		f.add(b1);
		b1.setFont(f2);
		b1.setBounds(450, 540, 150, 40);

		JButton b2 = new JButton("Back");
		f.add(b2);
		b2.setFont(f2);
		b2.setBounds(650, 540, 150, 40);

		JLabel l12 = new JLabel("*UserName is same as MotherName");
		l12.setFont(f2);
		f.add(l12);
		l12.setBounds(130, 590, 550, 30);

		// Button working code

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Connection con = getConnection();

					// FETCH DATA FROM DATABASE
					Statement stmt1 = con.createStatement();
					String query1 = "select * from mother.mother_data";
					ResultSet rs = stmt1.executeQuery(query1);

					while (rs.next()) {
						String user = rs.getString("mname");
						if (user.equals(t1.getText())) {
							JOptionPane.showMessageDialog(null, "Mother Name already exits");
							break;
						} else {
							id2 obj = new id2();
							obj.fun(t1.getText(), t2.getText(), t3.getText(), t3a.getText(), t4.getText(), t5.getText(),
									t6.getText(), t7.getText(), t8.getText(), String.valueOf(t9.getPassword()),
									String.valueOf(t10.getPassword()));
							break;

						}
					}

					con.close();
				} // end of try

				catch (Exception e23) {
					System.out.println(e23.getMessage());
					// JOptionPane.showMessageDialog(null,e23);
				}

			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] argu = new String[] { "asd" };
				try {
					f.dispose();
					id1.main(argu);
				} catch (Exception e34) {
					System.out.println(e34.getMessage());
				}
			}
		});

	}

	/* Mother registration Form */
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