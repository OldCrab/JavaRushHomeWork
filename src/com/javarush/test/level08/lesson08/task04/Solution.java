package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Самсамыч", new Date("JUNE 1 1970"));
        map.put("Байрам", new Date("JUNE 1 1965"));
        map.put("Ашотэ", new Date("JUNE 1 1945"));
        map.put("Бальзак", new Date("JUNE 1 1942"));
        map.put("Достоевский", new Date("JUNE 1 1939"));
        map.put("Толстой", new Date("JUNE 1 1910"));
        map.put("Солженицын", new Date("JUNE 1 1900"));
        map.put("Фицджеральд", new Date("MAY 1 1940"));
        map.put("Сэлинджер", new Date("JULY 1 1990"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                iterator.remove();

            }
        }
    }
}