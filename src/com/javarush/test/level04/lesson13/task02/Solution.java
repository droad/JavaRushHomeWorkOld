package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aStr = reader.readLine();
        String bStr = reader.readLine();
        // string to integer
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);

        for (int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                System.out.print("8");
            }
            System.out.println();

            }
        }



    }

