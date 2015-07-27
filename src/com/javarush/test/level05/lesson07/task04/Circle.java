package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private String circlesInternals;
    public void initialize(double centerX, double centerY, double radius){
        this.circlesInternals = centerX + centerY + radius + "";
    }

    public void initialize(double centerX, double centerY, double radius, double width){
        this.circlesInternals = centerX + centerY + radius + width + "";
    }

    public void initialize(double centerX, double centerY, double radius, double width, String colour){
        this.circlesInternals = centerX + centerY + radius + width + colour;
    }

}
