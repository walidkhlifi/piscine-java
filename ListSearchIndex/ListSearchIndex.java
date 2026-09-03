import java.util.List;
import java.util.ArrayList;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null || list.isEmpty()){
            return null;
        }
        int index= list.lastIndexOf(value);
        return index ==-1 ? null :index;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
         if (list == null || list.isEmpty()){
            return null;
        }
        int index= list.indexOf(value);
        return index ==-1 ? null :index;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> res=new ArrayList<Integer>();
        if (list == null || list.isEmpty()){
            return null;
        }
        for (int i=0 ; i<list.size(); i++){
            if (list.get(i)== value){
                res.add(i);
            }
        }
        return res;
    }
}