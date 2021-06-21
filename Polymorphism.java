import java.util.Scanner;

class ParentClass {

    void calCulate(int a) {
        System.out.println(a+a);
    }
}

public class Polymorphism extends ParentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();

        System.out.println("Area of rectangle = " +area(l, b));

        System.out.println("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("Area of circle = " +area(r));

        int a = sc.nextInt();
        Polymorphism poly = new Polymorphism();
        poly.calCulate(a);

        sc.close();
    }

    static int area(int l, int b) {
        return l*b;
    }

    static double area(double r) {
        final double pi = 3.14;
        return pi*(r*r);
    }                               //compile-time polymorphism/method overloading

    void calCulate(int a) {
        System.out.println(a*a);
    }                               //run-time polymorphism/method overriding
}
