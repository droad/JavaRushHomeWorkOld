package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bStr = reader.readLine();
        String aStr = reader.readLine();


        // string to integer
        int a = Integer.parseInt(aStr);
        int i=0;
        while (i<a){
            System.out.println(bStr);
            i++;}
    }
}
