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
			import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
			import java.util.Collection;

			import javax.swing.JTextField;
			import javax.swing.JButton;
			import javax.swing.JScrollPane;



			public class FindAllRangement extends JFrame {
				private JTable table;
				private DefaultTableModel model;
				private RangementDAO ran=null;
				private  DBMSConnection db1 = new DBMSConnection();
				
				//static String[][] ss;
				String[][] zz;
							/**
							 * Create the frame.
							 */
							
							public FindAllRangement() {
								setVisible(true);
								setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								setBounds(100, 100, 850, 450);
								getContentPane().setLayout(null);
								
								JPanel panel = new JPanel();
								panel.setBounds(0, 0, 1015, 430);
								getContentPane().add(panel);
								panel.setLayout(null);
								
								JScrollPane scrollPane = new JScrollPane();
								scrollPane.setBounds(63, 65, 683, 300);

								String[]ee ={"Ref Rangement", "Nom Rangement"};								
								panel.add(scrollPane);
								
								String ss[][]= new String[50][2];
								try {
										ran = new  RangementDAO(db1.getConnection());
								ArrayList <Rangement> w = ran.findAll();
								
								for(int k=0;k<w.size();k++) {
								String t2=w.get(k).getRefRangement();
								String t3=w.get(k).getNomRangement();
								String[] aa=new String[] {t2,t3};
								ss[k]=aa;
								}
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								 table = new JTable(ss,ee);
							
								scrollPane.setViewportView(table);
									JLabel lblNewLabel_1 = new JLabel("Find All Rangement");
									lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 27));
									lblNewLabel_1.setBounds(53, 11, 300, 43);
									panel.add(lblNewLabel_1);
									
									JButton btnNewButton = new JButton("Exit");
									btnNewButton.setBounds(179, 380, 89, 23);
									panel.add(btnNewButton);
									btnNewButton.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(ActionEvent e) {
											Object q=e.getSource();
											JButton r=(JButton)q;
											if(r==btnNewButton) {
												setVisible(false);
											}}});
							
							}
				
							
			}		
				
