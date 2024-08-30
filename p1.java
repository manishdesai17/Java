import  java.util.*;
import java.lang.*;
class p1
{
 public static void main(String []args)
 {
	String arr[]=new String[args.length];
	System.out.println("hello");
	int len=arr.length;
	for(int i=0;i<args.length;i++)
	{	
	 arr[i]=args[i];
	 System.out.print(args[i]+" ");
	}
	System.out.println("Sorted elment");
	Arrays.sort(arr);
	for(int j=0;j<arr.length;j++)
	{
	 System.out.print(arr[j]+" ");
	}
	System.out.println("max value in array");
	System.out.println("max value is "+arr[len-1]);
	
	System.out.println("min value in array");
	System.out.println("min value is "+arr[0]);
 }
}