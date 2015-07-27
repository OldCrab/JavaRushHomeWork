package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 4 2000"));
    }

    public static boolean isDateOdd(String date)
    {
        Date yearStartTime = new Date(date);
        yearStartTime.setMonth(0);
        yearStartTime.setDate(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setHours(0);

        Date currentTime = new Date(date);

        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24*60*60*1000;
        int dayCount =(int) (msTimeDistance/msDay);
        System.out.println(dayCount);
        if (dayCount%2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
