public class PlaneIntersection {

    public static Line findIntersection(Plane p1, Plane p2) {
       
        Vector3D dir = p1.normal.cross(p2.normal);

        if (dir.x == 0 && dir.y == 0 && dir.z == 0) {
            System.out.println("Hai mặt phẳng song song hoặc trùng nhau → không có giao tuyến duy nhất.");
            return null;
        }

        
        double a1 = p1.normal.x, b1 = p1.normal.y, d1 = p1.d;
        double a2 = p2.normal.x, b2 = p2.normal.y, d2 = p2.d;
        double det = a1 * b2 - a2 * b1;
        double x0, y0, z0;

        if (det != 0) {
            x0 = (-d1 * b2 + d2 * b1) / det;
            y0 = (-a1 * d2 + a2 * d1) / det;
            z0 = 0;
        } else {
            
            double c1 = p1.normal.z, c2 = p2.normal.z;
            det = a1 * c2 - a2 * c1;
            if (det != 0) {
                x0 = (-d1 * c2 + d2 * c1) / det;
                y0 = 0;
                z0 = (-a1 * d2 + a2 * d1) / det;
            } else {
                System.out.println("KHONG THE TIM DUOC DIEM TREN GIAO TUYEN.");
                return null;
            }
        }

        Vector3D point = new Vector3D(x0, y0, z0);
        return new Line(point, dir);
    }
}
