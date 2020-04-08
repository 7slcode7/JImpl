package Chap_1;

public interface Testable {
    public default void defaultMethod(){
        System.out.println("Interface Default Method");
    }

    public static void staticMethod(){
        System.out.println("Interface static Method");
    }
}
