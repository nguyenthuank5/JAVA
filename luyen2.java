
import java.util.Scanner;

public class luyen2 {
    public static void main(String[] args) {
        System.out.print(" hay nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%2==0){
            System.out.print(" so n la so chan");
        } else {
            System.out.print(" so n la so le");
        }
    }
    
}
