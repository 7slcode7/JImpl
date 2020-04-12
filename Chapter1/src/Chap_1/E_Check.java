package Chap_1;

enum SizeCategory{
    BIG,
    SMALL,
    LARGE
}
public class E_Check {
    SizeCategory size;
    public static void main(String[] args) {
        E_Check e = new E_Check();
        e.size = SizeCategory.LARGE;
        System.out.println(e.size);
    }
}
