import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class CustomTempAdjSample implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate loDate = LocalDate.from(temporal);
        int day = loDate.getDayOfMonth();
        if(day % 2  == 0)
        {
            loDate = loDate.plusDays(2);

        }
        return  temporal.with(loDate);
    }
}
