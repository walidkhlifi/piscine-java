import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(
            Map<String, List<String>> first,
            Map<String, List<String>> second) {

        Map<String, String> couples = new LinkedHashMap<>();
        Map<String, String> partner = new HashMap<>();
        Map<String, Integer> next = new HashMap<>();

        for (String p : first.keySet())
            next.put(p, 0);

        while (couples.size() < first.size()) {
            for (String p : first.keySet()) {
                if (couples.containsKey(p))
                    continue;

                String choice = first.get(p).get(next.get(p));
                next.put(p, next.get(p) + 1);

                if (!partner.containsKey(choice)) {
                    partner.put(choice, p);
                    couples.put(p, choice);
                } else {
                    String old = partner.get(choice);

                    if (second.get(choice).indexOf(p)
                            < second.get(choice).indexOf(old)) {
                        partner.put(choice, p);
                        couples.remove(old);
                        couples.put(p, choice);
                    }
                }
            }
        }

        return couples;
    }
}