package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    public String name;
    public int weight = 2;
    public int old = 2;
    public String color = "dirty";
    public String adress;
    public void initialize (String name){
        this.name = name;
    }
    public void initialize (String name, int weight, int old){
        initialize(name, old);
        this.weight = weight;
    }
    public void initialize (String name, int old){
        this.name = name;
        this.old = old;
    }
    public void initialize (int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public void initialize (int weight, String color, String adress){
        initialize(weight, color);
        this.adress = adress;
    }
}
