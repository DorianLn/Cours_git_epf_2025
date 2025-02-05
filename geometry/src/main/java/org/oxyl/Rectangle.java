package org.oxyl;

public class Rectangle {
    private double centreX;
    private double centreY;
    private double longueur;
    private double largeur;
    private double angle;

    public Rectangle(double centreX, double centreY, double longueur, double largeur, double angle) {
        this.centreX = centreX;
        this.centreY = centreY;
        setLargeur(largeur);
        setLongueur(longueur);
        this.angle = angle;
    }
    public void setLongueur(double longueur){
        if (longueur<0)
            this.longueur = 0;
        else
            this.longueur = longueur;
    }
    public void setLargeur(double largeur){
        if (largeur<0)
            this.largeur = 0;
        else
            this.largeur = largeur;
    }

    public Rectangle() {
        centreX = 0.0;
        centreY = 0.0;
        longueur = 1.0;
        largeur = 1.0;
        angle = 0.0;
    }
    public Rectangle(Rectangle rectangle){
        centreX = rectangle.centreX;
        centreY = rectangle.centreY;
        longueur = rectangle.longueur;
        largeur = rectangle.largeur;
        angle = rectangle.angle;
    }

    public void deplacer (double distanceX, double distanceY){
        centreX += distanceX;
        centreY += distanceY;
    }

    public boolean isCarre(){
        if(longueur == largeur)
            return true;
        else
            return false;
    }
     public void redimensionner(double f){
        if(f<0)
            f=0;
        longueur *=f;
        largeur *=f;
     }

     public void tourner(double theta){
        angle += theta;
     }
}
