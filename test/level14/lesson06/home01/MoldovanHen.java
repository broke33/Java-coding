package com.javarush.test.level14.lesson06.home01;

/**
 * Created by WWW on 20.03.2016.
 */
class MoldovanHen extends Hen{

    @Override
    int getCountOfEggsPerMonth()
    {
        return 23;
    }
    String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}