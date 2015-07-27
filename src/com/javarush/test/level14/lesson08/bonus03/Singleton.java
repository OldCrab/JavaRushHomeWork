package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by ADM on 27.10.2014.
 */
public class Singleton {
    private static Singleton non = new Singleton();
    public static Singleton getInstance(){
        return non;
    }
    private Singleton(){
    }
}
