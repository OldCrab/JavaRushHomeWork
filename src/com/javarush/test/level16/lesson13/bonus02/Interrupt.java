package com.javarush.test.level16.lesson13.bonus02;

/**
 * Created by ADM on 07.11.2014.
 */
public class Interrupt extends Thread {
    @Override
    public void run() {
        try {
            while (!isInterrupted()){
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
    }
}
