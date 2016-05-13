package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

/*public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] array = s.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < array.length; i++)
        {
            char[] stringArray = array[i].toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            result.append(stringArray).append(" ");
        }
        System.out.println(result.toString().trim());
    }


} */


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = new String();

        for (int i = 0; i < s.length(); i++)
        {
            String ch = String.valueOf(s.charAt(i));
            if(ch.equals(" "))
                s2 = s2 + s.toUpperCase().charAt(i)+s.toUpperCase().charAt(++i);
            else
                s2=s2+s.charAt(i);

        }

        System.out.println(s2);

    }
}