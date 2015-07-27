package com.javarush.test.level11.lesson08.task05;

/* Добавь недостающие переменные
Посмотри внимательно на методы и добавь недостающие переменные.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Cat
    {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight)
        {
            this.age = age;
            this.weight = weight;
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public void setWeight(int weight)
        {
            this.weight = weight;
        }

        public void setSpeed(int speed)
        {
            this.speed = speed;
        }
    }
}
