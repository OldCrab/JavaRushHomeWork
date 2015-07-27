package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String a = s.readLine();
        String a1 = s.readLine();
        int y = Integer.parseInt(a1);
        String a2 = s.readLine();
        int m = Integer.parseInt(a2);
        String a3 = s.readLine();
        int d = Integer.parseInt(a3);
        s.close();
        System.out.print("Меня зовут " + a + "\n" + "Я родился " + d + "." + m + "." + y );
    }
}
