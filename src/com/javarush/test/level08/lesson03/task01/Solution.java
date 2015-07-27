package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> berries = new HashSet<String>();
        berries.add("арбуз");
        berries.add("банан");
        berries.add("вишня");
        berries.add("груша");
        berries.add("дыня");
        berries.add("ежевика");
        berries.add("жень-шень");
        berries.add("земляника");
        berries.add("ирис");
        berries.add("картофель");

        for (String text: berries){
            System.out.println(text);
        }

    }
}
