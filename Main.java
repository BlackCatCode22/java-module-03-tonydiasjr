//TD 09/19/24
//AnimalandHyena.java

import java.io.BufferedReader;
        import java.io.FileReader;
                import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my Zoo Program!");

        //open the arriving animals file
        try{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Tony Jr\\OneDrive\\cit-63\\arrivingAnimals.txt"));
        String myLine;

        // read the file one line at time

            while ((myLine=bufferedReader.readLine())!=null){
                System.out.println(myLine);

            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }



        //create a Animal object
        Animal myAnimalObject = new Animal();



        myAnimalObject.setAge(4);

        //use our new Animal object

        System.out.println("\n my animal age is: "+myAnimalObject.getAge()+" years old");

        //create a Hyena object
        Hyena myNewHyena = new Hyena();
        myNewHyena.setAge(7);

        // output the age of our Hyena

        System.out.println("\n the age of our Hyena is : "+ myNewHyena.getAge()+" years old");

        //create a Lion object
        Lion myLion = new Lion();

        //make the lion 12 years old
        myLion.setAge(12);

        System.out.println("\n The age of our Lion is : "+ myLion.getAge()+ " years old");

        //output the numbers of animals
        System.out.println("\n The number of animals created is: "+Animal.numOfAnimals);

    }
}