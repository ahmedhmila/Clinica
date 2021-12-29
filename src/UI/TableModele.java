package UI;

import java.util.ArrayList;
import java.util.List;


import javax.swing.table.AbstractTableModel;

import Patient.Patient;

public class TableModele extends AbstractTableModel{ 
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 List<Patient>liste=new ArrayList<Patient>();

	String titres[]= {"id","nom","prenom","sexe","nCIN","Adresse","Maladie","Date Naissance"};
	
     
	public int getRowCount() {
	
		return liste.size();
	}

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
		case(7):return liste.get(l).getdNai();		}
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





