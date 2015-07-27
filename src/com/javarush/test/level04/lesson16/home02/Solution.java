package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String a = s.readLine();
        int b = Integer.parseInt(a);
        String a1 = s.readLine();
        int b1 = Integer.parseInt(a1);
        String a2 = s.readLine();
        int b2 = Integer.parseInt(a2);
        if ((b < b1 && b > b2)||(b > b1 && b < b2))
            System.out.println(b);
        if ((b1 < b && b1 > b2)||(b1 > b && b1 < b2))
            System.out.println(b1);
        if ((b2 < b && b2 > b1)||(b2 > b && b2 < b1))
            System.out.println(b2);
    }
}
