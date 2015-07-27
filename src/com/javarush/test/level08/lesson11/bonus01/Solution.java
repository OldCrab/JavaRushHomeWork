package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
            Date nameOfMonth = new Date(month+" 01 2008");
            char[] arrayOfName;
            arrayOfName = month.toCharArray();
            String correctMonth = "";
            for (int j = 0; j < arrayOfName.length; j++) {
                if (j<1){
                    correctMonth += Character.toUpperCase(arrayOfName[j]);
                }
                else {
                    correctMonth += Character.toLowerCase(arrayOfName[j]);
                }
            }
            correctMonth += " is " + (nameOfMonth.getMonth()+1) + " month";
            System.out.println(correctMonth);

    }

}
