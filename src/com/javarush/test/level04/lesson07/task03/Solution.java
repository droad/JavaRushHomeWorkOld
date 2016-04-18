package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aStr = reader.readLine();
        String bStr = reader.readLine();
        String cStr = reader.readLine();

        // string to integer
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        int c = Integer.parseInt(cStr);

        int i=0;
        if (a>0)
            i=i+1;

        if (b>0)
            i=i+1;
        if (c>0)
            i=i+1;

        System.out.println(i);

    }
}
