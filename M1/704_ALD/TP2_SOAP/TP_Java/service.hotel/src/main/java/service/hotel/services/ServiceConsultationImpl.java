package service.hotel.services;

import java.util.ArrayList;

import javax.jws.WebService;

import service.hotel.conceptualisation.Hotel;
import service.hotel.conceptualisation.Offre;

@WebService(endpointInterface = "service.hotel.services.ServiceConsultation")
public class ServiceConsultationImpl implements ServiceConsultation {
	private Hotel hotel;

	public ServiceConsultationImpl(Hotel hotel) {
		this.hotel = hotel;
	}

	/* Méthode de recherche de chambre dans l'hotel pour le service web */
	@Override
	public void recherche(String identifiant, String mdp, String dateDebut, String dateFin,
			int nombrePersonnes, int nombreEtoiles, double prixMin, double prixMax, String ville) {
		ArrayList<Offre> res = new ArrayList<Offre>();
		if (hotel.connexion(identifiant, mdp)) {
			hotel.rechercheChambre(nombrePersonnes, dateDebut, dateFin, prixMin, prixMax);
		}
	}

	/*Méthode qui permet d'énumérer les offres disponibles */
	@Override
	public String afficherOffres() {
		if (hotel.nombreOffres() > 0)
		{
			return hotel.enumOffre();
		}
		return "Aucune offre disponible";
	}

}
