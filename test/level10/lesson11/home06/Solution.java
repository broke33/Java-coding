package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        int old;
        String name;
        boolean sex;
        boolean married;
        String work;
        String dream;
        //напишите тут ваши переменные и конструкторы


        public Human(int old, String name, boolean sex, boolean married)
        {
            this.old = old;
            this.name = name;
            this.sex = sex;
            this.married = married;
        }

        public Human(int old, String name, boolean sex)
        {
            this.old = old;
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, boolean married, String dream)
        {
            this.name = name;
            this.sex = sex;
            this.married = married;
            this.dream = dream;
        }

        public Human(String name, boolean sex, String dream)
        {

            this.name = name;
            this.sex = sex;
            this.dream = dream;
        }

        public Human(int old, boolean sex, String name, boolean married)
        {

            this.old = old;
            this.sex = sex;
            this.name = name;
            this.married = married;
        }

        public Human(int old, String name, boolean sex, String work)
        {

            this.old = old;
            this.name = name;
            this.sex = sex;
            this.work = work;
        }

        public Human(String name, boolean sex)
        {

            this.name = name;
            this.sex = sex;
        }

        public Human()
        {

        }

        public Human(int old, String name, boolean sex, boolean married, String work, String dream)
        {

            this.old = old;
            this.name = name;
            this.sex = sex;
            this.married = married;
            this.work = work;
            this.dream = dream;
        }

        public Human(int old, String name, boolean sex, boolean married, String work)
        {

            this.old = old;
            this.name = name;
            this.sex = sex;
            this.married = married;
            this.work = work;
        }
    }
}
