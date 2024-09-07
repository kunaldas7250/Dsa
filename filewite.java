import java.io.*;

class fileWritter {
    public static void main(String args[]) {
        try {
            FileWriter f = new FileWriter("D:\\test.txt");
            try {
                f.write("hello kunal");
                System.out.println("file successfully written");
            } finally {
                f.close();
            }
        } catch (IOException i) {
            System.out.println("Error writing to file: " + i.getMessage());
        }
    }
}