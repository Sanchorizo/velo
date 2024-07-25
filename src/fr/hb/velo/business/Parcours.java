package fr.hb.velo.business;

public class Parcours {
    private Long id;
    private static Long compteur = 0L;
     private String libelle;
     private float distance;
     private static ArrayList<Localisation> maps = new ArrayList<>();
     
     //Surcharge de constructeur (overload)
      public Parcours() {
        id = ++compteur;
      }

    public Parcours(Long id, String libelle, float distance) {
    	this();
    	this.libelle = libelle;
        this.distance = distance;
    }

    

    public Long getId() {
        return id;
    }


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

	@Override
	public String toString() {
		return "Parcours [id=" + id + ", libelle=" + libelle + ", distance=" + distance + "]";
	}
    
    
      
}