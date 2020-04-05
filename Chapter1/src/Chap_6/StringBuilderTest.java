package Chap_6;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1234567890");
        System.out.println(sb.reverse());
        System.out.println(sb.append("Lahiru"));
        System.out.println(sb.delete(10,16));
        System.out.println(sb.insert(10,"===="));
        System.out.println(sb);
    }
}
