import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.format.DateTimeFormatterBuilder;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
            DateTimeFormatter f = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .appendPattern("EEEE dd MMMM yyyy")
            .toFormatter(Locale.ENGLISH);
        return LocalDate.parse(stringDate.toLowerCase(),f);
    }

   public static LocalTime parseTimeFormat(String stringDate) {
    String[] parts = stringDate.split(" ");
    
    int hour = Integer.parseInt(parts[0]) + 12;
    int minute = Integer.parseInt(parts[5]);
    int second = Integer.parseInt(parts[8]);

    return LocalTime.of(hour, minute, second);
}

}