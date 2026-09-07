import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime==null){
            return null;
        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("'Le' dd MMM 'de l'an' yyyy 'à' HH'h'mm'm' 'et' ss's'",Locale.FRANCE);
        return dateTime.format(f);
    }

    public static String formatSimple(LocalDate date) {
        if (dateTime==null){
            return null;
        }
        DateTimeFormatter f= DateTimeFormatter.ofPattern("MMMM dd yy" , Locale.ITALIC);
         return date.format(f);

    }

    public static String formatIso(LocalTime time) {
        if (dateTime==null){
            return null;
        }
        return time.toString();
    }

}