package code9;
public class Circle extends shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setCircle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return String.format("Hinh tron (r=%.2f)", radius);
    }
    
}
