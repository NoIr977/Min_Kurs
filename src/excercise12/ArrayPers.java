package excercise12;

import java.util.Arrays;

import static excercise12.ArrayPersTest.numPers;
import static excercise12.ArrayPersTest.sexNum;

public class ArrayPers {
    public static void main(String[] args) {
        String[] perNum = new String[5];

        perNum[0] = "198712094538";
        perNum[1] = "19881004-4567";
        perNum[2] = "20101204-9674";
        perNum[3] = "200004061245";
        perNum[4] = "19881204-8969";

        for (int i = 0; i < perNum.length; i++) {
            System.out.println("Persionnummer är: " + perNum[i]);
        }

        System.out.println("Checking the numbers ");

        for (String number : perNum) {
            if (numPers(number)) {
                System.out.println(number + " Good job, you have the right per number");
            } else {
                System.out.println(number + " You should add the " + "- " + " to the pers number");
            }
        }

            System.out.println("Checking the sex: ");

            for (String sex : perNum) {
                if (sexNum(sex)) {
                    System.out.println(sex + " The person is a women ");
                } else {
                    System.out.println(sex + " The person is a men ");
                }
            }
        }
    }

