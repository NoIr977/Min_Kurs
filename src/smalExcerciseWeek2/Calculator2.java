package smalExcerciseWeek2;

public class Calculator2 {

    private int numbers;
    int a;
    int b;

    public Calculator2(int a, int b) {
       this.a = a;
       this.b = b;
    }

   /* public void printSumma() { //utan return
        numbers = a+b;
        System.out.println("Summa of the numbers is: " + numbers);
    }
    public void printMultiply(){
        numbers = a*b;
        System.out.println("Multiplication of your numbers is: " + numbers);
    }
    public void printDeviation(){
        numbers = a/b;
        System.out.println("Deviation of your numbers is: " + numbers);
    }
    public void printMinus(){
        numbers = a-b;
        System.out.println("Substraction of your numbers is: " + numbers);
    }

    */

    public int summa() {
        return a+b;
    }
    public int substract() {
        return a-b;
    }
    public int multiply() {
        return a*b;
    }
    public int divide() {
        return a/b;
    }

}

