package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String a = s.readLine();
        int m = Integer.parseInt(a);
        String a1 = s.readLine();
        int n = Integer.parseInt(a1);
        for (; m > 0; m--){

            for (int i = n; i > 0 ; i--) {
                System.out.print("8");

            }
            System.out.println("");
        }


    }
}
