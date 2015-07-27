package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String a = s.readLine();
        int n = Integer.parseInt(a);
        String a1 = s.readLine();
        int d = Integer.parseInt(a1);
        String a2 = s.readLine();
        int x = Integer.parseInt(a2);

        if (x>d) {
            x = x;
        }
        else{
            int b = x;
            x = d;
            d = b;
        }
        if (x>n) {
            x = x;
        }
        else{
            int b = x;
            x = n;
            n = b;
        }
        if (d<x) {
            d = d;
        }
        else{
            int b = d;
            d = x;
            x = b;
        }
        if (n<d) {
            d = d;
        }
        else{
            int b = n;
            n = d;
            d = b;
        }
        System.out.println(x + " " + d + " " + n);

    }
}
