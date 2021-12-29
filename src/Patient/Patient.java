package Patient;

public class Patient { public int id ;
public String nom ;
public String prenom;
public String sexe ;
public String nCIN ;
public String adresse;
public String dNai;
public String Maladie;
private String Notes;
private int NbrC;
private String PrCo;
private String Num;
public static int cpt ;



public String getNum() {
	return Num;
}


public void setNum(String num) {
	Num = num;
}


public int getNbrC() {
	return NbrC;
}


public void setNbrC(int nbrC) {
	NbrC = nbrC;
}

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



public String getSexe() {
	return sexe;
}



public void setSexe(String sexe) {
	this.sexe = sexe;
}



public String getnCIN() {
	return nCIN;
}

public String getPrCo() {
	return PrCo;
}


public void setPrCo(String prCo) {
	PrCo = prCo;
}


public String getNotes() {
	return Notes;
}


public void setNotes(String notes) {
	Notes = notes;
}




public void setnCIN(String nCIN) {
	this.nCIN = nCIN;
}


public String getadresse() {
	return adresse;
}



public void setadresse(String adresse) {
	this.adresse = adresse;
} 

public String getdNai() {
	return dNai;
}



public void setdNai(String dNai) {
	this.dNai = dNai;
}




public String getMaladie() {
	return Maladie;
}



public void setmaladie(String Maladie) {
	this.Maladie = Maladie;
}

public int getId() {
	return id;
}

public void  setId(int id) {
this.id=id;
}









public Patient(String nom, String prenom, String sexe, String nCIN, String adresse, String Maladie, String dNai,
		String notes, int nbrC, String prCo,String num) {
	super();
	Notes = notes;
	NbrC = nbrC;
	PrCo = prCo;
	Num=num;

this.nom = nom;
this.prenom = prenom;
this.sexe = sexe;
this.nCIN = nCIN;
this.adresse=adresse;
this.Maladie=Maladie;
this.dNai=dNai;
}



public Patient() {
}


public int getInt() {
	// TODO Auto-generated method stub
	return 0;
}

}
