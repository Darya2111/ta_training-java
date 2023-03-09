package com.epam.training.darya_raicheva.classes.segments;

public class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Segment {

    public Segment(Point start, Point end) {

    }

    double length() {

    }

    Point middle() {

    }

    Point intersection(Segment another) {

    }

}

 public class Main {
    public static void main(String[] args) {

        {
            double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
            System.out.println(length);
        }

        {
            Segment first = new Segment(new Point(0, 0), new Point(4, 4));
            Segment second = new Segment(new Point(2, 0), new Point(0, 2));
            Point intersection = first.intersection(second);

            System.out.println(intersection.getX());
            System.out.println(intersection.getY());
        }

        {
            Segment first = new Segment(new Point(0, 0), new Point(4, 0));
            Segment second = new Segment(new Point(2, 1), new Point(1, 2));
            Point intersection = first.intersection(second);

            System.out.println(intersection == null);
        }
    }
}
