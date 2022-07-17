package bms;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class buyerdetails {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/*
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buyerdetails window = new buyerdetails();
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
	public buyerdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 621, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		table = new JTable();
		table.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, },
				new String[] { "no", "name", "Address", "Mobile", "Date", "BloodGroup", "Gender" }) {
			boolean[] columnEditables = new boolean[] { true, true, true, true, false, true, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(10, -466, 593, 1280);
		frame.getContentPane().add(table, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 53, 584, 190);
		frame.getContentPane().add(scrollPane);

		JLabel lblNewLabel = new JLabel("click yes to view buyer Details-");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(64, 11, 241, 31);
		frame.getContentPane().add(lblNewLabel);

		JButton btnYes = new JButton("yes");
		btnYes.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.sql.Connection con = dbConnectionClass.getConnection();

				try {
					java.sql.Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from buyerdetails");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnYes.setBackground(Color.RED);
		btnYes.setForeground(Color.WHITE);
		btnYes.setBounds(315, 16, 89, 23);
		frame.getContentPane().add(btnYes);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnCancel.setBackground(Color.RED);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBounds(278, 311, 89, 23);
		frame.getContentPane().add(btnCancel);

		JLabel lblSearchName = new JLabel("Search name:");
		lblSearchName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblSearchName.setBounds(10, 276, 111, 14);
		frame.getContentPane().add(lblSearchName);

		textField = new JTextField();
		textField.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		textField.setBounds(101, 273, 111, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent g) {
				if (g.getSource() == btnCancel) {

					homepage.main(new String[] {});
					frame.dispose();
				}

			}
		});

		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(Color.RED);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnSearch.setBounds(87, 311, 89, 23);
		frame.getContentPane().add(btnSearch);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 95, 30, -24);
		frame.getContentPane().add(scrollPane_1);

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root",
							"root1");
					String sql = "select * from buyerdetails where name=?";
					java.sql.PreparedStatement pdt = con.prepareStatement(sql);
					pdt.setString(1, textField.getText());
					ResultSet rs = pdt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(btnSearch, "null", "not", 0);
				}
			}
		});

	}
}
