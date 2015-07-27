package com.javarush.test.level14.lesson06.home01;

/**
 * Created by ADM on 25.10.2014.
 */
public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
