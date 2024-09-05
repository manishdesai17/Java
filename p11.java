class CustomeException extends Exception {
    public CustomeException(String s) {
        super(s);
    }
}

public class p11 {
    public static void main(String[] args) {
        int n[] = new int[args.length];
       
            try {
                int x=0;
                while(x < args.length) {
                n[x] = Integer.parseInt(args[x]);
                if(n[x]<0)
                {
                  throw new CustomeException(n[x]+" is nagative");
                  
                }  
                System.out.print(n[x]+" ");
            x=x+1;
            }
         } catch (CustomeException e) {
                System.out.println("\n"+e.getMessage());
            }
        }
    }
