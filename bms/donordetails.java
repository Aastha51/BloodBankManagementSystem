package bms;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class donordetails {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					donordetails window = new donordetails();
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
	public donordetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		table = new JTable();
		table.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null }, },
				new String[] { "DonorNo", "DonorName", "BloodGroup", "Sex", "Age", "City", "Country", "Mobile",
						"Date" }));
		table.getColumnModel().getColumn(5).setResizable(false);
		table.setBounds(46, 39, 395, 1211);
		frame.getContentPane().add(table);

		JLabel lblNewLabel = new JLabel("click yes to view Donor Details-");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel.setBounds(64, 11, 225, 31);
		frame.getContentPane().add(lblNewLabel);

		JButton btnYes = new JButton("yes");
		btnYes.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.sql.Connection con = bms.dbConnectionClass.getConnection();

				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from donordetails");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnYes.setBackground(Color.RED);
		btnYes.setForeground(Color.WHITE);
		btnYes.setBounds(278, 16, 89, 23);
		frame.getContentPane().add(btnYes);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnCancel) {

					homepage.main(new String[] {});
					frame.dispose();
				}

			}
		});

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 53, 414, 197);
		frame.getContentPane().add(scrollPane);

		btnCancel.setBackground(Color.RED);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnCancel.setBounds(278, 314, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblSearchDonorname = new JLabel("Search DonorName:");
		lblSearchDonorname.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblSearchDonorname.setBounds(20, 261, 152, 14);
		frame.getContentPane().add(lblSearchDonorname);

		textField = new JTextField();
		textField.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		textField.setBounds(147, 261, 118, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root",
							"root1");
					String sql = "select * from donordetails where DonorName=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnSearch, "null", "not", 0);
				}
			}
		});

		btnSearch.setBackground(Color.RED);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnSearch.setBounds(87, 315, 89, 23);
		frame.getContentPane().add(btnSearch);

	}
}
