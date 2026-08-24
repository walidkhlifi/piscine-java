import java.io.File;
public class FileSearch {
    public static String searchFile(String fileName) {
        File file=new File("documents");
        return search(file,fileName);
    }
    public static String search(File folder, String fileName){
        File[] files=folder.listFiles();
        if (files==null){
            return null;
        }

        for (File file:files){
            if (file.isFile() && file.getName().equals(fileName)){
                return file.getPath();
            }

            if (file.isDirectory()){
                String result=search(file,fileName);
                if (result!=null){
                    return result;
                }                
            }
        }
        return null;
    }
}