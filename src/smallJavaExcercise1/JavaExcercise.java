package smallJavaExcercise1;

import java.util.Scanner;

public class JavaExcercise {
    public static void main(String[] args) {


        System.out.println("The salary of the month");


        Scanner scanner2 = new Scanner(System.in);
        System.out.print("write the month salary: ");

        int salary = scanner2.nextInt();
        System.out.print("write the month sales: ");
        int sales = scanner2.nextInt();

        sales = sales * 9 / 100;
        salary = sales + salary;
        System.out.print("The month´s salary is: " + salary);

        scanner2.close();


    }
}
