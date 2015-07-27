package com.javarush.test.level12.lesson09.task03;

/* Fly, Run, Swim для классов Dog, Fish, Bird, Airplane
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Dog(собака), Fish(рыба), Bird(птица), Airplane(самолет).
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }

    public class Dog implements Run, Swim
            //Собака — ходит и иногда ныряет за рыбой
    {
        @Override
        public void run()
        {

        }

        @Override
        public void swim()
        {

        }
    }

    public class Fish implements Swim
            //Рыба - отстой эволюции, так и не вылезшая из своего болота

    {
        @Override
        public void swim()
        {

        }
    }

    public class Bird implements Fly, Swim, Run
            //Птица — универсальный боец (или просто утка)
    {
        @Override
        public void fly()
        {

        }

        @Override
        public void swim()
        {

        }

        @Override
        public void run()
        {

        }
    }

    public class Airplane implements Fly, Run
            //Самолёт — он и на земле, и в небе не бесполезен.
    {
        @Override
        public void fly()
        {

        }

        @Override
        public void run()
        {

        }
    }
}
