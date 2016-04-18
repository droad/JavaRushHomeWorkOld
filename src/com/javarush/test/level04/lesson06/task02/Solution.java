package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String dStr = reader.readLine();

        // string to integer
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        int c = Integer.parseInt(cStr);
        int d = Integer.parseInt(dStr);

        int i = 0;
        int j = 0;

        if (a>b)
            i=a;
        else
            i=b;

        if (c>d)
            j=c;
        else
            j=d;

        if (i>j)
            System.out.println(i);
        else
            System.out.println(j);

    }
}
