package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private String rectanglesInterals;
    public void initialize(double left, double top, double width, double height){
        this.rectanglesInterals = left + " - left" + top + " - top" + width + " - width" + height + " - height";
    }
    public void initialize(double left, double top){
        int width = 0;
        int height = 0;
        this.rectanglesInterals = left + " - left" + top + " - top" + width + " - width" + height + " - height";
    }
    public void initialize(double left, double top, double width){
        double height = width;
        this.rectanglesInterals = left + " - left" + top + " - top" + width + " - width" + height + " - height /n Square";
    }



    public String getRectanglesInterals(){
        return rectanglesInterals;
    }
    public void initialize(String name){
        this.rectanglesInterals = getRectanglesInterals() + name;
    }
}
