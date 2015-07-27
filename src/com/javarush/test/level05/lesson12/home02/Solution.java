package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man kent1 = new Man("Barebuh", 36, "Lenina 63");
        Man kent2 = new Man("Quasimodo", 666, "st. Diablo - 2");
        Woman baba1 = new Woman("Kartoshka", 38, "Lenina 66");
        Woman baba2 = new Woman("Grib", 777, "st. Diablo - 42");

        System.out.println(kent1.name + " " + kent1.age + " " + kent1.address);
        System.out.println(kent2.name + " " + kent2.age + " " + kent2.address);
        System.out.println(baba1.name + " " + baba1.age + " " + baba1.address);
        System.out.println(baba2.name + " " + baba2.age + " " + baba2.address);

    }

    public static class Man {
        private String name;
        private int age;
        private String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        private String name;
        private int age;
        private String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }


}
