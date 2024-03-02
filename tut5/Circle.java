package tut5;
import java.lang.Math;
public class Circle extends Shape {
    double radius = 1.0;
    public Circle() {};
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "[Circle[Shape[color="+getColor()+",filled="+isFilled()+",radius="+radius+"]";
    }

}
