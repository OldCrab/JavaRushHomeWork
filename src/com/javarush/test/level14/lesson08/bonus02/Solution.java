package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int remain = 0;
        for (int i = 0; i > -1 ; i++) {
            if (num1 > num2){
                if (num1%num2==0){
                    System.out.println(num2);
                    break;
                }
                else {
                    remain = num1%num2;
                    num1 = num2;
                    num2 = remain;
                }
            }
            else {
                remain = num1;
                num1 = num2;
                num2 = remain;
            }
        }
    }
}
