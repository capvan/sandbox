package ru.stqa.pft.sandbox;

public class FirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");

        //создание нового объекта
        Square s = new Square(5);
        //заполнение атрибутов объекта

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
//        int l = 6;
//        int s = l * l;
//        System.out.println("Площадь квадрата со стороной " + l + " = " + s);
    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }
}