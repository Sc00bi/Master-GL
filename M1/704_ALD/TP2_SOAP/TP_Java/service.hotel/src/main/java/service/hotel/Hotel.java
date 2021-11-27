package service.hotel;

import java.util.ArrayList;

public class Hotel {
	private String nom;
	private int etoiles;
	private PositionGPS positionGPS;
	private Adresse adresse;
	private ArrayList<Chambre> listeChambres;
	
	/* Constructeur d'Hotel */
	public Hotel(String nom, int etoiles, PositionGPS positionGPS, Adresse adresse)
	{
		this.nom = nom;
		this.etoiles = etoiles;
		this.positionGPS = positionGPS;
		this.adresse = adresse;
		this.listeChambres = new ArrayList<Chambre>();
	}
	
	/* Méthode toString */
	public String toString()
	{
		return "Hotel " + nom + ", " + etoiles + " étoiles, position GPS : {" + positionGPS + "}, Adresse : " + adresse;
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

	/* Accesseur sur la liste de chambres de l'hotel*/
	public ArrayList<Chambre> getListeChambres() {
		return listeChambres;
	}
}
