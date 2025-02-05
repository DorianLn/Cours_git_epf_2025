package org.oxyl;

public class TriangleAvecPoint {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private Point point5;

    public TriangleAvecPoint(Point p1, Point p2, Point p3) {
        this.point1 = new Point(p1);
        this.point2 = new Point(p2);
        this.point3 = new Point(p3);
    }

    public TriangleAvecPoint() {
        point1 = new Point(0, 0);
        point2 = new Point(0, 1.0);
        point3 = new Point(0.5, 0.5);

    }


    public TriangleAvecPoint(TriangleAvecPoint triangle){
        point1 = new Point(triangle.point1);
        point2 = new Point(triangle.point2);
        point3 = new Point(triangle.point3);
    }

    public void deplacer(double distanceX, double distanceY){
        point1.setX(point1.getX() + distanceX);
        point1.setY(point1.getY() + distanceY);

        point2.setX(point2.getX() + distanceX);
        point2.setY(point2.getY() + distanceY);

        point3.setX(point3.getX() + distanceX);
        point3.setY(point3.getY() + distanceY);
    }

    // Rotation autour du barycentre
    public void tourner(double theta) {
        double thetaRad = Math.toRadians(theta); // Conversion en radians

        // Calcul du barycentre
        double Gx = (point1.getX() + point2.getX() + point3.getX()) / 3;
        double Gy = (point1.getY() + point2.getY() + point3.getY()) / 3;

        // Appliquer la rotation
        double X1 = Gx + (point1.getX() - Gx) * Math.cos(thetaRad) - (point1.getY() - Gy) * Math.sin(thetaRad);
        double Y1 = Gy + (point1.getX() - Gx) * Math.sin(thetaRad) + (point1.getY() - Gy) * Math.cos(thetaRad);

        double X2 = Gx + (point2.getX() - Gx) * Math.cos(thetaRad) - (point2.getY() - Gy) * Math.sin(thetaRad);
        double Y2 = Gy + (point2.getX() - Gx) * Math.sin(thetaRad) + (point2.getY() - Gy) * Math.cos(thetaRad);

        double X3 = Gx + (point3.getX() - Gx) * Math.cos(thetaRad) - (point3.getY() - Gy) * Math.sin(thetaRad);
        double Y3 = Gy + (point3.getX() - Gx) * Math.sin(thetaRad) + (point3.getY() - Gy) * Math.cos(thetaRad);

        // Arrondir et assigner aux attributs
        point1.setX(arrondir(X1));
        point1.setY(arrondir(Y1));
        point2.setX(arrondir(X2));
        point2.setY(arrondir(Y2));
        point3.setX(arrondir(X3));
        point3.setY(arrondir(Y3));
    }

    // Vérifie si le triangle est équilatéral
    public boolean isEquilateral() {
        double AB = distance(point1, point2);
        double BC = distance(point2, point3);
        double CA = distance(point3, point1);

        // Arrondi à 2 décimales
        AB = arrondir(AB);
        BC = arrondir(BC);
        CA = arrondir(CA);

        return AB == BC && BC == CA;
    }

    // Fonction utilitaire pour calculer la distance entre deux points
    private double distance(Point pA,Point pB) {
        return Math.sqrt(Math.pow(pB.getX() - pA.getX(), 2) + Math.pow(pB.getY() - pA.getY(), 2));
    }

    // Fonction utilitaire pour arrondir à 2 décimales
    private double arrondir(double valeur) {
        return Math.round(valeur * 100) / 100.0;
    }
}
