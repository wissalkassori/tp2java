package tp2;

public class cercle {
		
	    private Point centre;
	    private double rayon;

	    public Cercle(Point centre, double rayon) {
	        this.centre = centre;
	        this.rayon = rayon;
	    }

	    public double perimetre() {
	        return 2 * Math.PI * rayon;
	    }



