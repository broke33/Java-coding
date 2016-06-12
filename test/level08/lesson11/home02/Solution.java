package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
//        System.out.println(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();
        Cat cat4 = new Cat();
        cats.add(cat4);
        Cat cat1 = new Cat();
        cats.add(cat1);
        Cat cat2 = new Cat();
        cats.add(cat2);
        Cat cat3 = new Cat();
        cats.add(cat3);

        return cats;
    }

    public static Set<Dog> createDogs()
    {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<Dog>();
        Dog dog3 = new Dog();
        dogs.add(dog3);
        Dog dog1 = new Dog();
        dogs.add(dog1);
        Dog dog2 = new Dog();
        dogs.add(dog2);

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //напишите тут ваш код
        for (Object cell : pets)
            if (pets.contains(cats))
                pets.remove(cell);
    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        for (Object pet : pets)
            System.out.println(pet.getClass());
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
