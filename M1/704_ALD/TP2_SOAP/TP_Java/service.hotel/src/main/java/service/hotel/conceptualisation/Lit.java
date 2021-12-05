package service.hotel.conceptualisation;

public class Lit {
	private int nbPlaces;

	/* Constructeur par défaut qui construit un lit simple */
	public Lit() {
		this.nbPlaces = 2;
	}

	/* Constructeur qui prend en paramètre le nombre de places du lit */
	public Lit(int nombrePlaces) {
		this.nbPlaces = nombrePlaces;
	}

	/* Accesseur sur le nombre de places du lit */
	public int getNbPlaces() {
		return nbPlaces;
	}

}
