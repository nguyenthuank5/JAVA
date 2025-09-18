
import java.util.Scanner;

public class giaithua {
    public static void main(String[] args) {
        System.out.print("Hay nhap so nguyen duong n:  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            long giaithua=1;
        for ( int i=1 ;  i <= n; i++){
            giaithua*=i;
        }
        System.out.print("Giai thua cua n la: " + giaithua);
    }
}
