package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"\n" +
                "January");
        map.put(2,"February");
        map.put(3,"March");
        map.put(4,"April");
        map.put(5,"May");
        map.put(6,"June");
        map.put(7,"July");
        map.put(8,"August");
        map.put(9,"September");
        map.put(10,"October");
        map.put(11,"November");
        map.put(12,"December");

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String month =reader.readLine();
        //int n = Integer.parseInt(reader.readLine());

        Iterator<Map.Entry<Integer, String>> iterator= map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> pair=iterator.next();
            if(month.equals(pair.getValue())){
                System.out.println(pair.getValue()+" is "+pair.getKey()+" month");
            }
        }
    }

}
