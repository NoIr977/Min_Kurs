package smalExcerciseWeek2;

public class Fruit {
    private String colour;

    public Fruit(String fruitColour) {
        colour = fruitColour;
    }

    public void printColour(){
        System.out.println("The colour of the fruit is: " + colour);
    }

    public String getColour() {
        return colour;
    }
}
