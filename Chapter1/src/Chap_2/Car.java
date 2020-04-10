package Chap_2;

public class Car extends Vehicle implements Changeable{
    public static void main(String[] args) {
        Changeable ch = new Car();
        ch.defaultMethod();
        ch.nextDefaultMethod();
    }
}
