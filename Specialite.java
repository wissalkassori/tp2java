package exercice3;

	public class Specialite {
	    private String code;
	    private String libelle;
	    
	    public Specialite(String code, String libelle) {
	        this.code = code;
	        this.libelle = libelle;
	    }

	    public String getCode() {
	        return code;
	    }

	    public String getLibelle() {
	        return libelle;
	    }

	    @Override
	    public String toString() {
	        return "Specialité : " + libelle + " (" + code + ")";
	    }
	}


