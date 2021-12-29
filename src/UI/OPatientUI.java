package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.table.TableColumnModel;



import dao.IGestionPatient;

import dao.PAImpl;


public class OPatientUI extends JFrame {	
	
	


	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	OldTableModele tm=new OldTableModele();
	JTable tableau=new JTable(tm);
	JScrollPane jsp = new JScrollPane(tableau);
	 ImageIcon image= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/OP.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

	    JButton Controle=new JButton("Ajouter une date de Controle  ");
	    ImageIcon REF = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/REF.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	    ImageIcon HH = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/HH.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	    JButton Aff=new JButton(REF);
	    JButton Mas=new JButton(HH);
	    
		
		ImageIcon ras = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/RAS2.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		JButton Att = new JButton(ras);
	
		
		ImageIcon tel = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/tel.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	     JButton Ajouter=new JButton("Confirmer la  date");
	     JTextField nextDa=new JTextField(30);
	     
	     JButton ANumB=new JButton(tel);
	     JTextField Num=new JTextField(8);
	
	
	   JButton RechercherCIN= new JButton("Rechercher");
	   JLabel CINcher=new JLabel("cherchant par CIN   ");
       JTextField CINScher=new JTextField(30);
		
		IGestionPatient action=new PAImpl();
	    JTextArea No=new JTextArea(14,135);
	
	
	
	
	JButton Confirmer= new JButton("Confirmer !");
	ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/home.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
	JButton Home = new JButton( imageIcon);
	
	
	
	
	
	JPanel P1=new JPanel(new BorderLayout()) ;
	JPanel P2=new JPanel(new GridLayout(2,1));
	JPanel P3 =new JPanel (new FlowLayout());
	JPanel P4=new JPanel(new BorderLayout()) ;
	JPanel P5 =new JPanel (new FlowLayout());
	JPanel P6=new JPanel(new GridLayout(1,2));
	JPanel P7 =new JPanel (new FlowLayout());
	JPanel P8 =new JPanel (new FlowLayout());
	JPanel P9 =new JPanel (new FlowLayout(FlowLayout.RIGHT, 30,10));
	JPanel P10 =new JPanel (new FlowLayout(FlowLayout.LEFT, 10,10));
	JPanel P11 =new JPanel (new FlowLayout());




