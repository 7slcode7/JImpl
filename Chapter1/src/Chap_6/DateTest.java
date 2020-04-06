package Chap_6;

import java.time.LocalDate;
import java.time.Period;

public class DateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020 , 1 ,31);
        Period period = Period.ofMonths(1);
        System.out.println(date);
        date.plus(period);
        System.out.println(date);
        System.out.println(date.plus(period));
        LocalDate date2 = date.plus(period);
        System.out.println("#####");
        System.out.println(date2);
    }
}
