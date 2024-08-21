public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){

    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public String toString(){
        return "Circle is "+this.color+" with the radius of "+this.radius;
    }


}
