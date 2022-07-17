package bms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 946, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewDonor = new JButton(" Donor Logins");
		btnNewDonor.setBackground(Color.LIGHT_GRAY);
		btnNewDonor.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnNewDonor.setForeground(Color.BLACK);
		btnNewDonor.setBounds(601, 86, 246, 34);
		btnNewDonor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewDonor.main(new String[] {});
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewDonor);

		JButton btnSearchDonor = new JButton("View Donor Details");
		btnSearchDonor.setForeground(Color.BLACK);
		btnSearchDonor.setBackground(Color.LIGHT_GRAY);
		btnSearchDonor.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnSearchDonor.setBounds(599, 149, 248, 32);
		btnSearchDonor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchDonor.main(new String[] {});
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnSearchDonor);

		JButton btnSellDonor = new JButton("Buyer Logins");
		btnSellDonor.setBackground(Color.LIGHT_GRAY);
		btnSellDonor.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnSellDonor.setForeground(Color.BLACK);
		btnSellDonor.setBounds(601, 206, 246, 34);
		btnSellDonor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SellBlood.main(new String[] {});
				frame.dispose();
			}
		});

		frame.getContentPane().add(btnSellDonor);

		JButton btnSearchBuyer = new JButton("View Buyer Details");
		btnSearchBuyer.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnSearchBuyer.setBackground(Color.LIGHT_GRAY);
		btnSearchBuyer.setForeground(Color.BLACK);
		btnSearchBuyer.setBounds(601, 272, 246, 33);

		btnSearchBuyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchBuyer.main(new String[] {});
				frame.dispose();
			}
		});

		frame.getContentPane().add(btnSearchBuyer);

		JButton btnNoOfSearch = new JButton("View Available Blood Packets");
		btnNoOfSearch.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnNoOfSearch.setBackground(Color.LIGHT_GRAY);
		btnNoOfSearch.setForeground(Color.BLACK);
		btnNoOfSearch.setBounds(601, 508, 246, 36);
		btnNoOfSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchpacket.main(new String[] {});
				frame.dispose();
			}
		});

		frame.getContentPane().add(btnNoOfSearch);

		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(675, 555, 123, 34);
		frame.getContentPane().add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginpage.main(new String[] {});
				frame.dispose();
			}
		});

		JLabel lblBloodManagmentSystem = new JLabel("Blood_Bank_Managment_System");
		lblBloodManagmentSystem.setBackground(Color.BLACK);
		lblBloodManagmentSystem.setForeground(Color.RED);
		lblBloodManagmentSystem.setFont(new Font("Tempus Sans ITC", Font.BOLD, 36));
		lblBloodManagmentSystem.setBounds(490, 11, 468, 68);
		frame.getContentPane().add(lblBloodManagmentSystem);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(homepage.class.getResource("/images/_20190723_082941.JPG")));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(10, 11, 552, 558);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Doctor Logins");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnNewButton.setBounds(601, 331, 246, 34);
		frame.getContentPane().add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewdoctordetails.main(new String[] {});
				frame.dispose();
			}
		});

		JButton btnViewDoctorDetails = new JButton("View Doctor Details");
		btnViewDoctorDetails.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnViewDoctorDetails.setBackground(Color.LIGHT_GRAY);
		btnViewDoctorDetails.setForeground(Color.BLACK);
		btnViewDoctorDetails.setBounds(601, 389, 246, 34);
		frame.getContentPane().add(btnViewDoctorDetails);

		JButton btnBloodPacketsDetails = new JButton("Blood Packets Details");
		btnBloodPacketsDetails.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnBloodPacketsDetails.setBackground(Color.LIGHT_GRAY);
		btnBloodPacketsDetails.setForeground(Color.BLACK);
		btnBloodPacketsDetails.setBounds(601, 450, 246, 34);
		frame.getContentPane().add(btnBloodPacketsDetails);
		btnBloodPacketsDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				noofpackets.main(new String[] {});
				frame.dispose();

			}
		});

		btnViewDoctorDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				viewdoctor.main(new String[] {});
				frame.dispose();

				JButton btnNoOfBlood = new JButton("No. of Blood Packets Available");
				btnNoOfBlood.setBackground(Color.LIGHT_GRAY);
				btnNoOfBlood.setForeground(Color.BLACK);
				btnNoOfBlood.setFont(new Font("Times New Roman", Font.BOLD, 15));
				btnNoOfBlood.setBounds(601, 449, 246, 34);
				frame.getContentPane().add(btnNoOfBlood);

				btnNoOfBlood.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						searchpacket.main(new String[] {});
						frame.dispose();

					}
				});

			}
		});
	}
}