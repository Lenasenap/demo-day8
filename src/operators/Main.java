package operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Säg en siffra:");
        int a = scanner.nextInt();
        System.out.println("Säg en till siffra:");
        int b = scanner.nextInt();
        System.out.println("Säg en sista siffra");
        int c = scanner.nextInt();

        System.out.println("Nu ska vi berätta vilka av dina siffror som är störst: ");
        System.out.println("Dina siffror är: " + a + ", " + b + " och " + c);

        if (c > a && c > b) {

            // Kommer bara köras om uttrycket i () == true
            System.out.println(c + " är den största siffran");
        } else if (a > b && a > c) {

            System.out.println(a + " är den största siffran");
        } else {
            System.out.println(b + " är den största siffran");
        }

        System.out.println("Slut");
    }
}
