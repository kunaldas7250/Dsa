//filereader
import java.io.*;

class fileReader{
 public static void main(String args[]){
 try{
 FileReader r=new FileReader("D:\\test.txt");
 try{
 int i;
 while((i=r.read()) != -1){ // corrected condition here
 System.out.println((char)i);
 }
 }finally{
 r.close();
 }
 }catch(IOException i) {
 System.out.println("Error writing to file: " + i.getMessage());
 }
 }
}