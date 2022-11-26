package PersonClassConstructor;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        //Creation Person Greg
        Person greg = new Person();
        greg.setFullName("Greg");
        greg.setAge(87);
        System.out.println("Creation Person Greg");
        greg.talk();
        greg.move();
        System.out.println("");

        //Creation Person Goodween
        Person goodween = new Person("Goodween", 50);

        System.out.println("Creation Person Goodween");
        //run method
        System.out.println("Goodween metod talk");
        goodween.talk();
        System.out.println("Goodween metod move");
        goodween.move();
        System.out.println("");


        //Creation Person Steffi
        Person steffi = new Person ("Steffi", 33);
        System.out.println("Creation Person Steffi");
        steffi.printtalk();
        steffi.talk();
        steffi.printmove();
        steffi.move();
        System.out.println("");

        Person klara = new Person();
        System.out.println("Creation Person Klara");
        klara.setFullName("Klara");
        klara.printtalk();
        klara.talk();

        //С Кларой у меня не получилось ее вызвать
        System.out.println("talk " + klara.getFullName());
        System.out.println("");

        //Creation Person Alisa
        Person alisa = new Person();
        alisa.setFullName("Alisa");
        alisa.setAge(17);

        System.out.println("Creation Person Alisa");
        alisa.printtalk();
        alisa.talk();
        alisa.printmove();
        alisa.move();
        System.out.println("");
        System.out.println("Alice changed her name");
        alisa.setFullName("Noalisa");
        alisa.talk();
        alisa.printtalk();
        alisa.move();
        System.out.println("---Next line is redundant here---");
        System.out.println("Talk " + alisa.getFullName());
        System.out.println("");

        //Creation Person Max
        System.out.println("Creation Person Max");
        Person max = new Person ("Max");
        max.printtalk();
        max.talk();

        System.out.println("");

        //Creation Person Billi
        Person billi = new Person();
        billi.setFullName("Billi");
        billi.setAge(25);
        System.out.println("Creation Person Billi");
        billi.talk();
        billi.move();
        System.out.println("");

        //Creation Person Steffi
        Person sandra = new Person("Sandra", 48);
        System.out.println("Creation Person Sandra");
        sandra.talk();
        sandra.move();
        System.out.println("");


    }
}
