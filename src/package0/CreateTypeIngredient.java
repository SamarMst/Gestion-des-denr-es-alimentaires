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



public class CreateTypeIngredient extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	TypeIngredientDAO ty = null;

		
			/**
			 * Create the frame.
			 */
			public CreateTypeIngredient() {
				setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 450, 400);
				getContentPane().setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 798, 373);
				getContentPane().add(panel);
				panel.setLayout(null);
				
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
				
				JLabel lblNewLabel = new JLabel("Ref Type Ingredient");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel.setBounds(27, 100, 164, 28);
				panel.add(lblNewLabel);
				
				JLabel lblNomRangement = new JLabel("Nom Type Ingredient");
				lblNomRangement.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNomRangement.setBounds(13, 154, 178, 28);
				panel.add(lblNomRangement);
				
				textField = new JTextField();
				textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField.setBounds(204, 100, 191, 28);
				panel.add(textField);
				textField.setColumns(10);
				
				textField_1 = new JTextField();
				textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				textField_1.setColumns(10);
				textField_1.setBounds(204, 154, 191, 28);
				panel.add(textField_1);
				
				
				JLabel lblNewLabel_1 = new JLabel("Créer Type Ingredient");
				lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
				lblNewLabel_1.setBounds(53, 11, 300, 43);
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
						TypeIngredient w=new TypeIngredient(t1,t2);
						try {
							 ty = new  TypeIngredientDAO(db.getConnection());
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						ty.create(w);
						JOptionPane.showMessageDialog(null, "Ajout avec Succes !","Creation Type Ingredient",JOptionPane.INFORMATION_MESSAGE);
						setVisible(false);
					}
					
					
				}});
				
			}
		}
