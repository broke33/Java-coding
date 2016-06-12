package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String> m1 = new ArrayList<String>();
        m1.add("23rf");
        ArrayList<String> m2 = new ArrayList<String>();
        m2.add("23rsdf");
        m2.add("13rsdf");
        m2.add("2234sdf");
        ArrayList<String> m3 = new ArrayList<String>();
        m3.add("23qf3rf");

        ArrayList<String>[] arrayOfStringList = new ArrayList[3];
        arrayOfStringList[0] = m1;
        arrayOfStringList[1] = m2;
        arrayOfStringList[2] = m3;


        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}