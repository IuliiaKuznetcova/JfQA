package com.hw.hw_11_11_22;

public class Person {
//переменные
    private String fullName;
    private int age;
    
//кострукторы
    //Person Goodwin()

    public Person () {
        /*тут я не смогла понять, что именно из персона надо
        добавить, чтобы он заговорил. По идее, куда-то нужно
        вписать get, который возвращает, но я не могу
        придумать, куда именно.*/

        System.out.println("Says"  );
    }
    //Person Alisa(fullName, age)
    public Person (String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    
    //

//Зачем эти методы? Какая у них функция?
    public void setFullName(String FullName) {

    }

    public void setAge(int age) {

    }

    public void move () {
        System.out.println("Says" + fullName);
    }
}

