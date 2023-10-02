package tp;

import java.util.Scanner;

public class tp5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez la température en degrés Farenheit : ");
			double farenheit = scanner.nextDouble();

			double celsius = (farenheit - 32) * 5 / 9;
			System.out.println("La température en degrés Celsius est : " + celsius);
		}
    }
}
