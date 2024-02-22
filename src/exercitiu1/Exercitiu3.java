package exercitiu1;

import java.util.Scanner;

public class Exercitiu3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr : ");

        try {
            int numar = scanner.nextInt();
            afiseazaDivizorii(numar);
            if (estePrim(numar)) {
                System.out.println("Numărul " + numar + " este prim.");
            } else {
                System.out.println("Numărul " + numar + " nu este prim.");
            }
        } catch (Exception e) {
            System.out.println("Introduceți un număr corect.");
        } finally {
            scanner.close();
        }
    }

    public static void afiseazaDivizorii(int numar) {
        System.out.print("Divizorii numărului sunt: ");
        for (int i = 1; i <= numar; i++) {
            if (numar % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean estePrim(int numar) {
        if (numar <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }
}