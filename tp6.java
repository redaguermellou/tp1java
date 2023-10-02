package tp;

import java.util.Scanner;

public class tp6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la valeur de b : ");
        int b = scanner.nextInt();

        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Après l'échange :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
