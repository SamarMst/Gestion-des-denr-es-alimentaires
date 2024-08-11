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



	public class FindAllProduit extends JFrame {
		private JTable table;
		private DefaultTableModel model;
		private CompositionDAO rcd77=null;
		private  DBMSConnection db1 = new DBMSConnection();
		String[][] zz;
					/**
					 * Create the frame.
					 */
					
					public FindAllProduit() {
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

						String[]ee ={"Ref Produit", "DescriptifProduit", "DatePeremption", "QuantiteProduit","PrixProduit","Ref Rangement","Ref Ingredient"};

						
						panel.add(scrollPane);
						
						String ss[][]= new String[68][7];
						ProduitDAO p = null;
						RangementDAO ra = null;
						IngredientDAO in = null;
						DBMSConnection db = new DBMSConnection();
						try {
							 p = new  ProduitDAO(db.getConnection());
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							 ra = new  RangementDAO(db.getConnection());
						} catch (ClassNotFoundException ee1) {
							// TODO Auto-generated catch block
							ee1.printStackTrace();
						}
						try {
							 in = new  IngredientDAO(db.getConnection());
						} catch (ClassNotFoundException eee1) {
							// TODO Auto-generated catch block
							eee1.printStackTrace();
						}
						ArrayList <Produit> w=	p.findAll();
						
						for(int k=0;k<w.size();k++) {
						String t2=w.get(k).getRefProduit();
						String t3=w.get(k).getDescriptifProduit();
						String t4=w.get(k).getDatePeremption();
						String t5=String.valueOf(w.get(k).getQuantiteProduit());
						String t6=String.valueOf(w.get(k).getPrixProduit());
						String t7 = w.get(k).getRefRangement1().getRefRangement();
						String t8 = w.get(k).getRefIngredient().getRefIngredient();
						String[] aa=new String[] {t2,t3,t4,t5,t6,t7,t8};
						ss[k]=aa;
						}
						 table = new JTable(ss,ee);
					
						scrollPane.setViewportView(table);
							JLabel lblNewLabel_1 = new JLabel("Find All Produit");
							lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 27));
							lblNewLabel_1.setBounds(53, 11, 250, 43);
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
		
