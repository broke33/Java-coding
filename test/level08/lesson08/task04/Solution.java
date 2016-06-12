package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Schwarzenegger", new Date("JULY 30 1947"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("OCTOBER 1 1980"));
        map.put("Stallone5", new Date("JANUARY 1 1980"));
        map.put("Stallone6", new Date("FEBRUARY 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("AUGUST 1 1980"));
        map.put("Stallone9", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone2", new Date("NOVEMBER 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        HashMap<String, Date> mapcopy = new HashMap<String, Date>(map);

        for (Map.Entry<String, Date> pair : mapcopy.entrySet())
            if ((pair.getValue().getMonth() > 4) & (pair.getValue().getMonth() < 8))
                map.remove(pair.getKey());
        System.out.println(map);
    }
//    public static void  main(String [] args){
//        System.out.println(createMap());
//        removeAllSummerPeople(createMap());
//    }
}
