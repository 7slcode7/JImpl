package Chap_3;

class Boo{
    public void booMethod(){
        System.out.println("Boo class boo method");
    }
}

public class FooBooTest  extends Boo{
    public void fooMethod(){
        System.out.println("Foo class foo method");
    }
}


class Tester{
    {int df = 3;}
    public static void main(String[] args) {
        Boo a = new Boo();
        Boo b = new FooBooTest();
        FooBooTest c = new FooBooTest();
        a.booMethod();
        b.booMethod();
        c.booMethod();
        c.fooMethod();
        System.out.println();
    }
}
