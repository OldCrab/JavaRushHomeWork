package com.javarush.test.level16.lesson13.bonus02;

/**
 * Created by ADM on 07.11.2014.
 */
public class Warning extends Thread implements Message {
    @Override
    public  void showWarning()
    {

        this.interrupt();
        try
        {
            this.join();
        }
        catch(Exception e)
        {

        }

    }

    @Override
    public void run()
    {
        Thread current = Thread.currentThread();
        while(!current.interrupted())
        {

        }


    }
}
