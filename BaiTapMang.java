import java.util.Scanner;

public class BaiTapMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Bài 1: Tính tổng và trung bình
        int tong = 0;
        for (int x : arr) {
            tong += x;
        }
        double trungBinh = (double) tong / n;

        System.out.println("Tổng các phần tử = " + tong);
        System.out.println("Giá trị trung bình = " + trungBinh);

        // Bài 2: Tìm số lớn nhất và nhỏ nhất
        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Số lớn nhất trong mảng = " + max);
        System.out.println("Số nhỏ nhất trong mảng = " + min);

        // Bài 3: Đếm số chẵn và số lẻ
        int demChan = 0, demLe = 0;
        for (int x : arr) {
            if (x % 2 == 0) demChan++;
            else demLe++;
        }
        System.out.println("Có " + demChan + " số chẵn");
        System.out.println("Có " + demLe + " số lẻ");

        sc.close();
    }
}
