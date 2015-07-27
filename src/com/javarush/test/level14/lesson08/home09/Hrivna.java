package com.javarush.test.level14.lesson08.home09;

/**
 * Created by ADM on 26.10.2014.
 */
public class Hrivna extends Money{
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
