package com.pwc.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class dateAndTime {

    public static void main(String[] args) throws InterruptedException {

    LocalDateTime d = LocalDateTime.now(ZoneId.of("GMT"));
    System.out.println(d);
    LocalDateTime t = LocalDateTime.now();
    LocalTime t1 = LocalTime.now();
        LocalDate todaydate = LocalDate.now();
        System.out.println(todaydate);



    /**
     * Not Thread Safe
     * No good support for TimeZones
     * So we used to use JodaTime
     */
    Date date = new Date();
    Calendar c = Calendar.getInstance();

//        for (int i = 0; i  < 50; i++) {
//            Date d = new Date();
//            System.out.println(d.getTime());
//            Thread.sleep(1000);
//
//        }


    System.out.println(Long.MAX_VALUE);

}
}

