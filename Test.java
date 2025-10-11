import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("TIM GIAO TUYEN CỦA HAI MAT PHANG");
        System.out.print("NHAP MAT PHANG P1 (a1 b1 c1 d1): ");
        double a1 = sc.nextDouble(), b1 = sc.nextDouble(), c1 = sc.nextDouble(), d1 = sc.nextDouble();

        System.out.print("NHAP MAT PHANG P2 (a2 b2 c2 d2): ");
        double a2 = sc.nextDouble(), b2 = sc.nextDouble(), c2 = sc.nextDouble(), d2 = sc.nextDouble();

        Plane p1 = new Plane(a1, b1, c1, d1);
        Plane p2 = new Plane(a2, b2, c2, d2);

        System.out.println();
        p1.display();
        p2.display();

        System.out.println("\n TINH GIAO TUYEN ...");
        Line L = PlaneIntersection.findIntersection(p1, p2);
        if (L != null) {
            L.display();
        }
    }
}
