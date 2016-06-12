package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by WWW on 10.04.2016.
 */
public class Singleton
{
    private Singleton(){}
    private static Singleton firstInstance = null;
    public static Singleton getInstance(){
        if (firstInstance == null)
            firstInstance = new Singleton();
        return firstInstance;
    }
}
