package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Patient.Patient;

public class PAImpl implements IGestionPatient{
	

	public void ajouter(Patient p) {
		Connection cx =SingletonConnection.getInstance();
		try {
			PreparedStatement st =cx.prepareStatement("insert into t_patient(Nom,Prenom,Sexe,nCIN,adresse,maladie,dNai,Notes,NbrC,PrCo,Num) values(?,?,?,?,?,?,?,?,?,?,?)");
			st.setString(1,p.getNom());
			st.setString(2, p.getPrenom());
			st.setString(3, p.getSexe());
			st.setString(4, p.getnCIN());
			st.setString(5, p.getadresse());
			st.setString(6, p.getMaladie());
			st.setString(7, p.getdNai());
			st.setString(8, p.getNotes());
			st.setInt(9, p.getNbrC());
			st.setString(10, p.getPrCo());
			st.setString(11, p.getNum());
		
			st.executeUpdate();
		}	catch(SQLException e1) {
			e1.printStackTrace();
		}
	}

	
	public List<Patient> rechercherparindice(String ind) {
		Connection cx =SingletonConnection.getInstance();
		List<Patient>liste=new ArrayList<Patient>();
		try {PreparedStatement ps =cx.prepareStatement("select * from t_patient where dNai like ?");
		ps.setString(1, "%"+ind+"%");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Patient p = new Patient();
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
			p.setPrenom(rs.getString(3));
			p.setSexe(rs.getString(4));
			p.setnCIN(rs.getString(5));
			p.setadresse(rs.getString(6));
			p.setmaladie(rs.getString(7));
			p.setdNai(rs.getString(8));
			p.setNotes(rs.getString(9));
			p.setNbrC(rs.getInt(10));
			p.setPrCo(rs.getString(11));
			p.setNum(rs.getString(12));
			liste.add(p);}}
		catch(SQLException e) {
			e.printStackTrace();}
		return liste;
	}


	


	public List<Patient> listeDesPatients() {
		Connection cx =SingletonConnection.getInstance();
		List<Patient>liste=new ArrayList<Patient>();
		try { PreparedStatement ps =cx.prepareStatement("select * from t_patient");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Patient p = new Patient();
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
			p.setPrenom(rs.getString(3));
			p.setSexe(rs.getString(4));
			p.setnCIN(rs.getString(5));
			p.setadresse(rs.getString(6));
			p.setmaladie(rs.getString(7));
			p.setdNai(rs.getString(8));
			p.setNotes(rs.getString(9));
			p.setNbrC(rs.getInt(10));
			p.setPrCo(rs.getString(11));
			p.setNum(rs.getString(12));
			liste.add(p);
		}
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}

	


	public  List<Patient> removePatient(String RnCIN) {
		Connection cx =SingletonConnection.getInstance();
		List<Patient>liste=new ArrayList<Patient>();
		try { PreparedStatement st =cx.prepareStatement("delete  from t_patient where nCIN=?");
		st.setString(1, RnCIN);
		st.executeUpdate();}
		catch(SQLException e) {
			e.printStackTrace();}
		return liste;
		
		
	}



	public List<Patient> rechercherparCIN(String nn) {
		Connection cx =SingletonConnection.getInstance();
		List<Patient>liste=new ArrayList<Patient>();
		try {PreparedStatement ps =cx.prepareStatement("select * from t_patient where nCIN like ?");
		ps.setString(1, "%"+nn+"%");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Patient p = new Patient();
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
			p.setPrenom(rs.getString(3));
			p.setSexe(rs.getString(4));
			p.setnCIN(rs.getString(5));
			p.setadresse(rs.getString(6));
			p.setmaladie(rs.getString(7));
			p.setdNai(rs.getString(8));
		
			p.setNotes(rs.getString(9));
			p.setNbrC(rs.getInt(10));
			p.setPrCo(rs.getString(11));
			p.setNum(rs.getString(12));
			
			liste.add(p);}}
		catch(SQLException e) {
			e.printStackTrace();}
		return liste;
		
	}


	@Override
	public void clearNP() {
	Connection cx =SingletonConnection.getInstance();
		
		try { PreparedStatement st =cx.prepareStatement("TRUNCATE TABLE t_patient;");
		

		st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();}
		

		
	}



	


	@Override
	public List<Patient> ajouterdate(String nn, String DD) {
		Connection cx =SingletonConnection.getInstance();
		List<Patient>liste=new ArrayList<Patient>();
		try { PreparedStatement st =cx.prepareStatement(" update  t_patient set PrCo=? where nCIN=?");
		

		st.setString(1, DD);
		st.setString(2, nn);
		st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}


	@Override
	public List<Patient> ajouterNotes(String nn, String NO) {
		Connection cx =SingletonConnection.getInstance();
		List<Patient>liste=new ArrayList<Patient>();
		try { PreparedStatement st =cx.prepareStatement(" update  t_patient set Notes=? where nCIN=?");
		

		st.setString(1, NO);
		st.setString(2, nn);
		st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}


	@Override
	public List<Patient> ajouterco(String nn, int CO) {
		Connection cx =SingletonConnection.getInstance();
		List<Patient>liste=new ArrayList<Patient>();
		try { PreparedStatement st =cx.prepareStatement(" update  t_patient set NbrC=? where nCIN=?");
		

		st.setInt(1, CO);
		st.setString(2, nn);
		st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}


	@Override
	public List<Patient> ajouterNum(String nn, String NM) {
		Connection cx =SingletonConnection.getInstance();
		List<Patient>liste=new ArrayList<Patient>();
		try { PreparedStatement st =cx.prepareStatement(" update  t_opatient set Num=? where nCIN=?");
		

		st.setString(1, NM);
		st.setString(2, nn);
		st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}

}
