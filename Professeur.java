package exercice3;

	public class Professeur {
	    private String nom;
	    private String email;
	    private Specialite specialite;
	    
	    public Professeur(String nom, String email, Specialite specialite) {
	        this.nom = nom;
	        this.email = email;
	        this.specialite = specialite;
	    }
          public String getNom() {
	        return nom;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public Specialite getSpecialite() {
	        return specialite;
	    }

	    @Override
	    public String toString() {
	        return "Professeur : " + nom + " - Email : " + email + " - " + specialite;
	    }
	}

