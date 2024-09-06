import java.util.Scanner;

class stackp{
    int top = -1;
    int stack[];
    int l;
    stackp(int len) {
        this.l=len;
        System.out.println("in stack"); 
        this.stack = new int[len];
    }

    public void push1(int value) {
        if (top ==this.l-1) {
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
public class pro12 {
    public static void main(String[] args) {
        int c,value,len;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter stack length:");
        len=sc.nextInt();
        stackp s1=new stackp(len);

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
                    s1.push1(value);
                     s1.traverse();
                    break;
                    case 2:
                    value = s1.pop();
                    System.out.println("Delete Element:" + value);
                    s1.traverse();
                    break;
                case 3:
                    s1.traverse();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter valid choice:");
        }}while(c!=4);
}
}
