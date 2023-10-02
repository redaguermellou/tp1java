package tp;

import java.util.Scanner;

public class tp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Entrez la longueur du côté a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la longueur du côté b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la longueur du côté c : ");
        double c = scanner.nextDouble();

        
        double perimetre = a + b + c;


        double demiPerimetre = perimetre / 2;

        double aire = Math.sqrt(demiPerimetre * (demiPerimetre - a) * (demiPerimetre - b) * (demiPerimetre - c));

                System.out.println("Le périmètre du triangle est : " + perimetre);
        System.out.println("L'aire du triangle est : " + aire);

        scanner.close();
    }
}
