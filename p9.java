import java.util.Scanner;

abstract class shape {
    int x, y;

    abstract double area();

    abstract double perimeter();

    shape() {
        this.x = 1;
        this.y = 1;
    }

    shape(int w, int l) {
        this.x = w;
        this.y = l;
    }
}

class Ractangle extends shape {
    Ractangle() {
        super();
    }

    Ractangle(int w, int l) {
        super(w, l);
    }

    double area() {
        return this.x * this.y;
    }

    double perimeter() {
        return (this.x + this.y) * 2;
    }
}

public class p9 {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("1.Area of Ractangle default value pass:");
            System.out.println("2.Area of Ractangle find user");
            System.out.println("Enter choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    Ractangle r1 = new Ractangle();
                    System.out.println("Area of Ractangle A1:" + r1.area());
                    System.out.println("Perimeter of Ractangle P1:" + r1.perimeter());
                    break;

                case 2:
                    System.out.println("Enter width find to area of ractangle:");
                    int w = sc.nextInt();
                    System.out.println("Enter length find to area of ractangle:");
                    int l = sc.nextInt();
                    Ractangle r2 = new Ractangle(w, l);
                    System.out.println("Area of Ractangle A2:" + r2.area());
                    System.out.println("Perimeter of Ractangle P2:" + r2.perimeter());
                    break;
                    
                case 3:break;
            }
        } while (c != 3);

    }
}