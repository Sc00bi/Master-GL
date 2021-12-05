package service.hotel.conceptualisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hotel {
	private String nom;
	private int etoiles;
	private PositionGPS positionGPS;
	private Adresse adresse;
	private ArrayList<Chambre> listeChambres;
	private String adresseWeb;
	private Map<String, String> agencesPartenaires; // La liste des agences partenaires est surtout spécifié par un
													// répertoire d'identifiants d'agences associés à un mot de passe

	private ArrayList<Offre> offres;
	
	/* Constructeur d'Hotel */
	public Hotel(String nom, int etoiles, PositionGPS positionGPS, Adresse adresse) {
		this.nom = nom;
		this.etoiles = etoiles;
		this.positionGPS = positionGPS;
		this.adresse = adresse;
		this.listeChambres = new ArrayList<Chambre>();
		this.agencesPartenaires = new HashMap<String, String>();
		this.adresseWeb = "";
		this.offres = new ArrayList<Offre>();
	}

	/* Méthode toString */
	public String toString() {
		return "Hotel " + nom + ", " + etoiles + " étoiles, position GPS : {" + positionGPS + "}, Adresse : " + adresse;
	}

	/* Méthode d'ajout de chambre dans l'hotel */
	public void addChambre(Chambre chambre) {
		this.listeChambres.add(chambre);
	}

	/*
	 * Méthode d'ajout d'identifiants et mot de passe pour autoriser une nouvelle
	 * agence
	 */
	public void addAgence(String identifiant, String motDePasse) {
		this.agencesPartenaires.putIfAbsent(identifiant, motDePasse);
	}

	/* Méthode pour écrire toutes les chambres disponibles dans l'hotel */
	public String ecrireChambres() {
		StringBuilder res = new StringBuilder();
		res.append("Liste des chambres de l'hotel " + this.nom + " :\n");
		for (Chambre chambre : listeChambres) {
			res.append(chambre.toString());
			res.append('\n');
		}
		return res.toString();
	}

	/*
	 * Recherche d'une chambre sans limite de prix, retourne une offre correspondant
	 * aux critères demandés
	 */
	public void rechercheChambre(int nbPersonnes, String dateArrivee, String dateDepart, double prixMin,
			double prixMax) {
		for (Chambre chambre : listeChambres) {
			if ((chambre.nombrePlaces() >= nbPersonnes) & (chambre.estDispo(dateArrivee, dateDepart))
					& (chambre.getPrix() <= prixMax) & (chambre.getPrix() >= prixMin)) {
				Offre offre = new Offre(chambre.nombreLits(), chambre.nombrePlaces(), dateArrivee, dateDepart,
						chambre.getPrix(), this.nom, chambre.getNumero());
				this.offres.add(offre);
			}
		}
	}

	/*
	 * Méthode qui : 
	 * réserve la chambre si elle est disponible et renvoie le prix;
	 * renvoie 0.0 si la connexion a échoué (à modifier en exception) ou si la chambre n'est plus disponible (à faire en excetion également si le temps me le permet)
	 */
	public double reserverChambre(int numeroChambre, String dateArrivee, String dateDepart, String nomClient,
			String prenomClient, int moisExpirationCarte, int anneeExpirationCarte, int numeroCarte) {

		for (Chambre chambre : listeChambres) {
			if (chambre.getNumero() == numeroChambre) {
				Client client = new Client(nomClient, prenomClient, numeroCarte, moisExpirationCarte,
						anneeExpirationCarte);
				Reservation reservation = new Reservation(client, dateArrivee, dateDepart);
				if (chambre.reserver(reservation) == 1) {
					return chambre.getPrix();
				} else {
					return 0.0;
				}

			}

		}
		return 0.0;
	}
	
	/* Retourne vrai si la chambre est disponible pour l'intervalle demandé, faux sinon */
	public boolean estDispo(int numeroChambre, String dateArrivee, String dateDepart)
	{
		for(Chambre chambre : listeChambres)
		{
			if(chambre.getNumero() == numeroChambre)
			{
				return chambre.estDispo(dateArrivee, dateDepart);
			}
		}
		return false;
	}

	/* Méthode qui retourne vrai si l'agence a accès à cet hotel, faux sinon */
	public boolean connexion(String identifiant, String mdp) {
		return mdp.equals(agencesPartenaires.get(identifiant));
	}
	
	/* Méthode d'affichage des Offres proposées */
	public String enumOffre() {
		System.out.println("hey");
		StringBuilder sb = new StringBuilder("Hotel " + this.getNom() + " :\n");
		for (Offre offre : offres) {
			sb.append(offre.toString());
			sb.append('\n');
		}
		return sb.toString();
	}
	
	/* Vide la liste des offres proposées */
	public void vider()
	{
		offres.clear();
	}
	
	/* Donne le nombre d'offres disponibles */
	public int nombreOffres()
	{
		return this.offres.size();
	}

	/* === ACCESSEURS ET MUTATEURS === */

	/* Accesseur sur le nom de l'hotel */
	public String getNom() {
		return nom;
	}

	/* Mutateur sur le nom de l'hotel */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* Accesseur sur le nombre d'etoiles de l'hotel */
	public int getEtoiles() {
		return etoiles;
	}

	/* Mutateur sur le nombre d'étoiles de l'hotel */
	public void setEtoiles(int etoiles) {
		this.etoiles = etoiles;
	}

	/* Accesseur sur la position GPS de l'hotel */
	public PositionGPS getPositionGPS() {
		return positionGPS;
	}

	/* Mutateur sur la position GPS de l'hotel */
	public void setPositionGPS(PositionGPS positionGPS) {
		this.positionGPS = positionGPS;
	}

	/* Accesseur sur l'adresse de l'hotel */
	public Adresse getAdresse() {
		return adresse;
	}

	/* Mutateur sur l'adresse de l'hotel */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/* Accesseur sur la liste de chambres de l'hotel */
	public ArrayList<Chambre> getListeChambres() {
		return listeChambres;
	}

	/* Accesseur sur l'adresse Web de l'hotel */
	public String getAdresseWeb() {
		return adresseWeb;
	}

	/* Mutateur sur l'adresse web de l'hotel */
	public void setAdresseWeb(String adresseWeb) {
		this.adresseWeb = adresseWeb;
	}
}
