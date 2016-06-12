package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer n1 = Integer.parseInt(reader.readLine());
        Integer n2 = Integer.parseInt(reader.readLine());
        System.out.println(gcd_1(n1, n2));

    }

    public static int gcd_1(int a, int b) {
        if (b == 0)
            return a;
        return gcd_1(b, a % b);
    }
}

/*
    System.out.println(gCD(n1, n2));


    }
    public static ArrayList<Integer> div(Integer num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= num; i++) {
            if (num%i == 0){
                list.add(i);
            }
        }
        return list;
    }
    public static Integer gCD(Integer num1, Integer num2) {
        ArrayList<Integer> div1 = div(num1);
        ArrayList<Integer> div2 = div(num2);
        Integer nod = 1;
        for (int i = 0; i < div1.size(); i++){
            for (int j = 0; j < div2.size(); j++){
                if (div1.get(i).equals(div2.get(j))){
                    nod *= div1.get(i);
                    div1.remove(i);
                    div2.remove(i);
                    i = 0;
                    j = 0;
                }
            }
        }
        return nod;
    }
 */