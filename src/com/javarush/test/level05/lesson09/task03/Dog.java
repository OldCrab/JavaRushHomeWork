package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {
    private String karapuz;

    public Dog(String name) {
        this.karapuz = name;
    }

    public Dog(String name, int height) {
        this.karapuz = name + height;
    }

    public Dog(String name, int height, String colour) {
        this.karapuz = name + height + colour;
    }
}