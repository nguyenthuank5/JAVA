class MANG_PS {
    PHANSO[] mang; // mảng các phân số
    int n;         // số lượng phần tử

    // Constructor
    public MANG_PS(int length) {
        this.n = length;
        this.mang = new PHANSO[length];
    }

    // Gán phân số vào vị trí i
    public void setPS(int i, PHANSO ps) {
        if (i >= 0 && i < n) {
            mang[i] = ps;
        }
    }

    // Tìm kiếm phân số trong mảng
    public int timkiem(PHANSO ps) {
        for (int i = 0; i < n; i++) {
            if (mang[i] != null && mang[i].sosanh(ps) == 0) {
                return i; // trả về vị trí tìm thấy
            }
        }
        return -1; // không tìm thấy
    }

    // Hiển thị mảng phân số
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (mang[i] != null) {
                sb.append(mang[i].toString()).append(" ");
            } else {
                sb.append("null ");
            }
        }
        return sb.toString();
    }
}
public class Maang_PS {
    public static void main(String[] args) {
        // Tạo mảng phân số có 3 phần tử
        MANG_PS arr = new MANG_PS(3);

        // Tạo phân số
        PHANSO ps1 = new PHANSO(1, 2);
        PHANSO ps2 = new PHANSO(3, 4);
        PHANSO ps3 = new PHANSO(2, 3);

        // Gán vào mảng
        arr.setPS(0, ps1);
        arr.setPS(1, ps2);
        arr.setPS(2, ps3);

        // In mảng
        System.out.println("Mảng phân số: " + arr);

        // Tìm kiếm
        PHANSO psFind = new PHANSO(3, 4);
        int index = arr.timkiem(psFind);
        System.out.println("Tìm " + psFind + " thấy ở vị trí: " + index);
    }
}
