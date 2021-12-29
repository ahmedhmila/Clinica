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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.table.TableColumnModel;


import Patient.UPatient;
import dao.CHImpl;
import dao.IGestionChambres;

import dao.IGestionUPatient;

import dao.UPImpl;

public class Urgence extends JFrame{
	/**
	 * 
	 */
	
	//partie 1 enos elloul 
	private static final long serialVersionUID = 1L;
	JLabel Nom=new JLabel("Nom              ");
	public static JTextField SNom=new JTextField(20);
	
	JLabel Prenom=new JLabel("Prenom           ");
	JTextField SPrenom=new JTextField(20);
	
	JLabel AnCIN=new JLabel("Numéro CIN       ");
	JTextField SnCIN=new JTextField(20);
	
	  JLabel Age=new JLabel("Age               ");
	JTextField SAge=new JTextField(20);
	
	 ImageIcon LL = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/LISTA.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	 ImageIcon image= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/EM.png").getImage().getScaledInstance(50, 35, Image.SCALE_DEFAULT));

	
		
		JLabel Maladie=new JLabel("Maladies  ");
		JComboBox<String>combo=new JComboBox<>(new String[] {null,"Pneumonie acquise à domicile","Cancer du poumon"
				,"Insuffisance rénale","Insuffisance cardiaque décompensée","Accouchement"});
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/home.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		ImageIcon conf = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/conf.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		ImageIcon annul = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/annul.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		JButton Confirmer= new JButton(conf);
		JButton Annuler= new JButton(annul);
		JButton Home = new JButton( imageIcon);
		JButton LISTA = new JButton( LL);
		
		UTableModele tm2=new UTableModele();
		JTable tableau2=new JTable(tm2);
		JScrollPane jsp2 = new JScrollPane(tableau2);
		IGestionUPatient action2=new UPImpl();
		
		
		JPanel P1 =new JPanel (new FlowLayout());
		JPanel P2 =new JPanel (new FlowLayout());
		JPanel P3 =new JPanel (new FlowLayout());
		JPanel P4 =new JPanel (new FlowLayout());
		
		JPanel P6 =new JPanel (new FlowLayout());
		JPanel P7 =new JPanel (new FlowLayout());
		JPanel P8 =new JPanel (new GridLayout(3,2));
		JPanel P9 =new JPanel (new FlowLayout());
		JPanel P12 =new JPanel (new BorderLayout());
		//partie 2 enos el theni
		
		
		CTableModele tm=new CTableModele();
		JTable tableau=new JTable(tm);
		JScrollPane jsp = new JScrollPane(tableau);
		IGestionChambres action=new CHImpl();
		JButton cha= new JButton("Associer cette chambre");
	    JTextField Scha=new JTextField(10);
	    JButton Ncha= new JButton("Vider cette chambre");
	    JTextField NScha=new JTextField(10);
	    JButton AFL= new JButton("Afficher la liste des chambres vides");
	    JButton AF= new JButton("Afficher la liste de toutes les chambres ");
	    
	    
	    ImageIcon REF = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/REF.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
	    JButton act= new JButton(REF);
	    
	    JPanel P10 =new JPanel (new FlowLayout());
	    JPanel P11 =new JPanel (new BorderLayout());
	    
