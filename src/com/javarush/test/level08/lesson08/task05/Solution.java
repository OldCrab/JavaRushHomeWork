package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> fullName = new HashMap<String, String>();
        fullName.put("Садомия","Trudlik");
        fullName.put("Гамория","Cramer");
        fullName.put("Сицилия","German");
        fullName.put("Венеция","German");
        fullName.put("Австралопитекова","Ssdfcker");
        fullName.put("ываыва","Sucksdfer");
        fullName.put("ываывацук","Sucksdfer");
        fullName.put("ЫВауцкцук","Suckewerr");
        fullName.put("Ввыакуе","Suckgcver");
        fullName.put("мисисмиа","Suckeawer");

        return fullName;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String,String> copy1 = new HashMap<String, String>(map);

        for (Map.Entry<String,String> pair: copy1.entrySet()){
             String value = pair.getValue();
                Set<String> keysWithValue = getKeysByValue(map, value) ;
                if (keysWithValue.size() > 1){
                    for (String keys: keysWithValue){
                        map.remove(keys);
                    }
                }



        }

    }

    public static Set<String>  getKeysByValue(HashMap<String,String> map, String value){
        HashSet<String> receivedKeys  = new HashSet<String>();
        for (Map.Entry<String,String> pair: map.entrySet()){
            if (value.equals(pair.getValue())){

                receivedKeys.add(pair.getKey());

            }
        }
        return receivedKeys;
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value){
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet()){
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
