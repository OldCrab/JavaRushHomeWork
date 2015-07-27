package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);
        String result = "";
        while(stream.available()>0){
            char data =(char) stream.read();
            result+= data;
        }
        stream.close();
        reader.close();
        System.out.println(result);

    }
}
