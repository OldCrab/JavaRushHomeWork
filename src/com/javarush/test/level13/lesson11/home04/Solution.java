package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reader.readLine())));

        for (int i = 0; i > -1 ; i++) {
            String strings = reader.readLine();
            writer.write(strings);
            if(strings.equals("exit")){
                break;
            }


                writer.newLine();
        }
        writer.close();
        reader.close();
    }
}
