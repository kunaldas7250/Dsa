import java.io.*;
class createFile{
	public static void main(String args[]){
		File f=new File("D:\\test.txt");
try{
			if(f.createNewFile()){
			System.out.println("file created");
		}else{
			System.out.println("file  not created");
		}
}catch(IOException i){
	System.out.println("expection handle");
}
	}
}