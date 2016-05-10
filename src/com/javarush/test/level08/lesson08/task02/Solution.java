package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(4);
        setInt.add(5);
        setInt.add(6);
        setInt.add(7);
        setInt.add(8);
        setInt.add(9);
        setInt.add(10);
        setInt.add(11);
        setInt.add(12);
        setInt.add(13);
        setInt.add(14);
        setInt.add(15);
        setInt.add(16);
        setInt.add(17);
        setInt.add(18);
        setInt.add(19);
        setInt.add(20);
        return (HashSet<Integer>) setInt;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
           // Integer n = iterator.next();
            if (iterator.next()>10)
                iterator.remove();

        }
        return set;


    }
}
