import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        FileInputStream reader=new FileInputStream(args[0]);
        int c;
        while((c=reader.read())!=-1){
            System.out.write(c);
        }
        reader.close();
    }
}
