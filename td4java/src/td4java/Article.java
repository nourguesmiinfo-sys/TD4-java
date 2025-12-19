package td4java;
import java.util.Scanner;
public class Article {
	

	
	
	    private int reference;
	    private String descriptif;
	    private String marque;
	    private double prixUnitaire;

	    public Article(int reference, String descriptif, String marque, double prixUnitaire) {
	        this.reference = reference;
	        this.descriptif = descriptif;
	        this.marque = marque;
	        this.prixUnitaire = prixUnitaire;
	    }

	    public double getPrix() {
	        return prixUnitaire;
	    }

	    public String toString() {
	        return "Réf : " + reference + ", Descriptif : " + descriptif + ", Marque : " + marque + ", Prix : " + prixUnitaire;
	    }
	}

	
	class Stylo extends Article {
	    private int couleur;

	    public Stylo(int reference, String descriptif, String marque, double prixUnitaire, int couleur) {
	        super(reference, descriptif, marque, prixUnitaire);
	        this.couleur = couleur;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Couleur : " + couleur;
	    }
	}

	
	class RamettePapier extends Article {
	    private int grammage;

	    public RamettePapier(int reference, String descriptif, String marque, double prixUnitaire, int grammage) {
	        super(reference, descriptif, marque, prixUnitaire);
	        this.grammage = grammage;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Grammage : " + grammage;
	    }
	}

	
	class Lot {
	    private Article[] articles;
	    private int nbArticles;

	    public Lot(int nbArticles) {
	        this.nbArticles = nbArticles;
	        articles = new Article[nbArticles];
	    }

	    public Article getArticle(int i) {
	        return articles[i];
	    }

	    public boolean ajouterArticle(Article a, int indice) {
	        if (indice >= 0 && indice < nbArticles) {
	            articles[indice] = a;
	            return true;
	        }
	        return false;
	    }

	    public boolean supprimerArticle(int indice) {
	        if (indice >= 0 && indice < nbArticles) {
	            articles[indice] = null;
	            return true;
	        }
	        return false;
	    }

	    public double calculerFacture() {
	        double total = 0;
	        for (Article a : articles) {
	            if (a != null) total += a.getPrix();
	        }
	        return total;
	    }
	}

	
	
