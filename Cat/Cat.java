import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        BufferedReader reader=new BufferedReader(new FileReader(args[0]));
        int c;
        while((c=reader.read())!=-1){
            System.out.print(char c);
        }
        reader.close();
    }
}
