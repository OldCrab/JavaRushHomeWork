package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мама
2 Рама
1 Мыла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Integer> login = new HashMap<String, Integer>();

        for (int i = 0; i > -1 ; i++) {
            String s = reader.readLine();
            if (s.isEmpty() ){
                break;
            }
            int id = Integer.parseInt(s);

            String name = reader.readLine();
            if (name.isEmpty()){
                break;
            }
            login.put(name,id);
        }

        for (Map.Entry<String,Integer>pair: login.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }



    }
}
