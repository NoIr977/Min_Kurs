package smallJavaExcercise1;

import java.util.Scanner;

public class Noequal5 {
        public static void main(String[] args) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Write any number from 0 to 9 here: ");
            int number = scanner1.nextInt();

            if(number>0 && number<=9 && (!(number==5))) {
                System.out.println("Number is " + number);
            }else{
                System.out.println("I do not like numbers more or less then 0 and 9, but I do not like the 5 either, give me the other number ");
            }

        }
    }