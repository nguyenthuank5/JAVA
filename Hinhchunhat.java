public class Hinhchunhat {

    double CD;
    double CR;
    double dientich(){
        return CD*CR;
    }
     double chuvi(){
        return (CD+CR)*2;
     }

    public static void main(String[] args) {
        Hinhchunhat hcn = new Hinhchunhat();
        hcn.CD=3;
        hcn.CR=5;
        System.out.print( "dien tich hcn là " + hcn.dientich());
        System.out.print( "chu vi hcn là " + hcn.chuvi());
    }
}