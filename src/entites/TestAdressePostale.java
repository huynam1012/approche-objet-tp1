package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale();
				
		adr1.numeroRue = 5;
		adr1.libelleRue = "rue Henri Farman";
		adr1.codePostal = 34500;
		adr1.ville = "Béziers";
				
		AdressePostale adr2 = new AdressePostale();
				
		adr2.numeroRue = 15;
		adr2.libelleRue = "rue Henri Jack";
		adr2.codePostal = 34000;
		adr2.ville = "Montpellier";
				

	}

}
