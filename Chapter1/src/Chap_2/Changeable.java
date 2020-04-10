package Chap_2;

public interface Changeable {

    default void defaultMethod(){
        System.out.println("Changeable default method.");
    }

    default void nextDefaultMethod(){
        System.out.println("Next default method");
    }
}
