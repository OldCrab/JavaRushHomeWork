package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> fullName = new HashMap<String, String>();
        fullName.put("Pupkin", "Vasya");
        fullName.put("Pobli", "Vsya");
        fullName.put("Goblin", "Igor");
        fullName.put("Sucker", "Vasya");
        fullName.put("Pupewrkin", "Vasdfsya");
        fullName.put("Pupkxcvin", "Vascvya");
        fullName.put("Pupsdfkin", "Vasxcvya");
        fullName.put("Pupkinsd", "Vawqesya");
        fullName.put("Pupkzxcin", "Vvcbwqeasya");
        fullName.put("Puqwefgpkin", "Vdfgasya");
        return fullName;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)){
                i++;
            }

        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int i = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(familiya)){
                i++;
            }

        }
        return i;
    }
}
