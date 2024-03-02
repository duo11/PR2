package tut5;

public class Square extends Rectangle {
    public Square () {};
    public Square (double side) {
        setWidth(side);
        setLength(side);
    }
    public Square (double side,String color,boolean filled) {
        setWidth(side);
        setLength(side);
        setColor(color);
        setFilled(filled);
    }
    public double getSide() {
        return getLength();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setLength(double side) {
        setWidth(side);
        setLength(side);
    }
    public String toString() {
        return "Square[Rectangle[Shape[color="+getColor()+",filled="+isFilled()+",width="+getWidth()+",length="+getLength()+"]";
    }

}
