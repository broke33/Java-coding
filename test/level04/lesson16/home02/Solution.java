package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);
        if ((a >= b)&&(a >= c)){
            if (b > c)
                System.out.print(b);
            else
                System.out.print(c);
        }
        else
        {
            if ((a <= b) && (a <= c))
            {
                if (b > c)
                    System.out.print(c);
                else
                    System.out.print(b);
            }
            else
                System.out.print(a);
        }
    }
}
