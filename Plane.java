public class Plane {
    Vector3D normal;  
    double d;        

    public Plane(double a, double b, double c, double d) {
        this.normal = new Vector3D(a, b, c);
        this.d = d;
    }

    public void display() {
        System.out.printf("Mat phang: %.2fx + %.2fy + %.2fz + %.2f = 0\n",
                normal.x, normal.y, normal.z, d);
    }
}
