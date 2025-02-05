package org.oxyl;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(Point point){
        x = point.x;
        y = point.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //méthode instance of
    public boolean equals(Object e) {
        Point p;
        if (e instanceof Point) {
            p = (Point) e;
        } else {
            return false;
        }
        if (x == p.getX() && y == p.getY()) {
            return true;
        }
        return false;

    }

    public double calculerDistance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
}
