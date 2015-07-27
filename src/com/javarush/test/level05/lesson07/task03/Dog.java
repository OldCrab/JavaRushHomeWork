package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String doggyDog;
    public void initialize(String name){
        this.doggyDog = name;
    }
    public void initialize(String name, int height){
        this.doggyDog = name + height;
    }
    public void initialize(String name, int height, String colour){
        this.doggyDog = name + height + colour;
    }

}