	public OPatientUI() {
		TableColumnModel columnModel =tableau.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(25);
        columnModel.getColumn(0).setMaxWidth(25);
        columnModel.getColumn(1).setPreferredWidth(75);
        columnModel.getColumn(1).setMaxWidth(105);
        columnModel.getColumn(2).setPreferredWidth(75);
        columnModel.getColumn(2).setMaxWidth(105);
        columnModel.getColumn(3).setPreferredWidth(40);
        columnModel.getColumn(3).setMaxWidth(50);
        columnModel.getColumn(4).setPreferredWidth(50);
        columnModel.getColumn(4).setMaxWidth(70);
        columnModel.getColumn(5).setPreferredWidth(75);
        columnModel.getColumn(5).setMaxWidth(150);
        columnModel.getColumn(6).setPreferredWidth(75);
        columnModel.getColumn(6).setMaxWidth(150);
        columnModel.getColumn(7).setPreferredWidth(40);
        columnModel.getColumn(7).setMaxWidth(75);
        columnModel.getColumn(8).setPreferredWidth(75);
        columnModel.getColumn(8).setMaxWidth(500);
        columnModel.getColumn(9).setPreferredWidth(35);
        columnModel.getColumn(9).setMaxWidth(50);
        columnModel.getColumn(10).setPreferredWidth(40);
        columnModel.getColumn(10).setMaxWidth(75);
        columnModel.getColumn(11).setPreferredWidth(50);
        columnModel.getColumn(11).setMaxWidth(75);
		
        Att.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	 Att.setBackground(Color.RED);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Att.setBackground(UIManager.getColor("control"));
            }
        });
        Mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	Mas.setBackground(Color.orange);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Mas.setBackground(UIManager.getColor("control"));
            }
        });
        Aff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	Aff.setBackground(Color.YELLOW);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Aff.setBackground(UIManager.getColor("control"));
            }
        });
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	Home.setBackground(Color.lightGray);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Home.setBackground(UIManager.getColor("control"));
            }
        });
        Confirmer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	Confirmer.setBackground(Color.GREEN);            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Confirmer.setBackground(UIManager.getColor("control"));
            }
        });
		this.setTitle("Patient inscrit");
		this.setLayout(new GridLayout(2,1));
		
		
		tm.charger(action.listeDesPatients());
		P11.add(No);
		P5.add(Ajouter);
		P5.add(nextDa);
		
		P7.add(Controle);
		P7.add(P5);
		
		
		P8.add(ANumB);
		P8.add(Num);
		
		P7.add(P8);
		
		P10.add(Aff);
		P10.add(Mas);
		P10.add(Att);
		  
		P9.add(P7);
		P9.add(P10);
		P2.add(Confirmer);
		P2.add(Home);
		
		P3.add(CINcher);
		P3.add(CINScher);
		P3.add(RechercherCIN);
		
       P4.add(jsp,BorderLayout.CENTER);
       P4.add(P3,BorderLayout.NORTH);
       P4.add(P9,BorderLayout.SOUTH);

		P1.add(P11,BorderLayout.CENTER);
		P1.add(P2,BorderLayout.SOUTH);
		
		this.add(P4);
		this.add(P1);
		
		
		P4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Informations du Patient"));
		P1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Notes"));
		
		
		Att.addActionListener(e->{
			 int res=JOptionPane.showConfirmDialog(this,"Voulez vous vraiment effacer toute la liste des patients inscrits ?");
			   if (res==0) {
			action.clearNP(); }}
		);	
		
		Controle.addActionListener(new ActionListener(){
			int CO =0;
			   
			public void actionPerformed(ActionEvent e) {
				String nn=CINScher.getText();
				 Ajouter.setEnabled(true);
				 nextDa. setEnabled(true);
				 nextDa.setBackground(Color.white);
			       Ajouter.setBackground(Color.white);
			       CO++;
			       tm.charger(action.ajouterco(nn, CO));
			       jsp.setVisible(true);
			}
    });
		nextDa.setBackground(Color.pink);
		nextDa. setEnabled(false);
       Ajouter.setEnabled(false);
       Ajouter.setBackground(Color.pink);
	
		
       ANumB.addActionListener(e->{
			  String NM=Num.getText();
			
			 
			  String nn=CINScher.getText();
			 
			  tm.charger(action.ajouterNum(nn,NM)) ;
			  jsp.setVisible(true);
		});	
			  
		
		Ajouter.addActionListener(e->{
			  String DD=nextDa.getText();
			
			 
			  String nn=CINScher.getText();
			 
			  tm.charger(action.ajouterdate(nn,DD)) ;
			  jsp.setVisible(true);
		});	
			  
					
				
		
		Aff.addActionListener(new ActionListener() {   
				public void actionPerformed(ActionEvent e) {
				
					 tm.charger(action.listeDesPatients());
					 jsp.setVisible(true);
	        }
	    });
		
		
		 Home.addActionListener(e->{ 
			    new MainMenu();
			   this.dispose();
		 });
		 
		 
		 RechercherCIN.addActionListener(e->{
			  String nn=CINScher.getText();
		tm.charger(action.rechercherparCIN(nn)) ;
		
		  });	  
		  
		 Confirmer.addActionListener(e->{
			 Confirmer.setBackground(Color.green);
				String NO=No.getText();
				
				 
				  String nn=CINScher.getText();
		         tm.charger(action. ajouterNotes(nn,NO));
			  
			 
		      int res=JOptionPane.showConfirmDialog(this, "Voulez vous Ajouter ces Modifications ?",
				  NO, JOptionPane.YES_NO_OPTION);
		      if (res==0) {
		      tm.charger(action.listeDesPatients()) ;}
		 });
		 
		 
		 Mas.addActionListener(new ActionListener() {   
				public void actionPerformed(ActionEvent e) {
					 jsp.setVisible(false);
	        }
	    });
			this.setSize(1400,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);  
	
		setIconImage(image.getImage());
	}
	
	
	public static void main(String[] args) {
		 new OPatientUI();
		}
		

}
