package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static {
        labels.put((double) 1, "a");
        labels.put((double) 2, "b");
        labels.put((double) 3, "c");
        labels.put((double) 4, "d");
        labels.put((double) 5, "e");
    }
}
