package com.javarush.test.level12.lesson02.task04;

/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/



public class Solution
{
    public static void main(String[] args)
    {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o)
    {
      //Напишите тут ваше решение
        if (o instanceof Cat)
        {
            System.out.println("Кошка");
        }

        if (o instanceof Bird)
        {
            System.out.println("Птица");
        }

        if (o instanceof Lamp)
        {
            System.out.println("Лампа");
        }

        if (o instanceof Dog)
        {
            System.out.println("Собака");
        }


    }

    public static class Cat
    {
        public String getName()
        {
            return "Кошка";
        }
    }

    public static class Dog
    {
        public String getName()
        {
            return "Собака";
        }
    }

    public static class Bird
    {
        public String getName()
        {
            return "Птица";
        }
    }

    public static class Lamp
    {
        public String getName()
        {
            return "Лампа";
        }
    }
}
