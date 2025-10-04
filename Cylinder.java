public class Cylinder extends Circle {
    // các thuộc tính có mức độ truy xuất private
    private double height;

    // Bộ khởi tạo
    public Cylinder() {
        super(); // gọi bộ khởi tạo lớp cha circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()"); // để kiểm tra
    }

    public Cylinder(double height) {
        super(); // gọi bộ khởi tạo lớp cha circle()
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }

    public Cylinder(double height, double radius) {
        super(radius); // gọi bộ khởi tạo lớp cha Circle(radius)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color); // gọi bộ khởi tạo lớp cha Circle(radius, color)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }

    // phương thức công khai getters và setters để lấy thông tin thuộc tính private
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính thể tích hình khối
    public double getVolume() {
        return getArea() * height; // có dùng phương thức getArea()
    }

    // mô tả thông tin đối tượng theo dạng chuỗi
    @Override
    public String toString() {
        return "This is a Cylinder"; // xem đoạn ví dụ sau
    }
}