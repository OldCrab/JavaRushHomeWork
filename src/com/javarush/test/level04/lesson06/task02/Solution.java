package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

        String a = s.readLine();
        int b = Integer.parseInt(a);
        String a1 = s.readLine();
        int b1 = Integer.parseInt(a1);
        String a2 = s.readLine();
        int b2 = Integer.parseInt(a2);
        String a3 = s.readLine();
        int b3 = Integer.parseInt(a3);

        if (b>b1)
            b = b;
        else
            b = b1;
        if (b2>b3)
            b2=b2;
        else
            b2=b3;
        if (b2>b)
            b2 = b2;
        else
            b2 = b;
        System.out.print(b2);

    }
}
