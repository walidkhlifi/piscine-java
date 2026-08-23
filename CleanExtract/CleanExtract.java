public class CleanExtract {
    public static String extract(String s) {
        String result="";
        String[] part=s.split("\\|");
        for (int i=0; i< part.length ; i++ ){
            int a=part[i].indexOf(".");
            int b=part[i].lastIndexOf(".");
            if (a != -1 && b != -1 && a < b) {
                String res=part[i].substring(a+1,b).trim();
                if (!res.isEmpty()){
                    if (!result.isEmpty()){
                        result+=" ";
                    }
                    result+=res;
                }
            }
        }
        return result;
    }
}
