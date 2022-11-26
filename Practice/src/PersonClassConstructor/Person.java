package PersonClassConstructor;

public class Person {

    //parameter
    private String fullName;
    private int age;

    //constructor
    public Person(String fullName, int age) {
        System.out.println("Creation the 1 variant of the person");
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

        System.out.println("Creating the 2 variant of the person");
    }

    String getFullName () {
        System.out.println("Creating the 3 variant of the person");
        return fullName;
    }

    public Person(String fullName) {

        System.out.println("Creating the 4 variant of the person");
    }




    //metod

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk() {
        System.out.println(fullName + " " + " " + age + " " + "is talk");
    }

    public void move() {
        System.out.println(fullName + " " + " " + age + " " + "is move");
    }

    public void printtalk() {
        System.out.println(fullName + " metod talk");
    }

    public void printmove() {
        System.out.println(fullName + " metod move");
    }
}
