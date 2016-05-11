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

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] array =s.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i = 0; i<array.length;i++){
            char[] stringArray = array[i].toCharArray();
            stringArray[0]=Character.toUpperCase(stringArray[0]);
            array[i]=new String(stringArray);
            result.append(array[i]).append(" ");
        }
        System.out.println(result.toString().trim());

    }


}
