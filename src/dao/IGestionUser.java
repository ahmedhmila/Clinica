package dao;

import java.sql.SQLException;
import java.util.List;


import Patient.User;

public interface IGestionUser {
	public   void ajouter(User p) throws SQLException ;
	public List<User>listeDesUsers();
}
