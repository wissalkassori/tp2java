package exercice4;
import exercice4.Hotel;
import exercice4.Salle;
public class test {

	    public static void main(String[] args) {
	        Salle salle1 = new Salle("S1", "Atlas", 100);
	        Salle salle2 = new Salle("S2", "Business", 50);
	        Salle salle3 = new Salle("S3", "VIP", 20);
	        Salle salle4 = new Salle("S4", "Conférence Royale", 200);
	        Salle salle5 = new Salle("S5", "Meeting Prestige", 80);
	        Hotel sofitel = new Hotel("Sofitel Casablanca Tour Blanche", "Rue Sidi Belyout, Casablanca", "0522445588");
	        Hotel fourSeasons = new Hotel("Four Seasons Marrakech", "Avenue de la Ménara, Marrakech", "0524320090");
	        sofitel.ajouterSalle(salle1);
	        sofitel.ajouterSalle(salle2);
	        sofitel.ajouterSalle(salle3);

	        fourSeasons.ajouterSalle(salle4);
	        fourSeasons.ajouterSalle(salle5);
	        System.out.println(sofitel);
	        System.out.println("----------------------------------");
	        System.out.println(fourSeasons);
	    }
}
	    