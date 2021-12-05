package service.hotel.conceptualisation;

public class Offre {
	private static int compteur;
	private int identifiant, nombreLits, nombrePlaces, numeroChambre;
	private String arriveeDispo, departDispo, nomHotel;
	private double prix;

	/* Constructeur offre */
	public Offre(int nombreLits, int nombrePlaces, String dateArrivee, String dateDepart, double prix, String nomHotel,
			int numeroChambre) {
		this.nomHotel = nomHotel;
		this.nombreLits = nombreLits;
		this.nombrePlaces = nombrePlaces;
		this.arriveeDispo = dateArrivee;
		this.departDispo = dateDepart;
		this.numeroChambre = numeroChambre;
		this.prix = prix;
		this.identifiant = compteur;
		compteur++;
	}

	/* Méthode d'écriture d'une offre */
	public String toString() {
		return "Offre [" + identifiant + "] : " + nomHotel + ", " + nombreLits + " lits et " + nombrePlaces
				+ " places, disponible du " + this.arriveeDispo + " au " + this.departDispo + ", numero chambre : " + this.numeroChambre;
	}

}
