package excercise12;


public class ArrayPersTest {
    public static boolean numPers (String perNum) {

        return(perNum.length()) >= 5 && perNum.charAt(perNum.length() - 5)== '-';
    }

    public static boolean sexNum ( String perNum) {

        char lastChar = perNum.charAt(perNum.length() - 2); //vi tar den senaste siffra
        return lastChar % 2 == 0;
    }

}

