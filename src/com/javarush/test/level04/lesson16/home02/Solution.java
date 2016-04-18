package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
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

        if (a<b & b>c)
            System.out.println(a);
        if (b<a & b>c)
            System.out.println(b);
        if (c<a & c>b)
            System.out.println(c);

    }
}
