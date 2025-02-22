package exercice3;


	import exercice3.Professeur;
	import exercice3.Specialite;

	public class Test {
	    public static void main(String[] args) {
	        Specialite s1 = new Specialite("JAVA", "Développement JAVA");
	        Specialite s2 = new Specialite("CSCO", "Réseaux CISCO");
	        Specialite s3 = new Specialite("GSI", "Gestion de projet");
	        Specialite s4 = new Specialite("PCEO", "PC et Ordinateurs");

	        Professeur p1 = new Professeur("Alami", "alami@gmail.com", s1);
	        Professeur p2 = new Professeur("Karim", "karim@gmail.com", s1);
	        Professeur p3 = new Professeur("Jouab", "jouab@gmail.com", s2);
	        Professeur p4 = new Professeur("Hamid", "hamid@gmail.com", s2);

	  
	        System.out.println(p1);
	        System.out.println(p2);
	        System.out.println(p3);
	        System.out.println(p4);
	    }
	}



