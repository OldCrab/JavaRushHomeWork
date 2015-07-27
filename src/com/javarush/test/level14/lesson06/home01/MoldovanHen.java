package com.javarush.test.level14.lesson06.home01;

/**
* Created by ADM on 25.10.2014.
*/
 public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 2;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
