import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        String formattedDate = formatOffsetDateTime(dateString);
        System.out.println(formattedDate);
    }

    public static String formatOffsetDateTime(String dateString) {
        // Creazione dell'oggetto OffsetDateTime dalla stringa
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        // Formattazione della data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        return offsetDateTime.format(formatter);
    }
}

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Fai attenzione a usare almeno Java 8
//Crea dei test per questo esercizio