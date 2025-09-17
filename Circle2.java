public class Circle2 {
    // Thuộc tính
    private double x;        // tọa độ tâm X
    private double y;        // tọa độ tâm Y
    private double radius;   // bán kính
    private String color;    // màu

    // Constructor mặc định
    public Circle2() {
        this(0, 0, 1.0, "red");
    }

    // Constructor với bán kính
    public Circle2(double radius) {
        this(0, 0, radius, "red");
    }

    // Constructor với bán kính và màu
    public Circle2(double radius, String color) {
        this(0, 0, radius, color);
    }

    // Constructor với tâm, bán kính, màu
    public Circle2(double x, double y, double radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    // Getter
    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }
    public String getColor() { return color; }

    // Setter
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }

    // Diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // toString
    @Override
    public String toString() {
        return "Circle[x=" + x + ",y=" + y + ",radius=" + radius + ",color=" + color + "]";
    }

    // ====== Tìm giao điểm của 2 đường tròn ======
    public static void findIntersection(Circle2 c1, Circle2 c2) {
        double dx = c2.x - c1.x;
        double dy = c2.y - c1.y;
        double d = Math.sqrt(dx*dx + dy*dy); // khoảng cách giữa 2 tâm

        // Các trường hợp đặc biệt
        if (d > c1.radius + c2.radius) {
            System.out.println("Hai đường tròn không cắt nhau.");
            return;
        }
        if (d < Math.abs(c1.radius - c2.radius)) {
            System.out.println("Một đường tròn nằm trong đường tròn kia (không cắt).");
            return;
        }
        if (d == 0 && c1.radius == c2.radius) {
            System.out.println("Hai đường tròn trùng nhau (vô số giao điểm).");
            return;
        }

        // Công thức
        double a = (c1.radius*c1.radius - c2.radius*c2.radius + d*d) / (2*d);
        double h = Math.sqrt(c1.radius*c1.radius - a*a);

        // Điểm trên đường nối tâm
        double xm = c1.x + a * (dx) / d;
        double ym = c1.y + a * (dy) / d;

        // 2 giao điểm
        double xs1 = xm + h * (dy) / d;
        double ys1 = ym - h * (dx) / d;

        double xs2 = xm - h * (dy) / d;
        double ys2 = ym + h * (dx) / d;

        if (xs1 == xs2 && ys1 == ys2) {
            System.out.printf("Hai đường tròn tiếp xúc tại (%.2f, %.2f)%n", xs1, ys1);
        } else {
            System.out.printf("Hai đường tròn cắt nhau tại (%.2f, %.2f) và (%.2f, %.2f)%n",
                               xs1, ys1, xs2, ys2);
        }
    }

    // Test
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(0, 0, 5, "red");   // tâm (0,0), bán kính 5
        Circle2 c2 = new Circle2(6, 0, 6, "blue"); // tâm (6,0), bán kính 5

        System.out.println(c1);
        System.out.println(c2);

        Circle2.findIntersection(c1, c2);
    }
}
