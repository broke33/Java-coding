package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov1", "Vova");
        map.put("Ivanov2", "Vova1");
        map.put("Ivanov3", "Vova");
        map.put("Ivanov4", "Vova3");
        map.put("Ivanov5", "Vova2");
        map.put("Ivanov6", "Vova4");
        map.put("Ivanov7", "Vova2");
        map.put("Ivanov8", "Vova");
        map.put("Ivanov9", "Vova1");
        map.put("Ivanov10", "Vova6");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> mapCopy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : mapCopy.entrySet())
        {
            int count = 0;
            for (Map.Entry<String, String> other : mapCopy.entrySet())
            {
                if (pair.getValue().equals(other.getValue()))
                    count += 1;
                if (count > 1) removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
/*    public static void  main(String [] args){
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
*/
}
