package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> vowel = new ArrayList<Character>();
        ArrayList<Character> notVowel = new ArrayList<Character>();
        String startString = reader.readLine();
        for (int i = 0; i < startString.length(); i++) {
            char a = startString.charAt(i);
            if (isVowel(a)){
                vowel.add(a);
            }
            else {
                notVowel.add(a);
            }
        }
        for (Character charsVowel: vowel){
            System.out.print(charsVowel + " ");
        }
        System.out.println("");
        for (Character charsNotVowel: notVowel){
            System.out.print(charsNotVowel + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
