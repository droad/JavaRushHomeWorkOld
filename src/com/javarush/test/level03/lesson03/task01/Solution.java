package com.javarush.test.level03.lesson03.task01;

/* Реализация метода
Добавьте метод public static void printString(String s) который будет выводить переданную строку на экран.
*/
public class Solution
{
    //напишите тут ваш код

    public static void printString(String s){

        String s1=s;
        System.out.print(s1);
    }

    public static void main(String[] args) {

        printString("Hello Amigo!");
    }
}
