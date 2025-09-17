public class Circle {
    private double radius = 1.0;   // mặc định
    private String color = "red";  // mặc định

    // Constructor mặc định
    public Circle() {
        // radius = 1.0, color = "red"
    }

    // Constructor có tham số (chỉ bán kính)
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; // vẫn giữ mặc định
    }

    // Getter bán kính
    public double getRadius() {
        return radius;
    }

    // Getter màu (nếu cần)
    public String getColor() {
        return color;
    }

    // Getter diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Test
    public static void main(String[] args) {
        Circle c1 = new Circle();      // mặc định radius=1.0, color=red
        Circle c2 = new Circle(2.5);   // radius=2.5, color=red

        System.out.println("Circle 1: radius=" + c1.getRadius() +
                           ", color=" + c1.getColor() +
                           ", area=" + c1.getArea());

        System.out.println("Circle 2: radius=" + c2.getRadius() +
                           ", color=" + c2.getColor() +
                           ", area=" + c2.getArea());
    }
}
