package td4java;

import java.util.Scanner;

public class TestPoint {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        
	        Point p1 = new Point();
	        System.out.print("Entrez x pour Point : ");
	        int x1 = sc.nextInt();
	        System.out.print("Entrez y pour Point : ");
	        int y1 = sc.nextInt();
	        p1.initialise(x1, y1);
	        System.out.println("Point p1 initialisé : x=" + p1.getX() + ", y=" + p1.getY());

	       
	        PointA p2 = new PointA();
	        System.out.print("Entrez x pour PointA : ");
	        int x2 = sc.nextInt();
	        System.out.print("Entrez y pour PointA : ");
	        int y2 = sc.nextInt();
	        p2.initialise(x2, y2);
	        p2.affiche();

	        sc.close();
	    }
	}


