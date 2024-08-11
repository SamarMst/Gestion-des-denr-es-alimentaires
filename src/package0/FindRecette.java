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



	public class FindRecette extends JFrame {
		
		static  JTextField textField_4;

		 static RecetteDAO rcd1=null;
		static  DBMSConnection db = new DBMSConnection();
					/**
					 * Create the frame.
					 */
					
					public FindRecette() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 400, 450);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 1015, 430);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setBounds(371, 63, 551, 300);

						JLabel lblNewLabel_1 = new JLabel("Find Recette");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 27));
						lblNewLabel_1.setBounds(53, 11, 215, 43);
						panel.add(lblNewLabel_1);
						
						JButton b = new JButton("Exit");
						b.setBounds(280, 291, 89, 23);
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
						btnNewButton.setBounds(179, 291, 89, 23);
						panel.add(btnNewButton);
					
						
			
						
						
						btnNewButton.addActionListener(new ActionListener() {
							

							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								if(r==btnNewButton) {
									FindRecetteTable fr = new FindRecetteTable();
									//JOptionPane.showMessageDialog(null, "Find avec Succes !","Find Recette",JOptionPane.INFORMATION_MESSAGE);
								setVisible(false);
								}
							}});
						
						textField_4 = new JTextField();
						textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_4.setColumns(10);
						textField_4.setBounds(153, 170, 191, 28);
						panel.add(textField_4);
						
						JLabel lblNomRangement_1_1_1 = new JLabel("Ref Recette");
						lblNomRangement_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNomRangement_1_1_1.setBounds(49, 170, 111, 28);
						panel.add(lblNomRangement_1_1_1);
						
						
							
						}
						public static String [][] tt() {
							try {
								 rcd1 = new  RecetteDAO(db.getConnection());
							} catch (ClassNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							String t1=textField_4.getText();
							Recette w=	rcd1.find(t1);
							String t2=w.getRefRecette();
							String t3=w.getNomRecette();
							String t4=w.getDescriptifRecette();
							String t5=String.valueOf(w.getCaloriesRecette());
							String t6=w.getDifficulte();
							String t7=String.valueOf(w.getTempsCuisson());
							String t8=String.valueOf(w.getTempsPreparation());
							String t9=String.valueOf(w.getNbPersonnes());
							String[][] ss= {{t2,t3,t4,t5,t6,t7,t8,t9}};
							return ss;
						}
					}
	
				

