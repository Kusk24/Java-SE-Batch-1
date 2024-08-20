public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private double radius = 1.0;

    public MyCircle(){

    }

    public MyCircle(int xCenter, int yCenter, double radius){
        center.setX(xCenter);
        center.setY(yCenter);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public MyPoint getCenter(){
        return this.center;
    }

    public void setCenter(MyPoint center){
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public void setCenterXY(int x, int y){
        this.center.setXY(x,y);
    }

    public String toString(){
       return "center"+"("+this.getCenterX()+","+this.getCenterY()+")"+ "  radius=" + this.getRadius();
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }

}
