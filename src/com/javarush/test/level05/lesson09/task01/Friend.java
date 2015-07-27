package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String karapuz;
    public Friend(String name){
        this.karapuz = name;
    }
    public Friend(String name, int age){
        this.karapuz = name + age;
    }
    public Friend(String name, int age, String sex){
        this.karapuz = name + age + sex;
    }

}