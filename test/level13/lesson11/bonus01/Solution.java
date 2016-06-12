package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
//D:\Java IDE\soft\JavaRushHomeWork\JavaRushHomeWork\src\hello.txt
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        InputStream file = new FileInputStream(reader.readLine());
        Scanner sFile = new Scanner(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (sFile.hasNextLine())
        {
            list.add(sFile.nextInt());
//            System.out.println((char) reader.read());
        }
        for (Integer anList : list)
        System.out.println(anList);
        sFile.close();
        reader.close();
    }
}
