package Chap_2;

abstract class CarN{
    public abstract void go();
}

public class AbstractTest extends CarN{
    @Override
    public void go() {
        System.out.println("Abs Test.");
    }

    public static void main(String[] args) {
        CarN c = new AbstractTest();
        c.go();
    }
}
