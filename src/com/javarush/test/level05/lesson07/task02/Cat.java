package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String catsName;
    public void initialize(String name){
        this.catsName = name;
    }
    public void initialize(String name,int weight, int age){
        this.catsName = name + weight + age;
    }
    public void initialize(String name, int age, String weight){
        weight = "Standard";
        this.catsName = name + age + weight;
    }
    public void initialize(int weight, String colour, String name, String address, String age ){
        name = "unknown";
        address = "unknown";
        age = "unknown";
        this.catsName = weight + colour + name + address + age;
    }
    public void initialize(int weight, String colour, String address){
        this.catsName = weight + colour + address + "- stranger housecat";
    }

}
