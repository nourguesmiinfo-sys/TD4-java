package td4java;

public class Point2 {
	

	
	
	    private int x;
	    private int y;

	    public Point2(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public void affCoord() {
	        System.out.println("Coordonnées : " + x + " " + y);
	    }
	}

	
	class PointNom extends Point2 {
	    private char nom;

	    public PointNom(int x, int y, char nom) {
	        super(x, y);
	        this.nom = nom;
	    }

	    public void affCoordNom() {
	        affCoord();
	        System.out.println("Nom : " + nom);
	    }
	}

	
	