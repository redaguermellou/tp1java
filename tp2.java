package tp;
import java.util.Scanner;

public class tp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Entrez le rayon (R) de la sphère : ");
        double rayon = scanner.nextDouble();

   
        double aire = 4 * Math.PI * Math.pow(rayon, 2);

        
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(rayon, 3);

        
        System.out.println("L'aire de la sphère est : " + aire);
        System.out.println("Le volume de la sphère est : " + volume);

      
        scanner.close();
    }
}

