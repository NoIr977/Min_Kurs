package smallJavaExcercise1;

import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {

        System.out.println( " ");
        System.out.println("Money Converter sek to the usd and funts");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the amount of sek: ");
        int sek = scanner.nextInt();

        int funt = sek / 13;
        int dollars = sek / 10;
        int eur = sek / 11;

        System.out.println(sek + " sek in the british funt is " + funt);
        System.out.println(sek + " sek in the american dollars is " + dollars);
        System.out.println(sek + " sek in the american dollars is " + eur);

        scanner.close();
    }
}
