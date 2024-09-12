package myanimals;

public class Animal {
    // there is not "static" keyword here, so... this method
    // will be available to Animal objects
    //create a static member named numOfAnimals
    public static int numOfAnimals =0;

    //create a constructor
    public Animal(){
        numOfAnimals++;
    }



    public void animalSound(){
        System.out.println("\n A sound from the animal class");
    }
}
