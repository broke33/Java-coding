package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    int top;
    int left;
    int wigth;
    int heigth;
    public Rectangle (int top, int left, int wigth, int heigth){
        this.top = top;
        this.left = left;
        this.wigth = wigth;
        this.heigth = heigth;
    }
    public Rectangle (int top, int left){
        this.heigth = 0;
        this.wigth = 0;
        this.left = left;
        this.top = top;
    }
    public Rectangle (int top, int left, int wigth){
        this.heigth = wigth;
        this.wigth = wigth;
        this.left = left;
        this.top = top;
    }
    public Rectangle (Rectangle anotheRectangle){
        anotheRectangle = this;
    }

}
