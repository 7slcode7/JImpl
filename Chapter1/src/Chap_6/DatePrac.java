package Chap_6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DatePrac {
    public static void main(String[] args) {
        DateTimeFormatter f= DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate bday = null;
        System.out.println("Ënter your birthday :");
        Scanner sc = new Scanner(System.in);
        String enteredBday = sc.nextLine();
        try {
            bday = LocalDate.parse(enteredBday,f);
        } catch (java.time.DateTimeException e){
            System.out.println("Bad days bro  !");
            System.exit(0);
        }
        System.out.println("Your birthday is : "+ bday);
        System.out.println("a : " + bday.getDayOfWeek());

        Period p1  = Period.between(bday,LocalDate.now());
        System.out.println("You have lived for :");
        System.out.println(p1.getDays() + " days.");
        System.out.println(p1.getMonths()+ " months.");
        System.out.println(p1.getYears() + " years.");

        int yearsOld = p1.getYears();
        if(yearsOld < 0 || yearsOld > 119)
            System.out.println("Wowy");
        long tDays = bday.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("Yuohave lived for " + tDays + " days, so far");

        System.out.println(" you will reach 30,000 days on "+bday.plusDays(30_000));
        LocalDate d2000 = LocalDate.of(2_000,1,1);

        Period p2 = Period.between(d2000,LocalDate.now());
        System.out.println("Period since Y2K : " + p2);
    }
}
