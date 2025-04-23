package smalExcerciseWeek2;

public class FruitSalad {
    public static void main(String[] args) {

        Fruit apple = new Fruit ("Red");
        Fruit grape = new Fruit ( "Green");
        Fruit lemon = new Fruit ("Yellow");

        String grapeColour = grape.getColour();
        String appleColour = apple.getColour();
        String lemonColour = lemon.getColour();

        apple.printColour();
        grape.printColour();
        lemon.printColour();
    }
}
