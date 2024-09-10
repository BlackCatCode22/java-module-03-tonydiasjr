//TD 09/10/24
//APP.java
// string point to create objects from classes

public class App {
    public static void main(String[] args) {

        System.out.println("\n\nwelcome to classes and objects oriented programing!");

        Student myNewStudent = new Student();

        myNewStudent.age=64;
        myNewStudent.gpa=3.4;
        myNewStudent.major="History";
        myNewStudent.firstname="Dennis";
        myNewStudent.lastname="Mohle";
        myNewStudent.onProbation=true;

        //output some stuff about our new object
        System.out.println("\n The First name of our student is:"+myNewStudent.firstname+"\n\n");

        //create two more students
        Student anotherStudent = new Student();
        Student oneMoreStu = new Student();

        oneMoreStu.major="history";
        anotherStudent.age=44;

        //how many students?
        System.out.println("\n There were "+ Student.numOfStudents+" Students created!");

        //create a phone object
        phone myNewPhone = new phone();
        myNewPhone.model="pixel 8";
        myNewPhone.numOfCameras=3;
        System.out.println("\n My new phone has "+myNewPhone.numOfCameras+"cameras!");





        }

    }
