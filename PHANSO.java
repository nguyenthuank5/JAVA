class PHANSO {
    int ts; // tử số
    int ms; // mẫu số

    // Constructor mặc định
    public PHANSO() {
        this.ts = 0;
        this.ms = 1;
    }

    // Constructor có tham số
    public PHANSO(int t, int m) {
        this.ts = t;
        this.ms = (m == 0) ? 1 : m; // tránh mẫu = 0
    }

    // Hàm cộng phân số
    public PHANSO cong(PHANSO ps) {
        int tu = this.ts * ps.ms + ps.ts * this.ms;
        int mau = this.ms * ps.ms;
        PHANSO kq = new PHANSO(tu, mau);
        kq.rutgon();
        return kq;
    }

    // Hàm tính ước số chung lớn nhất
    private int usc(int a, int b) {
        if (b == 0) return a;
        return usc(b, a % b);
    }

    // Hàm rút gọn phân số
    public void rutgon() {
        int u = usc(Math.abs(ts), Math.abs(ms));
        ts /= u;
        ms /= u;
        if (ms < 0) { // để mẫu dương
            ts = -ts;
            ms = -ms;
        }
    }

    // Hàm so sánh phân số
    public int sosanh(PHANSO ps) {
        int left = this.ts * ps.ms;
        int right = ps.ts * this.ms;
        return Integer.compare(left, right);
    }

    // Hiển thị phân số
    @Override
    public String toString() {
        return ts + "/" + ms;
    }
}
