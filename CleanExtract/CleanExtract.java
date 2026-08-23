public class CleanExtract {
    public static String extract(String s) {
        String result="";
        String[] part=s.split("\\|");
        for (int i=0; i< part.length ; i++ ){
            int a=part[i].indexOf(".");
            int b=part[i].lastIndexOf(".");

            String res;

            if (a != -1) {

                if (a == b) {
                    res = part[i].substring(a + 1).trim();
                } else {
                    res = part[i].substring(a + 1, b).trim();
                }

            } else {
                res = part[i].trim();
            }

                if (!res.isEmpty()){
                    if (!result.isEmpty()){
                        result+=" ";
                    }
                    result+=res;
                }
            
        }
        return result;
    }
}
