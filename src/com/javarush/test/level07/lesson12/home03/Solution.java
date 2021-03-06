package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[20];
        int  maximum = Integer.MIN_VALUE;
        int  minimum = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
            if (mas[i] > maximum){
                maximum = mas[i];
            }
            if (mas[i] < minimum){
                minimum = mas[i];
            }
        }



        System.out.println(maximum);
        System.out.println(minimum);
    }
}
