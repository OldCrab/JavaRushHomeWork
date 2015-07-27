package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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

        if (b1 > b) {
            System.out.println(b);
        }
        else
            System.out.println(b1);
        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
    }
}