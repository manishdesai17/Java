import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileCopy {
    public static void main(String[] args) {
        try
         {
         FileInputStream fs=new FileInputStream(args[0]);   
         FileOutputStream os=new FileOutputStream(args[1]);
         int c=fs.read();
         while(c!=-1)
         {
            os.write(c);
            c=fs.read();
         }
         fs.close();
         os.close();
        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    }
}
