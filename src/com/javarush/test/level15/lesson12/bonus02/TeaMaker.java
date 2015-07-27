package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by ADM on 30.10.2014.
 */
public class TeaMaker extends DrinkMaker {
    @Override
    protected void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    protected void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    protected void pour() {
        System.out.println("Заливаем водой");
    }
}
