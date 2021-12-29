package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Patient.UPatient;

public class UPImpl implements IGestionUPatient{

	@Override
	public void ajouter(UPatient p) throws SQLException {
		Connection cx =SingletonConnection.getInstance();
		try {
		PreparedStatement st =cx.prepareStatement("insert into t_upatient(Nom,Prenom,nCIN,Age,maladie,Chambre) values(?,?,?,?,?,?)");
		st.setString(1,p.getNom());
		st.setString(2, p.getPrenom());
	
		st.setString(3, p.getnCIN());
		st.setString(4, p.getAge());
		
		st.setString(5, p.getMaladie());
		st.setString(6, p.getChambre());
		st.executeUpdate();
	}	catch(SQLException e1) {
		e1.printStackTrace();
	}

		
	}

	@Override
	public List<UPatient> rechercherparindice(String ind) {
		
		return null;
	}

	@Override
	public List<UPatient> removePatient(String RnCIN) {
		Connection cx =SingletonConnection.getInstance();
		List<UPatient>liste=new ArrayList<UPatient>();
		try { PreparedStatement st =cx.prepareStatement("delete  from t_upatient where nCIN=?");
		st.setString(1, RnCIN);
		st.executeUpdate();}
		catch(SQLException e) {
			e.printStackTrace();}
		return liste;
	}

	@Override
	public List<UPatient> listeDesPatients() {
		Connection cx =SingletonConnection.getInstance();
		List<UPatient>liste=new ArrayList<UPatient>();
		try { PreparedStatement ps =cx.prepareStatement("select * from t_upatient");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			UPatient p = new UPatient();
			p.setNom(rs.getString(2));
			p.setPrenom(rs.getString(3));
		
			p.setnCIN(rs.getString(4));
			p.setAge(rs.getString(5));
			
			p.setmaladie(rs.getString(6));
			p.setChambre(rs.getString(7));
			
			liste.add(p);
		}
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}

}
