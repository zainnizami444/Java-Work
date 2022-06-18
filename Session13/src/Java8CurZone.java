import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8CurZone {

    public void sampleZDTime()
    {

        ZonedDateTime dateA = ZonedDateTime.parse("2016-04-303T10:15:30:08:00[Asia/Singapore]");
        System.out.println("dateA:"+dateA);
        ZoneId sampleidA = ZoneId.of("Asia/Singapore");
        System.out.println("ZoneId" + sampleidA);
        ZoneId samplecurrentZoneA= ZoneId.systemDefault();
        System.out.println("CurrentZone : " + samplecurrentZoneA);

    }

}
