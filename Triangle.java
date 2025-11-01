package code9;
public class Triangle extends shape {
    private double base1;
    private double base2;
    private double base3;

    public Triangle(double base1, double base2, double base3){
        this.base1 = base1;
        this.base2 = base2;
        this.base3 = base3;
    }
    public double getBase1(){
        return base1;
    }
    public double getBase2(){
        return base2;
    }
    public double getBase3(){
        return base3;
    }
    public void setBase1(double base){
        this.base1 = base1;
    }
    public void setBase2(double base){
        this.base2 = base2;
    }
    public void setBase3(double base){
        this.base3 = base3;
    }
    @Override
    public double getArea() {
        double s = (base1 + base2 + base3) / 2;
        return Math.sqrt(s * (s - base1) * (s - base2) * (s - base3));
    }
    
    @Override
    public double getPerimeter() {
        return base1 + base2 + base3;
    }
    @Override
    public String toString() {
        return String.format("Tam giac (a=%.2f, b=%.2f, c=%.2f)", base1, base2, base3);
    }
}
