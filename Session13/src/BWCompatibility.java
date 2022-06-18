import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class BWCompatibility {

    public  void sampleBW()
    {
        Date sampleCurday= new Date();

        System.out.println("Desired Current date = " + sampleCurday);
        Instant samplenow =sampleCurday.toInstant();
        ZoneId samplecurZone = ZoneId.systemDefault();
        LocalDateTime sampleLoDati = LocalDateTime.ofInstant(samplenow,samplecurZone);
        System.out.println("Desired Current Local Date = " + sampleLoDati);
        ZonedDateTime sampleZoDati = ZonedDateTime.ofInstant(samplenow,samplecurZone);
        System.out.println("Desired Current Zoned Date = " + sampleZoDati);
    }
}
