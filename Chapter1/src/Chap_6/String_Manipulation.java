package Chap_6;

public class String_Manipulation {
    public static void main(String[] args) {
        String s = "1234567890x";
        String s1 = "1234567890X";
        String trimmingString = "    sdfede  "+ "  1234    ";
        System.out.println("Substring the string : " + s.substring(2 , 5));
        System.out.println("String length : " + s.length());
        System.out.println("String concatenation : " + s.concat(" string get concatenated."));
        System.out.println("String char at : " + s.charAt(3));
        System.out.println("Equals Ignore Case : " + s.equalsIgnoreCase(s1));
//        ######################
        System.out.println("Replace : " + s.replace('0', 'z'));
        System.out.println("Trim : " + trimmingString.trim());
    }
}
