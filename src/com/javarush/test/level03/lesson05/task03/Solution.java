package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{
    public static int convertToSeconds(int hour){

        int hour1=hour;
        int sec;

        return sec=hour1*60*60;

    }
    //напишите тут ваш код

    public static void main(String[] args) {
        //напишите тут ваш код

        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(3));
    }
}