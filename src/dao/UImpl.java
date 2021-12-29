package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Patient.User;



public class UImpl implements IGestionUser{
	public void ajouter(User p) {
		Connection cx =SingletonConnection.getInstance();
		try {
			PreparedStatement st =cx.prepareStatement("insert into user(Nom,Prenom,CodeEmp,mdp) values(?,?,?,?)");
			st.setString(1,p.getNom());
			st.setString(2, p.getPrenom());
			st.setString(3, p.getCodeEmp());
			st.setString(4, p.getmdp());
		
		
			st.executeUpdate();
		}	catch(SQLException e1) {
			e1.printStackTrace();
		}
	}
	public List<User> listeDesUsers() {
		Connection cx =SingletonConnection.getInstance();
		List<User>liste=new ArrayList<User>();
		try { PreparedStatement ps =cx.prepareStatement("select * from user");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			User p = new User();
		
			p.setNom(rs.getString(1));
			p.setPrenom(rs.getString(2));
			p.setCodeEmp(rs.getString(3));
			p.setmdp(rs.getString(4));
			
			liste.add(p);
		}
		}catch(SQLException e) {
			e.printStackTrace();}
		
		return liste;
	}
}
