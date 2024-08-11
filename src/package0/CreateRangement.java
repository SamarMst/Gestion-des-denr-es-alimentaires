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



		public class CreateRangement extends JFrame {
			private JTextField textField;
			private JTextField textField_1;
			RangementDAO ran = null;
			

			/**
			 * Create the frame.
			 */
			
			public CreateRangement() {
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
				lblNewLabel.setBounds(27, 100, 147, 28);
				panel.add(lblNewLabel);
				
				JButton b = new JButton("Exit");
				b.setBounds(280, 239, 89, 23);
				panel.add(b);
				b.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Object q=e.getSource();
						JButton r=(JButton)q;
						if(r==b) {
							setVisible(false);
						}}});
				
				JLabel lblNomRangement = new JLabel("Nom Rangement");
				lblNomRangement.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNomRangement.setBounds(27, 154, 147, 28);
				panel.add(lblNomRangement);
				
				textField = new JTextField();
				textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField.setBounds(170, 102, 191, 28);
				panel.add(textField);
				textField.setColumns(10);
				
				textField_1 = new JTextField();
				textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_1.setColumns(10);
				textField_1.setBounds(170, 160, 191, 28);
				panel.add(textField_1);
				
				
				JLabel lblNewLabel_1 = new JLabel("Créer Rangement");
				lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
				lblNewLabel_1.setBounds(53, 11, 215, 43);
				panel.add(lblNewLabel_1);
				
				JButton btnNewButton = new JButton("Ajouter");
				btnNewButton.setBounds(179, 239, 89, 23);
				panel.add(btnNewButton);
				btnNewButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					DBMSConnection db = new DBMSConnection();
					Object q=e.getSource();
					String t1=textField.getText();
					String t2=textField_1.getText();
					JButton r=(JButton)q;
					if(r==btnNewButton) {
						Rangement w=new Rangement(t1,t2);
						try {
							 ran = new  RangementDAO(db.getConnection());
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						ran.create(w);
						JOptionPane.showMessageDialog(null, "Ajout avec Succes !","Creation Rangement",JOptionPane.INFORMATION_MESSAGE);
						setVisible(false);
					}
					
					
				}});
				
				
				
				
			}
		}
