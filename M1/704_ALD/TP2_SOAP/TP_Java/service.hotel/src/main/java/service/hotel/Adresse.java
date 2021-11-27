package service.hotel;

public class Adresse {
	
	enum TypeVoie
	{
		RUE,
		PLACE,
		AVENUE,
		BOULEVARD,
		ROUTE
	}
	
	private String ville, pays, lieuDit;
	private int numero;
	private TypeVoie voie;

}
