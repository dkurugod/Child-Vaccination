
/* About */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class id9 {
	public static void main(String args[]) {
		JFrame jf = new JFrame("About");
		jf.setBounds(250, 30, 1000, 700);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ImageIcon im2 = new ImageIcon("images//id2.png");
		ImageIcon im1 = new ImageIcon("images//mother2.jpg");
		jf.setContentPane(new JLabel(im1));

		Font f1 = new Font("Algerian", Font.BOLD, 50);

		JLabel l1 = new JLabel("E-HEALTHCARE VACCINATION SYSTEM");
		l1.setFont(f1);
		jf.add(l1);
		l1.setBounds(10, 70, 1000, 35);

		/*
		 * JLabel l2 = new JLabel(im2); jf.add(l2); l2.setBounds(0,0,300,200);
		 */

		JLabel l3 = new JLabel("overview:-");
		jf.add(l3);
		l3.setFont(new Font("Algerian", Font.BOLD, 25));
		l3.setBounds(10, 205, 200, 25);

		JLabel l4 = new JLabel("1. The National Advisory Committee on Immunization (NACI), an ");

		jf.add(l4);
		l4.setFont(new Font("Algerian", Font.BOLD, 25));
		l4.setBounds(10, 235, 1000, 25);

		JLabel l5 = new JLabel("advisory body to the Public Health Agency of Canada, makes ");
		jf.add(l5);
		l5.setFont(new Font("Algerian", Font.BOLD, 25));
		l5.setBounds(10, 260, 1000, 25);

		JLabel l6 = new JLabel("recommendations for the use of vaccines currently or  ");
		jf.add(l6);
		l6.setFont(new Font("Algerian", Font.BOLD, 25));
		l6.setBounds(10, 285, 1000, 25);

		JLabel l7 = new JLabel("newly approved for use in humans in Canada.");
		jf.add(l7);
		l7.setFont(new Font("Algerian", Font.BOLD, 25));
		l7.setBounds(10, 310, 1000, 25);

		JLabel l8 = new JLabel("2. Individuals are encouraged to talk to their ");
		jf.add(l8);
		l8.setFont(new Font("Algerian", Font.BOLD, 25));
		l8.setBounds(10, 335, 1000, 25);

		JLabel l9 = new JLabel(" health care provider about recommended immunizations.");
		jf.add(l9);
		l9.setFont(new Font("Algerian", Font.BOLD, 25));
		l9.setBounds(10, 360, 1000, 25);

		JLabel l10 = new JLabel("a. Canada's Provincial and Territorial Routine (and Catch-up)");
		jf.add(l10);
		l10.setFont(new Font("Algerian", Font.BOLD, 25));
		l10.setBounds(10, 385, 1000, 25);

		JLabel l11 = new JLabel("Vaccination Programs for Infants and Children");
		jf.add(l11);
		l11.setFont(new Font("Algerian", Font.BOLD, 25));
		l11.setBounds(10, 410, 1000, 25);

		JLabel l12 = new JLabel("b. Canada's Provincial and Territorial Routine Vaccination Programs");
		jf.add(l12);
		l12.setFont(new Font("Algerian", Font.BOLD, 25));
		l12.setBounds(10, 435, 1000, 25);

		JLabel l13 = new JLabel("for Healthy, Previously Immunized Adults (Aged 18 years and older)");
		jf.add(l13);
		l13.setFont(new Font("Algerian", Font.BOLD, 25));
		l13.setBounds(10, 460, 1000, 25);

		JLabel l14 = new JLabel("c. Public funding for Annual Influenza Vaccination");
		jf.add(l14);
		l14.setFont(new Font("Algerian", Font.BOLD, 25));
		l14.setBounds(10, 485, 1000, 25);

		JButton b1 = new JButton("Back");
		jf.add(b1);
		b1.setFont(new Font("Algerian", Font.BOLD, 25));
		b1.setBounds(400, 520, 130, 40);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ar[] = new String[] { args[0] };
				jf.dispose();
				id4.main(ar);

			}
		});

		/* About */

		jf.setVisible(true);
	}
}