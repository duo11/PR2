package tut4;

public class Circle2D extends Point2D {

    private Point2D center;
    private double radius;

    public Circle2D() {
        this.center = new Point2D(0,0);
        this.radius = 1;
    }
    public Circle2D(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Circle2D (double x, double y, double radius) {
        this.center = new Point2D(x,y);
        this.radius = radius;
    }
    public Point2D getCenter() {
        System.out.println("The center of this circle is:" + this.center);
        return this.center;
    }
    public double getRadius() {
        System.out.println("The radius of this circle is: "+radius);
        return radius;
    }
    public double getArea() {
        System.out.println("The area of this circle is: "+Math.PI*Math.pow(radius,2));
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter() {
        System.out.println("The perimeter of this circle is: "+ 2*Math.PI*radius);
        return 2*Math.PI*radius;
    }
    public boolean contains (Point2D p) {

        double distance = distance(p);

        if(distance <= radius) {
            System.out.println("Contain");
            return true;
        }
        else{
            System.out.println("Not contain");
            return false;
        }
    }
    public boolean contains (Circle2D c ) {
        double distance = distance(c.center) + c.radius;

        if(distance <= radius) {
            System.out.println("Contain");
            return true;
        }
        else{
            System.out.println("Not contain");
            return false;
        }
    }

    public boolean overlaps (Circle2D c) {
        double centerDistance = distance(c);
        if(centerDistance <= this.radius + c.radius) {
            System.out.println("Overlap");
            return true;
        }
        else{
            System.out.println("Not overlap");
            return false;
        }
    }



    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(new Point2D(2,2),5.5);
        c1.contains(new Point2D(3,3));
        c1.contains(new Circle2D(4, 5, 10.5));
        c1.overlaps(new Circle2D(3, 5, 2.3));
    }
}
