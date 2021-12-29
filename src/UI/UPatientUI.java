package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import dao.IGestionUPatient;
import dao.UPImpl;

public class UPatientUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UTableModele tm2=new UTableModele();
	JTable tableau2=new JTable(tm2);
	JScrollPane jsp2 = new JScrollPane(tableau2);
	 ImageIcon REF = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/return.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	 JButton ret= new JButton(REF);
	 ImageIcon image= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/EM.png").getImage().getScaledInstance(50, 35, Image.SCALE_DEFAULT));

	    ImageIcon fr = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/REF.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
	    JButton act= new JButton(fr);
	 
	 JTextField SEnl=new JTextField(10);
	  JButton Enl= new JButton("Enlever un patient ");
	 
	    JPanel P1 =new JPanel (new FlowLayout());
	    JPanel P2 =new JPanel (new FlowLayout());
	    JPanel P3 =new JPanel (new GridLayout(2,1));

	IGestionUPatient action2=new UPImpl();
	public UPatientUI() {
		this.setTitle("Liste des patients de L' urgence");
		tm2.charger(action2.listeDesPatients());
		setLayout(new BorderLayout());
		P2.add(SEnl);
		P2.add(Enl);
		P2.add(act);
		
		P3.add(P2);
		P3.add(ret);
		this.add(jsp2,BorderLayout.CENTER);
		this.add(P3,BorderLayout.SOUTH);
		P1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Tableau des patients de L' urgence"));
		this.add(P1,BorderLayout.NORTH);
		
		ret.addActionListener(e->{ 
		    new Urgence();
		   this.dispose();
				});
		 Enl.addActionListener(e->{
			  String RnCIN=SEnl.getText();
			  tm2.charger(action2.removePatient(RnCIN));}

		);
		 
		 act.addActionListener(e->{
			 
			  tm2.charger(action2.listeDesPatients());}

		);
		 this.setSize(1400,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);  
		
		setIconImage(image.getImage());
	}
	public static void main(String[] args) {
		 new UPatientUI();
		}
}
