import java.util.Scanner;

class stack1 {
    Scanner sc = new Scanner(System.in);
    int stack[] = new int[5];
    int top = -1;

    public void push1(int value) {
        if (top == 4) {
            System.out.println("stack is overflow");
        } else {
            top = top + 1;
            stack[top] = value;
        }
    }

    public int pop() {
        int val = 0;
        if (top == -1) {
            System.out.println("stack is underflow");
        } else {
            val = stack[top];
            top = top - 1;
        }
        return val;
    }

    public void traverse() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}

public class p7 {
    public static void main(String[] args) {
        int c, value;
        Scanner sc = new Scanner(System.in);
        stack1 s = new stack1();
        do {
            System.out.println("\n1.push");
            System.out.println("2.pop");
            System.out.println("3.traverse");
            System.out.println("4.Exit");
            System.out.println("Enter choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter element:");
                    value = sc.nextInt();
                    s.push1(value);
                    s.traverse();
                    break;
                case 2:
                    value = s.pop();
                    System.out.println("Delete Element:" + value);
                    s.traverse();
                    break;
                case 3:
                    s.traverse();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter valid choice:");

            }
        } while (c != 4);
    }
}
