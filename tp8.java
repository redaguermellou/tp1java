package tp;

import java.util.Scanner;

public class tp8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez la durée en secondes : ");
			int seconds = scanner.nextInt();

			int hours = seconds / 3600;
			int remainingSeconds = seconds % 3600;
			int minutes = remainingSeconds / 60;
			System.out.printf("Durée convertie : %d heures, %d minutes, %d secondes", hours, minutes);
		}
}
};