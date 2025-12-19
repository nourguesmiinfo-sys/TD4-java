package td4java;
import java.util.Scanner;

public class Point {
	
	
	    private int x;
	    private int y;

	    public void initialise(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public void deplace(int dx, int dy) {
	        x += dx;
	        y += dy;
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }
	}

	
	class PointA extends Point {
	    public void affiche() {
	        System.out.println("Coordonnées : (" + getX() + " , " + getY() + ")");
	    }
	}

	
	



