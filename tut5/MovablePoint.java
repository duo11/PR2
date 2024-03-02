package tut5;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(){};
    public MovablePoint(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x,float y,float xSpeed, float ySpeed) {
        this.setX(x);
        this.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{xSpeed,ySpeed};
    }
    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+"),speed=("+xSpeed+","+ySpeed+")";
    }

    public MovablePoint move() {
        this.setX(this.getX()+xSpeed);
        this.setY(this.getY()+ySpeed);
        return this;
    }
}
