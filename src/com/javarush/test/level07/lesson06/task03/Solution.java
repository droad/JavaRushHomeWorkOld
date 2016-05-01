package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String >();
        ArrayList<String> listMin = new ArrayList<String >();
        int strMin = 2147483647;

        for(int i=0;i<5;i++)
            list.add(reader.readLine());

        for(int m=0;m<list.size();m++)
            if(list.get(m).length()<strMin)
                strMin=list.get(m).length();

        for(int n = 0;n<list.size();n++)
            if(list.get(n).length()==strMin)
                listMin.add(list.get(n));

        for (int k=0;k<listMin.size();k++)
            System.out.println(listMin.get(k));




    }
}
