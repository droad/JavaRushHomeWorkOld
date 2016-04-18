package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        int n=0;
        String str1;
        String str2="";

        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                str1=Integer.toString(i*j);
                str2=str2+str1+ " ";
            }
            System.out.println(str2);
            str2="";
        }
    }
}