import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.format.DateTimeParseException;

class DataEsercizioTest {

    //Questo test controlla che venga ritornata una corretta formattazione della stringa
    @Test
    void testFormatOffsetDateTime() {
        String dateString = "2023-03-01T13:00:00Z";

        String actualFormattedDate = Main.formatOffsetDateTime(dateString);

        assertEquals("01 marzo 2023", actualFormattedDate);
    }


    //Questo test controlla che effettivamente il metodo lanci un eccezione di tipo DateTimeParseException
    //qualora venga inserita una stringa non corrispondente a data
    @Test
    void testFormatOffsetDateTimeInvalidDate() {
        String invalidDateString = "invalid-date";
        assertThrows(DateTimeParseException.class, () -> {
            Main.formatOffsetDateTime(invalidDateString);
        });
    }
}
