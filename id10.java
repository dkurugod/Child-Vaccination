
/* Vaccination schedule chart for registration Number */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class id10 {
	static String c1, c2, c3;

	public static void main(String args[]) {
		JFrame f = new JFrame("Enter Registration Number");

		f.setBounds(250, 30, 1000, 700);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon im1 = new ImageIcon("images//mother2.jpg");
		f.setContentPane(new JLabel(im1));

		Font f1 = new Font("Algerian", Font.BOLD, 50);

		JLabel l1 = new JLabel("Enter Registration Number");
		l1.setFont(f1);
		f.add(l1);
		l1.setBounds(100, 30, 900, 30);

		JLabel l2 = new JLabel("Enter -->");
		l2.setFont(new Font("Algerian", Font.BOLD, 30));
		l2.setBounds(220, 205, 200, 30);
		f.add(l2);

		JTextField l2a = new JTextField();
		l2a.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		l2a.setBounds(390, 202, 300, 40);
		f.add(l2a);

		JButton b1 = new JButton("Submit");
		b1.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		b1.setBounds(720, 203, 150, 40);
		f.add(b1);

		JLabel l3 = new JLabel("Child Name");
		l3.setFont(new Font("Algerian", Font.BOLD, 30));
		l3.setBounds(210, 300, 200, 30);
		f.add(l3);

		JLabel l4 = new JLabel("Registartion Number");
		l4.setFont(new Font("Algerian", Font.BOLD, 30));
		l4.setBounds(500, 300, 400, 30);
		f.add(l4);

		JLabel l5 = new JLabel("");
		l5.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		l5.setBounds(210, 340, 300, 30);
		f.add(l5);

		JLabel l5a = new JLabel("");
		l5a.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		l5a.setBounds(500, 340, 300, 30);
		f.add(l5a);

		JLabel l6 = new JLabel("");
		l6.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		l6.setBounds(210, 380, 300, 30);
		f.add(l6);

		JLabel l6a = new JLabel("");
		l6a.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		l6a.setBounds(500, 380, 300, 30);
		f.add(l6a);

		JLabel l7 = new JLabel("");
		l7.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		l7.setBounds(210, 420, 300, 30);
		f.add(l7);

		JLabel l7a = new JLabel("");
		l7a.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		l7a.setBounds(500, 420, 300, 30);
		f.add(l7a);

		JButton b2 = new JButton("Back");
		b2.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		b2.setBounds(420, 500, 150, 40);
		f.add(b2);

		String query = "select child_data.cname,child_data.reg from child_data where child_data.mname=" + "'" + args[0]
				+ "'";

		try {
			Connection con = getConnection();
			Statement stmt1 = con.createStatement();
			String query1 = query;
			ResultSet rs = stmt1.executeQuery(query1);

			while (rs.next()) {
				c1 = rs.getString("reg");
				l5.setText(rs.getString("cname"));
				l5a.setText(rs.getString("reg"));
				break;
			}
			while (rs.next()) {
				c2 = rs.getString("reg");
				l6.setText(rs.getString("cname"));
				l6a.setText(rs.getString("reg"));
				break;
			}
			while (rs.next()) {
				c3 = rs.getString("reg");
				l7.setText(rs.getString("cname"));
				l7a.setText(rs.getString("reg"));
				break;
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			//JOptionPane.showMessageDialog(null, "error");
		}

		// button working code
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				id4.main(ar);
			}
		});

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0], l2a.getText() };

				if (c1.equals(l2a.getText()) || c2.equals(l2a.getText()) || c3.equals(l2a.getText())) {
					f.dispose();
					id7.main(ar);
				} else {
					JOptionPane.showMessageDialog(null, "Wrong registered Number");
				}
			}
		});

		f.setVisible(true);

	}

	/* Vaccination schedule chart for registration Number */
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