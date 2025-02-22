package exercice4;

	import java.util.ArrayList;
	import java.util.List;

	public class Hotel {
	    private String nom;
	    private String adresse;
	    private String telephone;
	    private List<Salle> salles;
	    public Hotel(String nom, String adresse, String telephone) {
	        this.nom = nom;
	        this.adresse = adresse;
	        this.telephone = telephone;
	        this.salles = new ArrayList<>();
	    }

	    public void ajouterSalle(Salle salle) {
	        salles.add(salle);
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("🏨 Hôtel : ").append(nom).append("\n");
	        sb.append("📍 Adresse : ").append(adresse).append("\n");
	        sb.append("📞 Téléphone : ").append(telephone).append("\n");
	        sb.append("📋 Salles disponibles :\n");
	        for (Salle salle : salles) {
	            sb.append("   ➜ ").append(salle).append("\n");
	        }
	        return sb.toString();
	    }
	}
