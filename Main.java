package code9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        shape[] shapes = new shape[10]; // mảng gồm 10 hình ngẫu nhiên

       
        for (int i = 0; i < shapes.length; i++) {
            int type = rand.nextInt(3); // 0: Rectangle, 1: Triangle, 2: Circle

            switch (type) {
                case 0: // Rectangle
                    double width = 1 + rand.nextDouble() * 9;
                    double length = 1 + rand.nextDouble() * 9;
                    shapes[i] = new Rectangle(width, length);
                    break;

                case 1: // Triangle
                    double a, b, c;
                    do {
                        a = 3 + rand.nextDouble() * 5;
                        b = 3 + rand.nextDouble() * 5;
                        c = 3 + rand.nextDouble() * 5;
                    } while (a + b <= c || a + c <= b || b + c <= a);
                    shapes[i] = new Triangle(a, b, c);
                    break;

                case 2: // Circle
                    double radius = 1 + rand.nextDouble() * 5;
                    shapes[i] = new Circle(radius);
                    break;
            }
        }

      
        double totalArea = 0;
        System.out.println("Danh sach hinh:");
        for (shape s : shapes) {
            double area = s.getArea();
            double perimeter = s.getPerimeter();
            totalArea += area;
            System.out.printf(" - %s: Dien tich = %.2f, Chu vi = %.2f\n", s.toString(), area, perimeter);
        }
        System.out.printf("Tong dien tich cac hinh: %.2f\n", totalArea);

        
        shape maxShape = shapes[0];
        for (shape s : shapes) {
            if (s.getArea() > maxShape.getArea()) {
                maxShape = s;
            }
        }
        System.out.printf("Hinh co dien tich lon nhat: %s, Dien tich = %.2f\n", maxShape.toString(), maxShape.getArea());

     
        int minIndex = 0;
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].getArea() < shapes[minIndex].getArea()) {
                minIndex = i;
            }
        }
        System.out.printf("Hinh co dien tich nho nhat: %s, Dien tich = %.2f, Chu vi = %.2f\n",
                shapes[minIndex].toString(), shapes[minIndex].getArea(), shapes[minIndex].getPerimeter());

        
        List<shape> shapeList = new ArrayList<>(Arrays.asList(shapes));
        shapeList.remove(minIndex);

        System.out.println("\nMang sau khi xoa hinh nho nhat:");
        for (shape s : shapeList) {
            System.out.printf(" - %s: Dien tich = %.2f, Chu vi = %.2f\n", s.toString(), s.getArea(), s.getPerimeter());
        }
    }
}
