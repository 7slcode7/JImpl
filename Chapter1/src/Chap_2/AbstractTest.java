package Chap_2;

abstract class Car{
    public abstract void go();
}

public class AbstractTest extends Car{
    @Override
    public void go() {
        System.out.println("Abs Test.");
    }

    public static void main(String[] args) {
        Car c = new AbstractTest();
        c.go();
    }
}
