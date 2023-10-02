package tp;

import java.util.Scanner;

public class tp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Veuillez saisir votre poids en kg : ");
			double poids = scanner.nextDouble();

			System.out.print("Veuillez saisir votre taille en mètres : ");
			double taille = scanner.nextDouble();


			double bmi = poids / (taille * taille);


			System.out.println("Votre indice de masse corporelle (IMC) est : " + bmi);
		}
    }
}
