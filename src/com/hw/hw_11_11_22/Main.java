package com.hw.hw_11_11_22;

/*Создать класс Person, который содержит:
переменные fullName, age;
методы move() и talk(),
в которых просто вывести на консоль сообщение
-"Такой-то  Person говорит".
Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса.
Один объект инициализируется конструктором Person(),
другой - Person(fullName, age)*/

public class Main {

    public static void main(String [] args) {

        Person goodwin = new Person();
        goodwin.setFullName("Goodwin");
        goodwin.setAge(64);

       /* Алиса получается, только если принять предложение
        идеи, но тогда и гудвин на нее заменяется.*/
        Person alisa = new Person("Alisa")
    }


}
