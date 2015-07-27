package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байты, которые встречаются в файле меньше всего раз.
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        reader.close();
        long[] arr = new long[256];
        long minCount = Long.MAX_VALUE;
        while (inStream.available() > 0){
            int b = inStream.read();
            arr[b]++;
        }
        inStream.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCount){
                minCount = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minCount){
                System.out.print(i + " ");
            }
        }
    }
}
