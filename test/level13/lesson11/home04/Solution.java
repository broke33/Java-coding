package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader readerFC = new BufferedReader(new InputStreamReader(System.in));
        String filename = readerFC.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        String nextLine;
        while (true) {
            nextLine = readerFC.readLine();
            writer.write(nextLine + "\r\n");
            if (nextLine.equals("exit")) break;
        }
        readerFC.close();
        writer.close();
        /*String line;
        BufferedReader readerFF = new BufferedReader(new FileReader(filename));
        while ((line = readerFF.readLine()) != null ) System.out.println(line);
        readerFF.close();
        */
    }
}
