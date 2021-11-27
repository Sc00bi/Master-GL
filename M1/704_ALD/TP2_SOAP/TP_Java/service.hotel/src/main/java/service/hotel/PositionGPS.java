package service.hotel;

public class PositionGPS {
	private double latitude, longitude;

	/* Constructeur de coordonnées GPS */
	public PositionGPS(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/* Methode toString() */
	public String toString() {
		return latitude + " ; " + longitude;
	}

	/* Accesseur sur la lattitude */
	public double getLatitude() {
		return latitude;
	}

	/* Accesseur sur la longitude */
	public double getLongitude() {
		return longitude;
	}

}
