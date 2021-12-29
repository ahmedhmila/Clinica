package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class RPatientUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel SRPatient=new JLabel("  (fonctionnalité non disponible en attendant une m_à_j)");
	ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/home.png").getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
	ImageIcon conf = new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/main.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	JButton Home = new JButton( imageIcon);
	
	JLabel imgLabel = new JLabel(conf);
	ImageIcon image= new ImageIcon(new ImageIcon("C:/Users/ahmed/Desktop/KRAYA/JAVA ALL/JAVA 2/mini projet files/rp.png").getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));

	public RPatientUI() {
		  Home.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseEntered(java.awt.event.MouseEvent evt) {
	            	Home.setBackground(Color.lightGray);            }

	            public void mouseExited(java.awt.event.MouseEvent evt) {
	            	Home.setBackground(UIManager.getColor("control"));
	            }
	        });
		  Home.addActionListener(e->{ 
			    new MainMenu();
			   this.dispose();
					}

			);
		this.add(imgLabel,BorderLayout.CENTER);
		this.add(SRPatient,BorderLayout.NORTH);
		this.add(Home,BorderLayout.SOUTH);
this.setTitle("Patient Résidant");
this.setSize(600,600);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	this.setVisible(true);  

	setIconImage(image.getImage());
}
	public static void main(String[] args) {
		 new RPatientUI();
		}
}
