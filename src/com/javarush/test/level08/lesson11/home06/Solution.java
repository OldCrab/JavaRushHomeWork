package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human daughter = new Human("Краб", false, 2, new ArrayList<Human>());
        Human son1 = new Human("Шмель", true, 5, new ArrayList<Human>());
        Human son2 = new Human("Лягушка", true, 10, new ArrayList<Human>());
        ArrayList<Human> fathersAncestors = new ArrayList<Human>();
        fathersAncestors.add(son1);
        fathersAncestors.add(son2);
        fathersAncestors.add(daughter);
        ArrayList<Human> mothersAncestors = new ArrayList<Human>();
        mothersAncestors.add(son1);
        mothersAncestors.add(daughter);
        mothersAncestors.add(son2);
        Human father = new Human("Эрнест", true, 30, fathersAncestors);
        Human mother = new Human("Кармелитта", false, 15, mothersAncestors);
        ArrayList<Human> dead1Ancestors = new ArrayList<Human>();
        dead1Ancestors.add(father);
        ArrayList<Human> baba1Ancestors = new ArrayList<Human>();
        baba1Ancestors.add(father);
        ArrayList<Human> dead2Ancestors = new ArrayList<Human>();
        dead2Ancestors.add(mother);
        ArrayList<Human> baba2Ancestors = new ArrayList<Human>();
        baba2Ancestors.add(mother);
        Human dead1 = new Human("Кроманьонец", true, 55, dead1Ancestors);
        Human dead2 = new Human("Австралопитек", true, 53, dead2Ancestors);
        Human babulya1 = new Human("Неандерталец", false, 57, baba1Ancestors);
        Human babulya2 = new Human("Эректус", false, 51, baba2Ancestors);
        System.out.println(dead1);
        System.out.println(dead2);
        System.out.println(babulya1);
        System.out.println(babulya2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter);
        System.out.println(son1);
        System.out.println(son2);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
