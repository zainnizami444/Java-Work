public class Main {
    public static void main(String[] args) {
//    //
//        public static void main(String[] args) {
//
//      //   Code 1
//        Clock defaultClock = Clock.systemUTC();
//        System.out.println("Clock : " + defaultClock);
//
//
//        Clock defaultClock2 = Clock.systemDefaultZone();
//        System.out.println("Clock : " + defaultClock2);
//     //   Code 2
//               public class  Myclass{
//        private Clock clock;
//        public  void  process(LocalDate eventDate)
//        {
//            if(eventDate.isBefore(LocalDate.now(clock))){}
//
//        }
//    }Code 3
//        Duration present = null;
//        Duration samplePlusA = present.plusDays(3);
//        Duration samplePlusB = present.minusDays(3);
//        Instant sampleNow = Instant.now();
//          Code 4
//        Instant sampleFuture = sampleNow.plusNanos(4);
//        Instant samplePast = sampleNow.minusNanos(4);
//        Code 5
//        System.out.println(samplePast + " " +sampleFuture);
//           Code 6
//        LocalDate sampleLocDaA = LocalDate.now();
//             Code 7
//        LocalDate sampleLocDaB = LocalDate.of(2016,07,4);
//
//        System.out.println(sampleLocDaA + " " +sampleLocDaB);
//
//
//                    Code 8
//        int year = LocalDate.now().getYear();
//        int dayOfMonth = LocalDate.now().getDayOfMonth();
//        Month month = LocalDate.now().getMonth();
//        int dayOfYear = LocalDate.now().getDayOfYear();
//        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
//        int monthvalue = month.getValue();
//    //    Code 9
//
////        LocalDate sampleLocDa = LocalDate.of(2001,1,6);
////        LocalDate sampleLocDaA = sampleLocDa.plusYears(4);
////        LocalDate sampleLocDaB = sampleLocDa.minusYears(4);
//////        System.out.println(sampleLocDa +" "+ sampleLocDaA +" "+sampleLocDaB);
//        System.out.println(year+" "+dayOfMonth+" "+month+" "+dayOfYear+" "+dayOfWeek+" "+monthvalue);
//              //        code 10
//                 LocalDatTime sampleLocalDatiA  = LocalDateTime.now();
//          Code 11
//    LocalDateTime sampleLocDaTiB= LocalDateTime.of(2001,1,6,12,6,054);
//
//        System.out.println(sampleLocDaTiB);
//
//
//       Code 12
//        LocalDateTime sampleLocDaTime  = LocalDateTime.now();
//
//        LocalDateTime sampleLocDaTimeA = sampleLocDaTime.plusYears(4);
//        LocalDateTime sampleLocDaTimeB = sampleLocDaTime.minusYears(4);
//        System.out.println(sampleLocDaTimeA +" "+ sampleLocDaTimeB +" "+ sampleLocDaTime);
//          Code 13
//        LocalTime sampleLocTiA = LocalTime.now();
//        Code 14
//        LocalTime sampleLocTiB = LocalTime.of(12,24,33,00135);
//        System.out.println(sampleLocTiA +" "+sampleLocTiB);
//
//                 Code 15
//    LocalTime sampleLocTi = LocalTime.of(12,24,33,00135);
//    LocalTime sampleLocTiFuture = sampleLocTi.plusHours(4);
//    LocalTime sampleLocTiPast = sampleLocTi.minusHours(4);
//        System.out.println(sampleLocTiFuture +" "+  sampleLocTiPast);
//               Code 16
//        LocalDate dateOfbirth = LocalDate.of(2006,02,24);
//        MonthDay bday = MonthDay.of(dateOfbirth.getMonth(),dateOfbirth.getDayOfMonth());
//
//        MonthDay currentMonthDay  = MonthDay.from(LocalDate.now());
//        if(currentMonthDay.equals(bday))
//        {
//            System.out.println("**Colorful Joyful Birthday Buddy**");
//
//        }
//        else
//        {
//            System.out.println("Nope,today is not your Birthday");
//        }
//                Code 17
//        LocalDateTime dateTime = LocalDateTime.of(2001,Month.JANUARY,6,5,6);
//        ZoneOffset sampleoffset = ZoneOffset.of("-07:00");
//        OffsetDateTime date  = OffsetDateTime.of(dateTime,sampleoffset);
//        System.out.println("Sample display of Date and Time using time-zone offset:"+date);
//
//        Example 1
//    OffsetTime d = OffsetTime.now();
//    int e = d.getMinute();
//
//        System.out.println("Minutes : " + e);
//
//                    Example 2
//        OffsetTime d = OffsetTime.ofInstant(Instant.now(), ZoneId.systemDefault());
//        System.out.println(d);
//          Example 3
//        LocalDate presentday = LocalDate.now();
//        LocalDate bday = LocalDate.of(1983, Month.MAY,22);
//        LocalDate comingBday = bday.withYear(presentday.getYear());
//        if(comingBday.isBefore(presentday)|| comingBday.isEqual(presentday))
//        {
//            comingBday = comingBday.plusYears(1);
//
//        }

//        Period waitA = Period.between(presentday,comingBday);
//        long waitB = ChronoUnit.DAYS.between(presentday , comingBday);
//
//        System.out.println("Totally,I need to wait for " + waitA.getMonths()+" months and "+ waitA.getDays() +
//                " days to celebrate my next B'day. (" + waitB + "days in Total)");
//                   Example 4
//        LocalDate h1 = LocalDate.now();
//        System.out.println("Time Period between current  date and Maximum no. of days:" + Period.between(h1,
//                LocalDate.MAX).getDays());
//
//        System.out.println("Time  Period in Days:" + Period.ofDays(7).getDays());
//                      Example 5
//        System.out.println("the present year():"+Year.now());
//        System.out.println("the year 2002 is leap year :" + Year.isLeap(2002));
//        System.out.println("the year 2012 is a leap year  :" + Year.isLeap(2012));
//
//         Example 6
//        System.out.println("the present year Month:"+YearMonth.now());
//        System.out.println("Month alone:" + YearMonth.parse("2016-4-").getMonthValue());
//        System.out.println("the year alone  :" + YearMonth.parse("2016-04").isLeapYear());
//         Code 18
//        ZonedDateTime zoDati = ZonedDateTime.now();
//        Code 19
//        ZoneId sampleZoneId =ZoneId.of("UTC+1");
//        ZonedDateTime zoDaTi2 = ZonedDateTime.of(2016,11,30,23,45,59,5682,sampleZoneId);
//
//        System.out.println(zoDati+" "+zoDaTi2);
//        Code 20
//        int sampleYear = ZonedDateTime.now().getYear();
//        Code 21
//        int sampleMonth = ZonedDateTime.now().getMonth().getValue();
 //       int sampleYear = ZonedDateTime.now().getYear().getValue();
//        System.out.println(sampleYear);
//        System.out.println(sampleMonth);
//        Code 22
//        ZonedDateTime newZoneDateTime= previousDateTime.plus(Period.ofDays(4));
//        Code 23
// ZoneId sampleZonedId =ZoneId.of("UTC+1");
//        System.out.println(sampleZonedId);
//         Code 24
//        ZoneId sampleZoneIdA = ZoneId.of("America/New_York");
//        ZoneId sampleZoneIdB = ZoneId.of("Europe/Paris");
//          Example 7
//        System.out.println( sampleZoneIdA+" "+ sampleZoneIdB);
//
//        System.out.println(ZonedDateTime.now());
//
//        ZonedDateTime sampleZoDT = ZonedDateTime.parse("2016-04-03T10:15:08:00[Asia/Singapore]");
//        System.out.println("Present day of the year :" + sampleZoDT.getDayOfYear());
//        System.out.println("Present year:" + sampleZoDT.getYear());
//          Code 25
//        ZoneOffset sampleOffset = ZoneOffset.of("+05:00");
//        System.out.println(sampleOffset);
//

 //       Example 8
//        EnumDateCalculation java8enum = new EnumDateCalculation();
//        java8enum.enumChromoUnits();
//   //     Example 9
//        TemporalAdj Temp = new TemporalAdj();
//        Temp.sampleAdj();
//  //          Example 10
//        LocalDate randomDateA = LocalDate.of(2015, Month.MAY,5);;
//        LocalDate randomDateB = LocalDate.of(2015,Month.MAY,7);
//        CustomTempAdjSample nextOddDay = new CustomTempAdjSample();
//        LocalDate upcomOddDayA = randomDateA.with(nextOddDay);
//        LocalDate upcomOddDayB =randomDateB.with(nextOddDay);
//        System.out.println("Upcoming Odd Day for" + randomDateA + " is "+upcomOddDayA);
//        System.out.println("Upcoming Odd Day for" + randomDateB + " is " + upcomOddDayB);
//     //   Code Snippet 26 :
//             Date sampleDate = new Date();
//
//        Instant sampleNow = sampleDate.toInstant();
//        ZoneId myZone = ZoneId.systemDefault();
//        LocalDateTime dateTime = LocalDateTime.ofInstant(sampleNow,myZone);
//        ZonedDateTime zdt = ZonedDateTime.ofInstant(sampleNow,myZone);
//
//  //      Example 11
//   BWCompatibility bwCompatibility= new BWCompatibility();
//          bwCompatibility.sampleBW();
////     Code Snippet 27
//
//        SimpleDateFormat format = new SimpleDateFormat();
//        String dateString = format.format(new Date());
//        Date samplDate = format.parse ("2011-03-25");
// //  Code 28
//        Calendar cal = new GregorianCalendar();
//        TimeZone tiZo = cal.getTimeZone();
//        System.out.println(tiZo);
//      //    Code 29
//        cal.setTimeZone(tiZo);
// //        Code 30
//        TimeZone tiZo = TimeZone.getDefault();
//        System.out.println(tiZo);
//        Object timeZone = ZonedDateTime.now();
//
//    //     Code 31
//        timeZone.getDisplayName();
//        timeZone.getId();
//        timeZone.getOffset(System.currentTimeMillis());
//// Example 12
//        Java8CurZone java = new Java8CurZone();
//        java.sampleZDTime();
//
//
        // }
    }
}