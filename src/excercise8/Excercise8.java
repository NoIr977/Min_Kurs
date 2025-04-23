package excercise8;

public class Excercise8 {
    public static void main(String[] args) {

        SpellChecker spell = new SpellChecker();

        if(spell.isLetter('h')) {
            System.out.println("H is a letter");
        }
        if(spell.isLetter('%')){
        System.out.println("% is not a letter");
        }
        if(spell.isLetter('a')){
            System.out.println("a is a letter");
        }

    }
}