import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();
            for (int value : set1) {
                res.add(value);
            }

            for (int value : set2) {
                res.add(value);
            }
        return res;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();
        for (int x : set1){
            if (set2.contains(x)){
                res.add(x);
            }
        }
        return res;
    }
}