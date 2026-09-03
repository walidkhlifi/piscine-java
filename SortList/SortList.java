import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        List<Integer> res=new ArrayList<Integer>(list);
        res.sort(Comparator.naturalOrder());
        return res;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        List<Integer> res=new ArrayList<Integer>(list);
          res.sort(Comparator.reverseOrder());
        return res;
    }
}