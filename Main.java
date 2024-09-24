//TD 09/24/24
//arrayListPractice.java


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        //create a array list of strings
        ArrayList<String>myListOfStrings=new ArrayList<>();
        //add a few elements
        myListOfStrings.add("first");
        myListOfStrings.add("second");
        myListOfStrings.add("third");
        //output our array

        System.out.println("\n myListOfStrings is:" + myListOfStrings);
        //remove a element
        myListOfStrings.remove(0);
        //output our array
        System.out.println("\n After removing...");
        System.out.println("\n myListOfStrings is:" + myListOfStrings);
        //remove a element
        myListOfStrings.remove("third");
        //output our array
        System.out.println("\n After removing...");
        System.out.println("\n myListOfStrings is:" + myListOfStrings);

        //use a for loop to add some things to our list
        String toAdd ="";
        for (int i=0;i<10;i++){
            toAdd =toAdd + "adding..."+ Integer.toString(i);
            myListOfStrings.add(toAdd);
        }
        System.out.println("\n After adding a bunch of stuff...");
        System.out.println("\n myListOfStrings is:" + myListOfStrings);

        for (int i=0;i<myListOfStrings.size();i++){
            System.out.println("An element in my list is: "+myListOfStrings.get(i));
        }

    }
}