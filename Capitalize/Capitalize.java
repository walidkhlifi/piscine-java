import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        FileInputStream reader=new FileInputStream(args[0]);
        FileOutputStream file = new FileOutputStream(args[1]);

        String text;
        text =new String(reader.readAllBytes());
        text=text.trim();
        String[] arr=text.split("\\s+");

        for (int i =0; i<arr.length; i++){
            // arr[i] = Character.toUpperCase(arr[i].charAt(0))  + arr[i].substring(1).toLowerCase();
            arr[i] = Character.toUpperCase(arr[i].charAt(0))+ arr[i].substring(1).toLowerCase();
        }

        String res=String.join(" ",arr);
        file.write(res.getBytes());
        reader.close();
        file.close();
    }
}