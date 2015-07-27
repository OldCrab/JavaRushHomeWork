package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        for (int i = 1; i > 0; i++){
            String u = s.readLine();
            if (u.equals("сумма")){
                System.out.println(k);
                return;
            }
            else {
                int f = Integer.parseInt(u);
                k = k + f;
            }

        }

    }
}
