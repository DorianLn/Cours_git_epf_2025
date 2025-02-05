package org.oxyl;

public class Cercle {
    private double centreX;
    private double centreY;
    private double rayon;

    public Cercle() {
        centreX = 0.0;
        centreY = 0.0;
        rayon = 1.0;
    }

    public Cercle(Cercle cercle) {
        centreX = cercle.centreX;
        centreY = cercle.centreY;
        rayon = cercle.rayon;
    }

    public Cercle(double CentreX, double CentreY, double rayon) {
        this.centreX = CentreX;
        this.centreY = CentreY;
        setRayon(rayon);
    }

    public void setRayon(double rayon){
        if(rayon <0)
            this.rayon = 0;
        else
            this.rayon = rayon;
    }


    public void deplacer(double distanceX, double distanceY){
        centreX += distanceX;
        centreY += distanceY;
    }

    public boolean isGrand(){
        if(rayon>100)
            return true;
        else
            return false;
    }

    public void redimensionner(double f){
        if(f <0)
            f = 0;
        rayon *= f;
    }
    public void tourner (double theta){

    }


}
