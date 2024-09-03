import java.util.Scanner;

class matrix {
    int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

    public void display() {
        System.out.println("First Mtrix 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("second Mtrix 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void addition() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
                // System.out.println(a[i][j]);
            }
            System.out.println("");
        }
    }

    public void subtraction() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] - b[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void multiplication() {
        int s[][]=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for(int k=0;k<3;k++)
                { 
                     s[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

public class p5 {
    public static void main(String[] args) {
        matrix m = new matrix();
        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1:Display Matrix");
            System.out.println("2:Addition Of Matrix");
            System.out.println("3:substraction Of Matrix");
            System.out.println("4:multiplication of Matrix");
            System.out.println("5:Exit");
            System.out.print("Enetr your choice");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    m.display();
                    break;
                case 2:
                    m.addition();
                    break;
                    case 3:
                    m.subtraction();;
                    break;
                     case 4:
                    m.multiplication();;
                    break;
                case 5:
                    break;
            }
        } while (c != 5);
    }
}
