import java.io.*;
class fileInfo{
	public static void main(String args[]){
		File f=new File("D:\\test.txt");
//try{
			if(f.exists()){
			System.out.println("file Name.."+f.getName());
			System.out.println("file Location.."+f.getAbsolutePath());
			System.out.println("file Writeable.."+f.canWrite());
			System.out.println("file Readable.."+f.canRead());
			System.out.println("file length.."+f.length());
			System.out.println("file remove.."+f.delete());
		}else{
			System.out.println("file  not created");
		}
//}catch(IOException i){
	//System.out.println("expection handle");
//}
	}
}