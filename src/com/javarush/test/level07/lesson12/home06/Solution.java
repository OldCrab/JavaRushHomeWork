package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandpa1 = new Human();
        grandpa1.name = "Виктор";
        grandpa1.sex = true;
        grandpa1.age = 80;

        Human grandpa2 = new Human();
        grandpa2.name = "Gиктор";
        grandpa2.sex = true;
        grandpa2.age = 80;

        Human granny1 = new Human();
        granny1.name = "Cиктор";
        granny1.sex = false;
        granny1.age = 80;

        Human granny2 = new Human();
        granny2.name = "Ghиктор";
        granny2.sex = false;
        granny2.age = 80;

        Human mammy = new Human();
        mammy.name = "nhиктор";
        mammy.sex = false;
        mammy.age = 40;
        mammy.mother = granny1;
        mammy.father = grandpa1;


        Human pappy = new Human();
        pappy.name = "Proктор";
        pappy.sex = true;
        pappy.age = 40;
        pappy.mother = granny2;
        pappy.father = grandpa2;

        Human daughter = new Human();
        daughter.name = "Баба";
        daughter.sex = true;
        daughter.age = 20;
        daughter.mother = mammy;
        daughter.father = pappy;

        Human son1 = new Human();
        son1.name = "Паццан";
        son1.sex = true;
        son1.age = 10;
        son1.mother = mammy;
        son1.father = pappy;

        Human son2 = new Human();
        son2.name = "Паццан2";
        son2.sex = true;
        son2.age = 10;
        son2.mother = mammy;
        son2.father = pappy;
        System.out.println(grandpa1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(granny1.toString());
        System.out.println(granny2.toString());
        System.out.println(mammy.toString());
        System.out.println(pappy.toString());
        System.out.println(daughter.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());

    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
