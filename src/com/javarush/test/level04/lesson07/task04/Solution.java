package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int j=0;
        if (a>0)
            i=i+1;
        else
            j=j+1;

        if (b>0)
            i=i+1;
        else
            j=j+1;

        if (c>0)
            i=i+1;
        else
            j=j+1;

        System.out.println("количество отрицательных чисел: "+j);
        System.out.println("количество положительных чисел: "+i);
    }
}
