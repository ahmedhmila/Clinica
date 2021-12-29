package Patient;

public class UPatient {
	public int id ;
	public String nom ;
	public String prenom;

	public String nCIN ;
	public String Age;
	public String Chambre;
	public String Maladie;
	




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



	


	public String getnCIN() {
		return nCIN;
	}




	public void setnCIN(String nCIN) {
		this.nCIN = nCIN;
	}


	public String getAge() {
		return Age;
	}



	public void setAge(String Age) {
		this.Age = Age;
	} 

	public String getChambre() {
		return Chambre;
	}



	public void setChambre(String Chambre) {
		this.Chambre = Chambre;
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









	public UPatient(String nom, String prenom,  String nCIN, String Age,String Maladie, String Chambre) {
	super();

	this.nom = nom;
	this.prenom = prenom;
	this.Age = Age;
	this.nCIN = nCIN;
	this.Chambre=Chambre;
	this.Maladie=Maladie;

	}



	public UPatient() {
	}

	}



