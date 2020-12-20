
/* Child Registration form  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class id3 {
	public static void main(String args[]) {
		JFrame f = new JFrame("CHILD Registration");

		f.setVisible(true);
		f.setBounds(250, 30, 1000, 700);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon im1 = new ImageIcon("images//mother2.jpg");
		f.setContentPane(new JLabel(im1));

		Font f2 = new Font("Adobe Caslon Pro", Font.BOLD, 30);
		Font f1 = new Font("Algerian", Font.BOLD, 50);

		JLabel l1 = new JLabel("CHILD REGISTRATION");
		l1.setFont(f1);
		f.add(l1);
		l1.setBounds(200, 20, 700, 30);

		JLabel l2 = new JLabel("Child Name");
		JTextField t1 = new JTextField();
		f.add(l2);
		f.add(t1);
		l2.setFont(f2);
		t1.setFont(f2);
		l2.setBounds(220, 80, 200, 35);
		t1.setBounds(500, 80, 300, 35);

		JLabel l3 = new JLabel("Mother Name");
		JTextField t2 = new JTextField();
		f.add(l3);
		f.add(t2);
		l3.setFont(f2);
		t2.setFont(f2);
		l3.setBounds(220, 130, 300, 35);
		t2.setBounds(500, 130, 300, 35);

		JLabel l4 = new JLabel("Hospital Name");
		JTextField t3 = new JTextField();
		f.add(l4);
		f.add(t3);
		l4.setFont(f2);
		t3.setFont(f2);
		l4.setBounds(220, 180, 240, 35);
		t3.setBounds(500, 180, 300, 35);

		JLabel l5 = new JLabel("Date Of Birth");
		JTextField t4 = new JTextField();
		f.add(l5);
		f.add(t4);
		l5.setFont(f2);
		t4.setFont(f2);
		l5.setBounds(220, 230, 300, 35);
		t4.setBounds(500, 230, 300, 35);

		JLabel l6 = new JLabel("Street"); // address
		JTextField t5 = new JTextField();
		f.add(l6);
		f.add(t5);
		l6.setFont(f2);
		t5.setFont(f2);
		l6.setBounds(220, 280, 240, 35);
		t5.setBounds(500, 280, 300, 35);

		JLabel l7 = new JLabel("City"); // District
		JTextField t6 = new JTextField();
		f.add(l7);
		f.add(t6);
		l7.setFont(f2);
		t6.setFont(f2);
		l7.setBounds(220, 330, 240, 35);
		t6.setBounds(500, 330, 300, 35);

		JLabel l8 = new JLabel("Province"); // State
		JTextField t7 = new JTextField();
		f.add(l8);
		f.add(t7);
		l8.setFont(f2);
		t7.setFont(f2);
		l8.setBounds(220, 380, 240, 35);
		t7.setBounds(500, 380, 300, 35);

		JLabel l9 = new JLabel("Pincode");
		JTextField t8 = new JTextField();
		f.add(l9);
		f.add(t8);
		l9.setFont(f2);
		t8.setFont(f2);
		l9.setBounds(220, 430, 240, 35);
		t8.setBounds(500, 430, 300, 35);

		JLabel l10 = new JLabel("Registration Number");
		JTextField t9 = new JTextField();
		f.add(l10);
		f.add(t9);
		l10.setFont(f2);
		t9.setFont(f2);
		l10.setBounds(220, 480, 240, 35);
		t9.setBounds(500, 480, 300, 35);

		JButton b1 = new JButton("Submit");
		f.add(b1);
		b1.setFont(f2);
		b1.setBounds(450, 530, 150, 40);

		JButton b2 = new JButton("Back");
		f.add(b2);
		b2.setFont(f2);
		b2.setBounds(650, 530, 150, 40);

		JLabel l11 = new JLabel(" Last Registration number is: ");
		f.add(l11);
		l11.setFont(new Font("Algerian", Font.BOLD, 30));
		l11.setBounds(190, 580, 600, 35);

		// Back Button Working code

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				id4.main(ar);
			}
		});

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String check = "";
				if (check.equals(t1.getText()))
					JOptionPane.showMessageDialog(null, "Enter Child Name");
				if (check.equals(t2.getText()))
					JOptionPane.showMessageDialog(null, "Enter Mother Name");
				if (check.equals(t3.getText()))
					JOptionPane.showMessageDialog(null, "Enter Name of hospital");
				if (check.equals(t4.getText()))
					JOptionPane.showMessageDialog(null, "Enter Date of Birth");
				if (check.equals(t5.getText()))
					JOptionPane.showMessageDialog(null, "Enter Address");
				if (check.equals(t6.getText()))
					JOptionPane.showMessageDialog(null, "Enter District");
				if (check.equals(t7.getText()))
					JOptionPane.showMessageDialog(null, "Enter State");
				if (check.equals(t8.getText()))
					JOptionPane.showMessageDialog(null, "Enter pincode");
				if (check.equals(t9.getText()))
					JOptionPane.showMessageDialog(null, "Enter Registration Number");

				try {
					Connection con = getConnection();
					String query = "INSERT INTO child_data VALUES(?,?,?,?,?,?,?,?,?)";

					PreparedStatement stmt = con.prepareStatement(query);

					stmt.setString(1, t1.getText());

					stmt.setString(2, t2.getText());
					stmt.setString(3, t3.getText());
					stmt.setString(4, t4.getText());
					stmt.setString(5, t5.getText());
					stmt.setString(6, t6.getText());
					stmt.setString(7, t7.getText());
					stmt.setString(8, t8.getText());
					stmt.setString(9, t9.getText());
					int i = stmt.executeUpdate();

					if (i >= 0) {
						JOptionPane.showMessageDialog(null, "Successfully Registered");
					} else {
						JOptionPane.showMessageDialog(null, "Data is not saved");
					}
				} // end of try block
				catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});

		try {
			Connection con = getConnection();
			Statement stmt1 = con.createStatement();
			// String query1 = "select child_data.reg from child_data";
			String query1 = "select max(reg) from child_data";
			ResultSet rs = stmt1.executeQuery(query1);

			while (rs.next()) {

				l11.setText("Last Registration number is:  " + rs.getInt("max(reg)"));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/* Child Registration form */
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