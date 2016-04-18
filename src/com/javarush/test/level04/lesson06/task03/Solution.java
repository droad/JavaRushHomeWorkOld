package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aStr = reader.readLine();
        String bStr = reader.readLine();
        String cStr = reader.readLine();

        // string to integer
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        int c = Integer.parseInt(cStr);

        int n1=0;
        int n2=0;
        int n3=0;

        if ((a>b)&(a>c))
            //System.out.println(a);
            n1=a;
        if ((b>a)&(b>c))
            //System.out.println(b);
            n1=b;
        if ((c>a)&(c>b))
            n1=c;
            //System.out.println(c);

      if ((a < b & a > c)|(a > b & a< c))
            n2=a;
            //System.out.println(a);
        if ((b < a & b > c)|(b > a & b < c))
            n2=b;
            //System.out.println(b);
        if ((c < a & c > b)|(c >a & c< b))
            n2=c;
            //System.out.println(c);

        if ((a<b)&(a<c))
            n3=a;
            //System.out.println(a);
        if ((b<a)&(b<c))
            n3=b;
            //System.out.println(b);
        if ((c<a)&(c<b))
            n3=c;
            //System.out.println(c);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);



    }
}
