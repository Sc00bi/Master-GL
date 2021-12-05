package service.hotel.services;

import javax.jws.WebService;

import service.hotel.conceptualisation.Hotel;

@WebService(endpointInterface="service.hotel.services.ServiceReservation")
public class ServiceReservationImpl implements ServiceReservation {
	private Hotel hotel;

	/* Construction de ServiceReservationImpl */
	public ServiceReservationImpl(Hotel hotel) {
		this.hotel = hotel;
	}

	/*
	 * Réserve la chambre et renvoie le prix de la chambre, renvoie 0.0 si la
	 * réservation a échoué
	 */
	@Override
	public double reservation(String identifiant, String mdp, int numeroChambre, String dateArrivee, String dateDepart,
			String nom, String prenom, int numeroCarte, int moisExpiration, int anneeExpiration) {
		if (hotel.connexion(identifiant, mdp) & hotel.estDispo(numeroChambre, dateArrivee, dateDepart)) {
			return hotel.reserverChambre(numeroChambre, dateArrivee, dateDepart, nom, prenom, moisExpiration,
					anneeExpiration, numeroCarte);
		}
		return 0.0;
	}

}
