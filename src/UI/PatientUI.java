package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.table.TableColumnModel;

import Patient.Patient;
import dao.IGestionPatient;

import dao.PAImpl;


public class PatientUI extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon ras = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/RAS2.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	ImageIcon conf = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/conf.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	ImageIcon annul = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/annul.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	ImageIcon image= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/NP.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));

	JButton Att = new JButton(ras);
	TableModele tm=new TableModele();
	JTable tableau=new JTable(tm);
	JScrollPane jsp = new JScrollPane(tableau);
	
	JLabel Nom=new JLabel("Nom              ");
	public static JTextField SNom=new JTextField(20);
	
	JLabel Prenom=new JLabel("Prenom           ");
	JTextField SPrenom=new JTextField(20);
	
	JLabel Adresse=new JLabel("Adresse          ");
	JTextField SAdresse=new JTextField(20);
	
	JLabel AnCIN=new JLabel("Numéro CIN       ");
	JTextField SnCIN=new JTextField(20);
	                               
	JLabel dateNaissance=new JLabel("Date de Naissance");
	JTextField dNais=new JTextField(20);
	
	JLabel Maladie=new JLabel("Maladies  ");
	JComboBox<String>combo=new JComboBox<>(new String[] {null,"Pneumonie acquise à domicile","Cancer du poumon"
			,"Insuffisance rénale","Insuffisance cardiaque décompensée","Accouchement","COVID 19"});
	
	JLabel Sexe=new JLabel("Sexe:");
	JRadioButton Homme =new JRadioButton("Homme");
	JRadioButton Femme =new JRadioButton("Femme");
	ButtonGroup bg=new ButtonGroup();
	
	ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/home.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));

	IGestionPatient action=new PAImpl();
	JButton Confirmer= new JButton(conf);
	JButton Annuler= new JButton(annul);
	JButton Home = new JButton( imageIcon);
	 ImageIcon REF = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/LISTA.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	JButton Aff = new JButton(REF);
	  ImageIcon HH = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/HH.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	JButton mas = new JButton(HH);
	
	
    JButton Rechercher= new JButton("Rechercher");
	
	JLabel cher=new JLabel("Cherchant par D.Naissance");
	JTextField Scher=new JTextField(30);
	
    JButton RechercherCIN= new JButton("Rechercher");
	JLabel CINcher=new JLabel("Cherchant par Num.CIN   ");
	JTextField CINScher=new JTextField(30);
	

    JButton RemoveCIN= new JButton("Enlever");
	JLabel RCINcher=new JLabel("Enlever Patient selon CIN");
	JTextField RCINScher=new JTextField(25);
	
	
	JFormattedTextField dateField = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
	
	
	JPanel P1 =new JPanel (new BorderLayout());
	JPanel P2 =new JPanel (new BorderLayout());
	JPanel P3 =new JPanel (new GridLayout(4,2));
	JPanel P4 =new JPanel (new FlowLayout());
	
	JPanel P5 =new JPanel (new FlowLayout());
	JPanel P6 =new JPanel (new FlowLayout());
	JPanel P7 =new JPanel (new FlowLayout());
	JPanel P8 =new JPanel (new FlowLayout());
	JPanel P9 =new JPanel (new FlowLayout());
	JPanel P10 =new JPanel (new FlowLayout());
	JPanel P11 =new JPanel (new FlowLayout());
	
	JPanel P12 =new JPanel (new FlowLayout());

	JPanel P13 =new JPanel (new BorderLayout());
	JPanel P14 =new JPanel (new FlowLayout());
	
	JPanel P15 =new JPanel (new FlowLayout());
	JPanel P16 =new JPanel (new GridLayout(2,1));
	
	JPanel P17 =new JPanel (new FlowLayout());

	
	public PatientUI() {
		TableColumnModel columnModel =tableau.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(25);
        columnModel.getColumn(0).setMaxWidth(25);
        columnModel.getColumn(1).setPreferredWidth(75);
        columnModel.getColumn(1).setMaxWidth(150);
        columnModel.getColumn(2).setPreferredWidth(75);
        columnModel.getColumn(2).setMaxWidth(150);
        columnModel.getColumn(3).setPreferredWidth(40);
        columnModel.getColumn(3).setMaxWidth(150);
        columnModel.getColumn(4).setPreferredWidth(50);
        columnModel.getColumn(4).setMaxWidth(150);
        columnModel.getColumn(5).setPreferredWidth(75);
        columnModel.getColumn(5).setMaxWidth(150);
        columnModel.getColumn(6).setPreferredWidth(75);
        columnModel.getColumn(6).setMaxWidth(150);
        columnModel.getColumn(7).setPreferredWidth(75);
        columnModel.getColumn(7).setMaxWidth(150);
       
        Att.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	 Att.setBackground(Color.RED);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Att.setBackground(UIManager.getColor("control"));
            }
        });
        Confirmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	Confirmer.setBackground(Color.GREEN);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Confirmer.setBackground(UIManager.getColor("control"));
            }
        });
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
        Aff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	Aff.setBackground(Color.YELLOW);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Aff.setBackground(UIManager.getColor("control"));
            }
        });
        mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	mas.setBackground(Color.orange);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	mas.setBackground(UIManager.getColor("control"));
            }
        });
        


		setLayout(new FlowLayout());
		this.setTitle("Nouveau Patient");
		bg.add(Homme);
		bg.add(Femme);
		
		
		P5.add(Nom);
		P5.add(SNom);
		
		P6.add(Prenom);
		P6.add(SPrenom);
		
		P3.add(P5);
		P3.add(P6);
		
		P8.add(Adresse);
		P8.add(SAdresse);
		 
		P9.add(AnCIN);
		P9.add(SnCIN);
		
		P10.add(dateNaissance);
		P10.add(dNais);
		
		P7.add(Maladie);
		P7.add(combo);
		
	    P3.add(P8);
	    P3.add(P9);
	    P3.add(P10);
	   

		P11.add(Sexe);
		P11.add(Homme);
		P11.add(Femme);
		
		P12.add(Aff);
		P12.add(mas);
		P3.add(P11);
		
	    P3.add(P7);
	    P3.add(P12);

		P4.add(Confirmer);
		
		P4.add(Annuler);
		P4.add(Att);
		

		RemoveCIN.setBackground(Color.pink);
		
		  this.add(P1);
		  this.add(P13);
		
		P2.add(P3,BorderLayout.CENTER);
		P2.add(P4,BorderLayout.SOUTH);
		
		P1.add(P2,BorderLayout.CENTER);
		P1.add(Home,BorderLayout.SOUTH);

		P15.add(CINcher);
		P15.add(CINScher);
		P15.add(RechercherCIN);
		
		P14.add(cher);
		P14.add(Scher);
		P14.add(Rechercher);
		
		
		
		P16.add(P14);
		P16.add(P15);
	
		P17.add(RCINcher);
		P17.add(RCINScher);
		P17.add(RemoveCIN);
		P13.add(jsp,BorderLayout.CENTER);
		P13.add(P16,BorderLayout.NORTH);
		P13.add(P17,BorderLayout.SOUTH);
		
		
		
		Att.addActionListener(e->{
			 int res=JOptionPane.showConfirmDialog(this,"Voulez vous vraiment effacer toute la liste des patients  ?");
			   if (res==0) {
			action.clearNP(); } }
		);	
		
		 Aff.addActionListener(new ActionListener() {   
				public void actionPerformed(ActionEvent e) {
					 P13.setVisible(true);
					 tm.charger(action.listeDesPatients());
	        }
	    });
	  
	  Rechercher.addActionListener(e->{
		  String ind=Scher.getText();
		  tm.charger(action.rechercherparindice(ind));
	  });
	  
	
	  
	  RemoveCIN.addActionListener(e->{
		  String RnCIN=RCINScher.getText();
		  tm.charger(action.removePatient(RnCIN));
		  JButton source = (JButton) e.getSource();
		  source.setBackground(Color.pink);
		  
	  });
	  
	  
	  Annuler.addActionListener(e->{SNom.setText("");
	  SPrenom.setText("");
	  SAdresse.setText("");
	  SnCIN.setText("");
	  dNais.setText("");
	  combo.setSelectedItem(null);
	  bg.clearSelection();
	  		
	  });
	    
	  RechercherCIN.addActionListener(e->{
		  String nn=CINScher.getText();
		  tm.charger(action.rechercherparCIN(nn));
	  });
	  
	  Confirmer.addActionListener(e->{
		  String nom=SNom.getText();
		  String prenom=SPrenom.getText();
		  String Maladie=(String)combo.getSelectedItem();
		  String sexe=Homme.isSelected()?Homme.getText():Femme.getText();
		  String nCIN=SnCIN.getText();
		  String adresse=SAdresse.getText();
		  String dNai=dNais.getText();
		  String notes = "";
		  int nbrC = 0;
		  String prCo = "";
		  String num = "";
		  if(nom.equals("")||prenom.equals("")||sexe.equals("") || nCIN.equals("")||adresse.equals("") ||dNai.equals(""))
			  JOptionPane.showMessageDialog(this,"Erreur de saisie vous avez oublié un ou plusieurs champs vide(s)");
		  else {Patient et=new Patient(nom,prenom,sexe,nCIN, adresse, Maladie, dNai,notes,nbrC,prCo,num);
		  
		  
		      int res=JOptionPane.showConfirmDialog(this, "id:"+et.getId()+"\nNom:"+et.getNom(),"Voulez vous Ajouter cet Patient ?",
				  JOptionPane.YES_NO_OPTION);
		   if (res==0)
			try {
				action.ajouter(et);
				Confirmer.setBackground(Color.green);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	         tm.charger(action.listeDesPatients());
			}
		  
	  });
	  
	  Home.addActionListener(e->{ 
		    new MainMenu();
		   this.dispose();
				}

		);
	  
	     mas.addActionListener(new ActionListener() {   
			public void actionPerformed(ActionEvent e) {
				 P13.setVisible(false);
        }
    });
	    
	/*     Color c=new Color(250,232,202);
	     P1.setBackground(c);
	     P2.setBackground(c);
	     P3.setBackground(c);
	     P5.setBackground(c);
	     P4.setBackground(c);
	     P6.setBackground(c);
	     P7.setBackground(c);
	     P8.setBackground(c);
	     P9.setBackground(c);
	     P10.setBackground(c);
	     P11.setBackground(c);
	     P12.setBackground(c);
	     P13.setBackground(c);
	     P14.setBackground(c);
	     P15.setBackground(c);	     
	     P16.setBackground(c);
	     jsp.setBackground(c);


	     P17.setBackground(c);

	     getContentPane().setBackground(c);	 
	  */
	    P13.setVisible(false);
	    P13.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Affichage & Recherche"));
	    P1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Ajouter un  Patient"));
	    this.setSize(1400,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);  
		
		setIconImage(image.getImage());

	}
	
	public static void main(String[] args) {
	 new PatientUI();
	}


}
