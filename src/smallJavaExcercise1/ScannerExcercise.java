package smallJavaExcercise1;

import java.util.Scanner;

public class ScannerExcercise {
    public static void main(String[] args) {

        System.out.println( " ");
        System.out.println("Average of the numbers: new execercise ");

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Write first number: ");
        int numbers1 = scanner1.nextInt();
        System.out.print("Write second number: ");
        int numbers2 = scanner1.nextInt();
        System.out.print("Write third number: ");
        int numbers3 = scanner1.nextInt();

        int sum = numbers1 + numbers2 + numbers3;
        int average = sum / 3;

        System.out.println("sum is: " + sum);
        System.out.println("average is: " + average);

        scanner1.close();
    }
}
