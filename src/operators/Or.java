package operators;

import java.util.Scanner;

public class Or {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Skriv en siffra:");
        int a = scanner.nextInt();
        System.out.println("Skriv en till siffra:");
        int b = scanner.nextInt();
        boolean isTired = true;*/

        boolean isTired = false;

        if (true || false || 7 / 0 == 4) {
            System.out.println("Du är tydligen trött");
        }

        /*if (a > b || isTired && true) {
            System.out.println("Något av uttrycken är sant");
        }*/
    }
}
