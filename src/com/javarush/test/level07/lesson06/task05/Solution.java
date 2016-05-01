package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String str;

        for(int i=0;i<5;i++)
            list.add(reader.readLine());

        for(int n = 0;n<13;n++){
            str=list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,str);
        }

        for(int m=0;m<list.size();m++)
            System.out.println(list.get(m));
    }
}
