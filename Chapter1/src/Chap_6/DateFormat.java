package Chap_6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("E MMM dd, yyyy G");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("k:m:s A a");


        LocalDate d = LocalDate.now();
        System.out.println(d.format(f1));

        System.out.println(d.format(f2));

        LocalTime t = LocalTime.now();
        System.out.println(t.format(f3));

    }
}
