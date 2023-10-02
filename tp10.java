package tp;

import java.util.Scanner;

public class tp10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez un entier entre 100 et 999 : ");
			int number = scanner.nextInt();

			int units = number % 10;
			int tens = (number / 10) % 10;
			int hundreds = number / 100;

			System.out.println("Chiffre des unités : " + units);
			System.out.println("Chiffre des dizaines : " + tens);
			System.out.println("Chiffre des centaines : " + hundreds);
		}
    }
}

