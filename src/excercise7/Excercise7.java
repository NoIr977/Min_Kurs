package excercise7;

import java.sql.Struct;
import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        if(word.equals("ägg")) {
            System.out.println("ägg är knasigt");
        }else{
        for(int i=0; i<word.length();i++) {
            System.out.print(word.charAt(i) + " ");
        }

    }

    }

}
