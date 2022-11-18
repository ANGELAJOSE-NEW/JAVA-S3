import java.util.*;
import java.io.*;

class exception{
public static void main(String arg[])throws FileNotFoundException , IOException {
try {
      
      FileInputStream fi=new FileInputStream("/home/mec/ang.txt");
      int i=0;
      while((i=fi.read())!=-1){
      System.out.print((char)i);}
      System.out.println("  ");
   FileOutputStream fo=new FileOutputStream("/home/mec/angela.txt");
        System.out.println("Enter contents of file");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       byte b[]=s.getBytes();
       fo.write(b);
       System.out.println("UPDATED");
       fi.close();

            
            fo.close();
     }
catch (FileNotFoundException e){
       System.out.println("The file is not found"+e);
}
catch (IOException e){
System.out.println(e);
}


}
}
