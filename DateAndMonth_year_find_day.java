/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Dell 3567 7i3
 */
public class DateAndMonth_year_find_day {
    
    public static String findDay(int month, int day, int year) {
    LocalDate lo=LocalDate.of(year,month,day);
    return lo.getDayOfWeek().name(); // return name of day.
    }
    

public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the day,month and year");
  int d=sc.nextInt();
  int m=sc.nextInt();
  int y=sc.nextInt();
  String naday=findDay(m,d,y);
  System.out.println(naday);
}
}