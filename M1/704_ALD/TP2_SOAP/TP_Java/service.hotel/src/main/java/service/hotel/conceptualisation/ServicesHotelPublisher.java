package service.hotel.conceptualisation;

import java.util.ArrayList;

import javax.xml.ws.Endpoint;

import service.hotel.conceptualisation.Adresse.TypeVoie;
import service.hotel.services.ServiceConsultation;
import service.hotel.services.ServiceConsultationImpl;
import service.hotel.services.ServiceReservation;
import service.hotel.services.ServiceReservationImpl;

public class ServicesHotelPublisher {

	@SuppressWarnings("static-access")
	public static void main(String[] agrs) {
		/* === Création d'hotels dans le code === */

		// Pour une chambre avec un lit simple
		ArrayList<Integer> formule1 = new ArrayList<Integer>();
		formule1.add(1);

		// Pour une chambre avec un lit double
		ArrayList<Integer> formule2 = new ArrayList<Integer>();
		formule2.add(2);

		// Pour une chambre avec un lit double et un lit simple
		ArrayList<Integer> formule3 = new ArrayList<Integer>();
		formule3.add(2);
		formule3.add(1);

		// Pour une chambre avec deux lits doubles
		ArrayList<Integer> formule4 = new ArrayList<Integer>();
		formule4.add(2);
		formule4.add(2);

		// Pour une chambre avec deux lits simples
		ArrayList<Integer> formule5 = new ArrayList<Integer>();
		formule5.add(1);
		formule5.add(1);

		/* Création de l'hotel Corwn Plaza Montpellier */
		PositionGPS gpsCrown = new PositionGPS(43.6120942, 3.8844784);
		Adresse adrCrown = new Adresse("France", "Montpellier", "d'Argencourt", 190);
		Hotel crown = new Hotel("Crowne Plaza", 4, gpsCrown, adrCrown);
		System.out.println(crown);
		crown.addAgence("VoyageLuxe", "sansdents");
		crown.addAgence("SudVacances", "NinoFerrer");
		crown.setAdresseWeb("http://localhost:8080/Crown_Plaza_");

		Chambre chambre101plaza = new Chambre(formule1, 101, 60.0);
		Chambre chambre102plaza = new Chambre(formule1, 102, 60.0);
		Chambre chambre103plaza = new Chambre(formule2, 103, 75.5);
		Chambre chambre104plaza = new Chambre(formule2, 104, 75.5);
		Chambre chambre105plaza = new Chambre(formule3, 105, 80.0);
		Chambre chambre106plaza = new Chambre(formule3, 106, 80.0);
		Chambre chambre107plaza = new Chambre(formule4, 107, 87.0);
		Chambre chambre108plaza = new Chambre(formule4, 108, 87.0);
		Chambre chambre109plaza = new Chambre(formule5, 109, 65.0);
		Chambre chambre110plaza = new Chambre(formule5, 110, 65.0);
		Chambre chambre111plaza = new Chambre(formule5, 111, 65.0);

		crown.addChambre(chambre101plaza);
		crown.addChambre(chambre102plaza);
		crown.addChambre(chambre103plaza);
		crown.addChambre(chambre104plaza);
		crown.addChambre(chambre105plaza);
		crown.addChambre(chambre106plaza);
		crown.addChambre(chambre107plaza);
		crown.addChambre(chambre108plaza);
		crown.addChambre(chambre109plaza);
		crown.addChambre(chambre110plaza);
		crown.addChambre(chambre111plaza);

		/* Création de l'hotel Ritz à paris */
		PositionGPS gpsRitz = new PositionGPS(48.868730, 2.328455);
		Adresse adrRitz = new Adresse("France", "Paris", "Vendôme", "", 15, TypeVoie.PLACE);
		Hotel ritz = new Hotel("Ritz Paris", 5, gpsRitz, adrRitz);
		ritz.addAgence("VoyageLuxe", "sansdents");
		ritz.setAdresseWeb("http://localhost:8081/Ritz_Paris_");

		Chambre chambre1ritz = new Chambre(formule2, 1, 230.0);
		Chambre chambre2ritz = new Chambre(formule2, 104, 230.0);
		Chambre chambre3ritz = new Chambre(formule3, 105, 300.0);
		Chambre chambre4ritz = new Chambre(formule3, 106, 300.0);
		Chambre chambre5ritz = new Chambre(formule4, 107, 420.0);
		Chambre chambre6ritz = new Chambre(formule4, 108, 420.0);
		Chambre suitePresidentielle = new Chambre(formule4, 161, 1312.0);

		ritz.addChambre(chambre1ritz);
		ritz.addChambre(chambre2ritz);
		ritz.addChambre(chambre3ritz);
		ritz.addChambre(chambre4ritz);
		ritz.addChambre(chambre5ritz);
		ritz.addChambre(chambre6ritz);
		ritz.addChambre(suitePresidentielle);

		/* Création de l'hotel Ibis Budget à Sète */
		PositionGPS gpsIbis = new PositionGPS(43.406327, 3.704961);
		Adresse adrIbis = new Adresse("France", "Sète", "du Maréchal Juin", "", 164, TypeVoie.AVENUE);
		Hotel ibis = new Hotel("Ibis Sète Centre", 2, gpsIbis, adrIbis);
		ibis.addAgence("SudVacances", "NinoFerrer");
		ibis.setAdresseWeb("http://localhost:8082/Ibis_Sete_");

		Chambre chambre101ibis = new Chambre(formule1, 101, 35.0);
		Chambre chambre102ibis = new Chambre(formule1, 102, 35.0);
		Chambre chambre103ibis = new Chambre(formule5, 103, 42.0);
		Chambre chambre201ibis = new Chambre(formule5, 201, 42.0);
		Chambre chambre202ibis = new Chambre(formule3, 202, 47.0);
		Chambre chambre203ibis = new Chambre(formule3, 203, 47.0);
		Chambre chambre204ibis = new Chambre(formule3, 204, 47.0);
		Chambre chambre301ibis = new Chambre(formule4, 301, 55.0);
		Chambre chambre302ibis = new Chambre(formule4, 302, 55.0);
		Chambre chambre303ibis = new Chambre(formule4, 303, 55.0);
		Chambre chambre304ibis = new Chambre(formule4, 304, 55.0);

		ibis.addChambre(chambre101ibis);
		ibis.addChambre(chambre102ibis);
		ibis.addChambre(chambre103ibis);
		ibis.addChambre(chambre201ibis);
		ibis.addChambre(chambre202ibis);
		ibis.addChambre(chambre203ibis);
		ibis.addChambre(chambre204ibis);
		ibis.addChambre(chambre301ibis);
		ibis.addChambre(chambre302ibis);
		ibis.addChambre(chambre303ibis);
		ibis.addChambre(chambre304ibis);

		/* Publication des services web */
		ServiceConsultation consIbis = new ServiceConsultationImpl(ibis);
		ServiceReservation resaIbis = new ServiceReservationImpl(ibis);
		ServiceConsultation consCrown = new ServiceConsultationImpl(crown);
		ServiceReservation resaCrown = new ServiceReservationImpl(crown);
		ServiceConsultation consRitz = new ServiceConsultationImpl(ritz);
		ServiceReservation resaRitz = new ServiceReservationImpl(ritz);

		System.out.println(ibis.getAdresseWeb() + consIbis.nomService);

		Endpoint.publish(ibis.getAdresseWeb() + consIbis.nomService, new ServiceConsultationImpl(ibis));
		System.err.println("Serveur : consultation ibis prêt");
		System.out.println(ibis.getAdresseWeb() + consIbis.nomService);
		Endpoint.publish(ibis.getAdresseWeb() + resaIbis.nomService, new ServiceReservationImpl(ibis));
		System.err.println("Serveur : reservation ibis prêt");
		System.out.println(ibis.getAdresseWeb() + resaIbis.nomService);

		Endpoint.publish(crown.getAdresseWeb() + consCrown.nomService, new ServiceConsultationImpl(crown));
		System.err.println("Serveur : consultation crown prêt");
		System.out.println(crown.getAdresseWeb() + consCrown.nomService);
		Endpoint.publish(crown.getAdresseWeb() + resaCrown.nomService, new ServiceReservationImpl(crown));
		System.err.println("Serveur : reservation crown prêt");
		System.out.println(crown.getAdresseWeb() + resaCrown.nomService);

		Endpoint.publish(ritz.getAdresseWeb() + consRitz.nomService, new ServiceConsultationImpl(ritz));
		System.err.println("Serveur : consultation ritz prêt");
		System.out.println(ritz.getAdresseWeb() + consRitz.nomService);
		Endpoint.publish(ritz.getAdresseWeb() + resaRitz.nomService, new ServiceReservationImpl(ritz));
		System.err.println("Serveur : reservation ritz prêt");
		System.out.println(ritz.getAdresseWeb() + resaRitz.nomService);

		/* == Jeu de tests === */
		/*
		 * serv.recherche("SudVacances", "NinoFerrer", "2022/08/09", "2022/08/15", 3, 2,
		 * 10.0, 100.0, "Sète"); System.out.println(serv.afficherOffres());
		 * 
		 * double prix = servR.reservation("SudVacances", "NinoFerrer",
		 * 202,"2022/08/09", "2022/08/15", "tom", "bros", 21901981, 9, 22);
		 * System.out.println(prix);
		 */
	}

}
