package com.javarush.test.level16.lesson13.bonus02;

/**
 * Created by ADM on 07.11.2014.
 */
public class Ura extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Ура");
            Thread.sleep(500);
        }
        catch (InterruptedException ignore){

        }
    }
}
