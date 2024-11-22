import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class file1 {
    public static void main(String[] args) {
        try {
            File f = new File("myfile.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            System.out.println(s);
            br.close();
            FileWriter fs = new FileWriter("myfile.txt");
            String change="";
            String div[]=s.split(" ");
            
            for(String a:div)
            {
               if(a.equals("manish"))
               {
                 change= s.replace(a,"jignesh");
               }
            }
            fs.write(change);
            
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
