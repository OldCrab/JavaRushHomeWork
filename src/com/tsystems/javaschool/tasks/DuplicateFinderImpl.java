package com.tsystems.javaschool.tasks;

import java.io.*;
import java.util.*;

/**
 * Created by andre on 15.12.14.
 */
public class DuplicateFinderImpl implements DuplicateFinder {
    @Override
    public boolean process(File sourceFile, File targetFile) {
        try {
            Map<String,Integer> map = buildMap(sourceFile);                 //вызываем метод, который строит мап из ключей(строк) и значений(количества этих строк в файле)

            sortAndWrite(map,targetFile);                                   //вызываем метод, который сортирует нашу коллекцию и записывает в файл отсортированную коллекцию
        } catch (Exception e){                                              //если возникают ошибки в методах, возвращает фолс
            return false;
        }

        return true;
    }
    private Map<String,Integer> buildMap (File sourceFile) throws Exception{
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner in = new Scanner(sourceFile);

        while (in.hasNext()){
            String s = in.nextLine();
            if (map.containsKey(s)){                                        //если в коллекции уже есть такая строка, то ко значению прибавляется единица и кидается новая пара
                Integer i = map.get(s)+1;                                   //с отредактированным значением
                map.put(s, i);
            }else {
                map.put(s, 1);
            }
        }

        in.close();

        return map;
    }
    private void sortAndWrite(Map<String, Integer> map, File targetFile) throws Exception{
        if (!targetFile.exists()) {
            targetFile.createNewFile();                                 //если файл не существует, то мы его создаём
        }
        Writer writeFile = new FileWriter(targetFile, true);

        SortedSet<String> keys = new TreeSet<String>(map.keySet());     //сортировка
        for (String key : keys) {                                       //запись в файл, через append, чтобы не повредить содержимое
            writeFile.append(key + " [" + map.get(key) + "]" + "\n");
        }

        writeFile.close();
    }

    public static void main(String[] args) {
        DuplicateFinder d = new DuplicateFinderImpl();
        d.process(new File("a.txt"), new File("b.txt"));
    }
}
