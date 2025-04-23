package smalExcerciseWeek2;

import java.util.Scanner;

public class NumbersSum {

    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);
        System.out.print("Write the first number here: ");
        int num1 = calculator.nextInt();

        System.out.print("Write the second number here: ");
        int num2 = calculator.nextInt();

        Calculator calc = new Calculator(num1,num2);

        System.out.println("Addition: ");
        System.out.println("The sum of two numbers is: " + calc.add());
        System.out.println(" ");
        System.out.println("Substraction: ");
        System.out.println(" ");
        System.out.println("The substraction of two numbers is: " + calc.subtract());
        System.out.println(" ");
        System.out.println("Multiplication: ");
        System.out.println(" ");
        System.out.println("The multiplication of two numbers is: " + calc.multiply());
        System.out.println(" ");
        System.out.println("Divition: ");
        System.out.println(" ");
        System.out.println("The divition of two numbers is: " + calc.divide());

        Calculator raprot = new Calculator(num1, num2);

    }
}
