package fr.hb.velo.business;

public class Localisation {

	
	private long id;
	private float latitude;
	private float longitude;
	public static long compteur = 0L;
	
	public Localisation() {
		id = ++compteur;
	}

	
	public Localisation(long id, float latitude, float longitude) {
		this();
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public static long getCompteur() {
		return compteur;
	}

	public static void setCompteur(long compteur) {
		Localisation.compteur = compteur;
	}
	
	
}
