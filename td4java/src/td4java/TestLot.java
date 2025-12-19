package td4java;

import java.util.Scanner;

public class TestLot {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Lot lot = new Lot(10);

	        for (int i = 0; i < 7; i++) {
	            System.out.println("=== Stylo " + (i+1) + " ===");
	            System.out.print("Référence : "); int ref = sc.nextInt(); sc.nextLine();
	            System.out.print("Descriptif : "); String desc = sc.nextLine();
	            System.out.print("Marque : "); String marque = sc.nextLine();
	            System.out.print("Prix : "); double prix = sc.nextDouble();
	            System.out.print("Couleur (entier) : "); int couleur = sc.nextInt();
	            Stylo s = new Stylo(ref, desc, marque, prix, couleur);
	            lot.ajouterArticle(s, i);
	        }

	       
	        for (int i = 7; i < 10; i++) {
	            System.out.println("=== Ramette " + (i-6) + " ===");
	            System.out.print("Référence : "); int ref = sc.nextInt(); sc.nextLine();
	            System.out.print("Descriptif : "); String desc = sc.nextLine();
	            System.out.print("Marque : "); String marque = sc.nextLine();
	            System.out.print("Prix : "); double prix = sc.nextDouble();
	            System.out.print("Grammage : "); int grammage = sc.nextInt();
	            RamettePapier r = new RamettePapier(ref, desc, marque, prix, grammage);
	            lot.ajouterArticle(r, i);
	        }

	       
	        System.out.println("\n--- Articles du lot ---");
	        for (int i = 0; i < 10; i++) {
	            Article a = lot.getArticle(i);
	            if (a != null) System.out.println(a);
	        }

	      
	        System.out.println("\nFacture totale : " + lot.calculerFacture());

	        
	        System.out.print("\nIndice de l'article à supprimer (0-9) : ");
	        int indSup = sc.nextInt();
	        lot.supprimerArticle(indSup);

	       
	        System.out.println("\nNouvelle facture totale : " + lot.calculerFacture());

	        sc.close();
	    }
	




}
