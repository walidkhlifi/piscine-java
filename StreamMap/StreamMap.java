import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamMap {

    public static Integer sumOfStringLength(Stream<String> s) {
        return s.map(str -> str.length())
            .reduce(0 ,(a,b) -> a+b );
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(n -> n > 42)
                .map(n -> n.intValue())
                .collect(Collectors.toSet());
    }
}