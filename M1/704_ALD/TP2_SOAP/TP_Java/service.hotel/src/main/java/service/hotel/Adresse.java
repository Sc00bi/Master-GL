package service.hotel;

public class Adresse {

	enum TypeVoie {
		RUE("rue"), PLACE("pl"), AVENUE("av"), BOULEVARD("bvd"), ROUTE("rt");

		private String abrevation;

		private TypeVoie(String abrevation) {
			this.abrevation = abrevation;
		}

		public String getAbrevation() {
			return this.abrevation;
		}
	}

	private String ville, pays, lieuDit, nomVoie;
	private int numero;
	private TypeVoie typeVoie;

	/* Constructeur d'adresse */
	public Adresse(String pays, String ville, String nomVoie, String lieuDit, int numero, TypeVoie voie) {
		this.pays = pays;
		this.ville = ville;
		this.nomVoie = nomVoie;
		this.lieuDit = lieuDit;
		this.numero = numero;
		this.typeVoie = voie;
	}

	/*
	 * Constructeur d'adresse qui associe le type de voie à rue par défault et lieu
	 * dit à vide
	 */
	public Adresse(String pays, String ville, String nomVoie, int numero) {
		this.pays = pays;
		this.ville = ville;
		this.nomVoie = nomVoie;
		this.lieuDit = "";
		this.numero = numero;
		this.typeVoie = TypeVoie.RUE;
	}
	
	public String toString()
	{
		return numero + " " + lieuDit + typeVoie.getAbrevation() + " " + nomVoie + ", " + ville + ", " + pays;
	}

	/* === ACCESSEURS ET MUTATEURS === */

	/* Accesseur sur le nom de la voie de l'adresse */
	public String getNomVoie() {
		return nomVoie;
	}

	/* Mutateur sur le nom de la voie de l'adresse */
	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	/* Accesseur sur la ville de l'adresse */
	public String getVille() {
		return ville;
	}

	/* Mutateur sur la ville de l'adresse */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/* Accesseur sur le pays de l'adresse */
	public String getPays() {
		return pays;
	}

	/* Mutateur sur le pays de l'adresse */
	public void setPays(String pays) {
		this.pays = pays;
	}

	/* Accesseur sur le lieu dit de l'adresse */
	public String getLieuDit() {
		return lieuDit;
	}

	/* Mutateur sur le lieu-dit de l'adresse */
	public void setLieuDit(String lieuDit) {
		this.lieuDit = lieuDit;
	}

	/* Accesseur sur le numero de l'adresse */
	public int getNumero() {
		return numero;
	}

	/* Mutateur sur le numero de l'adresse */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/* Accesseur sur le numero de la voie */
	public TypeVoie getVoie() {
		return typeVoie;
	}

	/* Mutateur sur le numero de la voie */
	public void setVoie(TypeVoie voie) {
		this.typeVoie = voie;
	}

}