	    JPanel P13 =new JPanel (new FlowLayout());
	    JPanel P14 =new JPanel (new GridLayout(2,1));
	    JPanel P15 =new JPanel (new FlowLayout());
	    
	    

	    
	    
	    
	   
		
		
		
		
		
		
		
		public Urgence() {
			
			TableColumnModel columnModel =tableau.getColumnModel();
	        columnModel.getColumn(0).setPreferredWidth(25);
	        columnModel.getColumn(0).setMaxWidth(50);
	        columnModel.getColumn(1).setPreferredWidth(40);
	        columnModel.getColumn(1).setMaxWidth(50);
	        columnModel.getColumn(2).setPreferredWidth(75);
	        columnModel.getColumn(2).setMaxWidth(500);
	        columnModel.getColumn(3).setPreferredWidth(25);
	        columnModel.getColumn(3).setMaxWidth(50); 
			setLayout(new FlowLayout());
			this.setTitle("  URGENCE  ");
			tm.charger(action.listeDesChambres());
			P1.add(Nom);
			P1.add(SNom);
			
			P2.add(Prenom);
			P2.add(SPrenom);
			
			P3.add(AnCIN);
			P3.add(SnCIN);
			
			P4.add(Age);
			P4.add(SAge);
			   Home.addMouseListener(new java.awt.event.MouseAdapter() {
		            public void mouseEntered(java.awt.event.MouseEvent evt) {
		            	Home.setBackground(Color.lightGray);            }

		            public void mouseExited(java.awt.event.MouseEvent evt) {
		            	Home.setBackground(UIManager.getColor("control"));
		            }
		        });
			 Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
		            public void mouseEntered(java.awt.event.MouseEvent evt) {
		            	Annuler.setBackground(Color.PINK);            }

		            public void mouseExited(java.awt.event.MouseEvent evt) {
		            	Annuler.setBackground(UIManager.getColor("control"));
		            }
		        });
			 LISTA.addMouseListener(new java.awt.event.MouseAdapter() {
		            public void mouseEntered(java.awt.event.MouseEvent evt) {
		            	LISTA.setBackground(Color.YELLOW);            }

		            public void mouseExited(java.awt.event.MouseEvent evt) {
		            	LISTA.setBackground(UIManager.getColor("control"));
		            }
		        });
			
			P6.add(Maladie);
			P6.add(combo);
			
			P7.add(Confirmer);
			P7.add(Annuler);
			P7.add(Home);
			P7.add(LISTA);
			
			P8.add(P1);
			P8.add(P2);
			P8.add(P3);
			P8.add(P4);
			
			P8.add(P6);
		
			P10.add(Scha);
			P10.add(cha);
			
			P11.add(P15,BorderLayout.NORTH);
			P11.add(jsp,BorderLayout.CENTER);
			P11.add(P14,BorderLayout.SOUTH);
			
			
			P13.add(Ncha);
			P13.add(NScha);
			
			P14.add(P10);
			P14.add(P13);
			
			P15.add(AFL);
			P15.add(AF);
			P15.add(act);
			
			this.add(P12);
			this.add(P11);
			
			
			
			LISTA.addActionListener(e->{ 
			    new UPatientUI();
			});
			
		act.addActionListener(e->{
				  
				  tm.charger(action.listeDesChambres());
			  });
			
			AF.addActionListener(e->{
				  
				  tm.charger(action.listeDesChambres());
			  });
			
			
			AFL.addActionListener(e->{
				
				  tm.charger(action.chambresno());
			  });
			
			Ncha.addActionListener(e->{
				  String VC=NScha.getText();
				  tm.charger(action.VIDchambre(VC));
			  });
			
			cha.addActionListener(e->{
				  String nn=Scha.getText();
				  tm.charger(action.occchambre(nn));
				  
			  });
			
			
			
			
			
			  Home.addActionListener(e->{ 
				    new MainMenu();
				   this.dispose();
						}

				);
			  
			  Annuler.addActionListener(e->{SNom.setText("");
			  SPrenom.setText("");
			 
			  SnCIN.setText("");
			  SAge.setText("");
			  combo.setSelectedItem(null);
			  
			  		
			  });
			  
			  Confirmer.addMouseListener(new java.awt.event.MouseAdapter() {
				    public void mouseEntered(java.awt.event.MouseEvent evt) {
				    	Confirmer.setBackground(Color.GREEN);
				    }

				    public void mouseExited(java.awt.event.MouseEvent evt) {
				    	Confirmer.setBackground(UIManager.getColor("control"));
				    }
				});
			  
			  Confirmer.addActionListener(e->{
				  String nom=SNom.getText();
				  String prenom=SPrenom.getText();
				  String Maladie=(String)combo.getSelectedItem();
				  
				  String nCIN=SnCIN.getText();
				  String Chambre=Scha.getText();
				  String Age=SAge.getText();
				  if(nom.equals("")||prenom.equals("")||Age.equals("") || nCIN.equals("")||Chambre.equals("") )
					  JOptionPane.showMessageDialog(this,"Erreur de saisie vous avez oublié un ou plusieurs champs vide(s)");
				  else {UPatient et=new UPatient(nom,prenom,nCIN, Age, Maladie, Chambre);
				  
				  
				      int res=JOptionPane.showConfirmDialog(this, "id:"+et.getId()+"\nNom:"+et.getNom(),"Voulez vous Ajouter cet Patient ?",
						  JOptionPane.YES_NO_OPTION);
				   if (res==0)
					try {
						action2.ajouter(et);
						Confirmer.setBackground(Color.green);
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}}
			         
			  });
			  
			
			P12.add(P8,BorderLayout.CENTER);
			P12.add(P7,BorderLayout.SOUTH);
			P8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Informations du patient"));
			P11.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Gestion des chambres"));
			this.setSize(1400,600);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			this.setVisible(true);  
			
			setIconImage(image.getImage());
		}
		public static void main(String[] args) {
			 new Urgence();
			}


		}

