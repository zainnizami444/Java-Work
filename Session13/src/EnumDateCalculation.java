import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EnumDateCalculation {

    public void enumChromoUnits(){

        LocalDate today = LocalDate.now();
        System.out.println("Current date : "+  today);

        LocalDate nextWeek = today.plus(2, ChronoUnit.WEEKS);
        System.out.println("After 2 weeks" + nextWeek);

        LocalDate nextMonth =today.plus(2,ChronoUnit.MONTHS);
        System.out.println("After 2 Months" + nextMonth);


        LocalDate nextYear =today.plus(2,ChronoUnit.YEARS);
        System.out.println("After 2 Months" + nextYear);

        LocalDate nextDecade = today.plus(2, ChronoUnit.DECADES);
        System.out.println("After 2 Decades" + nextDecade);

    }}
