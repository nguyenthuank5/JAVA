public class Circleteacher {
    double x,y;
    double R;
    int color;

    public  Circleteacher(){
        x=y=0;
        R=1;
        color=0;


    }
    
    public Circleteacher(double xx, double yy,double rr , int c)
    {
        x=xx;
        y=yy;
        R=rr;
        color = c;
    }

    public double getArea()
    {
        return 3.1416*R*R;
    }
 

    // Kiểm tra giao nhau
    public int kiemtragiao(Circleteacher c) {
       double kc=Math.sqrt((x-c.x)*(x-c.x)+(y+c.y)*(y-c.y));
        if (kc < R +c.R) return 1;
        if (kc == R+c.R) return 0;
        return -1;
    }
    

    public String tostring()
    {
        return "Hinh tron tam x= "+x+"y="+y+"co mau="+color;
    }


    public static void main(String[] args) 
{
        Circleteacher c1 = new Circleteacher(1, 2, 3, 4);
        Circleteacher c2 = new Circleteacher(3, 4, 5, 6);

        System.out.println("Diện tích c1 = " + c1.getArea());
        System.out.println("Diện tích c2 = " + c2.getArea());
        System.out.println(c1.kiemtragiao(c2));
    }



}
