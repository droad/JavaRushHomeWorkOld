package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aStr = reader.readLine();

        // string to integer
        int a = Integer.parseInt(aStr);

        if (a>0 && a%2==0 && aStr.length()==1)
            System.out.println("четное однозначное число");
        if (a>0 && a%2!=0 && aStr.length()==1)
            System.out.println("нечетное однозначное число");

        if (a>0 && a%2==0 && aStr.length()==2)
            System.out.println("четное двузначное число");
        if (a>0 && a%2!=0 && aStr.length()==2)
            System.out.println("нечетное двузначное число");

        if (a>0 && a%2==0 && aStr.length()==3)
            System.out.println("четное трехзначное число");
        if (a>0 && a%2!=0 && aStr.length()==3)
            System.out.println("нечетное трехзначное число");


    }
}
