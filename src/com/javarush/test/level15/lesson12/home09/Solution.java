package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String u;
        String result = "";
        String obj = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            u = "";

            if (chars[i]=='?'||chars[i]=='&'){
                for (int j = i+1; j < chars.length; j++) {
                    if (chars[j]!='='&&chars[j]!='&'){
                        u += chars[j];
                    }
                    else{

                        break;
                    }
                    i++;
                }

                    result += u + " ";

                if (u.equals("obj")){
                    for (int j = i + 2; j < chars.length; j++) {
                        if (!(chars[j]=='&')){
                            obj += chars[j];
                        }
                        else {
                            break;
                        }
                        i++;

                    }
                }

            }
        }
        System.out.println(result);
        if (!(obj == "")){
            try {
                double k = Double.parseDouble(obj);
                alert(k);
            }
            catch (Exception e){
                alert(obj);
            }
        }
    }



    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
