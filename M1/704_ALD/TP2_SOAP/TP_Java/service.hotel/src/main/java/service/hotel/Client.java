package service.hotel;

public class Client {
	private String nom, prenom;
	private CarteCredit carte;

	/* Constructeur qui prend en paramètre une CarteCredit */
	public Client(String nom, String prenom, CarteCredit carte) {
		this.nom = nom;
		this.prenom = prenom;
		this.carte = carte;
	}

	/* Constructeur qui prend en paramètre une CarteCredit */
	public Client(String nom, String prenom, int numeroCarte, int moisExpiration, int anneeExpiration) {
		this.nom = nom;
		this.prenom = prenom;
		this.carte = new CarteCredit(numeroCarte, moisExpiration, anneeExpiration);
	}

	/* Accesseur sur le nom du client */
	public String getNom() {
		return nom;
	}

	/* Mutateur sur le nom du client */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* Accesseur sur le prenom du client */
	public String getPrenom() {
		return prenom;
	}

	/* Mutateur sur le prenom du client */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/* Accesseur sur la carte du client */
	public CarteCredit getCarte() {
		return carte;
	}

}
