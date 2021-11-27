package service.hotel;

import java.util.Date;

public class Reservation {
	private Date dateArrivee, dateDepart;
	private Client client;

	/* Constructeur de Reservation avec tous les paramètres nécessaires */
	Reservation(Client client, int anneeArrivee, int moisArrivee, int jourArrivee, int anneeDepart, int moisDepart,
			int jourDepart) {
		this.dateArrivee = new Date(anneeArrivee, moisArrivee, jourArrivee);
		this.dateDepart = new Date(anneeDepart, moisDepart, jourDepart);
		this.client = client;
	}

	/* Constructeur utilisant des chaînes de caractères pour entrer les Dates */
	public Reservation(Client client, String dateArrivee, String dateDepart) {
		this.dateArrivee = new Date(dateArrivee);
		this.dateDepart = new Date(dateDepart);
		this.client = client;

	}

	/* Accesseur sur la date d'arrivée de la réservation */
	public Date getDateArrivee() {
		return dateArrivee;
	}

	/* Mutateur sur lla date d'arrivée de la réservation */
	public void setDateArrive(String dateArrivee) {
		this.dateArrivee = new Date(dateArrivee);
	}

	/* Accesseur sur la date de départ de la réservation */
	public Date getDateDepart() {
		return dateDepart;
	}

	/* Mutateur sur la date de départ de la réservation */
	public void setDateDepart(String dateDepart) {
		this.dateDepart = new Date(dateDepart);
	}

	/* Accesseur sur la date de départ de la réservation */
	public Client getClient() {
		return client;
	}

	/* Mutateur sur le client de la réservation */
	public void setClient(Client client) {
		this.client = client;
	}

}
