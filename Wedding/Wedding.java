import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Wedding {

    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {

        Map<String, String> result = new HashMap<>();

        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);

        Collections.shuffle(secondList);

        int size = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < size; i++) {
            result.put(firstList.get(i), secondList.get(i));
        }

        return result;
    }
}