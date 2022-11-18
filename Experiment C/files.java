//file reader and writer
import java.util.*;
import java.io.*;
class files{
public static void main(String arg[]){
try{
      Reader r=newFileReader("/home/mec/angela.txt");
      int ch;
      ch=r.read();
      while(ch!=-1){
      System.out.print((char)ch);
      ch=r.read;
      }
      r.close();


}
catch (Exception e){
         System.out.println(e);
}
try {
       Writer r=newFileWriter("/home/mec/angela.txt");
       String s="ANGELA";
       r.write(s);
       r.close();
      System.out.println("FILE WRITTEN");
     }

catch (Exception e){
         System.out.println(e);
}
}
}








}


}
}
