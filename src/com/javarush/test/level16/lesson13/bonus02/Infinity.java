package com.javarush.test.level16.lesson13.bonus02;

/**
 * Created by ADM on 07.11.2014.
 */
public class Infinity extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println(1);
        }
    }
}
