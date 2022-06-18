import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdj {

    public void sampleAdj()
    {
        LocalDate sampledateA = LocalDate.now();
        System.out.println("Current date: " + sampledateA);
        LocalDate nextWednesday = sampledateA.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        LocalDate firstInyear = LocalDate.of(sampledateA.getYear(),sampledateA.getMonth(),1);
        LocalDate secondSunday = firstInyear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next
                (DayOfWeek.SUNDAY));

        System.out.println("Second Sunday on : " + secondSunday);
    }
}
