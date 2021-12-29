package UI;
import java.util.ArrayList;
import java.util.List;


import javax.swing.table.AbstractTableModel;

import AcquiClini.Chambre;

public class CTableModele extends AbstractTableModel{ 
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 List<Chambre>liste=new ArrayList<Chambre>();

	String titres[]= {"id","nom","Maladie","Occ"};
	
     
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
		case(2):return liste.get(l).getMaladie();
		case(3):return liste.get(l).getOcc();
			}
		return null;
	}
	public String getColumnName(int column) {
		return titres[column];
	}
	public void charger(List<Chambre>listeChambres) {
		liste=listeChambres;
		fireTableDataChanged();
	}
}




