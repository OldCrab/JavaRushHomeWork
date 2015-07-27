package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private String circlesInternals;
    public Circle(double centerX, double centerY, double radius){
        this.circlesInternals = centerX + centerY + radius + "";
    }

    public Circle(double centerX, double centerY, double radius, double width){
        this.circlesInternals = centerX + centerY + radius + width + "";
    }

    public Circle(double centerX, double centerY, double radius, double width, String colour){
        this.circlesInternals = centerX + centerY + radius + width + colour;
    }



}
