package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

        if (a!=b & b==c)
            System.out.println("1");
        if (a!=b&b!=c)
            System.out.println("2");
        if (a==b&b!=c)
            System.out.println("3");
    }
}
