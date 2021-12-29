package Patient;




public class User { public int id ;
public String nom ;
public String prenom;
public String CodeEmp ;
public String mdp ;

public static int cpt ;





public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public String getPrenom() {
	return prenom;
}



public void setPrenom(String prenom) {
	this.prenom = prenom;
}



public String getCodeEmp() {
	return CodeEmp;
}



public void setCodeEmp(String CodeEmp) {
	this.CodeEmp = CodeEmp;
}



public String getmdp() {
	return mdp;
}


public void setmdp(String mdp) {
	this.mdp = mdp;
}




public User(String nom, String prenom, String CodeEmp, String mdp ) {
	super();
	

this.nom = nom;
this.prenom = prenom;
this.CodeEmp = CodeEmp;
this.mdp = mdp;

}



public User() {
}


public int getInt() {
	// TODO Auto-generated method stub
	return 0;
}

}
