package smalExcerciseWeek2;

public class Calculator {
     int num1;
     int num2;

    public Calculator (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }
    public int subtract(){
        return num1 - num2;
    }
    public int multiply(){
        return num1 * num2;
    }
    public int divide() {
        if (num2 == 0) {
            System.out.println("Error: divide to 0!");
            return 0;
        }if(num2>num1) {
            System.out.println("Attention the second number is lower, and you will get a 0");
        }
            return num1 / num2;
    }
}

