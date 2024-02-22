package exercitiu1;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.PrintWriter;
        import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/Exercitiu1/in.txt");
            File outputFile = new File("src/Exercitiu1/out.txt");
            Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFile);

            double sum = 0;
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            int count = 0;

            while (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                sum += num;
                count++;
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            double average = sum / count;


            System.out.println("Suma: " + sum);
            System.out.println("Media aritmetica: " + average);
            System.out.println("Minim: " + min);
            System.out.println("Maxim: " + max);


            writer.println("Suma: " + sum);
            writer.println("Media aritmetica: " + average);
            writer.println("Minim: " + min);
            writer.println("Maxim: " + max);

            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul de intrare nu a fost găsit.");
            e.printStackTrace();
        }
    }
}


