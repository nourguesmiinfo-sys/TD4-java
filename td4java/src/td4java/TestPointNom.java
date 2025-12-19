package td4java;

import java.util.Scanner;

public class TestPointNom {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Entrez x : ");
	        int x = sc.nextInt();
	        System.out.print("Entrez y : ");
	        int y = sc.nextInt();
	        System.out.print("Entrez le nom (un caractère) : ");
	        char nom = sc.next().charAt(0);

	        PointNom p = new PointNom(x, y, nom);
	        p.affCoordNom();

	        sc.close();
	    }
	

}


