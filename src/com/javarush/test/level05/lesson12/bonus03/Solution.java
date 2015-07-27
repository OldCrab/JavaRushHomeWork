package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int a = 0;
        for (int i = -10; i <= 0; i = a) {
            String h = reader.readLine();
            a = Integer.parseInt(h);
        }
        for (int i = 0; i < a; i++) {
            String s = reader.readLine();
            int u = Integer.parseInt(s);
            if (u > maximum){
                maximum = u;
            }
        }
        reader.close();

        System.out.println(maximum);
    }
}
