package dao;

import java.sql.SQLException;
import java.util.List;


import Patient.Patient;

public interface IGestionPatient {
	public   void ajouter(Patient p) throws SQLException ;
	public  List<Patient>rechercherparindice(String ind);
	public List<Patient> removePatient(String RnCIN);
	public  List<Patient>rechercherparCIN(String nn);
	public void clearNP();

	
	public List<Patient>ajouterdate(String nn,String DD );
	public List<Patient>ajouterNotes(String nn,String NO  );
	public List<Patient>ajouterco(String nn,int CO  );
	public List<Patient>ajouterNum(String nn,String NM );

	public List<Patient>listeDesPatients();
}
