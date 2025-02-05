package org.oxyl;

public class CercleAvecPoint {
    private Point point1;
    private Point point2;
    private double rayon;
    private double testcommit;

    public CercleAvecPoint(Point point1, Point point2, double rayon) {
        this.point1 = point1;
        this.point2 = point2;
        this.rayon = rayon;
    }

    public CercleAvecPoint(){
        point1 = new Point(0,0);
        point2 = new Point(0,0);
        rayon = 1.0;
    }


}
