package com.javarush.test.level07.lesson06.task05;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> sList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            sList.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            sList.add(0,sList.get(sList.size()-1));
            sList.remove(sList.size()-1);
        }
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }
    }
}
