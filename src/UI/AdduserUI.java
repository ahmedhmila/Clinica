package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

import Patient.User;

import dao.IGestionUser;

import dao.UImpl;


public class AdduserUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel Nom=new JLabel("Nom              ");
	public static JTextField SNom=new JTextField(20);
	
	JLabel Prenom=new JLabel("Prenom           ");
	JTextField SPrenom=new JTextField(20);
	
	JLabel CodeEmp=new JLabel("Votre CodeEmp   ");
	JTextField SCodeEmp=new JTextField(20);
	IGestionUser action=new UImpl();

	
	JLabel mdp =new JLabel("Code :               ");
	JPasswordField SPass=new JPasswordField(20);
	
	
	ImageIcon image= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/HOS2.png").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));

	JLabel img =new JLabel(image);
	JButton Confirmer= new JButton("Confirmer !");
	JButton Annuler= new JButton("Annuler");
	
	JPanel P1 =new JPanel (new BorderLayout());
	JPanel P2 =new JPanel (new FlowLayout());
	JPanel P3 =new JPanel (new FlowLayout());
	JPanel P4 =new JPanel (new GridLayout(4,1));
	JPanel P5 =new JPanel (new FlowLayout());
	JPanel P6 =new JPanel (new FlowLayout());
	JPanel P7 =new JPanel (new FlowLayout());
	public AdduserUI() {
		this.setTitle("Inscription Employé");
		this.add(P1);
		 Annuler.addActionListener(e->{SNom.setText("");
		  SPrenom.setText("");
		  SPass.setText("");
		  SCodeEmp.setText("");
		
		  });
		 Confirmer.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseEntered(java.awt.event.MouseEvent evt) {
	            	Confirmer.setBackground(Color.GREEN);            }

	            public void mouseExited(java.awt.event.MouseEvent evt) {
	            	Confirmer.setBackground(UIManager.getColor("control"));
	            }
	        });
		 Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseEntered(java.awt.event.MouseEvent evt) {
	            	Annuler.setBackground(Color.PINK);            }

	            public void mouseExited(java.awt.event.MouseEvent evt) {
	            	Annuler.setBackground(UIManager.getColor("control"));
	            }
	        });
		
		P2.add(Nom);
		P2.add(SNom);
		
		
		P3.add(mdp);
		P3.add(SPass);
		
		
		P6.add(Prenom);
		P6.add(SPrenom);
		
		P7.add(CodeEmp);
		P7.add(SCodeEmp);
		
		P4.add(P2);
		P4.add(P6);
		P4.add(P7);

		P4.add(P3);
		
		P5.add(Confirmer);
		P5.add(Annuler);
		P1.add(img,BorderLayout.NORTH);
		P1.add(P4,BorderLayout.CENTER);
		P1.add(P5,BorderLayout.SOUTH);
		

		
		 Annuler.addActionListener(e->{SNom.setText("");
		  SPass.setText("");
			
		  });
		    
		  
		
		       
		   
			  Confirmer.addActionListener(e->{
				  String Nom=SNom.getText();
				  String prenom=SPrenom.getText();
				  String CodeEmp=SCodeEmp.getText();
				  @SuppressWarnings("deprecation")
				String mdp=SPass.getText();
				
				  if(Nom.equals("")||prenom.equals("")||CodeEmp.equals("") || mdp.equals(""))
					  JOptionPane.showMessageDialog(this,"Erreur de saisie vous avez oublié un ou plusieurs champs vide(s)");
				  else {User et=new User(Nom,prenom,CodeEmp,mdp);
				  
				  
					try {
						action.ajouter(et);
						Confirmer.setBackground(Color.green);
						  new Login();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
					}
				  
			  });
			  
			 
		
		
		 P1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Incription Administration"));
		 Color c=new Color(250,232,202);
		P1.setBackground(c);
		P2.setBackground(c);
		P3.setBackground(c);
		P5.setBackground(c);
		P6.setBackground(c);
		P7.setBackground(c);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);  
	
		ImageIcon image2= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/HOS2.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
				setIconImage(image2.getImage());
	}
	
	public static void main(String[] args) {
		 new AdduserUI();
		}


	

}

