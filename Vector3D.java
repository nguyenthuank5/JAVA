public class Vector3D {
    double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    
    public double dot(Vector3D v) {
        return x * v.x + y * v.y + z * v.z;
    }

  
    public Vector3D cross(Vector3D v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new Vector3D(cx, cy, cz);
    }

    public Vector3D scale(double k) {
        return new Vector3D(x * k, y * k, z * k);
    }

   
    public Vector3D add(Vector3D v) {
        return new Vector3D(x + v.x, y + v.y, z + v.z);
    }

    
    public void display() {
        System.out.printf("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
