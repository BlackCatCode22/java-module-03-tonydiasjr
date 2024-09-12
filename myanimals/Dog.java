package myanimals;

public class Dog extends Animal {
    //the dog class is a sub class of Animal
    // so it should have all the methods from the animal class
    // available to it
    // this is polymorphism - this word means "many shapes"
    //when used here, by a dog object, This method that has the same name
    // as the method in the superclass, take another shape
    public void animalSound() {
        System.out.println("\n A sound from the Dog class used by a Dog Object.-'bark'");
    }
}