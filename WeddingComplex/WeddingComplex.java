import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(
            Map<String, List<String>> first,
            Map<String, List<String>> second) {

        Map<String, String> couples = new HashMap<>();
        Map<String, String> partner = new HashMap<>();

        for (String person : first.keySet()) {
            for (String choice : first.get(person)) {
                if (!partner.containsKey(choice)) {
                    partner.put(choice, person);
                    couples.put(person, choice);
                    break;
                }

                String current = partner.get(choice);

                if (second.get(choice).indexOf(person)
                        < second.get(choice).indexOf(current)) {
                    couples.remove(current);
                    couples.put(person, choice);
                    partner.put(choice, person);
                    break;
                }
            }
        }

        return couples;
    }
}