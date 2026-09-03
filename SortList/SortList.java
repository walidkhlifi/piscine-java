import java.util.List;
import java.util.Comparator;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
      list.sort(Comparator.reverseOrder());
        return list;
    }
}