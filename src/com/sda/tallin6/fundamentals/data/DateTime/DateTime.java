package com.sda.tallin6.fundamentals.data.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) throws ParseException {

        // How to get current date and time with calender
        Calendar calender = Calendar.getInstance();
        System.out.println("Current date: " + calender.getTime());

        // we have an option to get only a year or a month

        System.out.println("Year: " + calender.get(Calendar.YEAR));
        System.out.println("Month: " + calender.get(Calendar.MONTH));
        System.out.println("Day: " + calender.get(Calendar.DATE));

        // We can get 10 days before
        calender.add(Calendar.DATE, -10);
        System.out.println("10 days before: " + calender.getTime());


        // or 2 months later
        calender.add(Calendar.MONTH, 2);
        System.out.println("2 months later:" + calender.getTime());

        //one year before
        calender.add(Calendar.YEAR, -1);
        System.out.println("1 year before:" + calender.getTime());

        //How to get current date time with date
        Date currentDate = new Date();
        System.out.println("Current date:" + currentDate);

        // IN THE PROGRAMMING WORLD WE ARE MOSTLY INTERESTED  IN
        //FORMATTING AND PARSING DAT

        SimpleDateFormat format = new SimpleDateFormat("");

        /*
        * The common paterns we use when formatting date:
        *
        * yyyy-MM-dd
        * dd.MM.yyy
        * dd-MM-yyy
        * yyy-MM.dd HH:mm:ss
        * yyy-MM-dd HH:mm:ss:sss
         */
        SimpleDateFormat firstFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String formattedDate = firstFormatter.format(currentDate);
        System.out.println("Formatted date: " + formattedDate);

        // How can we convert a string to a date?
        String textDate = "12/03/2018";
        SimpleDateFormat anotherFormat = new SimpleDateFormat("dd/MM/yyy");
        Date date = anotherFormat.parse(textDate);
        System.out.println("Parsed from string to date:" + date);

        //Another way to get the date time

        LocalDate today = LocalDate.now();
        System.out.println("Local date :" + today);
        int year = today.getYear();
        Month month = today.getMonth();

        System.out.println("Year and month " + year + "month" + month);

        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        System.out.println("tomorrow :" + tomorrow);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println("yesterday :"+ yesterday);

        //date time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);
        int hour = now.getHour();
        int minutes = now.getMinute();

        System.out.println("hour:minute " + hour + ":"+minutes);

        // Duration - It measures time in seconds and nanoseconds.

        Duration oneHour = Duration.ofHours(1);
        System.out.println(oneHour.getSeconds() + "seconds in one hour");

        //Duration between two different dates

        LocalDateTime startDate = LocalDateTime.of( 2019, Month.JANUARY, 1, 10,
                20, 00);
        LocalDateTime endDate = LocalDateTime.of(2019, Month.APRIL, 13, 10,
                20, 00);

        Duration duration = Duration.between(startDate, endDate);

        System.out.println("Duration between two dates : " + duration.getSeconds());

        //Period - It measures seconds in years, months and days
        Period fiveDays = Period.ofDays(5);
        System.out.println("days..." + fiveDays.getDays());

        Period twoYearsFourMonthsThreeDays = Period.of(2, 4, 3);
        System.out.println(twoYearsFourMonthsThreeDays.getYears()); //2
        System.out.println(twoYearsFourMonthsThreeDays.getMonths());  //4
        System.out.println(twoYearsFourMonthsThreeDays.getDays());  //3

        //How many years and days passed after you were born
        LocalDate birthDate = LocalDate.of(1990, Month.APRIL, 22);
        LocalDate todayDate = LocalDate.of(2019, Month.APRIL, 14);
        Period period = Period.between(birthDate, todayDate);
        System.out.println(period.getYears() + "years,");
        System.out.println(period.getMonths() + "months,");
        System.out.println(period.getDays() + "days passed!");




    }

    //convert between the date and time objects
    private static void convertDateTimeObjects(){
        //From date to local datetime
        Date date = new Date();
        System.out.println("today;" + date);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(),
        ZoneId.systemDefault());
        System.out.println("local date time " + localDateTime);
        // from local date

        Date sameDate = Date.from(localDateTime.toInstant(ZoneOffset.UTC));

        System.out.println(" " + sameDate);


    }
}
