package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        //напишите тут ваш код

        System.out.println(convertEurToUsd(10, 12.5));
        System.out.println(convertEurToUsd(20, 30));
    }

    public static double convertEurToUsd(int eur, double course){
        //напишите тут ваш код
        int eur1=eur;
        double course1=course;
        double result;

        return result=eur1*course1;



    }
}
