package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ADM on 07.11.2014.
 */
public class Sum extends Thread {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
            try {
                while (!isInterrupted()){
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        this.interrupt();
                    } else {
                        sum += Integer.parseInt(s);
                    }
                    throw new InterruptedException();
                }

            }
            catch (IOException e){

            }
            catch (InterruptedException e){
                System.out.println(sum);
            }

    }
}
