package service.hotel;

import java.util.ArrayList;
import java.util.Date;

public class Chambre {
	private int numero;
	private double prix;
	private ArrayList<Lit> lits;
	private ArrayList<Reservation> reservations;

	/*
	 * Constructeur chambre prenant en parametre une liste de tailles de lits, un
	 * numero et un prix
	 */
	public Chambre(ArrayList<Integer> taillesLits, int numero, double prix) {
		this.numero = numero;
		this.prix = prix;
		this.lits = new ArrayList<Lit>();

		for (Integer taille : taillesLits) {
			lits.add(new Lit(taille));
		}
		this.reservations = new ArrayList<Reservation>();
	}

	/* Ajout d'un lit dans la chambre */
	public void addLit(int taille) {
		lits.add(new Lit(taille));
	}

	/* Recherche si la chambre est disponible pour le créneau entré en paramètre */
	public boolean estDipo(Date arrivee, Date depart) {
		for (Reservation reservee : reservations) {
			if (reservee.getDateArrivee().before(depart) || reservee.getDateDepart().after(arrivee)
					|| (reservee.getDateArrivee().equals(arrivee) && reservee.getDateDepart().equals(depart)))
				return false;
		}
		return true;
	}

	/*
	 * Recherche si la chambre est disponible pour le créneau entré en paramètre
	 * pour des dates en chaines de caracteres
	 */
	@SuppressWarnings("deprecation")
	public boolean estDipo(String arriveeS, String departS) {
		Date arrivee = new Date(departS);
		Date depart = new Date(arriveeS);
		for (Reservation reservee : reservations) {
			if (reservee.getDateArrivee().before(depart) || reservee.getDateDepart().after(arrivee)
					|| (reservee.getDateArrivee().equals(arrivee) && reservee.getDateDepart().equals(depart)))
				return false;
		}
		return true;
	}

	/* Méthode qui réserve le séjour si celui-ci est bien disponible */
	public int reserver(Reservation reservation) {
		if (this.estDipo(reservation.getDateArrivee(), reservation.getDateDepart())) {
			reservations.add(reservation);
			return 1;
		}
		return 0;

	}
	
	/* Retourne le nombre de places disponibles dans la chambre */
	public int nombrePlaces()
	{
		int compteur = 0;
		for (Lit l : lits)
		{
			compteur += l.getNbPlaces();
		}
		return compteur;
	}
	
	public String toString()
	{
		return "Chambre " + numero + ", " + this.nombrePlaces() + " personnes maximum, " + prix + " euros.";
	}

	/* === ACCESSEURS ET MUTATEURS === */

	/* Accesseur sur le numero de chambre */
	public int getNumero() {
		return numero;
	}

	/* Mutateur sur le numero de la chambre */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/* Accesseur sur le prix de la chambre */
	public double getPrix() {
		return prix;
	}

	/* Mutateurs sur le prix de la chambre */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/* Accesseur sur la liste de lits de la chambre */
	public ArrayList<Lit> getLits() {
		return lits;
	}

	/* Accesseur sur la liste de réservations de la chambre */
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

}
