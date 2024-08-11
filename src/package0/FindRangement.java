			package package0;


			import java.awt.EventQueue;
			import javax.swing.JFrame;
			import javax.swing.JPanel;
			import javax.swing.border.EmptyBorder;
			import javax.swing.JTable;
			import java.awt.FlowLayout;
			import javax.swing.table.DefaultTableModel;
			import java.awt.BorderLayout;
			import javax.swing.JLabel;
		import javax.swing.JOptionPane;

		import java.awt.Font;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;

		import javax.swing.JTextField;
			import javax.swing.JButton;
			import javax.swing.JScrollPane;

			public class FindRangement extends JFrame {
				private static JTextField textField;
				private JTable table;
				static RangementDAO c = null;
				static  DBMSConnection db = new DBMSConnection();


							/**
							 * Create the frame.
							 */
							
							public FindRangement() {
								setVisible(true);
								setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								setBounds(100, 100, 450, 400);
								getContentPane().setLayout(null);
								
								JPanel panel = new JPanel();
								panel.setBounds(0, 0, 798, 373);
								getContentPane().add(panel);
								panel.setLayout(null);
								
								JLabel lblNewLabel = new JLabel("Ref Rangement");
								lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
								lblNewLabel.setBounds(27, 150, 147, 28);
								panel.add(lblNewLabel);
								
								
								textField = new JTextField();
								textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
								textField.setBounds(170, 150, 191, 28);
								panel.add(textField);
								textField.setColumns(10);
								
								JLabel lblNewLabel_1 = new JLabel("Find Rangement");
								lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
								lblNewLabel_1.setBounds(53, 11, 350, 43);
								panel.add(lblNewLabel_1);
								
								JButton b = new JButton("Exit");
								b.setBounds(300,250 , 89, 23);
								panel.add(b);
								b.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										Object q=e.getSource();
										JButton r=(JButton)q;
										if(r==b) {
											setVisible(false);
										}}});
								
								JButton btnNewButton = new JButton("Find");
								btnNewButton.setBounds(179, 250, 89, 23);
								panel.add(btnNewButton);
								
								btnNewButton.addActionListener(new ActionListener() {
									@Override
									public void actionPerformed(ActionEvent e) {
										Object q=e.getSource();
										JButton r=(JButton)q;
										if(r==btnNewButton) {
											FindRangementTable fr = new FindRangementTable();
											setVisible(false);
										}
									}});
								
								
			
								
							}
							public static String [][] tt() {
								try {
									 c = new  RangementDAO(db.getConnection());
								} catch (ClassNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								String t1= textField.getText();
								Rangement com = c.find(t1);
								String r1 = com.getRefRangement();
								String r2 = com.getNomRangement();
								String[][] ss= {{r1,r2}};
								return ss;
							}
						}

