package tut4;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color= color;
	}
	
	public double getRadius() {
		System.out.println("The radius of this circle is: "+radius);
		return radius;
	}
	
	public String getColor() {
		System.out.println("The color of this circle is: "+color);
		return color;
	}
	
	public double getArea() {
		System.out.println("The area of this circle is: "+Math.PI*Math.pow(radius,2));
		return Math.PI*Math.pow(radius,2);
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2.0, "blue");
		c1.getRadius();
		c1.getColor();
		c1.getArea();
		System.out.println();
		Circle c2 = new Circle(2.0,"red");
		c2.getRadius();
		c2.getColor();
		c2.getArea();
		System.out.println();
		Circle c3 = new Circle(1.0,"red");
		c3.getRadius();
		c3.getColor();
		c3.getArea();
	}
	
	
}
