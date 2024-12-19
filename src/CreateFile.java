
import java.io.*;
public class CreateFile {
    public static void main(String[] args)throws IOException {
        File f1=new File("C:\\Users\\Talif Ali\\Desktop\\LC.txt");
            if (f1.createNewFile()){
                System.out.println("File created Successfully..!");
            }
            else {
                System.out.println("File already edxists..!");
            }
        try (FileWriter f = new FileWriter(f1)) {
            f.write("Java is a language.");
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }


        System.out.println("File name :"+f1.getName());
        System.out.println("Location:"+f1.getCanonicalPath());
        System.out.println("File readable "+f1.canRead());
        System.out.println("File writable :"+f1.canWrite());
        System.out.println("File size :"+f1.length());
    }
}
