package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.sql.Connection;

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

import dao.IGestionUser;
import dao.SingletonConnection;
import dao.UImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection cx =SingletonConnection.getInstance();
	
	JLabel Nom=new JLabel("Code Employe");
	JTextField SNom=new JTextField(20);
	
	JLabel mdp =new JLabel("Mot de passe :");
	JPasswordField SPass=new JPasswordField(20);
	IGestionUser action=new UImpl();
	
	ImageIcon image= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/HOS2.png").getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
	
	JLabel img =new JLabel(image);
	JButton Confirmer= new JButton("Confirmer !");
	JButton Annuler= new JButton("Annuler");
	JButton Add= new JButton("Ajouter");
	
	JPanel P1 =new JPanel (new BorderLayout());
	JPanel P2 =new JPanel (new FlowLayout());
	JPanel P3 =new JPanel (new FlowLayout());
	JPanel P4 =new JPanel (new GridLayout(2,1));
	JPanel P5 =new JPanel (new FlowLayout());
	public Login() {
		this.setTitle("Login");
		this.add(P1);
	
		
		P2.add(Nom);
		P2.add(SNom);
		
		P3.add(mdp);
		P3.add(SPass);
		
		P4.add(P2);
		P4.add(P3);
		
		
		P5.add(Confirmer);
		P5.add(Annuler);
		P5.add(Add);
		
		P1.add(img,BorderLayout.NORTH);
		P1.add(P4,BorderLayout.CENTER);
		P1.add(P5,BorderLayout.SOUTH);
		

		
		 Annuler.addActionListener(e->{SNom.setText("");
		  SPass.setText("");
			
		  });
		    
		  
		  Confirmer.addActionListener(e->{
			  String nom=SNom.getText();
			  @SuppressWarnings("deprecation")
			String password=SPass.getText();
			  if(nom.equals("")||password.equals(""))
				  JOptionPane.showMessageDialog(this,"Erreur de saisie");
			  else 
			   if (nom.equals("root") && password.equals("1234" )) { 
				   JOptionPane.showMessageDialog(this,"Bienvenu Admin !");
		         new MainMenu();
		         this.dispose();}
			   
			  try {
					
					
						
						 
							
							PreparedStatement ps=cx.prepareStatement("SELECT * From user where CodeEmp=? And Mdp=? ");
							ps.setString(1,nom);
							ps.setString(2,password);
							ResultSet rs=ps.executeQuery();
							
							if(rs.next()) {
								JOptionPane.showMessageDialog(null,"Vous êtes connecté");
						
								new MainMenu();
								this.setVisible(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "identifiant ou mot de passe incorrecte");
							}
							
						}
						
					
					
					catch(SQLException e3){
						
					}
					
				}

 
		  );
		  Add.addActionListener(e->{ 
			    new AdduserUI();
			   this.dispose();
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
		  Add.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseEntered(java.awt.event.MouseEvent evt) {
	            	Add.setBackground(Color.YELLOW);            }

	            public void mouseExited(java.awt.event.MouseEvent evt) {
	            	Add.setBackground(UIManager.getColor("control"));
	            }
	        });
		
		 P1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Login Administration"));
		 Color c=new Color(250,232,202);
		P1.setBackground(c);
		P2.setBackground(c);
		P3.setBackground(c);
		P5.setBackground(c);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);  
	
		ImageIcon image2= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/HOS2.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
				setIconImage(image2.getImage());
	}
	
	public static void main(String[] args) {
		 new Login();
		}


	

}
