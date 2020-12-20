
/*Vaccination Schedule form*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class id5 {

	public static void main(String args[]) {
		JFrame jf = new JFrame("Vaccination Schedule");
		ImageIcon im1 = new ImageIcon("images//mother2.jpg");

		jf.setContentPane(new JLabel(im1));
		jf.setBounds(250, 30, 1000, 700);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font f2 = new Font("Algerian", Font.BOLD, 40);
		Font f1 = new Font("Adobe Caslon Pro", Font.BOLD, 20);
		Font f3 = new Font("Algerian", Font.BOLD, 25);

		JLabel l1 = new JLabel("Vaccination Schedule");
		l1.setFont(f2);
		l1.setBounds(300, 10, 500, 40);
		jf.add(l1);

		JLabel l2 = new JLabel("At Birth");
		l2.setFont(f3);
		l2.setBounds(20, 60, 150, 25);
		jf.add(l2);

		JRadioButton rb1 = new JRadioButton("BCG");
		rb1.setFont(f1);
		rb1.setBounds(170, 65, 100, 20);
		jf.add(rb1);

		JRadioButton rb2 = new JRadioButton("HBV1");
		rb2.setFont(f1);
		rb2.setBounds(290, 65, 100, 20);
		jf.add(rb2);

		/*
		 * JRadioButton rb3 = new JRadioButton("HEB B*"); rb3.setFont(f1);
		 * rb3.setBounds(410,65,100,20); jf.add(rb3);
		 */

		JLabel l3 = new JLabel("2 Months");
		l3.setFont(f3);
		l3.setBounds(20, 90, 160, 25);
		jf.add(l3);

		JRadioButton rb3 = new JRadioButton("Hexa1 (HBV, DTaP, HiB, IPV)");
		rb3.setFont(f1);
		rb3.setBounds(170, 95, 300, 20);
		jf.add(rb3);

		JRadioButton rb4 = new JRadioButton("Rota1");
		rb4.setFont(f1);
		rb4.setBounds(490, 95, 100, 20);
		jf.add(rb4);

		JRadioButton rb5 = new JRadioButton("PCV1");
		rb5.setFont(f1);
		rb5.setBounds(610, 95, 100, 20);
		jf.add(rb5);

		JLabel l4 = new JLabel("4 Months");
		l4.setFont(f3);
		l4.setBounds(10, 120, 200, 25);
		jf.add(l4);

		JRadioButton rb6 = new JRadioButton("Hexa2 (HBV, DTaP, HiB, IPV)");
		rb6.setFont(f1);
		rb6.setBounds(170, 125, 300, 20);
		jf.add(rb6);

		JRadioButton rb7 = new JRadioButton("Rota2*");
		rb7.setFont(f1);
		rb7.setBounds(490, 125, 100, 20);
		jf.add(rb7);

		JRadioButton rb8 = new JRadioButton("PCV2");
		rb8.setFont(f1);
		rb8.setBounds(610, 125, 100, 20);
		jf.add(rb8);

		JLabel l5 = new JLabel("6 Months");
		l5.setFont(f3);
		l5.setBounds(10, 150, 200, 25);
		jf.add(l5);

		JRadioButton rb9 = new JRadioButton("Hexa3 (HBV, DTaP, HiB, IPV)");
		rb9.setFont(f1);
		rb9.setBounds(170, 155, 300, 20);
		jf.add(rb9);

		JRadioButton rb10 = new JRadioButton("Rota3");
		rb10.setFont(f1);
		rb10.setBounds(490, 155, 100, 20);
		jf.add(rb10);

		JRadioButton rb11 = new JRadioButton("PCV3");
		rb11.setFont(f1);
		rb11.setBounds(610, 155, 100, 20);
		jf.add(rb11);

		/*
		 * JRadioButton rb13 = new JRadioButton("HEP B*"); rb13.setFont(f1);
		 * rb13.setBounds(530,155,100,20); jf.add(rb13);
		 */

		JLabel l6 = new JLabel("9 Months");
		l6.setFont(f3);
		l6.setBounds(10, 180, 200, 25);
		jf.add(l6);

		JRadioButton rb12 = new JRadioButton("Measles");
		rb12.setFont(f1);
		rb12.setBounds(210, 185, 110, 20);
		jf.add(rb12);

		JRadioButton rb13 = new JRadioButton("MCV1");
		rb13.setFont(f1);
		rb13.setBounds(330, 185, 90, 20);
		jf.add(rb13);

		/*
		 * JRadioButton rb16 = new JRadioButton("JE**"); rb16.setFont(f1);
		 * rb16.setBounds(510,185,60,20); jf.add(rb16);
		 */

		JLabel l7 = new JLabel("12 Months");
		l7.setFont(f3);
		l7.setBounds(10, 210, 200, 25);
		jf.add(l7);

		JRadioButton rb14 = new JRadioButton("OPV2");
		rb14.setFont(f1);
		rb14.setBounds(210, 210, 110, 20);
		jf.add(rb14);

		JRadioButton rb15 = new JRadioButton("MMR1");
		rb15.setFont(f1);
		rb15.setBounds(330, 210, 90, 20);
		jf.add(rb15);

		JRadioButton rb16 = new JRadioButton("PCV4");
		rb16.setFont(f1);
		rb16.setBounds(440, 210, 100, 20);
		jf.add(rb16);

		JRadioButton rb17 = new JRadioButton("MCV2");
		rb17.setFont(f1);
		rb17.setBounds(550, 210, 100, 20);
		jf.add(rb17);

		/*
		 * JRadioButton rb21 = new JRadioButton("DDT BOOSTER");
		 * rb21.setFont(f1); rb21.setBounds(770,210,180,20); jf.add(rb21);
		 */

		JLabel l8 = new JLabel("18 Months");
		l8.setFont(f3);
		l8.setBounds(10, 240, 200, 25);
		jf.add(l8);

		JRadioButton rb18 = new JRadioButton("OPV3");
		rb18.setFont(f1);
		rb18.setBounds(220, 240, 90, 20);
		jf.add(rb18);

		JRadioButton rb19 = new JRadioButton("DTaP");
		rb19.setFont(f1);
		rb19.setBounds(320, 240, 90, 20);
		jf.add(rb19);

		JRadioButton rb20 = new JRadioButton("Hib");
		rb20.setFont(f1);
		rb20.setBounds(420, 240, 90, 20);
		jf.add(rb20);

		JRadioButton rb21 = new JRadioButton("MMR2");
		rb21.setFont(f1);
		rb21.setBounds(520, 240, 90, 20);
		jf.add(rb21);

		JRadioButton rb22 = new JRadioButton("Varicella");
		rb22.setFont(f1);
		rb22.setBounds(620, 240, 120, 20);
		jf.add(rb22);

		JRadioButton rb23 = new JRadioButton("HAV1");
		rb23.setFont(f1);
		rb23.setBounds(750, 240, 100, 20);
		jf.add(rb23);

		JLabel l9 = new JLabel("24 Months");
		l9.setFont(f3);
		l9.setBounds(10, 270, 200, 25);
		jf.add(l9);

		JRadioButton rb24 = new JRadioButton("HAV2");
		rb24.setFont(f1);
		rb24.setBounds(210, 270, 90, 20);
		jf.add(rb24);

		JLabel l10 = new JLabel(
				"DTaP-IPV-Hib: Diphtheria, Tetanus, Pertussis (Whooping Cough), Polio, Haemophilus Influenzae type B (Hib)");
		l10.setBounds(0, 300, 1000, 20);
		jf.add(l10);

		JLabel l11 = new JLabel("Rota: Rotavirus");
		l11.setBounds(0, 320, 1000, 20);
		jf.add(l11);

		JLabel l12 = new JLabel("MMR: Measles, Mumps, Rubella");
		l12.setBounds(0, 340, 1000, 20);
		jf.add(l12);

		JLabel l13 = new JLabel("Var: Varicella (Chickenpox)");
		l13.setBounds(0, 360, 1000, 20);
		jf.add(l13);

		JLabel l14 = new JLabel("BCG: Bacille Calmette Guerin, OPV: Oral Polio Vaccine");
		l14.setBounds(0, 380, 1000, 20);
		jf.add(l14);

		JLabel l15 = new JLabel(
				"HBV: Hepatitis B vaccine, PCV: Pneumococcal conjugate vaccine, HAV: Hepatitis A vaccine");
		l15.setBounds(0, 400, 1000, 20);
		// l15.setFont(f2);
		jf.add(l15);

		JButton b1 = new JButton("Update Data");
		b1.setBounds(450, 550, 150, 50);
		b1.setFont(f1);
		jf.add(b1);

		JButton b2 = new JButton("Back");
		b2.setBounds(700, 550, 150, 50);
		b2.setFont(f1);
		jf.add(b2);

		JButton b3 = new JButton("Submit Data");
		b3.setBounds(250, 550, 150, 50);
		b3.setFont(f1);
		jf.add(b3);

		jf.setVisible(true);

		// button workig code

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = getConnection();
					Statement stmt = con.createStatement();

					// at birth
					if (rb1.isSelected() && rb2.isSelected()) {
						String query1 = "update mother.vacci_data set v1='true' where mname=" + "'" + args[0] + "'";
						String query = query1;
						int i = stmt.executeUpdate(query);
						if (i > 0) {
							JOptionPane.showMessageDialog(null, "Data is Updated");
						} else {
							JOptionPane.showMessageDialog(null, "Data is not Updated");
						}

					}

					// 6 week
					if (rb3.isSelected() && rb4.isSelected() && rb5.isSelected()) {
						String query1 = "update mother.vacci_data set v2='true' where mname=" + "'" + args[0] + "'";
						String query = query1;
						int i = stmt.executeUpdate(query);
						if (i > 0) {
							JOptionPane.showMessageDialog(null, "Data is Updated");
						} else {
							JOptionPane.showMessageDialog(null, "Data is not Updated");
						}
					}
					// 10 week
					if (rb6.isSelected() && rb7.isSelected() && rb8.isSelected()) {
						String query1 = "update mother.vacci_data set v3='true' where mname=" + "'" + args[0] + "'";
						String query = query1;
						int i = stmt.executeUpdate(query);
						if (i > 0) {
							JOptionPane.showMessageDialog(null, "Data is Updated");
						} else {
							JOptionPane.showMessageDialog(null, "Data is not Updated");
						}

					}
					// 14 week
					if (rb9.isSelected() && rb10.isSelected() && rb11.isSelected()) {
						String query1 = "update mother.vacci_data set v4='true' where mname=" + "'" + args[0] + "'";
						String query = query1;
						int i = stmt.executeUpdate(query);
						if (i > 0) {
							JOptionPane.showMessageDialog(null, "Data is Updated");
						} else {
							JOptionPane.showMessageDialog(null, "Data is not Updated");
						}
					}
					// 9 - 12 month
					if (rb12.isSelected() && rb13.isSelected()) {
						String query1 = "update mother.vacci_data set v5='true' where mname=" + "'" + args[0] + "'";
						String query = query1;
						int i = stmt.executeUpdate(query);
						if (i > 0) {
							JOptionPane.showMessageDialog(null, "Data is Updated");
						} else {
							JOptionPane.showMessageDialog(null, "Data is not Updated");
						}

					}
					// 16_24 month
					if (rb14.isSelected() && rb15.isSelected() && rb16.isSelected() && rb17.isSelected()) {
						String query1 = "update mother.vacci_data set v6='true' where mname=" + "'" + args[0] + "'";
						String query = query1;
						int i = stmt.executeUpdate(query);
						if (i > 0) {
							JOptionPane.showMessageDialog(null, "Data is Updated");
						} else {
							JOptionPane.showMessageDialog(null, "Data is not Updated");
						}

					}
					// 5-6 years
					if (rb18.isSelected() && rb19.isSelected() && rb20.isSelected() && rb21.isSelected()
							&& rb22.isSelected() && rb23.isSelected()) {
						String query1 = "update mother.vacci_data set v7='true' where mname=" + "'" + args[0] + "'";
						String query = query1;
						int i = stmt.executeUpdate(query);
						if (i > 0) {
							JOptionPane.showMessageDialog(null, "Data is Updated");
						} else {
							JOptionPane.showMessageDialog(null, "Data is not Updated");
						}

					}
					// 10 -16 years
					if (rb24.isSelected()) {
						String query1 = "update mother.vacci_data set v8='true' where mname=" + "'" + args[0] + "'";
						String query = query1;
						int i = stmt.executeUpdate(query);
						if (i > 0) {
							JOptionPane.showMessageDialog(null, "Data is Updated");
						} else {
							JOptionPane.showMessageDialog(null, "Data is not Updated");
						}

					}

				} // end of try
				catch (Exception e12) {
					System.out.println(e12.getMessage());
					// JOptionPane.showMessageDialog(null,e12);

				}

			}
		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = getConnection();
					String query = "insert into vacci_data values(?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement stmt = con.prepareStatement(query);

					stmt.setString(1, args[0]);

					// at birth
					if (rb1.isSelected() && rb2.isSelected()) {
						stmt.setString(2, "true");
					} else {
						stmt.setString(2, "false");
					}
					// 6 week
					if (rb3.isSelected() && rb4.isSelected() && rb5.isSelected()) {
						stmt.setString(3, "true");
					} else {
						stmt.setString(3, "false");
					}
					// 9-12 week
					if (rb6.isSelected() && rb7.isSelected() && rb8.isSelected()) {
						stmt.setString(4, "true");
					} else {
						stmt.setString(4, "false");
					}
					// 10 week
					if (rb9.isSelected() && rb10.isSelected() && rb11.isSelected()) {
						stmt.setString(5, "true");
					} else {
						stmt.setString(5, "false");
					}
					// 14 wwks
					if (rb12.isSelected() && rb13.isSelected()) {
						stmt.setString(6, "true");
					} else {
						stmt.setString(6, "false");
					}
					// 10-24 years
					if (rb14.isSelected() && rb15.isSelected() && rb16.isSelected() && rb17.isSelected()) {
						stmt.setString(7, "true");
					} else {
						stmt.setString(7, "false");
					}
					// 10-16
					if (rb18.isSelected() && rb19.isSelected() && rb20.isSelected() && rb21.isSelected()
							&& rb22.isSelected() && rb23.isSelected()) {
						stmt.setString(8, "true");
					} else {
						stmt.setString(8, "false");
					}
					// 10 -16
					if (rb24.isSelected()) {
						stmt.setString(9, "true");
					} else {
						stmt.setString(9, "false");
					}

					stmt.setString(10, args[1]);

					int i = stmt.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "Data is saved");
					} else {
						JOptionPane.showMessageDialog(null, "Data is not saved");
					}

				} // end of try
				catch (Exception e1) {
					System.out.println(e1.getMessage());
				}

			}
		});// end b1 coding

		/*
		 * rb1.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { //rb1.setSelected(true);
		 * JOptionPane.showMessageDialog(null, rb1.isSelected()); } });
		 */

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[] ar = new String[] { args[0] };
				jf.dispose();
				id11.main(ar);
			}
		});
	}

	/* Vaccination Schedule form */
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