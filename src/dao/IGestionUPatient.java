package dao;

import java.sql.SQLException;
import java.util.List;


import Patient.UPatient;

public interface IGestionUPatient {
	public   void ajouter(UPatient p) throws SQLException ;
	public  List<UPatient>rechercherparindice(String ind);
	public List<UPatient> removePatient(String RnCIN);
	public List<UPatient>listeDesPatients();


}
