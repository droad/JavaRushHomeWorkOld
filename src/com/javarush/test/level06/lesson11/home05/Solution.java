package com.javarush.test.level06.lesson11.home05;

/* Есть новые идеи? Подумаем...
1. В классе Solution создать public статический класс Idea
2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
3. В классе Solution создайте статический метод public void printIdea(Idea idea), который будет выводить
на экран описание идеи - это то, что возвращает метод getDescription
*/

//import com.sun.xml.internal.bind.v2.model.core.ID;

public class Solution
{
    public static void main(String[] args)
    {
        printIdea(new Idea());
    }
    //Добавьте тут класс Idea
    public static class Idea
    {
        public String getDescription()
        {
            return "Not empty string";

        }
    }
    public static void printIdea(Idea idea)
    {
        System.out.print(idea.getDescription());
    }


}
