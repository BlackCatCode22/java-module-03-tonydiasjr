//TD 09/12/24
//main.java
import myanimals.Animal;
import myanimals.Cat;
import myanimals.Dog;
import mystudent.Student;
import mystudent.App;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome from the main!");

        //create a student object
        Student student = new Student();

        //create an object from a runnable class
        App app = new App();

        // use a method from the Student class
        //I know that i have a static  method on the Student Class
        // and , I know how to call a static class method
        Student.sayHello();

        //call a method that belongs to the student object
        student.sayHi();

        //output the number of animals
        System.out.println("\n the number of animals is "+Animal.numOfAnimals);

        // create a cat object
        Cat cat = new Cat();
        //use a method that is available to the Cat object named cat
        System.out.println("\n This sound is coming from the Cat object named cat...");
        cat.animalSound();

        //create a dog object
        Dog dog = new Dog();
        //use a method that is available to the Cat object named dog
        System.out.println("\n This sound is coming from the Dog object named dog...");
        dog.animalSound();

        System.out.println("\n the number of animals is "+Animal.numOfAnimals);





    }
}