package tut4;

public class Rectangle2D extends Point2D {

    private Point2D center;
    private double width;
    private double height;

    public Rectangle2D () {
        this.center = new Point2D(0,0);
        this.width = 1;
        this.height = 1;
    }
    public Rectangle2D (Point2D center, double width, double height) {
        this.center = center;
        this.width = width;
        this.height = height;

    }
    public Rectangle2D (double x ,double y,double width,double height) {
    	this.center = new Point2D(x,y);
    	this.width = width;
    	this.height = height;
    }

    public double getWidth () {
        System.out.println("The width of this rectangle is: "+ width);
        return width;
    }
    public void setWidth (double w) {
        boolean isCorrect = true;
        while(!isCorrect) {
            try{
                this.width = w;
                isCorrect = true;
            }catch (Exception e) {
                isCorrect = false;
            }
        }

    }

    public double getHeight () {
        System.out.println("The height of this rectangle is: " + height);
        return height;
    }
    public void setHeight (double h) {
        boolean isCorrect = true;
        while(!isCorrect) {
            try{
                this.height = h;
                isCorrect = true;
            }catch (Exception e) {
                isCorrect = false;
            }
        }

    }
    
    
    public Point2D getLuDot() {
    	return new Point2D(this.center.getX() - width/2,this.center.getY() + height/2);
    }
    public Point2D getLdDot() {
    	return new Point2D(this.center.getX() - width/2,this.center.getY() - height/2);
    }
    public Point2D getRuDot() {
    	return new Point2D(this.center.getX() + width/2,this.center.getY() + height/2);
    }
    public Point2D getRdDot() {
    	return new Point2D(this.center.getX() + width/2,this.center.getY() - height/2);
    }



    public double getArea () {
        System.out.println("The area of this rectangle is: " + width*height);
        return width*height;
    }
    public double getPrimeter() {
        System.out.println("The primeter of this rectangle is: " + (width+height) * 2 );
        return (width+height) * 2;
    }
    public boolean contains(Point2D p) {
		double distanceX = Math.abs(this.center.getX() - p.getX());
		double distanceY = Math.abs(this.center.getY()- p.getY()) ;
		return (distanceX < width / 2 && distanceY < height / 2) ;
    }

    public boolean coincide(Point2D p) {
        double distanceX = Math.abs(this.center.getX() - p.getX());
        double distanceY = Math.abs(this.center.getY()- p.getY()) ;
        return distanceX == width/2  && distanceY <= height / 2 || distanceY == height/2  && distanceX <= width / 2  ;
    }
    
    public boolean contains (Rectangle2D r) {
    		return this.contains(r.getLuDot()) && this.contains(r.getLdDot()) && this.contains(r.getRuDot()) && this.contains(r.getRdDot()) ; 
    }



    public boolean outsides (Rectangle2D r) {
        return !this.contains(r.getLuDot()) && !this.contains(r.getLdDot()) && !this.contains(r.getRuDot()) && !this.contains(r.getRdDot()) && !this.coincide(r.getLuDot()) && !this.coincide(r.getLdDot()) && !this.coincide(r.getRuDot()) && !this.coincide(r.getRdDot())  ;
    }
    public boolean overlaps (Rectangle2D r) {
        return !contains(r) && !outsides(r);
    }

	public static void main (String[] args) {
//		
		Rectangle2D r1 = new Rectangle2D(10,6,6,4);
//		System.out.print(r1.contains(new Point2D(14,5)));
//		System.out.print(r1.contains(new Point2D(14,3)));
//
//		System.out.print(r1.contains(new Point2D(10,3)));
//
//		System.out.print(r1.contains(new Point2D(6,6)));
//
//		System.out.print(r1.contains(new Point2D(8,7)));
		System.out.println(r1.contains(new Rectangle2D(8.5,6.5,4,4)));
        System.out.println(r1.overlaps(new Rectangle2D(8.5,6.5,4,4)));

		
	}
	
	



}
