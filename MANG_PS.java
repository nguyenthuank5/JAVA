import java.util.Random;

public class MANG_PS {
    PHANSO[] mang;
    int n;

    public MANG_PS(int length) {
        n = length;
        mang = new PHANSO[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int t = r.nextInt(10);   // tử số
            int m = r.nextInt(10) + 1; // mẫu số khác 0
            mang[i] = new PHANSO(t, m);
        }
    }

    public int timkiem(PHANSO ps) {
        for (int i = 0; i < n; i++) {
            if (mang[i].sosanh(ps) == 0)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp += mang[i].toString() + " ";
        }
        return temp;
    }
}
