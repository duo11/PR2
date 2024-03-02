package tut4;

import java.lang.Math;
public class Point2D {

    private double x;
    private double y;


    public Point2D () {

    }

    public Point2D (double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distance (double x,double y) {
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow(this.y-y,2));
    }
    public double distance (Point2D p) {
        return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow(this.y-p.y,2));
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    public String toString () {
        return "This point has x-,y-coordinates: " + x + ", " + y ;
    }



    public static void main(String[] args) {
        Point2D p1 = new Point2D(1.5,5.5);
        System.out.println(p1.getX());
    }
}
