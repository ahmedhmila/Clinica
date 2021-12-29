package UI;


	import java.util.ArrayList;
	import java.util.List;


	import javax.swing.table.AbstractTableModel;

	import Patient.UPatient;

	public class UTableModele extends AbstractTableModel{ 
		
		 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		 List<UPatient>liste=new ArrayList<UPatient>();

		String titres[]= {"id","nom","prenom","nCIN","Age","Maladie","Chambre"};
		
	     
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
			case(3):return liste.get(l).getnCIN();
			case(4):return liste.get(l).getAge();
			case(5):return liste.get(l).getMaladie();
			case(6):return liste.get(l).getChambre();	}
			return null;
		}
		public String getColumnName(int column) {
			return titres[column];
		}
		public void charger(List<UPatient>listePatients) {
			liste=listePatients;
			fireTableDataChanged();
		}
	}

