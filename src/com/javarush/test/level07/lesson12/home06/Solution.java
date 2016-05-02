package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int),
отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human ivan = new Human();
        ivan.name="Ivan";
        ivan.age=75;
        ivan.sex=true;
        System.out.println(ivan.toString());

        Human vasya = new Human();
        vasya.name="Vasya";
        vasya.age=80;
        vasya.sex=true;
        System.out.println(vasya.toString());

        Human masha = new Human();
        masha.name="Masha";
        masha.age=65;
        masha.sex=false;
        System.out.println(masha.toString());

        Human natasha = new Human();
        natasha.name="Natasha";
        natasha.age=60;
        masha.sex=false;
        System.out.println(natasha.toString());

        Human sasha = new Human();
        sasha.name = "Sasha";
        sasha.age=25;
        sasha.sex=true;
        sasha.father = ivan;
        sasha.mother=masha;
        System.out.println(sasha.toString());

        Human wife = new Human();
        wife.name="Katya";
        wife.age=23;
        wife.sex=false;
        wife.father=vasya;
        wife.mother=natasha;
        System.out.println(wife.toString());

        Human child1 = new Human();
        child1.name="Anton";
        child1.age=4;
        child1.sex=true;
        child1.mother=wife;
        child1.father=sasha;
        System.out.println(child1.toString());

        Human child2 = new Human();
        child2.name="Kolya";
        child2.age=5;
        child2.sex=true;
        child2.mother=wife;
        child2.father=sasha;
        System.out.println(child2.toString());

        Human child3 = new Human();
        child3.name="Polina";
        child3.age=3;
        child3.sex=false;
        child3.mother=wife;
        child3.father=sasha;
        System.out.println(child3.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
