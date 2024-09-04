import java.util.Scanner;

class circle {
    private double x, y, r;
    double pi = 3.14;

    circle() {
        this.x = 1;
        this.y = 1;
        this.r = 1;
    }

    circle(double r) {
        this.x = 1;
        this.y = 1;
        this.r = r;
    }

    circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double area() {
        return pi * r * r;
    }

    public double circumference() {
        return 2 * pi * r;
    }

    public double diameter() {
        return 2 * r;
    }
}

public class p6 {
    public static void main(String args[]) {
        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Default radius");
            System.out.println("2.Enter only radius");
            System.out.println("3.Enter x,y and radius");
            System.out.println("4.Exit");
            System.out.println(" ");
            System.out.print("Enter choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    circle cs = new circle();
                    System.out.println("circle of area is:"+cs.area());
                    System.out.println("circle of area is:"+cs.circumference());
                    System.out.println("circle of area is:"+cs.diameter());
                    break;

                    case 2:
                    System.out.println("Enter radius:");
                    double r=sc.nextDouble();
                    circle cs1 = new circle(r);
                    System.out.println("circle of area is:"+cs1.area());
                    System.out.println("circle of area is:"+cs1.circumference());
                    System.out.println("circle of area is:"+cs1.diameter());
                    break;

                    case 3:
                    System.out.println("Enter radius:");
                    double r1=sc.nextDouble();
                    System.out.println("Enter x value:");
                    double x=sc.nextDouble();
                    System.out.println("Enter y value:");
                    double y=sc.nextDouble();
                    circle cs2 = new circle(x,y,r1);
                    System.out.println("circle of area is:"+cs2.area());
                    System.out.println("circle of area is:"+cs2.circumference());
                    System.out.println("circle of area is:"+cs2.diameter());
                    break;

                    case 4:break;

                    default:System.out.println("Enter valid choice");
                    
            }
        } while (c != 4);
    }
}
