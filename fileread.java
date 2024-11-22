import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class fileread {
    public static void main(String[] args) {
        try {
            File f = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(f));
            FileWriter fs = new FileWriter(args[1], false);
            String s = br.readLine();
            fs.write(s);

            br.close();
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
