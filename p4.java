import java.util.*;
class number{
    private double value;

    number(double value)
    {
        this.value=value;
    }

    public boolean isZero()
    {
        if(value==0)
        {
            return true;
        }
        return false;
    } 
    public boolean isPositive(){
        if(value>0)
        {
            return true;
        }
        return false;
    } 
    public boolean isNegative( ){
        if(value<0)
        {
            return true;
        }
        return false;
    } 
    public boolean isOdd( )
    {
        if(value%2!=0)
        {
            return true;
        }
        return false;
    } 
    public boolean isEven( )
    {
        if(value%2==0)
        {
            return true;
        }
        return false;
    }
    public double getFactorial()
    {
        double f = 1;
        for (int i = 1; i <= value; i++) {
             f= f * i;
        }
        return f;
    }
}
public class p4 {
    public static void main(String []args)
    {
        int c;
        double val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
         val=sc.nextDouble();
         number n=new number(val);
        do
        {
            System.out.println("1:isZero");
            System.out.println("2:sPositive");
            System.out.println("3:isNegative");
            System.out.println("4:isOdd");
            System.out.println("5:isEven");
            System.out.println("6:getFactorial");
            System.out.println("7:exit");
            System.out.println("Enetr your choice");
            c = sc.nextInt();
            switch (c)
            {
                case 1:System.out.println("is zero:"+n.isZero());
                    break;
                    case 2:System.out.println("is positive:"+n.isPositive());
                    break;
                    case 3:System.out.println("is nagative:"+n.isNegative());
                    break;
                    case 4:System.out.println("is odd:"+n.isOdd());
                    break;
                    case 5:System.out.println("is even:"+n.isOdd());
                    break;
                    case 6:System.out.println("factorial is :"+n.getFactorial());
                    break;
                    case 7:break;
                default:System.out.println("enter valid choice..");
            }
        }
        while(c!=7);
    }
}
