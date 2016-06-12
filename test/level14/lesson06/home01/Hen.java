package com.javarush.test.level14.lesson06.home01;

/**
 * Created by WWW on 20.03.2016.
 */
abstract class Hen{
    abstract int getCountOfEggsPerMonth();
    String getDescription(){
        return "Я курица.";
    }
}