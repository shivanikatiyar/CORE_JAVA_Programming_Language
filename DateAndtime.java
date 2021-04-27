/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell 3567 7i3
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
public class DateAndtime {
    public static void main(String args[])
    {
        LocalDate d=LocalDate.now();
        System.out.println(d);  // current date
        LocalTime t=LocalTime.now();  // current time
        System.out.println(t);
        LocalDateTime t1=LocalDateTime.now();   // current date and time.
        System.out.println(t1);
        DateTimeFormatter t2=DateTimeFormatter.ofPattern("E,HH:mm:ss dd:MMM:yyyy"); // HH:mm:ss dd-MM,HH:mm dd-MM-yyyy,E-->day
        String dt1=t1.format(t2);
        System.out.println("After formatter :"+dt1);
        MonthDay month = MonthDay.now();  // month and day.
        LocalDate date = month.atYear(1994);  
        System.out.println(month); 
        System.out.println(date); // this time month and day and given year 1994.
        DayOfWeek day = DayOfWeek.of(7);  
        System.out.println(day.name());  //SUNDAY
        System.out.println(day.ordinal());  // 6
        System.out.println(day.getValue()); // 7
        Period period = Period.ofDays(24);  // period
        Temporal temp = period.addTo(LocalDate.now());  
        System.out.println(temp); // current+24D-->2021-03-19
        System.out.println(period);
    } 
}