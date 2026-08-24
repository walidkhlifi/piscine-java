import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream(args[0]);
    int c;
    while ((c = System.in.read()) != -1) {
        file.write(c);
    }
    file.close();
    }
}