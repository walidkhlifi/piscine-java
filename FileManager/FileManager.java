import java.io.*;
public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        FileOutputStream writer =new FileOutputStream(fileName);
        writer.write(content.getBytes());
        writer.close();
    }
    public static String getContentFile(String fileName) throws IOException {
       FileInputStream reader=new FileInputStream(fileName);
       String res="";
       int c;
       while((c =reader.read())!=-1){
        res+=(char)c;
       }
       reader.close();
       return res;
    }
    public static void deleteFile(String fileName) {
        File file=new File(fileName);
        file.delete();
    }
}