package Chap_6;

import java.util.function.Predicate;

public class Predicate_Lambda {
    public static void main(String[] args) {
        Predicate<String> i = (String s) -> {
            System.out.println("String retrived : " + s);
            s = s.toUpperCase();
            return s.length() > 5;
        };
        System.out.println(i.test("Lahiru Chandima"));
    }
}
