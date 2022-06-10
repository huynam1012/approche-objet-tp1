package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressPostale adr1 = new AdressPostale();
		
		adr1.numeroRue = 5;
		adr1.libelleRue = "rue Henri Farman";
		adr1.codePostal = 34500;
		adr1.ville = "Béziers";
		
		Personne per1 = new Personne();
		
		per1.nom = "Tran";
		per1.prenom = "Nam";
		per1.adresse = adr1;
		

	}

}
