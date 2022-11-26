package PhoneClassConstructor;

/*2.Класс Phone.
Создайте класс Phone,который содержит переменные number,model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы:receiveCall,имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит{name}”.Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.*/

public class Main {

    public static void main(String[] args) {

        Phone samsung = new Phone("Samsung", "123654", 223.12);
        Phone xiaomi = new Phone("Xiaomi", "564897", 231);
        Phone sony = new Phone("Sony", "6871243", 265);


        samsung.phoneConsol();
        xiaomi.phoneConsol();
        sony.phoneConsol();
        System.out.println("");

        samsung.receiveCall("Tom");
        xiaomi.receiveCall("Alisa");
        sony.receiveCall("Max");
        System.out.println("");

        xiaomi.setNumber("654234");
        xiaomi.receiveCall("Alisa");


    }


}
