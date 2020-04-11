package Chap_2;

interface Changeable2 {
    public default void nextDefaultMethod(){
        System.out.println("Changeable 2 default method.");
    }
}
public class Car extends Vehicle implements Changeable , Changeable2{


    public void nextDefaultMethod(){
        System.out.println("Wow");
    }

    public static void main(String[] args) {
        Changeable ch = new Car();
        ch.defaultMethod();
        ch.nextDefaultMethod();
    }
}
