package service.hotel;

public class CarteCredit {
	private int moisExpiration, anneeExpiration, numeroCarte;

	/* Constructeur de carte */
	public CarteCredit(int numeroCarte, int moisExpiration, int anneeExpiration) {
		this.numeroCarte = numeroCarte;
		this.moisExpiration = moisExpiration;
		this.anneeExpiration = anneeExpiration;
	}

	/* Accesseur sur le mois d'expiration */
	public int getMoisExpiration() {
		return moisExpiration;
	}

	/* Accesseur sur l'année d'expiration */
	public int getAnneeExpiration() {
		return anneeExpiration;
	}

	/* Accesseur sur le numero de carte */
	public int getNumeroCarte() {
		return numeroCarte;
	}

}
