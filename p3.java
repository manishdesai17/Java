import java.util.*;

class Utility {
    public static long factorial(long value) {
        long f = 1;
        for (int i = 1; i <= value; i++) {
            f = f * i;
        }
        return f;
    }

    public static boolean isPrime(int value)
    {
        for(int i=2;i<value;i++)
        {
            if(value%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(long value)
    {
        if(value%2==0)
        {
            return true;
        }
        return false;
    }

    public static boolean isOdd(long value) {
        if(value%2!=0)
        {
            return true;
        }
        return false;
    }
}



public class p3 {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.factorial");
            System.out.println("2.prime");
            System.out.println("3.even");
            System.out.println("4.odd");
            System.out.println("5.exit");
            System.out.print("Enter Choice");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("enter value to find factorial");
                    long f = sc.nextLong();
                    System.out.println("factorial is :" + Utility.factorial(f));
                    break;

                    case 2:
                    System.out.print("enter value to check prime or not...");
                    int p = sc.nextInt();
                    System.out.println( Utility.isPrime(p));
                    break;

                    case 3:
                    System.out.print("enter value to check even or not...");
                    f = sc.nextLong();
                    boolean e=Utility.isEven(f);
                    System.out.println(e);
                    break;

                    case 4:
                    System.out.print("enter value to check odd or not...");
                    f = sc.nextLong();
                    System.out.println( Utility.isOdd(f));
                    break;
                 
                    case 5:break;
                    default:
                    System.out.println("Enter valid choice:");                    
   
            }

        } while (c != 5);
    }
}
