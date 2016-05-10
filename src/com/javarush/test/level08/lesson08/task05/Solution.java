package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
<<<<<<< Updated upstream
=======
import java.util.Iterator;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        Map<String,String> map= new HashMap<>();
        map.put("Ivanon1","Ivan1");
        map.put("Ivanon2","Ivan");
        map.put("Ivanon3","Ivan2");
        map.put("Ivanon4","Ivan");
        map.put("Ivanon5","Ivan3");
        map.put("Ivanon6","Ivan");
        map.put("Ivanon7","Ivan4");
        map.put("Ivanon8","Ivan");
        map.put("Ivanon9","Ivan5");
        map.put("Ivanon10","Ivan");

        return (HashMap<String, String>) map;


=======
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("chaschin","dmitro");
        map.put("norris","chak");
        map.put("lee","brus");
        map.put("villis","brus");
        map.put("solunskiy","dmitro");
        map.put("porox","petya");
        map.put("yanik","vitya");
        map.put("avakov","arsen");
        map.put("chan","jekki");
        map.put("ivanov","ivan");
        return map;
>>>>>>> Stashed changes

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
<<<<<<< Updated upstream
=======
        String name;

        Iterator<Map.Entry<String, String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            name=iterator.next().getValue();
            removeItemFromMapByValue(map,name);
        }




>>>>>>> Stashed changes

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
