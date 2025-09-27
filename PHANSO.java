public class PHANSO {
    int ts; // tử số
    int ms; // mẫu số

    public PHANSO() {
        this.ts = 0;
        this.ms = 1;
    }

    public PHANSO(int t, int m) {
        this.ts = t;
        this.ms = (m == 0) ? 1 : m;
        rutgon();
    }

    public PHANSO cong(PHANSO ps) {
        int tu = this.ts * ps.ms + ps.ts * this.ms;
        int mau = this.ms * ps.ms;
        PHANSO kq = new PHANSO(tu, mau);
        kq.rutgon();
        return kq;
    }

    private int usc(int a, int b) {
        if (b == 0) return a;
        return usc(b, a % b);
    }

    public void rutgon() {
        if (ts == 0) {
            ms = 1;
            return;
        }
        int u = usc(Math.abs(ts), Math.abs(ms));
        ts /= u;
        ms /= u;
        if (ms < 0) {
            ts = -ts;
            ms = -ms;
        }
    }

    public int sosanh(PHANSO ps) {
        int left = this.ts * ps.ms;
        int right = ps.ts * this.ms;
        return Integer.compare(left, right);
    }

    @Override
    public String toString() {
        return ts + "/" + ms;
    }
}
