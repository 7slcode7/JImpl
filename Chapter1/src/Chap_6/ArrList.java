package Chap_6;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>();
        arrList.add("Lahiru Chandima");
        arrList.add("Dayarathne");
        arrList.add("Padukka");
        System.out.println(arrList);

        System.out.println("##########");
        arrList.indexOf("Padukka");
        arrList.add(1,"Covidiii");
        System.out.println(arrList);
        System.out.println(arrList.size());
        arrList.add("Padukka");
        System.out.println(arrList);
    }
}
