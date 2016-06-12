package com.javarush.test.level02.lesson08.task06;

/* Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
*/
public class Solution
{
    public static void print3(String s)
    {
        //напишите тут ваш код
        String s1 = "window";
        String s2 = " file";
        if (!s.equals(s2)){
            System.out.print(s + " ");
            System.out.print(s + " ");
            System.out.println(s);
        }
        else {
            System.out.print(s);
            System.out.print(s);
            System.out.print(s);
        }


    }
    public static void main(String[] args)
    {
        print3("window");
        print3(" file");
    }
}
