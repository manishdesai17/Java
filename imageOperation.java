import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
class imageOperation{
    //get key oparation
    public static void keyOperation(int key,String in,String msg)
    {
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file =fileChooser.getSelectedFile();
        try {
             FileInputStream fis=new FileInputStream(file);
             byte []data=new byte[fis.available()];
             fis.read(data);
             int i=0;
             for(byte b:data)
             {
                if(in=="in")
                {
              data[i]=(byte)(b^key);
              System.out.println(b);
              i++;
                }
                else
                {
                    data[i]=(byte)(data[i]^key);
                    System.out.println(b);
                    i++; 
                }
             }
             FileOutputStream f=new FileOutputStream(file);
             f.write(data);
             f.close();
             fis.close();
             JOptionPane.showMessageDialog(null,msg);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String []args)
    {
    
     JFrame f=new JFrame();
     f.setLocationRelativeTo(null);
     f.setTitle("image operation");
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setSize(500,500);

     //create button
     JButton button=new JButton();
     button.setText("image open for Incrept");
     
     JButton button2=new JButton();
     button2.setText("image open for Dcrept");
     //create text box
     JTextField text=new JTextField(10);
     JTextField tex2=new JTextField(10);

     //get key function call
     button.addActionListener(e->{
        System.out.println("button click");
        String t=text.getText();
        int temp=Integer.parseInt(t);
        String in="in";
        String msg="increpted";
        keyOperation(temp,in,msg);
     });
     button2.addActionListener(e->{
        String t2=tex2.getText();
        int temp2=Integer.parseInt(t2);
        String in="de";
        String msg="Decrepted";
        keyOperation(temp2,in,msg);
     });

     f.setLayout(new FlowLayout());
     f.add(button);
     f.add(text);
     f.add(button2);
     f.add(tex2);
     //Dimension size =button2.getPreferredSize();
     //button2.setBounds(100, 500, size.width, size.height);
     f.setVisible(true);
    }
}