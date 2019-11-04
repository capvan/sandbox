package ru.stqa.pft.sandbox;

public class Square {
    //атрибуты
    public double l;

    public Square(double l) {
        //инициализация нового объекта
        this.l = l;
    }

    public double area() {
        return this.l * this.l;
    }
}
