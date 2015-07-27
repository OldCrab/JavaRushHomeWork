package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception{
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int kick = 0;
        for (int i = 0;; i++) {
           String a = s.readLine();
            int b;
            b = Integer.parseInt(a);
            kick = kick + b;
            if (b == -1) {
                System.out.print(kick);
                break;
            }

        }
        s.close();
    }
}
