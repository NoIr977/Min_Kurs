package smalExcerciseWeek2;

import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {

        //Calculator2 summa = new Calculator2(3,7);

        Scanner calc = new Scanner(System.in);

        System.out.print("write the first number here: " );
        int a = calc.nextInt();

        System.out.print("write the second number here: " );
        int b = calc.nextInt();

            /* Calculator2 summa = new Calculator2(a,b);
        summa.printSumma();
        System.out.println("Summa of the numbers is: " + );

        Calculator2 multiply = new Calculator2(a,b);
        multiply.printMultiply();

        Calculator2 deviation = new Calculator2(a,b);
        deviation.printDeviation();

        Calculator2 minus = new Calculator2(a,b);
        minus.printMinus();

         */

        Calculator2 hem = new Calculator2(a,b);

        System.out.println("Summ of the numbers is: " + hem.summa());

        System.out.println("Substraction of the numbers is: " + hem.substract());

        System.out.println("Substraction of the numbers is: " + hem.multiply());

        System.out.println("Substraction of the numbers is: " + hem.divide());


    }
}
