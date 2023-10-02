package tp;
import java.util.Scanner;

public class tp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez le premier nombre (a) : ");
        double a = scanner.nextDouble();

       
        System.out.print("Entrez le deuxième nombre (b) : ");
        double b = scanner.nextDouble();

         
        double moyenne = (a + b) / 2;

        System.out.println("La moyenne de " + a + " et " + b + " est : " + moyenne);

        
        scanner.close();
    }
}
