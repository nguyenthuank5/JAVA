import java.util.Scanner;

public class luyen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số nguyên:");
        int n = sc.nextInt();
        System.out.println("Các số nguyên tố từ 1 đến " + n + " là:");
        for ( int i=2; i <=n;i++)
        {
            if (songuyento(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean songuyento(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

