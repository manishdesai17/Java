import java.util.Scanner;

class stack1 {
    Scanner sc = new Scanner(System.in);
    int stack[];
    int top = -1;
    int len;

    stack1() {
        len=5;
        stack = new int[len];
    }

    stack1(int len) {
        this.len=len;
        stack = new int[this.len];
    }

    public void push1(int value) {
        if (top == this.len-1) {
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
    static Scanner sc = new Scanner(System.in);

    static void operation(stack1 s) {
        int c, value;

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

    public static void main(String[] args) {

        System.out.println("1.Default stack length 5");
        System.out.println("2.User input stack length");
        System.out.println("Enter choice:");
        int c = sc.nextInt();
        boolean t = true;
        while (t)
        {
            if (c == 1) {
                stack1 s1 = new stack1();
                operation(s1);
                t = false;
            } else if (c == 2) {
                System.out.println("Enter stack length:");
                int len = sc.nextInt();
                stack1 s2 = new stack1(len);
                operation(s2);
                t = false;
            }
            else
            {
                System.out.println("enter valid choice....");
            }
    }
}
}
