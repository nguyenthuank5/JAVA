public class Test {
    int x=0;          // biến thường (instance variable)
    static int y=0;   // biến tĩnh (class variable)

    // Constructor
    public Test() {
        x++;
        y++;
    }

    public static void main(String[] args) {
        Test a, b, c;
        a = new Test();
        b = new Test();
        c = new Test();

        System.out.println("a.x = " + a.x + ", a.y = " + a.y);
        System.out.println("b.x = " + b.x + ", b.y = " + b.y);
        System.out.println("c.x = " + c.x + ", c.y = " + c.y);
    }
}
