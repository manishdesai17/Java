import java.util.Scanner;

abstract class shape {
    int x, y, z;

    abstract double area();

    abstract double perimeter();
}

class Ractangle extends shape {
    Ractangle() {
        this.x = 1;
        this.y = 1;
    }

    Ractangle(int w, int l) {
        this.x = w;
        this.y = l;
    }

    double area() {
        return this.x * this.y;
    }

    double perimeter() {
        return (this.x + this.y) * 2;
    }
}

class Triangle extends shape {
    Triangle() {
        this.x = 1;
        this.y = 1;
        this.z = 1;
    }

    Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double area() {
        return this.x * this.y / 2;
    }

    double perimeter() {
        return (this.x + this.y + this.z);
    }
}

class Circle1 extends shape {
    double pi = 3.14;

    Circle1() {
        this.x = 1;
        this.y = 1;
    }

    Circle1(int r) {
        this.x = r;
    }

    double area() {
        return (pi * this.x * this.x);
    }

    double perimeter() {
        return (2 * pi * this.x);
    }
}

public class p9 {

    static void Ractangle() {
        Scanner sc = new Scanner(System.in);
        do {
            int c;
            System.out.println("1.Area and Perimeter of Ractangle default value :");
            System.out.println("2.Area and Perimeter of Ractangle  user input value:");
            System.out.println("3.Exit");
            System.out.println("Enter choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    Ractangle r1 = new Ractangle();
                    System.out.println("Area of Ractangle :" + r1.area());
                    System.out.println("Perimeter of Ractangle :" + r1.perimeter());
                    break;
                case 2:
                    System.out.println("Enter width find to area of ractangle:");
                    int w = sc.nextInt();
                    System.out.println("Enter length find to area of ractangle:");
                    int l = sc.nextInt();
                    Ractangle r2 = new Ractangle(w, l);
                    System.out.println("Area of Ractangle :" + r2.area());
                    System.out.println("Perimeter of Ractangle :" + r2.perimeter());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Enter valid choice:");
                    break;
            }
        } while (true);
    }

    static void Triangle() {
        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Area and Perimeter of Triangle default value :");
            System.out.println("2.Area and Perimeter of Triangle user input value:");
            System.out.println("3.Exit");
            System.out.println("Enter choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    Triangle t1 = new Triangle();
                    System.out.println("Area of Triangle :" + t1.area());
                    System.out.println("Perimeter of Triangle :" + t1.perimeter());
                    break;
                case 2:
                    System.out.println("Enter side 1 find to area of Triangle:");
                    int a = sc.nextInt();
                    System.out.println("Enter base find to area of Triangle:");
                    int b = sc.nextInt();
                    System.out.println("Enter side 2 find to area of Triangle:");
                    int d = sc.nextInt();
                    Triangle t2 = new Triangle(a, b, d);
                    System.out.println("Area of Triangle :" + t2.area());
                    System.out.println("Perimeter of Triangle :" + t2.perimeter());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Enter valid choice:");
                    break;
            }
        } while (true);
    }

    static void Circle() {
        Scanner sc = new Scanner(System.in);
        do {
            int c;
            System.out.println("1.Area and Perimeter of Circle default value :");
            System.out.println("2.Area and Perimeter of Circle  user input value:");
            System.out.println("3.Exit");
            System.out.println("Enter choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                Circle1 c1=new Circle1();
                    System.out.println("Area of Circle :" + c1.area());
                    System.out.println("Perimeter of Circle :" + c1.perimeter());
                    break;
                case 2:
                    System.out.println("Enter radius find to area of Circle:");
                    int r = sc.nextInt();
                    Circle1 c2=new Circle1(r);
                    System.out.println("Area of Circle  :" + c2.area());
                    System.out.println("Perimeter of Circle  :" + c2.perimeter());
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Enter valid choice:");
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("1 Ractangle operation:");
            System.out.println("2.Triangle operation:");
            System.out.println("3.Circle operation");
            System.out.println("4.exit");
            System.out.println("Enter choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    Ractangle();
                    break;
                case 2:
                    Triangle();
                    break;
                case 3:
                    Circle();
                    break;
                case 4:
                    break;
            }
        } while (c != 4);

    }
}