package service.hotel.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ServiceReservation {
	String nomService = "service_reservation";

	/*
	 * Méthode de réservation d'hotel prennant en paramètre les informations client
	 * et l'identifiant d'offre
	 */
	@WebMethod
	double reservation(String identifiant, String mdp, int numeroChambre, String dateArrivee, String dateDepart,
			String nom, String prenom, int numeroCarte, int moisExpiration, int anneeExpiration);

}
