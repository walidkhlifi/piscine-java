import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        BufferedReader reader=new BufferedReader(new FileReader(args[0]));
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }
}
