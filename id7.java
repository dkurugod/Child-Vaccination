
//StatusPending/Complete Form

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class id7 {
	public static void main(String args[]) {
		JFrame f = new JFrame("Child information");
		f.setBounds(250, 30, 1000, 700);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon im1 = new ImageIcon("images//mother2.jpg");
		f.setContentPane(new JLabel(im1));

		Font f3 = new Font("Algerian", Font.BOLD, 25);
		Font f2 = new Font("Algerian", Font.BOLD, 40);

		JLabel xc = new JLabel("Child Information");
		xc.setFont(f2);
		xc.setBounds(300, 10, 500, 40);
		f.add(xc);

		JLabel l1 = new JLabel("Child Name");
		l1.setFont(f3);
		l1.setBounds(150, 70, 200, 25);
		f.add(l1);

		JLabel l1a = new JLabel("Not Registered Yet");
		l1a.setFont(f3);
		l1a.setBounds(400, 70, 400, 25);
		f.add(l1a);

		JLabel l2 = new JLabel("Date of birth");
		l2.setFont(f3);
		l2.setBounds(150, 100, 300, 25);
		f.add(l2);

		JLabel l2a = new JLabel("Not registered yet");
		l2a.setFont(f3);
		l2a.setBounds(400, 100, 400, 25);
		f.add(l2a);

		JLabel l3 = new JLabel("Doses");
		l3.setFont(f3);
		l3.setBounds(150, 150, 150, 25);
		f.add(l3);

		JLabel l3a = new JLabel("Status(Pending/Complete)");
		l3a.setFont(f3);
		l3a.setBounds(600, 150, 400, 25);
		f.add(l3a);

		JLabel l4 = new JLabel("At Birth");
		l4.setFont(f3);
		l4.setBounds(150, 190, 150, 25);
		f.add(l4);

		JLabel l4a = new JLabel("Pending");
		l4a.setFont(f3);
		l4a.setBounds(600, 190, 150, 25);
		f.add(l4a);

		JLabel l5 = new JLabel("2 Months");
		l5.setFont(f3);
		l5.setBounds(150, 220, 200, 25);
		f.add(l5);

		JLabel l5a = new JLabel("Pending");
		l5a.setFont(f3);
		l5a.setBounds(600, 220, 150, 25);
		f.add(l5a);

		JLabel l6 = new JLabel("4 Months");
		l6.setFont(f3);
		l6.setBounds(150, 250, 250, 25);
		f.add(l6);

		JLabel l6a = new JLabel("Pending");
		l6a.setFont(f3);
		l6a.setBounds(600, 250, 150, 25);
		f.add(l6a);

		JLabel l7 = new JLabel("6 Months");
		l7.setFont(f3);
		l7.setBounds(150, 280, 250, 25);
		f.add(l7);

		JLabel l7a = new JLabel("Pending");
		l7a.setFont(f3);
		l7a.setBounds(600, 280, 150, 25);
		f.add(l7a);

		JLabel l8 = new JLabel("9 Months");
		l8.setFont(f3);
		l8.setBounds(150, 310, 250, 25);
		f.add(l8);

		JLabel l8a = new JLabel("Pending");
		l8a.setFont(f3);
		l8a.setBounds(600, 310, 150, 25);
		f.add(l8a);

		JLabel l9 = new JLabel("12 Months");
		l9.setFont(f3);
		l9.setBounds(150, 340, 250, 25);
		f.add(l9);

		JLabel l9a = new JLabel("Pending");
		l9a.setFont(f3);
		l9a.setBounds(600, 340, 150, 25);
		f.add(l9a);

		JLabel l10 = new JLabel("18 Months");
		l10.setFont(f3);
		l10.setBounds(150, 370, 250, 25);
		f.add(l10);

		JLabel l10a = new JLabel("Pending");
		l10a.setFont(f3);
		l10a.setBounds(600, 370, 150, 25);
		f.add(l10a);

		JLabel l11 = new JLabel("24 Months");
		l11.setFont(f3);
		l11.setBounds(150, 400, 250, 25);
		f.add(l11);

		JLabel l11a = new JLabel("Pending");
		l11a.setFont(f3);
		l11a.setBounds(600, 400, 150, 25);
		f.add(l11a);

		JButton b1 = new JButton("Back");
		b1.setFont(f3);
		b1.setBounds(400, 500, 150, 60);
		f.add(b1);

		String query = "";
		try {

			query = "select * from mother.child_data  where reg like " + "'" + args[1] + "'";
		} catch (Exception e21) {
			System.out.println(e21.getMessage());
		}

		try {
			Connection con = getConnection();
			Statement stmt1 = con.createStatement();
			String query1 = query;
			ResultSet rs = stmt1.executeQuery(query1);

			while (rs.next()) {

				l1a.setText(rs.getString("cname"));
				l2a.setText(rs.getString("dob"));
			}

		} catch (Exception e12) {
			System.out.println(e12.getMessage());
		}

		String query2 = "";
		try {

			query2 = "select * from mother.vacci_data  where reg like " + "'" + args[1] + "'";
		} catch (Exception e21) {
			System.out.println(e21.getMessage());
		}

		try {
			Connection con = getConnection();
			Statement stmt1 = con.createStatement();
			String query1 = query2;
			ResultSet rs = stmt1.executeQuery(query1);

			String t = "true";

			while (rs.next()) {

				if (t.equals(rs.getString("v1"))) {

					l4a.setText("completed");
				}
				if (t.equals(rs.getString("v2"))) {

					l5a.setText("completed");
				}
				if (t.equals(rs.getString("v3"))) {
					l6a.setText("completed");
				}
				if (t.equals(rs.getString("v4"))) {
					l7a.setText("completed");
				}
				if (t.equals(rs.getString("v5"))) {
					l8a.setText("completed");
				}
				if (t.equals(rs.getString("v6"))) {
					l9a.setText("completed");
				}
				if (t.equals(rs.getString("v7"))) {
					l10a.setText("completed");
				}
				if (t.equals(rs.getString("v8"))) {
					l11a.setText("completed");
				}

			}

		} catch (Exception e12) {
			System.out.println(e12.getMessage());
		}

		// button working code
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e11) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				id10.main(ar);
			}
		});

		f.setVisible(true);

	}// end of main function

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