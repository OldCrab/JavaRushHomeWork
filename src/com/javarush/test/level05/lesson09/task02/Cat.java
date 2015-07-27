package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String catChar;
    public Cat(String name){
        this.catChar = name;
    }
    public Cat(String name, int weight, int age){
        this.catChar = name + weight + " " + age;
    }
    public Cat(String name, int age){
        int weight = 7;
        this.catChar = name + age + " Standard:" + weight ;
    }
    public Cat(int weight, String colour){
        String name = "Name - unknown";
        String address = " Address - unknown";
        String age = " Age - unknown ";
        this.catChar = name + age + weight + colour + address + " Homeless";
    }
    public Cat(int weight, String colour, String address){
        this.catChar = weight + colour + address + " - housecat";
    }

}
