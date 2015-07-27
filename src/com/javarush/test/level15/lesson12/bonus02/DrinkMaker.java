package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by ADM on 30.10.2014.
 */
public abstract class DrinkMaker {
    protected abstract void getRightCup();
    protected abstract void putIngredient();
    protected abstract void pour();

    public void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
