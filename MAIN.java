public class MAIN {
    public static void main(String[] args) {
        MANG_PS arr = new MANG_PS(5);  // tạo mảng 5 phân số ngẫu nhiên
        System.out.println("Mang phan so: " + arr);

        PHANSO x = new PHANSO(1, 2);
        int vt = arr.timkiem(x);
        if (vt != -1) {
            System.out.println("Tim thay " + x + " tai vi tri " + vt);
        } else {
            System.out.println("Khong tim thay " + x);
        }
    }
}
