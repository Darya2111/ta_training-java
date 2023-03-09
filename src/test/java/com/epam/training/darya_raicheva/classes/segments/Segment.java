package com.epam.training.darya_raicheva.classes.segments;

// Реализуйте методы класса Segment (отрезок):
// Конструктор, в который в качестве параметров передаются координаты точек начала и конца отрезка.
// Убедитесь, что созданный отрезок существует и не является вырожденным, что означает, что начало
// и конец отрезка не являются одной и той же точкой.
// Если это не так, используйте throw new IllegalArgumentException(), чтобы вызвать ошибку.
// double length() – возвращает длину сегмента.
// Point middle() – возвращает среднюю точку сегмента.
// Point intersection(Segment another) – возвращает точку пересечения текущего отрезка с другим.
// Возвращает null, если такой точки нет.
// Возвращает null, если сегменты коллинеарны.
// Обратите внимание, что точка пересечения должна лежать на обоих сегментах.

public class Segment {
    private Point start;
    private Point end;
    public Segment(Point start, Point end) {
        if (start == null || end == null)
            throw new IllegalArgumentException("Arguments can't be null");
        if (start.equals(end))
            throw new IllegalArgumentException("The points must differ");
        this.start = start;
        this.end = end;
    }
    double length() {
        double xDistanceSquare = Math.pow(start.getX() - end.getX(), 2);
        double yDistanceSquare = Math.pow(start.getY() - end.getY(), 2);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }
    Point middle() {
        return new Point( (start.getX() + end.getX()) / 2,
                (start.getY() + end.getY()) / 2 );
    }
    Point intersection(Segment another) {
        // Координаты точки пересечения найдите сами
        double x = 5; // Это просто пример, чтоб компилятор не ругался
        double y = 25;
        // И верните точку с этими координатами
        return new Point(x, y);
    }
}
