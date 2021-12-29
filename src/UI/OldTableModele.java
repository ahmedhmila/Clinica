package UI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Patient.Patient;

public class OldTableModele extends AbstractTableModel{ 
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 List<Patient> liste=new ArrayList<Patient>();

	String titres[]= {"id","nom","prenom","sexe","nCIN","Adresse","Maladie","Date Naissance","Notes","Nbr Controles","Prochain Controle","Numéro"};
	
	@Override
	public int getRowCount() {
	
		return liste.size();
	}
	@Override
	public int getColumnCount() {
	
		return titres.length;
	}
	

	
	public Object getValueAt(int l, int c) {
		switch(c)
		{case(0):return liste.get(l).getId();
		case(1):return liste.get(l).getNom();
		case(2):return liste.get(l).getPrenom();
		case(3):return liste.get(l).getSexe();
		case(4):return liste.get(l).getnCIN();
		case(5):return liste.get(l).getadresse();
		case(6):return liste.get(l).getMaladie();
		case(7):return liste.get(l).getdNai();
		case(8):return liste.get(l).getNotes();
		case(9):return liste.get(l).getNbrC();
		case(10):return liste.get(l).getPrCo();
		case(11):return liste.get(l).getNum();}
		return null;
	}
	public String getColumnName(int column) {
		return titres[column];
	}
	public void charger(List<Patient>listePatients) {
		liste=listePatients;
		fireTableDataChanged();
	}
}