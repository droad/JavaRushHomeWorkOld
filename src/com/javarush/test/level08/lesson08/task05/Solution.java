package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
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
        Map<String,String> map = new HashMap<>();
        map.put("Ivanov","Ivan1");
        map.put("Ivanov","Ivan2");
        map.put("Ivanov","Ivan3");
        map.put("Ivanov","Ivan4");
        map.put("Ivanov","Ivan5");
        map.put("Ivanov","Ivan");
        map.put("Ivanov","Ivan7");
        map.put("Ivanov","Ivan7");
        map.put("Ivanov","Ivan");
        map.put("Ivanov","Ivan9");
        return (HashMap<String, String>) map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        String value = "Ivan";

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            removeItemFromMapByValue(map,value);
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
}
