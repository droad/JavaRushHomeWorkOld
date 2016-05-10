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
        map.put(1,"Jun");
        map.put(2,"Feb");
        map.put(3,"Mar");
        map.put(4,"Apr");
        map.put(5,"May");
        map.put(6,"Juny");
        map.put(7,"July");
        map.put(8,"Aug");
        map.put(9,"Sept");
        map.put(10,"Oct");
        map.put(11,"Nov");
        map.put(12,"Dec");

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Iterator<Integer,String>
    }

}
