public class Line {
    Vector3D point;   
    Vector3D dir;     

    public Line(Vector3D point, Vector3D dir) {
        this.point = point;
        this.dir = dir;
    }

    public void display() {
        System.out.println(" GIAO TUYEN CUA HAI MAT PHANG:");
        System.out.print(" DIEM DI QUA: ");
        point.display();
        System.out.println();
        System.out.print("VECTO CHI PHUONG: ");
        dir.display();
        System.out.println("\n PHUONG TRINH THAM SO:");
        System.out.printf("x = %.2f + %.2ft\n", point.x, dir.x);
        System.out.printf("y = %.2f + %.2ft\n", point.y, dir.y);
        System.out.printf("z = %.2f + %.2ft\n", point.z, dir.z);
    }
}
