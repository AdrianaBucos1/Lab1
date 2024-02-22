package exercitiu1;

import java.util.Scanner;

public class Exercitiu1 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului: ");
        double lungime= scanner.nextDouble();
        System.out.println("Introduceti latimea dreptunghiului ");
        double latime=scanner.nextDouble();

        double perimetru = 2*(lungime + latime);
        double arie = lungime* latime;

        System.out.println(" Perimetru este: "+ perimetru);
        System.out.println(" Aria este: "+ arie);

        scanner.close();

    }
}
