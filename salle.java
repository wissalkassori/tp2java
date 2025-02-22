package exercice4;

	public class Salle {
	    private String code;
	    private String libelle;
	    private int capacite;
	    public Salle(String code, String libelle, int capacite) {
	        this.code = code;
	        this.libelle = libelle;
	        this.capacite = capacite;
	    }

	    public String getCode() {
	        return code;
	    }

	    public String getLibelle() {
	        return libelle;
	    }

	    public int getCapacite() {
	        return capacite;
	    }

	    @Override
	    public String toString() {
	        return "Salle : " + libelle + " (" + code + "), Capacité : " + capacite;
	    }
	}

