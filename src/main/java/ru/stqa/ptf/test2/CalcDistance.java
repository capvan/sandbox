package ru.stqa.ptf.test2;

public class CalcDistance {

    public static void main(String[] args) {
        Point p1 = new Point(4,7);
        Point p2 = new Point(0,12);

        System.out.println("Расстояние между точками" + " = " + distance(p1,p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
    }
}