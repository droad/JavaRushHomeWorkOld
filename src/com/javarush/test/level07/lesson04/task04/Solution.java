package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        int[] arrayReverse = new int[10];
        int j=0;

        for (int i=0;i<array.length;i++)
            array[i]=Integer.parseInt(reader.readLine());

        for (int m=array.length-1;m>=0;m--)
        {
            arrayReverse[j] = array[m];
            j++;
        }

        for(int k=0;k<arrayReverse.length;k++)
            System.out.println(arrayReverse[k]);

        }



    }

