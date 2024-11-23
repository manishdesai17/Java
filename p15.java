import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class p15 {
    public static void main(String[] args) {
        try {
            File f=new File("file1.txt");
            BufferedReader br=new BufferedReader(new FileReader(f));
            String s;
            //  String s1= br.readLine();
            // String div[]=s.split("  ");
            System.out.println("No     Name     sub1    sub2    sub3    total    Percentage");
            while((s=br.readLine())!=null)
            {
                String div[]=s.split("\t");
                int total=(Integer.parseInt(div[2])+Integer.parseInt(div[3])+Integer.parseInt(div[4]));
                int per=total/3;
                System.out.println(div[0]+"      "+div[1]+"    "+div[2]+"      "+div[3]+"      "+div[4]+"      "+total+"      "+per+" %");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
