package com.javarush.test.level08.lesson08.task03;


import java.util.HashMap;
import java.util.Map;



/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static Map<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Gf","Ga");
        map.put("Gf","Fa");
        map.put("Fg","Da");
        map.put("Tr","Da");
        map.put("Sd","Fa");
        map.put("Sc","Ff");
        map.put("Sd","Yy");
        map.put("Drt","Yy");
        map.put("Sa","Fa");
        map.put("Sa","Fa");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int n=0;
        for (Map.Entry<String, String> stringStringEntry : map.entrySet())
        {
            if (stringStringEntry.getValue().equals(name)) n++;

        }
        return n;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int n=0;
        for (Map.Entry<String, String> stringStringEntry : map.entrySet())
            if (stringStringEntry.getKey().equals(lastName)) n++;
        return n;

    }
}
