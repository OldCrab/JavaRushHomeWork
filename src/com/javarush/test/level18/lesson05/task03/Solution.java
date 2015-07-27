package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        reader.close();
        int count = inputStream.available();
        int count1 = 0, count2 = 0;
        for (int i = count; i > 0; i--){
            int b = inputStream.read();
            System.out.println(b);
            if (count % 2 == 0) {
                if (i > count/2) {
                    outputStream1.write(b);
                    count1++;
                }
                else {
                    count2++;
                    outputStream2.write(b);
                }
            }
            else {
                if (i > ((count/2))) {
                    count1++;
                    outputStream1.write(b);
                }
                else {
                    count2++;
                    outputStream2.write(b);
                }
            }
        }
        System.out.println(count1 + " " + count2);
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
