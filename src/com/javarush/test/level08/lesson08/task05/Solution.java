package com.javarush.test.level08.lesson08.task05;


import java.util.Collections;
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
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Ivanov", "Ivan2");
        map.put("Ivanov", "Ivan");
        map.put("Ivanov", "Ivan3");
        map.put("Ivanov", "Ivan");
        map.put("Ivanov", "Ivan4");
        map.put("Ivanov", "Ivan6");
        map.put("Ivanov", "Ivan6");
        map.put("Ivanov", "Ivan7");
        map.put("Ivanov", "Ivan");

        return (HashMap<String, String>) map;


    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);


        for (Map.Entry<String, String> element : copy.entrySet())
        {
            int count = 0;
            for(Map.Entry<String, String> copyElement : copy.entrySet())
            {
                if (element.getValue().equals(copyElement.getValue())) count++;

            }
            if (count>1) removeItemFromMapByValue(map, element.getValue());
        }

     /*   HashMap<String,String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> chek : copy.entrySet()){
            if(Collections.frequency(copy.values(),chek.getValue()) > 1) removeItemFromMapByValue(map, chek.getValue());
        }
*/

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
