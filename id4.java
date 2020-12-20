
/* Menu page*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class id4 {
	public static void main(String args[]) {
		JFrame f = new JFrame("E-HEALTHCARE VACCINATION SYSTEM");

		ImageIcon im1 = new ImageIcon("images//mother2.jpg");
		f.setContentPane(new JLabel(im1));

		f.setVisible(true);
		f.setBounds(250, 30, 1000, 700);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font f2 = new Font("Adobe Caslon Pro", Font.BOLD, 40);
		Font f1 = new Font("Algerian", Font.BOLD, 50);

		JLabel l1 = new JLabel("E-HEALTHCARE VACCINATION SYSTEM");
		l1.setFont(f1);
		f.add(l1);
		l1.setBounds(0, 30, 1000, 50);

		JButton b1 = new JButton("Child Registartion");
		b1.setFont(f2);
		f.add(b1);
		b1.setBounds(5, 130, 400, 60);

		JButton b2 = new JButton("Vaccination Schedule");
		b2.setFont(f2);
		f.add(b2);
		b2.setBounds(450, 130, 500, 60);

		JButton b3 = new JButton("Child Information");
		b3.setFont(f2);
		f.add(b3);
		b3.setBounds(5, 260, 400, 60);

		JButton b4 = new JButton("Parent Details");
		b4.setFont(f2);
		f.add(b4);
		b4.setBounds(450, 260, 500, 60);

		JButton b5 = new JButton("Change Password");
		b5.setFont(f2);
		f.add(b5);
		b5.setBounds(5, 390, 400, 60);

		JButton b6 = new JButton("About");
		b6.setFont(f2);
		f.add(b6);
		b6.setBounds(450, 390, 500, 60);

		JButton b7 = new JButton("Logout");
		b7.setFont(f2);
		f.add(b7);
		b7.setBounds(320, 490, 300, 60);

		// button working code
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = new String[] { "hallo" };
				f.dispose();
				try {
					id1.main(args);
				} catch (Exception e12) {
				}
			}
		});

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				try {
					id6.main(args);
				} catch (Exception e12) {
				}
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				id11.main(ar);
			}
		});

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				id3.main(ar);
			}
		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				id10.main(ar);
			}
		});

		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				id8.main(ar);
			}
		});

		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ar = new String[] { args[0] };
				f.dispose();
				id9.main(ar);
			}
		});

		/* Menu page */

	}
}