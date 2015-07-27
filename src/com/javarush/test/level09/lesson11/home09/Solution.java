package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> mapOfCats = new HashMap<String, Cat>();
        Cat cat1 = new Cat("Vasya");
        Cat cat2 = new Cat("Karamba");
        Cat cat3 = new Cat("Vitalii");
        Cat cat4 = new Cat("Foma");
        Cat cat5 = new Cat("Pushok");
        Cat cat6 = new Cat("Zmeevik");
        Cat cat7 = new Cat("Begemot");
        Cat cat8 = new Cat("Uchenii");
        Cat cat9 = new Cat("Hammet");
        Cat cat10 = new Cat("Hetfield");
        mapOfCats.put(cat1.name, cat1);
        mapOfCats.put(cat2.name, cat2);
        mapOfCats.put(cat3.name, cat3);
        mapOfCats.put(cat4.name, cat4);
        mapOfCats.put(cat5.name, cat5);
        mapOfCats.put(cat6.name, cat6);
        mapOfCats.put(cat7.name, cat7);
        mapOfCats.put(cat8.name, cat8);
        mapOfCats.put(cat9.name, cat9);
        mapOfCats.put(cat10.name, cat10);
        return mapOfCats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> setOfNames = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair: map.entrySet()){
            Cat key = pair.getValue();
            setOfNames.add(key);
        }
        return setOfNames;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
