package service.hotel.services;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import service.hotel.conceptualisation.Offre;

@WebService
public interface ServiceConsultation {
	String nomService = "service_consultation";

	/*
	 * Méthode de recherche d'hôtel en prenant en paramètres une ville, un
	 * intervalle de séjour, une intervalle de date, et un nombre de personnes et
	 * une intervalle de prix
	 */
	@WebMethod
	void recherche(String identifiant, String mdp, String dateDebut, String dateFin, int nombrePersonnes,
			int nombreEtoiles, double prixMin, double prixMax, String ville);

	/* Méthode qui écrit les Offres disponibles sous une chaîne de caractères */
	@WebMethod
	String afficherOffres();

}
