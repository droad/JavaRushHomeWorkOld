package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandpa1 = new Human();
        grandpa1.name="Vasya";
        grandpa1.age=65;
        grandpa1.sex=true;


        Human grandpa2 = new Human();
        grandpa2.name="Petya";
        grandpa2.age=66;
        grandpa2.sex=true;

        Human grandma1 = new Human();
        grandma1.name="Masha";
        grandma1.age=60;
        grandma1.sex=false;

        Human grandma2 = new Human();
        grandma2.name="Dasha";
        grandma2.age=62;
        grandma2.sex=false;

        Human father = new Human();
        father.name="Igor";
        father.age=40;
        father.sex=true;


        Human mother = new Human();
        mother.name="Nata";
        mother.age=38;
        mother.sex=false;

        Human son1 = new Human();
        son1.name="Son1";
        son1.age=5;
        son1.sex=true;

        Human son2 = new Human();
        son2.name="Son2";
        son2.age=10;
        son2.sex=true;

        Human son3 = new Human();
        son3.name="Son3";
        son3.age=12;
        son3.sex=true;

        father.children.add(son1);
        father.children.add(son2);
        father.children.add(son3);
        mother.children.add(son1);
        mother.children.add(son2);
        mother.children.add(son3);

        grandpa1.children.add(father);
        grandma1.children.add(father);

        grandpa2.children.add(mother);
        grandma2.children.add(mother);



        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
