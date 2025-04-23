package excercise6;

public class PetZoo {
    public static void main(String[] args) {
        Pet cat = new Pet ("Gaby");
        Pet kanin = new Pet ("Cosmos");
        Pet dog = new Pet("Bulle");

        /*cat.printName();
        dog.printName();
        kanin.printName();

         */

        String catName = cat.getName();
        String dogName = dog.getName();
        String kaninName = kanin.getName();

        for(int i=0;i<2;i++){
            System.out.println(catName);
            System.out.println(dogName);
            System.out.println(kaninName);
        }
    }
}


