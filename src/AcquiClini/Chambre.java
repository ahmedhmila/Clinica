package AcquiClini;

public class Chambre {

	
		public int id ;
		public String nom ;
		public String prenom;
		public String Occ ;
		public String Maladie;
		




		public String getNom() {
			return nom;
		}



		public void setNom(String nom) {
			this.nom = nom;
		}





		


		public String getOcc() {
			return Occ;
		}




		public void setOcc(String Occ) {
			this.Occ = Occ;
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









		public Chambre(String nom, String Maladie, String Occ) {
		super();

		this.nom = nom;
		this.Occ=Occ;
		this.Maladie=Maladie;

		}



		public Chambre() {
		}

		}





