//rename file
import java.io.*;

class renameFile{
 public static void main(String args[]){
 try{
 File f=new File("D:\\test.txt");
 File r=new File("D:\\file.txt");
 if(f.exists()){
 System.out.println(f.renameTo(r));
 }
 }catch(Exception e){
 System.out.println("Error renaming file: " + e.getMessage());
 }
 }
}