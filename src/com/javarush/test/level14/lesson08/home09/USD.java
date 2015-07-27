package com.javarush.test.level14.lesson08.home09;

/**
 * Created by ADM on 26.10.2014.
 */
public class USD extends Money{
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }

}
