package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listMax = new ArrayList<>();

        int maxStr=0;

        for(int i=0;i<5;i++)
            list.add(reader.readLine());

        for (int l =0;l<list.size();l++)
            if (list.get(l).length()>maxStr)
                maxStr=list.get(l).length();

        for (int n =0;n<list.size();n++){
            if (list.get(n).length()==maxStr)
                listMax.add(list.get(n));
        }

        for (int k=0;k<listMax.size();k++)
            System.out.println(listMax.get(k));

       // for(int i=0;i<5;i++)
       // System.out.println(list.get(i));

    }
}
