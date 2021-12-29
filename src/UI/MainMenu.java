package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class MainMenu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon NP = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/opn.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
	ImageIcon OP = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/OP.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
    ImageIcon EM = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/UR.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
	ImageIcon rp = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/rp.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
	ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/home.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	ImageIcon image= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/HOS2.png").getImage().getScaledInstance(50, 35, Image.SCALE_DEFAULT));

	JLabel img =new JLabel(image);
    JButton NPatient= new JButton(NP);
	JButton OPatient= new JButton(OP);
	JButton RPatient= new JButton(rp);
	JButton Urgence = new JButton(EM);

	
	JLabel SNPatient=new JLabel(" Nouveau Patient ");
	JLabel SOPatient=new JLabel(" Ancien Patient  ");
	JLabel SRPatient=new JLabel(" Patient Résidant ");
	JLabel SUrgence=new  JLabel(" URGENCE     ");
	
	
	
	
	JPanel P1 =new JPanel (new GridLayout(4,1));
	JPanel P2 =new JPanel (new FlowLayout());
	JPanel P3 =new JPanel (new FlowLayout());
	JPanel P4 =new JPanel (new FlowLayout());
	JPanel P5 =new JPanel (new FlowLayout());

public MainMenu(){
	this.setLayout(new BorderLayout());
    this.setTitle("Menu Principal");
    this.add(img,BorderLayout.SOUTH);
    this.add(P1,BorderLayout.CENTER);



P2.add(NPatient);
P2.add(SNPatient);

P3.add(OPatient);
P3.add(SOPatient);

P4.add(RPatient);
P4.add(SRPatient);

P5.add(Urgence);
P5.add(SUrgence);

P1.add(P2);
P1.add(P3);
P1.add(P4);
P1.add(P5);




NPatient.addActionListener(e->{ 
	       new PatientUI();
	      this.dispose();
			}
	 
	);

OPatient.addActionListener(e->{ 
    new OPatientUI();
   this.dispose();
		}

);

RPatient.addActionListener(e->{ 
    new RPatientUI();
   this.dispose();
		}

);

Urgence.addActionListener(e->{ 
    new Urgence();
   this.dispose();
		}

);


P1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED),"Menu Principal"));
this.setSize(600,600);
/*
Color c=new Color(250,232,202);
P1.setBackground(c);
P2.setBackground(c);
P3.setBackground(c);
P5.setBackground(c);
P4.setBackground(c);
getContentPane().setBackground(c);
*/


this.setLocationRelativeTo(null);
this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
this.setVisible(true);  
setIconImage(imageIcon.getImage());
}	
	
public static void main(String[] args) {
	 new MainMenu();
	}

	
}
