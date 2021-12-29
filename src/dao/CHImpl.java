package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import AcquiClini.Chambre;


public class CHImpl implements IGestionChambres{

	
	public List<Chambre> listeDesChambres() {
		Connection cx =SingletonConnection.getInstance();
		List<Chambre>liste=new ArrayList<Chambre>();
		try { PreparedStatement ps =cx.prepareStatement("select * from t_chambre");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Chambre p = new Chambre();
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
	        p.setmaladie(rs.getString(3));
			p.setOcc(rs.getString(4));
			
			
			liste.add(p);
		}
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}

	public List<Chambre> chambresno() {
		Connection cx =SingletonConnection.getInstance();
		List<Chambre>liste=new ArrayList<Chambre>();
		try { PreparedStatement ps =cx.prepareStatement("select * from t_chambre where Occ=?");
		ps.setString(1,"NON");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Chambre p = new Chambre();
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
	        p.setmaladie(rs.getString(3));
			p.setOcc(rs.getString(4));
			
			
			liste.add(p);
		}
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}

	public List<Chambre> occchambre(String nn) {
		Connection cx =SingletonConnection.getInstance();
		List<Chambre>liste=new ArrayList<Chambre>();
		try { PreparedStatement st =cx.prepareStatement("update  t_chambre set Occ=? where Nom=?");
		st.setString(1,"OUI");
		st.setString(2, nn);
		st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;}

	@Override
	public List<Chambre> VIDchambre(String VC) {
		Connection cx =SingletonConnection.getInstance();
		List<Chambre>liste=new ArrayList<Chambre>();
		try { PreparedStatement st =cx.prepareStatement("update  t_chambre set Occ=? where Nom=?");
		st.setString(1,"NON");
		st.setString(2, VC);
		st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}
	
		
		
	
	

}
