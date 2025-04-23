package smallJavaExcercise1;

import java.util.Scanner;

public class kvadrat {
    public static void main(String[] args) {

        System.out.println("Räkna kvadrat ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write any number from 0 to 9 here: ");
        int number = scanner.nextInt();

        if(number>0 && number<=9) {
            System.out.println(" Kvadrat är talet är: " + number*number);
        }else{
            System.out.println("Error! The number is larger then 9");
        }

    }
}
