package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Мыла».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        String st1="Мама";
        String st2="Мыла";
        String st3="Раму";

        System.out.println(st1+st2+st3);
        System.out.println(st2+st1+st3);
        System.out.println(st2+st3+st1);
        System.out.println(st1+st3+st2);
        System.out.println(st3+st1+st2);
        System.out.println(st3+st2+st1);


    }
}