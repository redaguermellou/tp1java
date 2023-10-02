package tp;

import java.util.Scanner;

public class tp9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez la durée en secondes : ");
			int totalSeconds = scanner.nextInt();

			int secondsInMinute = 60;
			int secondsInHour = secondsInMinute * 60;
			int secondsInDay = secondsInHour * 24;

			int days = totalSeconds / secondsInDay;
			int remainingSeconds = totalSeconds % secondsInDay;
			int hours = remainingSeconds / secondsInHour;
			remainingSeconds %= secondsInHour;
			int minutes = remainingSeconds / secondsInMinute;
			int seconds = remainingSeconds % secondsInMinute;

			System.out.printf("Durée convertie : %d jours, %d heures, %d minutes, %d secondes", days, hours, minutes, seconds);
		}
    }
}
