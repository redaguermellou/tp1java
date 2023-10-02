package tp;

import java.util.Scanner;

public class tp7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez le premier réel : ");
			double num1 = scanner.nextDouble();

			System.out.print("Entrez le deuxième réel : ");
			double num2 = scanner.nextDouble();

			double sum = num1 + num2;
			double product = num1 * num2;

			System.out.println("La somme est : " + sum);
			System.out.println("Le produit est : " + product);
		}
    }
}
