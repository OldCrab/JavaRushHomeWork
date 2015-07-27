package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        reader.close();
        byte[] buffer = new byte[inputStream.available()];
        for (int i = inputStream.available(); i > 0; i--){
            int b = inputStream.read(buffer);
        }
        for (int i = buffer.length-1; i >= 0; i--) {
            outputStream1.write(buffer[i]);
        }
        inputStream.close();
        outputStream1.close();
    }
}
