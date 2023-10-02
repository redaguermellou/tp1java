package tp;
import java.util.Scanner;

public class tp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez le poids en kg : ");
        double poids = scanner.nextDouble();

        
        System.out.print("Entrez la taille en cm : ");
        double taille = scanner.nextDouble();

        
        double surfaceCorporelle = Math.pow(poids, 0.425) * Math.pow(taille, 0.725) * 0.202;

        
        System.out.print("Entrez le genre (H pour homme, F pour femme) : ");
        char genre = scanner.next().charAt(0);

        
        double metabolismeDeBase;
        if (Character.toUpperCase(genre) == 'H') {
            metabolismeDeBase = surfaceCorporelle * 24 * 40;
            System.out.println("Le métabolisme de base pour un homme est : " + metabolismeDeBase + " calories par jour.");
        } else if (Character.toUpperCase(genre) == 'F') {
            metabolismeDeBase = surfaceCorporelle * 24 * 35;
            System.out.println("Le métabolisme de base pour une femme est : " + metabolismeDeBase + " calories par jour.");
        } else {
            System.out.println("Genre non reconnu. Veuillez entrer 'H' pour homme ou 'F' pour femme.");
        }

        
        scanner.close();
    }
}

