package com.epam.training.darya_raicheva.classes.line_intersection;

public class Line {
    final int k;
    final int b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }
    public Point intersection(Line other) {
        if (k != b) {
            int x = (other.b - this.b) / (this.k - other.k);
            int y = this.k * x + this.b;
            return new Point(x, y);
        } else {
            return null;
        }
    }
}
