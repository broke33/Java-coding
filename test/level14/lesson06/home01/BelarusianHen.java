package com.javarush.test.level14.lesson06.home01;

/**
 * Created by WWW on 20.03.2016.
 */
class BelarusianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth()
    {
        return 28;
    }
    String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}