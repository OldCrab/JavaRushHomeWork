package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        reader.close();
        long[] arr = new long[256];
        long maxCount = 0;
        while (inStream.available() > 0){
            int b = inStream.read();
            arr[b]++;
        }
        inStream.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCount){
                maxCount = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxCount){
                System.out.print(i + " ");
            }
        }
    }
}
