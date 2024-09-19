public class Animal {

    static int numOfAnimals =0;
    //create a constructor
    public Animal(){
        numOfAnimals++;
    }
    //create a few attributes(fields)
    //sex will be 'male ' or 'female'
    private String sex ="";
    //age will be in years
    private int age=0;
    //weight will be in pounds
    private int weight=0;

    //create getters and setters


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
